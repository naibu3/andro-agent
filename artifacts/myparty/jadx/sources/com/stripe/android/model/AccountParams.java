package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.Token;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountParams.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001d\u001e\u001fB\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÀ\u0001¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0017\u001a\u00020\nHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/TokenParams;", "tosShownAndAccepted", "", "businessTypeParams", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "<init>", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V", "typeDataParams", "", "", "", "getTypeDataParams", "()Ljava/util/Map;", "component1", "component2", "copy", "copy$payments_core_release", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "BusinessType", "BusinessTypeParams", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountParams extends TokenParams {
    private static final String PARAM_BUSINESS_TYPE = "business_type";
    private static final String PARAM_TOS_SHOWN_AND_ACCEPTED = "tos_shown_and_accepted";
    private final BusinessTypeParams businessTypeParams;
    private final boolean tosShownAndAccepted;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AccountParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: AccountParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountParams(parcel.readInt() != 0, (BusinessTypeParams) parcel.readParcelable(AccountParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountParams[] newArray(int i) {
            return new AccountParams[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getTosShownAndAccepted() {
        return this.tosShownAndAccepted;
    }

    /* renamed from: component2, reason: from getter */
    private final BusinessTypeParams getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    public static /* synthetic */ AccountParams copy$payments_core_release$default(AccountParams accountParams, boolean z, BusinessTypeParams businessTypeParams, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountParams.tosShownAndAccepted;
        }
        if ((i & 2) != 0) {
            businessTypeParams = accountParams.businessTypeParams;
        }
        return accountParams.copy$payments_core_release(z, businessTypeParams);
    }

    @JvmStatic
    public static final AccountParams create(boolean z) {
        return INSTANCE.create(z);
    }

    @JvmStatic
    public static final AccountParams create(boolean z, BusinessType businessType) {
        return INSTANCE.create(z, businessType);
    }

    @JvmStatic
    public static final AccountParams create(boolean z, BusinessTypeParams.Company company) {
        return INSTANCE.create(z, company);
    }

    @JvmStatic
    public static final AccountParams create(boolean z, BusinessTypeParams.Individual individual) {
        return INSTANCE.create(z, individual);
    }

    public final AccountParams copy$payments_core_release(boolean tosShownAndAccepted, BusinessTypeParams businessTypeParams) {
        return new AccountParams(tosShownAndAccepted, businessTypeParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountParams)) {
            return false;
        }
        AccountParams accountParams = (AccountParams) other;
        return this.tosShownAndAccepted == accountParams.tosShownAndAccepted && Intrinsics.areEqual(this.businessTypeParams, accountParams.businessTypeParams);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.tosShownAndAccepted) * 31;
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        return iHashCode + (businessTypeParams == null ? 0 : businessTypeParams.hashCode());
    }

    public String toString() {
        return "AccountParams(tosShownAndAccepted=" + this.tosShownAndAccepted + ", businessTypeParams=" + this.businessTypeParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.tosShownAndAccepted ? 1 : 0);
        dest.writeParcelable(this.businessTypeParams, flags);
    }

    public /* synthetic */ AccountParams(boolean z, BusinessTypeParams businessTypeParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : businessTypeParams);
    }

    public AccountParams(boolean z, BusinessTypeParams businessTypeParams) {
        super(Token.Type.Account, null, 2, null);
        this.tosShownAndAccepted = z;
        this.businessTypeParams = businessTypeParams;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(PARAM_TOS_SHOWN_AND_ACCEPTED, Boolean.valueOf(this.tosShownAndAccepted)));
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        Map mapMapOf2 = businessTypeParams != null ? MapsKt.mapOf(TuplesKt.to(PARAM_BUSINESS_TYPE, businessTypeParams.getType().getCode()), TuplesKt.to(businessTypeParams.getType().getCode(), businessTypeParams.toParamMap())) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapMapOf, mapMapOf2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountParams.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Individual", "Company", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BusinessType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BusinessType[] $VALUES;
        private final String code;
        public static final BusinessType Individual = new BusinessType("Individual", 0, "individual");
        public static final BusinessType Company = new BusinessType("Company", 1, "company");

        private static final /* synthetic */ BusinessType[] $values() {
            return new BusinessType[]{Individual, Company};
        }

        public static EnumEntries<BusinessType> getEntries() {
            return $ENTRIES;
        }

        private BusinessType(String str, int i, String str2) {
            this.code = str2;
        }

        public final String getCode() {
            return this.code;
        }

        static {
            BusinessType[] businessTypeArr$values = $values();
            $VALUES = businessTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(businessTypeArr$values);
        }

        public static BusinessType valueOf(String str) {
            return (BusinessType) Enum.valueOf(BusinessType.class, str);
        }

        public static BusinessType[] values() {
            return (BusinessType[]) $VALUES.clone();
        }
    }

    /* compiled from: AccountParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/AccountParams$BusinessType;", "<init>", "(Lcom/stripe/android/model/AccountParams$BusinessType;)V", "getType$payments_core_release", "()Lcom/stripe/android/model/AccountParams$BusinessType;", "paramsList", "", "Lkotlin/Pair;", "", "", "getParamsList", "()Ljava/util/List;", "toParamMap", "", "Company", "Individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class BusinessTypeParams implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private final BusinessType type;

        public /* synthetic */ BusinessTypeParams(BusinessType businessType, DefaultConstructorMarker defaultConstructorMarker) {
            this(businessType);
        }

        public abstract List<Pair<String, Object>> getParamsList();

        private BusinessTypeParams(BusinessType businessType) {
            this.type = businessType;
        }

        /* renamed from: getType$payments_core_release, reason: from getter */
        public final BusinessType getType() {
            return this.type;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<Pair<String, Object>> paramsList = getParamsList();
            Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
            Iterator<T> it = paramsList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                Object objComponent2 = pair.component2();
                Map mapMapOf = objComponent2 != null ? MapsKt.mapOf(TuplesKt.to(str, objComponent2)) : null;
                if (mapMapOf == null) {
                    mapMapOf = MapsKt.emptyMap();
                }
                mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
            }
            return mapEmptyMap;
        }

        /* compiled from: AccountParams.kt */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0004_`abB¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003J¶\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010SJ\u0006\u0010T\u001a\u00020UJ\u0013\u0010V\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010X\u001a\u00020UHÖ\u0001J\t\u0010Y\u001a\u00020\u000bHÖ\u0001J\u0016\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020UR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0@0?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006c"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "directorsProvided", "", "executivesProvided", "name", "", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", Company.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "<init>", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getAddressKanji", "setAddressKanji", "getDirectorsProvided", "()Ljava/lang/Boolean;", "setDirectorsProvided", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getExecutivesProvided", "setExecutivesProvided", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNameKana", "setNameKana", "getNameKanji", "setNameKanji", "getOwnersProvided", "setOwnersProvided", "getPhone", "setPhone", "getTaxId", "setTaxId", "getTaxIdRegistrar", "setTaxIdRegistrar", "getVatId", "setVatId", "getVerification", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "paramsList", "", "Lkotlin/Pair;", "", "getParamsList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Verification", "Document", "Builder", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Company extends BusinessTypeParams {
            private static final String PARAM_ADDRESS = "address";
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            private static final String PARAM_DIRECTORS_PROVIDED = "directors_provided";
            private static final String PARAM_EXECUTIVES_PROVIDED = "executives_provided";
            private static final String PARAM_NAME = "name";
            private static final String PARAM_NAME_KANA = "name_kana";
            private static final String PARAM_NAME_KANJI = "name_kanji";
            private static final String PARAM_OWNERS_PROVIDED = "owners_provided";
            private static final String PARAM_PHONE = "phone";
            private static final String PARAM_TAX_ID = "tax_id";
            private static final String PARAM_TAX_ID_REGISTRAR = "tax_id_registrar";
            private static final String PARAM_VAT_ID = "vat_id";
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private Boolean directorsProvided;
            private Boolean executivesProvided;
            private String name;
            private String nameKana;
            private String nameKanji;
            private Boolean ownersProvided;
            private String phone;
            private String taxId;
            private String taxIdRegistrar;
            private String vatId;
            private Verification verification;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Company> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: AccountParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Company> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Company createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    Boolean boolValueOf3;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
                    AddressJapanParams addressJapanParamsCreateFromParcel = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    AddressJapanParams addressJapanParamsCreateFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    String string = parcel.readString();
                    boolean z = true;
                    Boolean bool = boolValueOf2;
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf3 = null;
                    } else {
                        if (parcel.readInt() == 0) {
                            z = false;
                        }
                        boolValueOf3 = Boolean.valueOf(z);
                    }
                    return new Company(addressCreateFromParcel, addressJapanParamsCreateFromParcel, addressJapanParamsCreateFromParcel2, boolValueOf, bool, string, string2, string3, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Verification.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Company[] newArray(int i) {
                    return new Company[i];
                }
            }

            public Company() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            /* renamed from: component1, reason: from getter */
            public final Address getAddress() {
                return this.address;
            }

            /* renamed from: component10, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            /* renamed from: component11, reason: from getter */
            public final String getTaxId() {
                return this.taxId;
            }

            /* renamed from: component12, reason: from getter */
            public final String getTaxIdRegistrar() {
                return this.taxIdRegistrar;
            }

            /* renamed from: component13, reason: from getter */
            public final String getVatId() {
                return this.vatId;
            }

            /* renamed from: component14, reason: from getter */
            public final Verification getVerification() {
                return this.verification;
            }

            /* renamed from: component2, reason: from getter */
            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            /* renamed from: component3, reason: from getter */
            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getDirectorsProvided() {
                return this.directorsProvided;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getExecutivesProvided() {
                return this.executivesProvided;
            }

            /* renamed from: component6, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component7, reason: from getter */
            public final String getNameKana() {
                return this.nameKana;
            }

            /* renamed from: component8, reason: from getter */
            public final String getNameKanji() {
                return this.nameKanji;
            }

            /* renamed from: component9, reason: from getter */
            public final Boolean getOwnersProvided() {
                return this.ownersProvided;
            }

            public final Company copy(Address address, AddressJapanParams addressKana, AddressJapanParams addressKanji, Boolean directorsProvided, Boolean executivesProvided, String name, String nameKana, String nameKanji, Boolean ownersProvided, String phone, String taxId, String taxIdRegistrar, String vatId, Verification verification) {
                return new Company(address, addressKana, addressKanji, directorsProvided, executivesProvided, name, nameKana, nameKanji, ownersProvided, phone, taxId, taxIdRegistrar, vatId, verification);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Company)) {
                    return false;
                }
                Company company = (Company) other;
                return Intrinsics.areEqual(this.address, company.address) && Intrinsics.areEqual(this.addressKana, company.addressKana) && Intrinsics.areEqual(this.addressKanji, company.addressKanji) && Intrinsics.areEqual(this.directorsProvided, company.directorsProvided) && Intrinsics.areEqual(this.executivesProvided, company.executivesProvided) && Intrinsics.areEqual(this.name, company.name) && Intrinsics.areEqual(this.nameKana, company.nameKana) && Intrinsics.areEqual(this.nameKanji, company.nameKanji) && Intrinsics.areEqual(this.ownersProvided, company.ownersProvided) && Intrinsics.areEqual(this.phone, company.phone) && Intrinsics.areEqual(this.taxId, company.taxId) && Intrinsics.areEqual(this.taxIdRegistrar, company.taxIdRegistrar) && Intrinsics.areEqual(this.vatId, company.vatId) && Intrinsics.areEqual(this.verification, company.verification);
            }

            public int hashCode() {
                Address address = this.address;
                int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
                AddressJapanParams addressJapanParams = this.addressKana;
                int iHashCode2 = (iHashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                int iHashCode3 = (iHashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
                Boolean bool = this.directorsProvided;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.executivesProvided;
                int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.name;
                int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.nameKana;
                int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.nameKanji;
                int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool3 = this.ownersProvided;
                int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str4 = this.phone;
                int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.taxId;
                int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.taxIdRegistrar;
                int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.vatId;
                int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Verification verification = this.verification;
                return iHashCode13 + (verification != null ? verification.hashCode() : 0);
            }

            public String toString() {
                return "Company(address=" + this.address + ", addressKana=" + this.addressKana + ", addressKanji=" + this.addressKanji + ", directorsProvided=" + this.directorsProvided + ", executivesProvided=" + this.executivesProvided + ", name=" + this.name + ", nameKana=" + this.nameKana + ", nameKanji=" + this.nameKanji + ", ownersProvided=" + this.ownersProvided + ", phone=" + this.phone + ", taxId=" + this.taxId + ", taxIdRegistrar=" + this.taxIdRegistrar + ", vatId=" + this.vatId + ", verification=" + this.verification + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Address address = this.address;
                if (address == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    address.writeToParcel(dest, flags);
                }
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressJapanParams.writeToParcel(dest, flags);
                }
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressJapanParams2.writeToParcel(dest, flags);
                }
                Boolean bool = this.directorsProvided;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.executivesProvided;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                dest.writeString(this.name);
                dest.writeString(this.nameKana);
                dest.writeString(this.nameKanji);
                Boolean bool3 = this.ownersProvided;
                if (bool3 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                dest.writeString(this.phone);
                dest.writeString(this.taxId);
                dest.writeString(this.taxIdRegistrar);
                dest.writeString(this.vatId);
                Verification verification = this.verification;
                if (verification == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    verification.writeToParcel(dest, flags);
                }
            }

            public final Address getAddress() {
                return this.address;
            }

            public final void setAddress(Address address) {
                this.address = address;
            }

            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final Boolean getDirectorsProvided() {
                return this.directorsProvided;
            }

            public final void setDirectorsProvided(Boolean bool) {
                this.directorsProvided = bool;
            }

            public final Boolean getExecutivesProvided() {
                return this.executivesProvided;
            }

            public final void setExecutivesProvided(Boolean bool) {
                this.executivesProvided = bool;
            }

            public final String getName() {
                return this.name;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final String getNameKana() {
                return this.nameKana;
            }

            public final void setNameKana(String str) {
                this.nameKana = str;
            }

            public final String getNameKanji() {
                return this.nameKanji;
            }

            public final void setNameKanji(String str) {
                this.nameKanji = str;
            }

            public /* synthetic */ Company(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : addressJapanParams, (i & 4) != 0 ? null : addressJapanParams2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? false : bool3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : verification);
            }

            public final Boolean getOwnersProvided() {
                return this.ownersProvided;
            }

            public final void setOwnersProvided(Boolean bool) {
                this.ownersProvided = bool;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final String getTaxId() {
                return this.taxId;
            }

            public final void setTaxId(String str) {
                this.taxId = str;
            }

            public final String getTaxIdRegistrar() {
                return this.taxIdRegistrar;
            }

            public final void setTaxIdRegistrar(String str) {
                this.taxIdRegistrar = str;
            }

            public final String getVatId() {
                return this.vatId;
            }

            public final void setVatId(String str) {
                this.vatId = str;
            }

            public final Verification getVerification() {
                return this.verification;
            }

            public final void setVerification(Verification verification) {
                this.verification = verification;
            }

            public Company(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification) {
                super(BusinessType.Company, null);
                this.address = address;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.directorsProvided = bool;
                this.executivesProvided = bool2;
                this.name = str;
                this.nameKana = str2;
                this.nameKanji = str3;
                this.ownersProvided = bool3;
                this.phone = str4;
                this.taxId = str5;
                this.taxIdRegistrar = str6;
                this.vatId = str7;
                this.verification = verification;
            }

            @Override // com.stripe.android.model.AccountParams.BusinessTypeParams
            public List<Pair<String, Object>> getParamsList() {
                Pair[] pairArr = new Pair[14];
                Address address = this.address;
                pairArr[0] = TuplesKt.to("address", address != null ? address.toParamMap() : null);
                AddressJapanParams addressJapanParams = this.addressKana;
                pairArr[1] = TuplesKt.to(PARAM_ADDRESS_KANA, addressJapanParams != null ? addressJapanParams.toParamMap() : null);
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                pairArr[2] = TuplesKt.to(PARAM_ADDRESS_KANJI, addressJapanParams2 != null ? addressJapanParams2.toParamMap() : null);
                pairArr[3] = TuplesKt.to(PARAM_DIRECTORS_PROVIDED, this.directorsProvided);
                pairArr[4] = TuplesKt.to(PARAM_EXECUTIVES_PROVIDED, this.executivesProvided);
                pairArr[5] = TuplesKt.to("name", this.name);
                pairArr[6] = TuplesKt.to(PARAM_NAME_KANA, this.nameKana);
                pairArr[7] = TuplesKt.to(PARAM_NAME_KANJI, this.nameKanji);
                pairArr[8] = TuplesKt.to(PARAM_OWNERS_PROVIDED, this.ownersProvided);
                pairArr[9] = TuplesKt.to("phone", this.phone);
                pairArr[10] = TuplesKt.to(PARAM_TAX_ID, this.taxId);
                pairArr[11] = TuplesKt.to(PARAM_TAX_ID_REGISTRAR, this.taxIdRegistrar);
                pairArr[12] = TuplesKt.to(PARAM_VAT_ID, this.vatId);
                Verification verification = this.verification;
                pairArr[13] = TuplesKt.to(PARAM_VERIFICATION, verification != null ? verification.toParamMap() : null);
                return CollectionsKt.listOf((Object[]) pairArr);
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Verification.PARAM_DOCUMENT, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "<init>", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;)V", "getDocument", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "setDocument", "toParamMap", "", "", "", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Verification implements StripeParamsModel, Parcelable {
                private static final String PARAM_DOCUMENT = "document";
                private Document document;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: AccountParams.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Verification> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Verification() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document, int i, Object obj) {
                    if ((i & 1) != 0) {
                        document = verification.document;
                    }
                    return verification.copy(document);
                }

                /* renamed from: component1, reason: from getter */
                public final Document getDocument() {
                    return this.document;
                }

                public final Verification copy(Document document) {
                    return new Verification(document);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Verification) && Intrinsics.areEqual(this.document, ((Verification) other).document);
                }

                public int hashCode() {
                    Document document = this.document;
                    if (document == null) {
                        return 0;
                    }
                    return document.hashCode();
                }

                public String toString() {
                    return "Verification(document=" + this.document + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Document document = this.document;
                    if (document == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        document.writeToParcel(dest, flags);
                    }
                }

                public Verification(Document document) {
                    this.document = document;
                }

                public /* synthetic */ Verification(Document document, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : document);
                }

                public final Document getDocument() {
                    return this.document;
                }

                public final void setDocument(Document document) {
                    this.document = document;
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    Document document = this.document;
                    Map<String, Object> mapMapOf = document != null ? MapsKt.mapOf(TuplesKt.to(PARAM_DOCUMENT, document.toParamMap())) : null;
                    return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
                }

                /* compiled from: AccountParams.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification$Companion;", "", "<init>", "()V", "PARAM_DOCUMENT", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                private static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }
                }
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Document.PARAM_FRONT, "", Document.PARAM_BACK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toParamMap", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Document implements StripeParamsModel, Parcelable {
                private static final String PARAM_BACK = "back";
                private static final String PARAM_FRONT = "front";
                private final String back;
                private final String front;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Document> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: AccountParams.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Document> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Document(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document[] newArray(int i) {
                        return new Document[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Document() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Document(String str) {
                    this(str, null, 2, 0 == true ? 1 : 0);
                }

                /* renamed from: component1, reason: from getter */
                private final String getFront() {
                    return this.front;
                }

                /* renamed from: component2, reason: from getter */
                private final String getBack() {
                    return this.back;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = document.front;
                    }
                    if ((i & 2) != 0) {
                        str2 = document.back;
                    }
                    return document.copy(str, str2);
                }

                public final Document copy(String front, String back) {
                    return new Document(front, back);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Document)) {
                        return false;
                    }
                    Document document = (Document) other;
                    return Intrinsics.areEqual(this.front, document.front) && Intrinsics.areEqual(this.back, document.back);
                }

                public int hashCode() {
                    String str = this.front;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.back;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Document(front=" + this.front + ", back=" + this.back + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.front);
                    dest.writeString(this.back);
                }

                public Document(String str, String str2) {
                    this.front = str;
                    this.back = str2;
                }

                public /* synthetic */ Document(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_FRONT, this.front), TuplesKt.to(PARAM_BACK, this.back)});
                    Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
                    for (Pair pair : listListOf) {
                        String str = (String) pair.component1();
                        String str2 = (String) pair.component2();
                        Map mapMapOf = str2 != null ? MapsKt.mapOf(TuplesKt.to(str, str2)) : null;
                        if (mapMapOf == null) {
                            mapMapOf = MapsKt.emptyMap();
                        }
                        mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
                    }
                    return mapEmptyMap;
                }

                /* compiled from: AccountParams.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document$Companion;", "", "<init>", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                private static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }
                }
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010!\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010'\u001a\u00020(R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "", "<init>", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "directorsProvided", "", "Ljava/lang/Boolean;", "executivesProvided", "name", "", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", Company.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "setAddress", "setAddressKana", "setAddressKanji", "setDirectorsProvided", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "setExecutivesProvided", "setName", "setNameKana", "setNameKanji", "setOwnersProvided", "setPhone", "setTaxId", "setTaxIdRegistrar", "setVatId", "setVerification", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Builder {
                public static final int $stable = 8;
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private Boolean directorsProvided;
                private Boolean executivesProvided;
                private String name;
                private String nameKana;
                private String nameKanji;
                private Boolean ownersProvided;
                private String phone;
                private String taxId;
                private String taxIdRegistrar;
                private String vatId;
                private Verification verification;

                public final Builder setAddress(Address address) {
                    this.address = address;
                    return this;
                }

                public final Builder setAddressKana(AddressJapanParams addressKana) {
                    this.addressKana = addressKana;
                    return this;
                }

                public final Builder setAddressKanji(AddressJapanParams addressKanji) {
                    this.addressKanji = addressKanji;
                    return this;
                }

                public final Builder setDirectorsProvided(Boolean directorsProvided) {
                    this.directorsProvided = directorsProvided;
                    return this;
                }

                public final Builder setExecutivesProvided(Boolean executivesProvided) {
                    this.executivesProvided = executivesProvided;
                    return this;
                }

                public final Builder setName(String name) {
                    this.name = name;
                    return this;
                }

                public final Builder setNameKana(String nameKana) {
                    this.nameKana = nameKana;
                    return this;
                }

                public final Builder setNameKanji(String nameKanji) {
                    this.nameKanji = nameKanji;
                    return this;
                }

                public final Builder setOwnersProvided(Boolean ownersProvided) {
                    this.ownersProvided = ownersProvided;
                    return this;
                }

                public final Builder setPhone(String phone) {
                    this.phone = phone;
                    return this;
                }

                public final Builder setTaxId(String taxId) {
                    this.taxId = taxId;
                    return this;
                }

                public final Builder setTaxIdRegistrar(String taxIdRegistrar) {
                    this.taxIdRegistrar = taxIdRegistrar;
                    return this;
                }

                public final Builder setVatId(String vatId) {
                    this.vatId = vatId;
                    return this;
                }

                public final Builder setVerification(Verification verification) {
                    this.verification = verification;
                    return this;
                }

                public final Company build() {
                    return new Company(this.address, this.addressKana, this.addressKanji, this.directorsProvided, this.executivesProvided, this.name, this.nameKana, this.nameKanji, this.ownersProvided, this.phone, this.taxId, this.taxIdRegistrar, this.vatId, this.verification);
                }
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Companion;", "", "<init>", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DIRECTORS_PROVIDED", "PARAM_EXECUTIVES_PROVIDED", "PARAM_NAME", "PARAM_NAME_KANA", "PARAM_NAME_KANJI", "PARAM_OWNERS_PROVIDED", "PARAM_PHONE", "PARAM_TAX_ID", "PARAM_TAX_ID_REGISTRAR", "PARAM_VAT_ID", "PARAM_VERIFICATION", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: AccountParams.kt */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 t2\u00020\u0001:\u0004qrstBë\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0019HÆ\u0003Jí\u0001\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0006\u0010e\u001a\u00020fJ\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010j\u001a\u00020fHÖ\u0001J\t\u0010k\u001a\u00020\nHÖ\u0001J\u0016\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010+\"\u0004\bE\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010+\"\u0004\bG\u0010-R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010O0N0M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006u"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", Individual.PARAM_METADATA, "", "phone", "ssnLast4", Individual.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "<init>", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getAddressKanji", "setAddressKanji", "getDateOfBirth", "()Lcom/stripe/android/model/DateOfBirth;", "setDateOfBirth", "(Lcom/stripe/android/model/DateOfBirth;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getFirstNameKana", "setFirstNameKana", "getFirstNameKanji", "setFirstNameKanji", "getGender", "setGender", "getIdNumber", "setIdNumber", "getLastName", "setLastName", "getLastNameKana", "setLastNameKana", "getLastNameKanji", "setLastNameKanji", "getMaidenName", "setMaidenName", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getPhone", "setPhone", "getSsnLast4", "setSsnLast4", "getVerification", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "paramsList", "", "Lkotlin/Pair;", "", "getParamsList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Verification", "Document", "Builder", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Individual extends BusinessTypeParams {
            private static final String PARAM_ADDRESS = "address";
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            private static final String PARAM_DOB = "dob";
            private static final String PARAM_EMAIL = "email";
            private static final String PARAM_FIRST_NAME = "first_name";
            private static final String PARAM_FIRST_NAME_KANA = "first_name_kana";
            private static final String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
            private static final String PARAM_GENDER = "gender";
            private static final String PARAM_ID_NUMBER = "id_number";
            private static final String PARAM_LAST_NAME = "last_name";
            private static final String PARAM_LAST_NAME_KANA = "last_name_kana";
            private static final String PARAM_LAST_NAME_KANJI = "last_name_kanji";
            private static final String PARAM_MAIDEN_NAME = "maiden_name";
            private static final String PARAM_METADATA = "metadata";
            private static final String PARAM_PHONE = "phone";
            private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private DateOfBirth dateOfBirth;
            private String email;
            private String firstName;
            private String firstNameKana;
            private String firstNameKanji;
            private String gender;
            private String idNumber;
            private String lastName;
            private String lastNameKana;
            private String lastNameKanji;
            private String maidenName;
            private Map<String, String> metadata;
            private String phone;
            private String ssnLast4;
            private Verification verification;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Individual> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: AccountParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Individual> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Individual createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
                    AddressJapanParams addressJapanParamsCreateFromParcel = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    AddressJapanParams addressJapanParamsCreateFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    DateOfBirth dateOfBirthCreateFromParcel = parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(i);
                        int i2 = 0;
                        while (i2 != i) {
                            linkedHashMap.put(parcel.readString(), parcel.readString());
                            i2++;
                            i = i;
                        }
                    }
                    return new Individual(addressCreateFromParcel, addressJapanParamsCreateFromParcel, addressJapanParamsCreateFromParcel2, dateOfBirthCreateFromParcel, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Individual[] newArray(int i) {
                    return new Individual[i];
                }
            }

            public Individual() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            }

            public static /* synthetic */ Individual copy$default(Individual individual, Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Verification verification, int i, Object obj) {
                Verification verification2;
                String str13;
                Address address2 = (i & 1) != 0 ? individual.address : address;
                AddressJapanParams addressJapanParams3 = (i & 2) != 0 ? individual.addressKana : addressJapanParams;
                AddressJapanParams addressJapanParams4 = (i & 4) != 0 ? individual.addressKanji : addressJapanParams2;
                DateOfBirth dateOfBirth2 = (i & 8) != 0 ? individual.dateOfBirth : dateOfBirth;
                String str14 = (i & 16) != 0 ? individual.email : str;
                String str15 = (i & 32) != 0 ? individual.firstName : str2;
                String str16 = (i & 64) != 0 ? individual.firstNameKana : str3;
                String str17 = (i & 128) != 0 ? individual.firstNameKanji : str4;
                String str18 = (i & 256) != 0 ? individual.gender : str5;
                String str19 = (i & 512) != 0 ? individual.idNumber : str6;
                String str20 = (i & 1024) != 0 ? individual.lastName : str7;
                String str21 = (i & 2048) != 0 ? individual.lastNameKana : str8;
                String str22 = (i & 4096) != 0 ? individual.lastNameKanji : str9;
                String str23 = (i & 8192) != 0 ? individual.maidenName : str10;
                Address address3 = address2;
                Map map2 = (i & 16384) != 0 ? individual.metadata : map;
                String str24 = (i & 32768) != 0 ? individual.phone : str11;
                String str25 = (i & 65536) != 0 ? individual.ssnLast4 : str12;
                if ((i & 131072) != 0) {
                    str13 = str25;
                    verification2 = individual.verification;
                } else {
                    verification2 = verification;
                    str13 = str25;
                }
                return individual.copy(address3, addressJapanParams3, addressJapanParams4, dateOfBirth2, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, map2, str24, str13, verification2);
            }

            /* renamed from: component1, reason: from getter */
            public final Address getAddress() {
                return this.address;
            }

            /* renamed from: component10, reason: from getter */
            public final String getIdNumber() {
                return this.idNumber;
            }

            /* renamed from: component11, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            /* renamed from: component12, reason: from getter */
            public final String getLastNameKana() {
                return this.lastNameKana;
            }

            /* renamed from: component13, reason: from getter */
            public final String getLastNameKanji() {
                return this.lastNameKanji;
            }

            /* renamed from: component14, reason: from getter */
            public final String getMaidenName() {
                return this.maidenName;
            }

            public final Map<String, String> component15() {
                return this.metadata;
            }

            /* renamed from: component16, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            /* renamed from: component17, reason: from getter */
            public final String getSsnLast4() {
                return this.ssnLast4;
            }

            /* renamed from: component18, reason: from getter */
            public final Verification getVerification() {
                return this.verification;
            }

            /* renamed from: component2, reason: from getter */
            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            /* renamed from: component3, reason: from getter */
            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            /* renamed from: component4, reason: from getter */
            public final DateOfBirth getDateOfBirth() {
                return this.dateOfBirth;
            }

            /* renamed from: component5, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            /* renamed from: component6, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* renamed from: component7, reason: from getter */
            public final String getFirstNameKana() {
                return this.firstNameKana;
            }

            /* renamed from: component8, reason: from getter */
            public final String getFirstNameKanji() {
                return this.firstNameKanji;
            }

            /* renamed from: component9, reason: from getter */
            public final String getGender() {
                return this.gender;
            }

            public final Individual copy(Address address, AddressJapanParams addressKana, AddressJapanParams addressKanji, DateOfBirth dateOfBirth, String email, String firstName, String firstNameKana, String firstNameKanji, String gender, String idNumber, String lastName, String lastNameKana, String lastNameKanji, String maidenName, Map<String, String> metadata, String phone, String ssnLast4, Verification verification) {
                return new Individual(address, addressKana, addressKanji, dateOfBirth, email, firstName, firstNameKana, firstNameKanji, gender, idNumber, lastName, lastNameKana, lastNameKanji, maidenName, metadata, phone, ssnLast4, verification);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Individual)) {
                    return false;
                }
                Individual individual = (Individual) other;
                return Intrinsics.areEqual(this.address, individual.address) && Intrinsics.areEqual(this.addressKana, individual.addressKana) && Intrinsics.areEqual(this.addressKanji, individual.addressKanji) && Intrinsics.areEqual(this.dateOfBirth, individual.dateOfBirth) && Intrinsics.areEqual(this.email, individual.email) && Intrinsics.areEqual(this.firstName, individual.firstName) && Intrinsics.areEqual(this.firstNameKana, individual.firstNameKana) && Intrinsics.areEqual(this.firstNameKanji, individual.firstNameKanji) && Intrinsics.areEqual(this.gender, individual.gender) && Intrinsics.areEqual(this.idNumber, individual.idNumber) && Intrinsics.areEqual(this.lastName, individual.lastName) && Intrinsics.areEqual(this.lastNameKana, individual.lastNameKana) && Intrinsics.areEqual(this.lastNameKanji, individual.lastNameKanji) && Intrinsics.areEqual(this.maidenName, individual.maidenName) && Intrinsics.areEqual(this.metadata, individual.metadata) && Intrinsics.areEqual(this.phone, individual.phone) && Intrinsics.areEqual(this.ssnLast4, individual.ssnLast4) && Intrinsics.areEqual(this.verification, individual.verification);
            }

            public int hashCode() {
                Address address = this.address;
                int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
                AddressJapanParams addressJapanParams = this.addressKana;
                int iHashCode2 = (iHashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                int iHashCode3 = (iHashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
                DateOfBirth dateOfBirth = this.dateOfBirth;
                int iHashCode4 = (iHashCode3 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
                String str = this.email;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.firstName;
                int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.firstNameKana;
                int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.firstNameKanji;
                int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.gender;
                int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.idNumber;
                int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.lastName;
                int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.lastNameKana;
                int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.lastNameKanji;
                int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.maidenName;
                int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
                Map<String, String> map = this.metadata;
                int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
                String str11 = this.phone;
                int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.ssnLast4;
                int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
                Verification verification = this.verification;
                return iHashCode17 + (verification != null ? verification.hashCode() : 0);
            }

            public String toString() {
                return "Individual(address=" + this.address + ", addressKana=" + this.addressKana + ", addressKanji=" + this.addressKanji + ", dateOfBirth=" + this.dateOfBirth + ", email=" + this.email + ", firstName=" + this.firstName + ", firstNameKana=" + this.firstNameKana + ", firstNameKanji=" + this.firstNameKanji + ", gender=" + this.gender + ", idNumber=" + this.idNumber + ", lastName=" + this.lastName + ", lastNameKana=" + this.lastNameKana + ", lastNameKanji=" + this.lastNameKanji + ", maidenName=" + this.maidenName + ", metadata=" + this.metadata + ", phone=" + this.phone + ", ssnLast4=" + this.ssnLast4 + ", verification=" + this.verification + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Address address = this.address;
                if (address == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    address.writeToParcel(dest, flags);
                }
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressJapanParams.writeToParcel(dest, flags);
                }
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressJapanParams2.writeToParcel(dest, flags);
                }
                DateOfBirth dateOfBirth = this.dateOfBirth;
                if (dateOfBirth == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dateOfBirth.writeToParcel(dest, flags);
                }
                dest.writeString(this.email);
                dest.writeString(this.firstName);
                dest.writeString(this.firstNameKana);
                dest.writeString(this.firstNameKanji);
                dest.writeString(this.gender);
                dest.writeString(this.idNumber);
                dest.writeString(this.lastName);
                dest.writeString(this.lastNameKana);
                dest.writeString(this.lastNameKanji);
                dest.writeString(this.maidenName);
                Map<String, String> map = this.metadata;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        dest.writeString(entry.getKey());
                        dest.writeString(entry.getValue());
                    }
                }
                dest.writeString(this.phone);
                dest.writeString(this.ssnLast4);
                Verification verification = this.verification;
                if (verification == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    verification.writeToParcel(dest, flags);
                }
            }

            public /* synthetic */ Individual(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Verification verification, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : addressJapanParams, (i & 4) != 0 ? null : addressJapanParams2, (i & 8) != 0 ? null : dateOfBirth, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : map, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? null : verification);
            }

            public final Address getAddress() {
                return this.address;
            }

            public final void setAddress(Address address) {
                this.address = address;
            }

            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final DateOfBirth getDateOfBirth() {
                return this.dateOfBirth;
            }

            public final void setDateOfBirth(DateOfBirth dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public final String getEmail() {
                return this.email;
            }

            public final void setEmail(String str) {
                this.email = str;
            }

            public final String getFirstName() {
                return this.firstName;
            }

            public final void setFirstName(String str) {
                this.firstName = str;
            }

            public final String getFirstNameKana() {
                return this.firstNameKana;
            }

            public final void setFirstNameKana(String str) {
                this.firstNameKana = str;
            }

            public final String getFirstNameKanji() {
                return this.firstNameKanji;
            }

            public final void setFirstNameKanji(String str) {
                this.firstNameKanji = str;
            }

            public final String getGender() {
                return this.gender;
            }

            public final void setGender(String str) {
                this.gender = str;
            }

            public final String getIdNumber() {
                return this.idNumber;
            }

            public final void setIdNumber(String str) {
                this.idNumber = str;
            }

            public final String getLastName() {
                return this.lastName;
            }

            public final void setLastName(String str) {
                this.lastName = str;
            }

            public final String getLastNameKana() {
                return this.lastNameKana;
            }

            public final void setLastNameKana(String str) {
                this.lastNameKana = str;
            }

            public final String getLastNameKanji() {
                return this.lastNameKanji;
            }

            public final void setLastNameKanji(String str) {
                this.lastNameKanji = str;
            }

            public final String getMaidenName() {
                return this.maidenName;
            }

            public final void setMaidenName(String str) {
                this.maidenName = str;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final String getSsnLast4() {
                return this.ssnLast4;
            }

            public final void setSsnLast4(String str) {
                this.ssnLast4 = str;
            }

            public final Verification getVerification() {
                return this.verification;
            }

            public final void setVerification(Verification verification) {
                this.verification = verification;
            }

            public Individual(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification) {
                super(BusinessType.Individual, null);
                this.address = address;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.dateOfBirth = dateOfBirth;
                this.email = str;
                this.firstName = str2;
                this.firstNameKana = str3;
                this.firstNameKanji = str4;
                this.gender = str5;
                this.idNumber = str6;
                this.lastName = str7;
                this.lastNameKana = str8;
                this.lastNameKanji = str9;
                this.maidenName = str10;
                this.metadata = map;
                this.phone = str11;
                this.ssnLast4 = str12;
                this.verification = verification;
            }

            @Override // com.stripe.android.model.AccountParams.BusinessTypeParams
            public List<Pair<String, Object>> getParamsList() {
                Pair[] pairArr = new Pair[18];
                Address address = this.address;
                pairArr[0] = TuplesKt.to("address", address != null ? address.toParamMap() : null);
                AddressJapanParams addressJapanParams = this.addressKana;
                pairArr[1] = TuplesKt.to(PARAM_ADDRESS_KANA, addressJapanParams != null ? addressJapanParams.toParamMap() : null);
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                pairArr[2] = TuplesKt.to(PARAM_ADDRESS_KANJI, addressJapanParams2 != null ? addressJapanParams2.toParamMap() : null);
                DateOfBirth dateOfBirth = this.dateOfBirth;
                pairArr[3] = TuplesKt.to(PARAM_DOB, dateOfBirth != null ? dateOfBirth.toParamMap() : null);
                pairArr[4] = TuplesKt.to("email", this.email);
                pairArr[5] = TuplesKt.to(PARAM_FIRST_NAME, this.firstName);
                pairArr[6] = TuplesKt.to(PARAM_FIRST_NAME_KANA, this.firstNameKana);
                pairArr[7] = TuplesKt.to(PARAM_FIRST_NAME_KANJI, this.firstNameKanji);
                pairArr[8] = TuplesKt.to("gender", this.gender);
                pairArr[9] = TuplesKt.to(PARAM_ID_NUMBER, this.idNumber);
                pairArr[10] = TuplesKt.to(PARAM_LAST_NAME, this.lastName);
                pairArr[11] = TuplesKt.to(PARAM_LAST_NAME_KANA, this.lastNameKana);
                pairArr[12] = TuplesKt.to(PARAM_LAST_NAME_KANJI, this.lastNameKanji);
                pairArr[13] = TuplesKt.to(PARAM_MAIDEN_NAME, this.maidenName);
                pairArr[14] = TuplesKt.to(PARAM_METADATA, this.metadata);
                pairArr[15] = TuplesKt.to("phone", this.phone);
                pairArr[16] = TuplesKt.to(PARAM_SSN_LAST_4, this.ssnLast4);
                Verification verification = this.verification;
                pairArr[17] = TuplesKt.to(PARAM_VERIFICATION, verification != null ? verification.toParamMap() : null);
                return CollectionsKt.listOf((Object[]) pairArr);
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\""}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Verification.PARAM_DOCUMENT, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "additionalDocument", "<init>", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getDocument", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "setDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getAdditionalDocument", "setAdditionalDocument", "toParamMap", "", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Verification implements StripeParamsModel, Parcelable {
                private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
                private static final String PARAM_DOCUMENT = "document";
                private Document additionalDocument;
                private Document document;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: AccountParams.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Verification> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Verification() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Verification(Document document) {
                    this(document, null, 2, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document, Document document2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        document = verification.document;
                    }
                    if ((i & 2) != 0) {
                        document2 = verification.additionalDocument;
                    }
                    return verification.copy(document, document2);
                }

                /* renamed from: component1, reason: from getter */
                public final Document getDocument() {
                    return this.document;
                }

                /* renamed from: component2, reason: from getter */
                public final Document getAdditionalDocument() {
                    return this.additionalDocument;
                }

                public final Verification copy(Document document, Document additionalDocument) {
                    return new Verification(document, additionalDocument);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Verification)) {
                        return false;
                    }
                    Verification verification = (Verification) other;
                    return Intrinsics.areEqual(this.document, verification.document) && Intrinsics.areEqual(this.additionalDocument, verification.additionalDocument);
                }

                public int hashCode() {
                    Document document = this.document;
                    int iHashCode = (document == null ? 0 : document.hashCode()) * 31;
                    Document document2 = this.additionalDocument;
                    return iHashCode + (document2 != null ? document2.hashCode() : 0);
                }

                public String toString() {
                    return "Verification(document=" + this.document + ", additionalDocument=" + this.additionalDocument + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    Document document = this.document;
                    if (document == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        document.writeToParcel(dest, flags);
                    }
                    Document document2 = this.additionalDocument;
                    if (document2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        document2.writeToParcel(dest, flags);
                    }
                }

                public Verification(Document document, Document document2) {
                    this.document = document;
                    this.additionalDocument = document2;
                }

                public /* synthetic */ Verification(Document document, Document document2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : document, (i & 2) != 0 ? null : document2);
                }

                public final Document getDocument() {
                    return this.document;
                }

                public final void setDocument(Document document) {
                    this.document = document;
                }

                public final Document getAdditionalDocument() {
                    return this.additionalDocument;
                }

                public final void setAdditionalDocument(Document document) {
                    this.additionalDocument = document;
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    Pair[] pairArr = new Pair[2];
                    Document document = this.additionalDocument;
                    pairArr[0] = TuplesKt.to(PARAM_ADDITIONAL_DOCUMENT, document != null ? document.toParamMap() : null);
                    Document document2 = this.document;
                    pairArr[1] = TuplesKt.to(PARAM_DOCUMENT, document2 != null ? document2.toParamMap() : null);
                    List<Pair> listListOf = CollectionsKt.listOf((Object[]) pairArr);
                    Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
                    for (Pair pair : listListOf) {
                        String str = (String) pair.component1();
                        Map map = (Map) pair.component2();
                        Map mapMapOf = map != null ? MapsKt.mapOf(TuplesKt.to(str, map)) : null;
                        if (mapMapOf == null) {
                            mapMapOf = MapsKt.emptyMap();
                        }
                        mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
                    }
                    return mapEmptyMap;
                }

                /* compiled from: AccountParams.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification$Companion;", "", "<init>", "()V", "PARAM_ADDITIONAL_DOCUMENT", "", "PARAM_DOCUMENT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                private static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }
                }
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", Document.PARAM_FRONT, "", Document.PARAM_BACK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toParamMap", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Document implements StripeParamsModel, Parcelable {
                private static final String PARAM_BACK = "back";
                private static final String PARAM_FRONT = "front";
                private String back;
                private String front;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Document> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: AccountParams.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Document> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Document(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Document[] newArray(int i) {
                        return new Document[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Document() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Document(String str) {
                    this(str, null, 2, 0 == true ? 1 : 0);
                }

                /* renamed from: component1, reason: from getter */
                private final String getFront() {
                    return this.front;
                }

                /* renamed from: component2, reason: from getter */
                private final String getBack() {
                    return this.back;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = document.front;
                    }
                    if ((i & 2) != 0) {
                        str2 = document.back;
                    }
                    return document.copy(str, str2);
                }

                public final Document copy(String front, String back) {
                    return new Document(front, back);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Document)) {
                        return false;
                    }
                    Document document = (Document) other;
                    return Intrinsics.areEqual(this.front, document.front) && Intrinsics.areEqual(this.back, document.back);
                }

                public int hashCode() {
                    String str = this.front;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.back;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Document(front=" + this.front + ", back=" + this.back + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.front);
                    dest.writeString(this.back);
                }

                public Document(String str, String str2) {
                    this.front = str;
                    this.back = str2;
                }

                public /* synthetic */ Document(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_FRONT, this.front), TuplesKt.to(PARAM_BACK, this.back)});
                    Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
                    for (Pair pair : listListOf) {
                        String str = (String) pair.component1();
                        String str2 = (String) pair.component2();
                        Map mapMapOf = str2 != null ? MapsKt.mapOf(TuplesKt.to(str, str2)) : null;
                        if (mapMapOf == null) {
                            mapMapOf = MapsKt.emptyMap();
                        }
                        mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
                    }
                    return mapEmptyMap;
                }

                /* compiled from: AccountParams.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document$Companion;", "", "<init>", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                private static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }
                }
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010!\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u0010*\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017J\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010.\u001a\u00020/R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "", "<init>", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", Individual.PARAM_METADATA, "", "phone", "ssnLast4", Individual.PARAM_VERIFICATION, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "setAddress", "setAddressKana", "setAddressKanji", "setDateOfBirth", "setEmail", "setFirstName", "setFirstNameKana", "setFirstNameKanji", "setGender", "setIdNumber", "setLastName", "setLastNameKana", "setLastNameKanji", "setMaidenName", "setMetadata", "setPhone", "setSsnLast4", "setVerification", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Builder {
                public static final int $stable = 8;
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private DateOfBirth dateOfBirth;
                private String email;
                private String firstName;
                private String firstNameKana;
                private String firstNameKanji;
                private String gender;
                private String idNumber;
                private String lastName;
                private String lastNameKana;
                private String lastNameKanji;
                private String maidenName;
                private Map<String, String> metadata;
                private String phone;
                private String ssnLast4;
                private Verification verification;

                public final Builder setAddress(Address address) {
                    this.address = address;
                    return this;
                }

                public final Builder setAddressKana(AddressJapanParams addressKana) {
                    this.addressKana = addressKana;
                    return this;
                }

                public final Builder setAddressKanji(AddressJapanParams addressKanji) {
                    this.addressKanji = addressKanji;
                    return this;
                }

                public final Builder setDateOfBirth(DateOfBirth dateOfBirth) {
                    this.dateOfBirth = dateOfBirth;
                    return this;
                }

                public final Builder setEmail(String email) {
                    this.email = email;
                    return this;
                }

                public final Builder setFirstName(String firstName) {
                    this.firstName = firstName;
                    return this;
                }

                public final Builder setFirstNameKana(String firstNameKana) {
                    this.firstNameKana = firstNameKana;
                    return this;
                }

                public final Builder setFirstNameKanji(String firstNameKanji) {
                    this.firstNameKanji = firstNameKanji;
                    return this;
                }

                public final Builder setGender(String gender) {
                    this.gender = gender;
                    return this;
                }

                public final Builder setIdNumber(String idNumber) {
                    this.idNumber = idNumber;
                    return this;
                }

                public final Builder setLastName(String lastName) {
                    this.lastName = lastName;
                    return this;
                }

                public final Builder setLastNameKana(String lastNameKana) {
                    this.lastNameKana = lastNameKana;
                    return this;
                }

                public final Builder setLastNameKanji(String lastNameKanji) {
                    this.lastNameKanji = lastNameKanji;
                    return this;
                }

                public final Builder setMaidenName(String maidenName) {
                    this.maidenName = maidenName;
                    return this;
                }

                public final Builder setMetadata(Map<String, String> metadata) {
                    this.metadata = metadata;
                    return this;
                }

                public final Builder setPhone(String phone) {
                    this.phone = phone;
                    return this;
                }

                public final Builder setSsnLast4(String ssnLast4) {
                    this.ssnLast4 = ssnLast4;
                    return this;
                }

                public final Builder setVerification(Verification verification) {
                    this.verification = verification;
                    return this;
                }

                public final Individual build() {
                    return new Individual(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.ssnLast4, this.verification);
                }
            }

            /* compiled from: AccountParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Companion;", "", "<init>", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PHONE", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }
    }

    /* compiled from: AccountParams.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/AccountParams$Companion;", "", "<init>", "()V", "PARAM_BUSINESS_TYPE", "", "PARAM_TOS_SHOWN_AND_ACCEPTED", "create", "Lcom/stripe/android/model/AccountParams;", "tosShownAndAccepted", "", "individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "company", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "businessType", "Lcom/stripe/android/model/AccountParams$BusinessType;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: AccountParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BusinessType.values().length];
                try {
                    iArr[BusinessType.Individual.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BusinessType.Company.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountParams create(boolean tosShownAndAccepted, BusinessTypeParams.Individual individual) {
            Intrinsics.checkNotNullParameter(individual, "individual");
            return new AccountParams(tosShownAndAccepted, individual);
        }

        @JvmStatic
        public final AccountParams create(boolean tosShownAndAccepted, BusinessTypeParams.Company company) {
            Intrinsics.checkNotNullParameter(company, "company");
            return new AccountParams(tosShownAndAccepted, company);
        }

        @JvmStatic
        public final AccountParams create(boolean tosShownAndAccepted, BusinessType businessType) {
            BusinessTypeParams.Individual individual;
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            int i = WhenMappings.$EnumSwitchMapping$0[businessType.ordinal()];
            if (i == 1) {
                individual = new BusinessTypeParams.Individual(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                individual = new BusinessTypeParams.Company(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
            return new AccountParams(tosShownAndAccepted, individual);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final AccountParams create(boolean tosShownAndAccepted) {
            return new AccountParams(tosShownAndAccepted, null, 2, 0 == true ? 1 : 0);
        }
    }
}
