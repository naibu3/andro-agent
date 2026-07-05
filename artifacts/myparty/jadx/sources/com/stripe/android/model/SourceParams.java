package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.Address;
import com.stripe.android.model.KlarnaSourceParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrderParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SourceParams.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0006nopqrsB»\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010M\u001a\u00020\u00002\u0016\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010K\u0018\u00010\u0015J\u0014\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020K0\u0015H\u0016J\t\u0010O\u001a\u00020\u0004HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\bQJ\u0010\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\t\u0010\\\u001a\u00020\u0019HÂ\u0003J\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bHÀ\u0003¢\u0006\u0002\b^JÄ\u0001\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bHÀ\u0001¢\u0006\u0004\b`\u0010aJ\u0006\u0010b\u001a\u00020cJ\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010g\u001a\u00020cHÖ\u0001J\t\u0010h\u001a\u00020\u0004HÖ\u0001J\u0016\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020cR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010+R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\bG\u0010H\u001a\u0004\bI\u0010\u001fR\u001f\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010K0\u00158F¢\u0006\u0006\u001a\u0004\bL\u0010A¨\u0006t"}, d2 = {"Lcom/stripe/android/model/SourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "typeRaw", "", "typeData", "Lcom/stripe/android/model/SourceParams$TypeData;", "amount", "", "currency", SourceParams.PARAM_OWNER, "Lcom/stripe/android/model/SourceParams$OwnerParams;", "usage", "Lcom/stripe/android/model/Source$Usage;", "returnUrl", SourceParams.PARAM_FLOW, "Lcom/stripe/android/model/SourceParams$Flow;", "sourceOrder", "Lcom/stripe/android/model/SourceOrderParams;", SourceParams.PARAM_TOKEN, SourceParams.PARAM_METADATA, "", "weChatParams", "Lcom/stripe/android/model/SourceParams$WeChatParams;", "apiParams", "Lcom/stripe/android/model/SourceParams$ApiParams;", "attribution", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)V", "getTypeRaw", "()Ljava/lang/String;", "getTypeData$payments_core_release", "()Lcom/stripe/android/model/SourceParams$TypeData;", "setTypeData$payments_core_release", "(Lcom/stripe/android/model/SourceParams$TypeData;)V", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrency", "setCurrency", "(Ljava/lang/String;)V", "getOwner", "()Lcom/stripe/android/model/SourceParams$OwnerParams;", "setOwner", "(Lcom/stripe/android/model/SourceParams$OwnerParams;)V", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "setUsage", "(Lcom/stripe/android/model/Source$Usage;)V", "getReturnUrl", "setReturnUrl", "getFlow", "()Lcom/stripe/android/model/SourceParams$Flow;", "setFlow", "(Lcom/stripe/android/model/SourceParams$Flow;)V", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrderParams;", "setSourceOrder", "(Lcom/stripe/android/model/SourceOrderParams;)V", "getToken", "setToken", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getAttribution$payments_core_release", "()Ljava/util/Set;", "type", "getType$annotations", "()V", "getType", "apiParameterMap", "", "getApiParameterMap", "setApiParameterMap", "toParamMap", "component1", "component2", "component2$payments_core_release", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component14$payments_core_release", "copy", "copy$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/model/SourceParams$TypeData;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$OwnerParams;Lcom/stripe/android/model/Source$Usage;Ljava/lang/String;Lcom/stripe/android/model/SourceParams$Flow;Lcom/stripe/android/model/SourceOrderParams;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/SourceParams$WeChatParams;Lcom/stripe/android/model/SourceParams$ApiParams;Ljava/util/Set;)Lcom/stripe/android/model/SourceParams;", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "WeChatParams", "OwnerParams", "Flow", "Companion", "ApiParams", "TypeData", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SourceParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_AMOUNT = "amount";
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_CURRENCY = "currency";
    private static final String PARAM_FLOW = "flow";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_OWNER = "owner";
    private static final String PARAM_REDIRECT = "redirect";
    private static final String PARAM_RETURN_URL = "return_url";
    private static final String PARAM_SOURCE_ORDER = "source_order";
    private static final String PARAM_TOKEN = "token";
    private static final String PARAM_TYPE = "type";
    private static final String PARAM_USAGE = "usage";
    private static final String PARAM_WECHAT = "wechat";
    private Long amount;
    private ApiParams apiParams;
    private final Set<String> attribution;
    private String currency;
    private Flow flow;
    private Map<String, String> metadata;
    private OwnerParams owner;
    private String returnUrl;
    private SourceOrderParams sourceOrder;
    private String token;
    private TypeData typeData;
    private final String typeRaw;
    private Source.Usage usage;
    private WeChatParams weChatParams;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SourceParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: SourceParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            TypeData typeData = (TypeData) parcel.readParcelable(SourceParams.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            OwnerParams ownerParamsCreateFromParcel = parcel.readInt() == 0 ? null : OwnerParams.CREATOR.createFromParcel(parcel);
            Source.Usage usageValueOf = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String string3 = parcel.readString();
            Flow flowValueOf = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            SourceOrderParams sourceOrderParamsCreateFromParcel = parcel.readInt() == 0 ? null : SourceOrderParams.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            WeChatParams weChatParamsCreateFromParcel = parcel.readInt() == 0 ? null : WeChatParams.CREATOR.createFromParcel(parcel);
            ApiParams apiParamsCreateFromParcel = ApiParams.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashSet.add(parcel.readString());
            }
            return new SourceParams(string, typeData, lValueOf, string2, ownerParamsCreateFromParcel, usageValueOf, string3, flowValueOf, sourceOrderParamsCreateFromParcel, string4, linkedHashMap2, weChatParamsCreateFromParcel, apiParamsCreateFromParcel, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceParams[] newArray(int i) {
            return new SourceParams[i];
        }
    }

    /* renamed from: component12, reason: from getter */
    private final WeChatParams getWeChatParams() {
        return this.weChatParams;
    }

    /* renamed from: component13, reason: from getter */
    private final ApiParams getApiParams() {
        return this.apiParams;
    }

    @JvmStatic
    public static final SourceParams createAlipayReusableParams(String str, String str2, String str3, String str4) {
        return INSTANCE.createAlipayReusableParams(str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createAlipaySingleUseParams(long j, String str, String str2, String str3, String str4) {
        return INSTANCE.createAlipaySingleUseParams(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createBancontactParams(long j, String str, String str2, String str3, String str4) {
        return INSTANCE.createBancontactParams(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createCardParams(CardParams cardParams) {
        return INSTANCE.createCardParams(cardParams);
    }

    @JvmStatic
    public static final SourceParams createCardParamsFromGooglePay(JSONObject jSONObject) throws JSONException {
        return INSTANCE.createCardParamsFromGooglePay(jSONObject);
    }

    @JvmStatic
    public static final SourceParams createCustomParams(String str) {
        return INSTANCE.createCustomParams(str);
    }

    @JvmStatic
    public static final SourceParams createEPSParams(long j, String str, String str2, String str3) {
        return INSTANCE.createEPSParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createGiropayParams(long j, String str, String str2, String str3) {
        return INSTANCE.createGiropayParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createIdealParams(long j, String str, String str2, String str3, String str4) {
        return INSTANCE.createIdealParams(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final SourceParams createKlarna(String str, String str2, KlarnaSourceParams klarnaSourceParams) {
        return INSTANCE.createKlarna(str, str2, klarnaSourceParams);
    }

    @JvmStatic
    public static final SourceParams createMasterpassParams(String str, String str2) {
        return INSTANCE.createMasterpassParams(str, str2);
    }

    @JvmStatic
    public static final SourceParams createMultibancoParams(long j, String str, String str2) {
        return INSTANCE.createMultibancoParams(j, str, str2);
    }

    @JvmStatic
    public static final SourceParams createP24Params(long j, String str, String str2, String str3, String str4) {
        return INSTANCE.createP24Params(j, str, str2, str3, str4);
    }

    @JvmStatic
    public static final Map<String, String> createRetrieveSourceParams(String str) {
        return INSTANCE.createRetrieveSourceParams(str);
    }

    @JvmStatic
    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6) {
        return INSTANCE.createSepaDebitParams(str, str2, str3, str4, str5, str6);
    }

    @JvmStatic
    public static final SourceParams createSepaDebitParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return INSTANCE.createSepaDebitParams(str, str2, str3, str4, str5, str6, str7);
    }

    @JvmStatic
    public static final SourceParams createSofortParams(long j, String str, String str2, String str3) {
        return INSTANCE.createSofortParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createSourceFromTokenParams(String str) {
        return INSTANCE.createSourceFromTokenParams(str);
    }

    @JvmStatic
    public static final SourceParams createThreeDSecureParams(long j, String str, String str2, String str3) {
        return INSTANCE.createThreeDSecureParams(j, str, str2, str3);
    }

    @JvmStatic
    public static final SourceParams createVisaCheckoutParams(String str) {
        return INSTANCE.createVisaCheckoutParams(str);
    }

    @JvmStatic
    public static final SourceParams createWeChatPayParams(long j, String str, String str2, String str3) {
        return INSTANCE.createWeChatPayParams(j, str, str2, str3);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTypeRaw() {
        return this.typeRaw;
    }

    /* renamed from: component10, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final Map<String, String> component11() {
        return this.metadata;
    }

    public final Set<String> component14$payments_core_release() {
        return this.attribution;
    }

    /* renamed from: component2$payments_core_release, reason: from getter */
    public final TypeData getTypeData() {
        return this.typeData;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component5, reason: from getter */
    public final OwnerParams getOwner() {
        return this.owner;
    }

    /* renamed from: component6, reason: from getter */
    public final Source.Usage getUsage() {
        return this.usage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final Flow getFlow() {
        return this.flow;
    }

    /* renamed from: component9, reason: from getter */
    public final SourceOrderParams getSourceOrder() {
        return this.sourceOrder;
    }

    public final SourceParams copy$payments_core_release(String typeRaw, TypeData typeData, Long amount, String currency, OwnerParams owner, Source.Usage usage, String returnUrl, Flow flow, SourceOrderParams sourceOrder, String token, Map<String, String> metadata, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        return new SourceParams(typeRaw, typeData, amount, currency, owner, usage, returnUrl, flow, sourceOrder, token, metadata, weChatParams, apiParams, attribution);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceParams)) {
            return false;
        }
        SourceParams sourceParams = (SourceParams) other;
        return Intrinsics.areEqual(this.typeRaw, sourceParams.typeRaw) && Intrinsics.areEqual(this.typeData, sourceParams.typeData) && Intrinsics.areEqual(this.amount, sourceParams.amount) && Intrinsics.areEqual(this.currency, sourceParams.currency) && Intrinsics.areEqual(this.owner, sourceParams.owner) && this.usage == sourceParams.usage && Intrinsics.areEqual(this.returnUrl, sourceParams.returnUrl) && this.flow == sourceParams.flow && Intrinsics.areEqual(this.sourceOrder, sourceParams.sourceOrder) && Intrinsics.areEqual(this.token, sourceParams.token) && Intrinsics.areEqual(this.metadata, sourceParams.metadata) && Intrinsics.areEqual(this.weChatParams, sourceParams.weChatParams) && Intrinsics.areEqual(this.apiParams, sourceParams.apiParams) && Intrinsics.areEqual(this.attribution, sourceParams.attribution);
    }

    public int hashCode() {
        int iHashCode = this.typeRaw.hashCode() * 31;
        TypeData typeData = this.typeData;
        int iHashCode2 = (iHashCode + (typeData == null ? 0 : typeData.hashCode())) * 31;
        Long l = this.amount;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OwnerParams ownerParams = this.owner;
        int iHashCode5 = (iHashCode4 + (ownerParams == null ? 0 : ownerParams.hashCode())) * 31;
        Source.Usage usage = this.usage;
        int iHashCode6 = (iHashCode5 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.returnUrl;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Flow flow = this.flow;
        int iHashCode8 = (iHashCode7 + (flow == null ? 0 : flow.hashCode())) * 31;
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        int iHashCode9 = (iHashCode8 + (sourceOrderParams == null ? 0 : sourceOrderParams.hashCode())) * 31;
        String str3 = this.token;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode11 = (iHashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        WeChatParams weChatParams = this.weChatParams;
        return ((((iHashCode11 + (weChatParams != null ? weChatParams.hashCode() : 0)) * 31) + this.apiParams.hashCode()) * 31) + this.attribution.hashCode();
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.typeRaw + ", typeData=" + this.typeData + ", amount=" + this.amount + ", currency=" + this.currency + ", owner=" + this.owner + ", usage=" + this.usage + ", returnUrl=" + this.returnUrl + ", flow=" + this.flow + ", sourceOrder=" + this.sourceOrder + ", token=" + this.token + ", metadata=" + this.metadata + ", weChatParams=" + this.weChatParams + ", apiParams=" + this.apiParams + ", attribution=" + this.attribution + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) throws JSONException {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.typeRaw);
        dest.writeParcelable(this.typeData, flags);
        Long l = this.amount;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeString(this.currency);
        OwnerParams ownerParams = this.owner;
        if (ownerParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ownerParams.writeToParcel(dest, flags);
        }
        Source.Usage usage = this.usage;
        if (usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(usage.name());
        }
        dest.writeString(this.returnUrl);
        Flow flow = this.flow;
        if (flow == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(flow.name());
        }
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        if (sourceOrderParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sourceOrderParams.writeToParcel(dest, flags);
        }
        dest.writeString(this.token);
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
        WeChatParams weChatParams = this.weChatParams;
        if (weChatParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            weChatParams.writeToParcel(dest, flags);
        }
        this.apiParams.writeToParcel(dest, flags);
        Set<String> set = this.attribution;
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
    }

    public SourceParams(String typeRaw, TypeData typeData, Long l, String str, OwnerParams ownerParams, Source.Usage usage, String str2, Flow flow, SourceOrderParams sourceOrderParams, String str3, Map<String, String> map, WeChatParams weChatParams, ApiParams apiParams, Set<String> attribution) {
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        this.typeRaw = typeRaw;
        this.typeData = typeData;
        this.amount = l;
        this.currency = str;
        this.owner = ownerParams;
        this.usage = usage;
        this.returnUrl = str2;
        this.flow = flow;
        this.sourceOrder = sourceOrderParams;
        this.token = str3;
        this.metadata = map;
        this.weChatParams = weChatParams;
        this.apiParams = apiParams;
        this.attribution = attribution;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final TypeData getTypeData$payments_core_release() {
        return this.typeData;
    }

    public final void setTypeData$payments_core_release(TypeData typeData) {
        this.typeData = typeData;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final void setAmount(Long l) {
        this.amount = l;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final OwnerParams getOwner() {
        return this.owner;
    }

    public final void setOwner(OwnerParams ownerParams) {
        this.owner = ownerParams;
    }

    public final Source.Usage getUsage() {
        return this.usage;
    }

    public final void setUsage(Source.Usage usage) {
        this.usage = usage;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public final void setFlow(Flow flow) {
        this.flow = flow;
    }

    public final SourceOrderParams getSourceOrder() {
        return this.sourceOrder;
    }

    public final void setSourceOrder(SourceOrderParams sourceOrderParams) {
        this.sourceOrder = sourceOrderParams;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SourceParams(String str, TypeData typeData, Long l, String str2, OwnerParams ownerParams, Source.Usage usage, String str3, Flow flow, SourceOrderParams sourceOrderParams, String str4, Map map, WeChatParams weChatParams, ApiParams apiParams, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ApiParams apiParams2;
        Map map2 = null;
        Object[] objArr = 0;
        TypeData typeData2 = (i & 2) != 0 ? null : typeData;
        Long l2 = (i & 4) != 0 ? null : l;
        String str5 = (i & 8) != 0 ? null : str2;
        OwnerParams ownerParams2 = (i & 16) != 0 ? null : ownerParams;
        Source.Usage usage2 = (i & 32) != 0 ? null : usage;
        String str6 = (i & 64) != 0 ? null : str3;
        Flow flow2 = (i & 128) != 0 ? null : flow;
        SourceOrderParams sourceOrderParams2 = (i & 256) != 0 ? null : sourceOrderParams;
        String str7 = (i & 512) != 0 ? null : str4;
        Map map3 = (i & 1024) != 0 ? null : map;
        WeChatParams weChatParams2 = (i & 2048) != 0 ? null : weChatParams;
        if ((i & 4096) != 0) {
            apiParams2 = new ApiParams(map2, 1, objArr == true ? 1 : 0);
        } else {
            apiParams2 = apiParams;
        }
        this(str, typeData2, l2, str5, ownerParams2, usage2, str6, flow2, sourceOrderParams2, str7, map3, weChatParams2, apiParams2, (i & 8192) != 0 ? SetsKt.emptySet() : set);
    }

    public final Set<String> getAttribution$payments_core_release() {
        return this.attribution;
    }

    public final String getType() {
        return Source.INSTANCE.asSourceType(this.typeRaw);
    }

    public final Map<String, Object> getApiParameterMap() {
        return this.apiParams.getValue();
    }

    public final SourceParams setApiParameterMap(Map<String, ? extends Object> apiParameterMap) {
        if (apiParameterMap == null) {
            apiParameterMap = MapsKt.emptyMap();
        }
        this.apiParams = new ApiParams(apiParameterMap);
        return this;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("type", this.typeRaw));
        Map<String, Object> value = this.apiParams.getValue();
        if (value.isEmpty()) {
            value = null;
        }
        Map mapMapOf2 = value != null ? MapsKt.mapOf(TuplesKt.to(this.typeRaw, value)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(mapMapOf, mapMapOf2);
        TypeData typeData = this.typeData;
        Map<String, Map<String, Object>> mapCreateParams = typeData != null ? typeData.createParams() : null;
        if (mapCreateParams == null) {
            mapCreateParams = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapCreateParams);
        Long l = this.amount;
        Map mapMapOf3 = l != null ? MapsKt.mapOf(TuplesKt.to("amount", Long.valueOf(l.longValue()))) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
        String str = this.currency;
        Map mapMapOf4 = str != null ? MapsKt.mapOf(TuplesKt.to("currency", str)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        Map mapPlus4 = MapsKt.plus(mapPlus3, mapMapOf4);
        Flow flow = this.flow;
        Map mapMapOf5 = flow != null ? MapsKt.mapOf(TuplesKt.to(PARAM_FLOW, flow.getCode())) : null;
        if (mapMapOf5 == null) {
            mapMapOf5 = MapsKt.emptyMap();
        }
        Map mapPlus5 = MapsKt.plus(mapPlus4, mapMapOf5);
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        Map mapMapOf6 = sourceOrderParams != null ? MapsKt.mapOf(TuplesKt.to(PARAM_SOURCE_ORDER, sourceOrderParams.toParamMap())) : null;
        if (mapMapOf6 == null) {
            mapMapOf6 = MapsKt.emptyMap();
        }
        Map mapPlus6 = MapsKt.plus(mapPlus5, mapMapOf6);
        OwnerParams ownerParams = this.owner;
        Map mapMapOf7 = ownerParams != null ? MapsKt.mapOf(TuplesKt.to(PARAM_OWNER, ownerParams.toParamMap())) : null;
        if (mapMapOf7 == null) {
            mapMapOf7 = MapsKt.emptyMap();
        }
        Map mapPlus7 = MapsKt.plus(mapPlus6, mapMapOf7);
        String str2 = this.returnUrl;
        Map mapMapOf8 = str2 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_REDIRECT, MapsKt.mapOf(TuplesKt.to("return_url", str2)))) : null;
        if (mapMapOf8 == null) {
            mapMapOf8 = MapsKt.emptyMap();
        }
        Map mapPlus8 = MapsKt.plus(mapPlus7, mapMapOf8);
        Map<String, String> map = this.metadata;
        Map mapMapOf9 = map != null ? MapsKt.mapOf(TuplesKt.to(PARAM_METADATA, map)) : null;
        if (mapMapOf9 == null) {
            mapMapOf9 = MapsKt.emptyMap();
        }
        Map mapPlus9 = MapsKt.plus(mapPlus8, mapMapOf9);
        String str3 = this.token;
        Map mapMapOf10 = str3 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_TOKEN, str3)) : null;
        if (mapMapOf10 == null) {
            mapMapOf10 = MapsKt.emptyMap();
        }
        Map mapPlus10 = MapsKt.plus(mapPlus9, mapMapOf10);
        Source.Usage usage = this.usage;
        Map mapMapOf11 = usage != null ? MapsKt.mapOf(TuplesKt.to("usage", usage.getCode())) : null;
        if (mapMapOf11 == null) {
            mapMapOf11 = MapsKt.emptyMap();
        }
        Map mapPlus11 = MapsKt.plus(mapPlus10, mapMapOf11);
        WeChatParams weChatParams = this.weChatParams;
        Map mapMapOf12 = weChatParams != null ? MapsKt.mapOf(TuplesKt.to("wechat", weChatParams.toParamMap())) : null;
        if (mapMapOf12 == null) {
            mapMapOf12 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus11, mapMapOf12);
    }

    /* compiled from: SourceParams.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÂ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/SourceParams$WeChatParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "appId", "", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toParamMap", "", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WeChatParams implements StripeParamsModel, Parcelable {
        private static final String PARAM_APPID = "appid";
        private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
        private final String appId;
        private final String statementDescriptor;
        public static final Parcelable.Creator<WeChatParams> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SourceParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WeChatParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WeChatParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatParams[] newArray(int i) {
                return new WeChatParams[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WeChatParams() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* renamed from: component1, reason: from getter */
        private final String getAppId() {
            return this.appId;
        }

        /* renamed from: component2, reason: from getter */
        private final String getStatementDescriptor() {
            return this.statementDescriptor;
        }

        public static /* synthetic */ WeChatParams copy$default(WeChatParams weChatParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = weChatParams.appId;
            }
            if ((i & 2) != 0) {
                str2 = weChatParams.statementDescriptor;
            }
            return weChatParams.copy(str, str2);
        }

        public final WeChatParams copy(String appId, String statementDescriptor) {
            return new WeChatParams(appId, statementDescriptor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeChatParams)) {
                return false;
            }
            WeChatParams weChatParams = (WeChatParams) other;
            return Intrinsics.areEqual(this.appId, weChatParams.appId) && Intrinsics.areEqual(this.statementDescriptor, weChatParams.statementDescriptor);
        }

        public int hashCode() {
            String str = this.appId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.statementDescriptor;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WeChatParams(appId=" + this.appId + ", statementDescriptor=" + this.statementDescriptor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.appId);
            dest.writeString(this.statementDescriptor);
        }

        public WeChatParams(String str, String str2) {
            this.appId = str;
            this.statementDescriptor = str2;
        }

        public /* synthetic */ WeChatParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            String str = this.appId;
            Map mapMapOf = str != null ? MapsKt.mapOf(TuplesKt.to(PARAM_APPID, str)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str2 = this.statementDescriptor;
            Map mapMapOf2 = str2 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_STATEMENT_DESCRIPTOR, str2)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus, mapMapOf2);
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B9\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b!J9\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u00060"}, d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress$payments_core_release", "()Lcom/stripe/android/model/Address;", "setAddress$payments_core_release", "(Lcom/stripe/android/model/Address;)V", "getEmail$payments_core_release", "()Ljava/lang/String;", "setEmail$payments_core_release", "(Ljava/lang/String;)V", "getName$payments_core_release", "setName$payments_core_release", "getPhone$payments_core_release", "setPhone$payments_core_release", "toParamMap", "", "", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OwnerParams implements StripeParamsModel, Parcelable {
        private static final String PARAM_ADDRESS = "address";
        private static final String PARAM_EMAIL = "email";
        private static final String PARAM_NAME = "name";
        private static final String PARAM_PHONE = "phone";
        private Address address;
        private String email;
        private String name;
        private String phone;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<OwnerParams> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SourceParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OwnerParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OwnerParams(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OwnerParams[] newArray(int i) {
                return new OwnerParams[i];
            }
        }

        public OwnerParams() {
            this(null, null, null, null, 15, null);
        }

        public OwnerParams(Address address) {
            this(address, null, null, null, 14, null);
        }

        public OwnerParams(Address address, String str) {
            this(address, str, null, null, 12, null);
        }

        public OwnerParams(Address address, String str, String str2) {
            this(address, str, str2, null, 8, null);
        }

        public static /* synthetic */ OwnerParams copy$default(OwnerParams ownerParams, Address address, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = ownerParams.address;
            }
            if ((i & 2) != 0) {
                str = ownerParams.email;
            }
            if ((i & 4) != 0) {
                str2 = ownerParams.name;
            }
            if ((i & 8) != 0) {
                str3 = ownerParams.phone;
            }
            return ownerParams.copy(address, str, str2, str3);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3$payments_core_release, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4$payments_core_release, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final OwnerParams copy(Address address, String email, String name, String phone) {
            return new OwnerParams(address, email, name, phone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnerParams)) {
                return false;
            }
            OwnerParams ownerParams = (OwnerParams) other;
            return Intrinsics.areEqual(this.address, ownerParams.address) && Intrinsics.areEqual(this.email, ownerParams.email) && Intrinsics.areEqual(this.name, ownerParams.name) && Intrinsics.areEqual(this.phone, ownerParams.phone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OwnerParams(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
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
            dest.writeString(this.email);
            dest.writeString(this.name);
            dest.writeString(this.phone);
        }

        public OwnerParams(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ OwnerParams(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final void setAddress$payments_core_release(Address address) {
            this.address = address;
        }

        public final String getEmail$payments_core_release() {
            return this.email;
        }

        public final void setEmail$payments_core_release(String str) {
            this.email = str;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final void setName$payments_core_release(String str) {
            this.name = str;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public final void setPhone$payments_core_release(String str) {
            this.phone = str;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            Address address = this.address;
            Map mapMapOf = address != null ? MapsKt.mapOf(TuplesKt.to("address", address.toParamMap())) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str = this.email;
            Map mapMapOf2 = str != null ? MapsKt.mapOf(TuplesKt.to("email", str)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf2);
            String str2 = this.name;
            Map mapMapOf3 = str2 != null ? MapsKt.mapOf(TuplesKt.to("name", str2)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
            String str3 = this.phone;
            Map mapMapOf4 = str3 != null ? MapsKt.mapOf(TuplesKt.to("phone", str3)) : null;
            if (mapMapOf4 == null) {
                mapMapOf4 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus3, mapMapOf4);
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/SourceParams$OwnerParams$Companion;", "", "<init>", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SourceParams.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/SourceParams$Flow;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;
        private final String code;
        public static final Flow Redirect = new Flow("Redirect", 0, SourceParams.PARAM_REDIRECT);
        public static final Flow Receiver = new Flow("Receiver", 1, NotificationsService.RECEIVER_KEY);
        public static final Flow CodeVerification = new Flow("CodeVerification", 2, "code_verification");
        public static final Flow None = new Flow("None", 3, "none");

        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{Redirect, Receiver, CodeVerification, None};
        }

        public static EnumEntries<Flow> getEntries() {
            return $ENTRIES;
        }

        private Flow(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Flow[] flowArr$values = $values();
            $VALUES = flowArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(flowArr$values);
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J0\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J:\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J.\u0010\u001c\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0007J:\u0010\"\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0005H\u0007J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0005H\u0007J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0007J.\u0010.\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J.\u0010/\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J<\u00100\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005H\u0007J\"\u00102\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J<\u00103\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\b\b\u0001\u00108\u001a\u00020\u0005H\u0007JL\u00103\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u00105\u001a\u0004\u0018\u00010\u00052\b\u00106\u001a\u0004\u0018\u00010\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0005H\u0007J0\u00109\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u00108\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007J*\u0010:\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0007J\u0010\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0005H\u0007J\u0018\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005H\u0007J\u001e\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050B2\b\b\u0001\u0010C\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/stripe/android/model/SourceParams$Companion;", "", "<init>", "()V", "PARAM_AMOUNT", "", "PARAM_CLIENT_SECRET", "PARAM_CURRENCY", "PARAM_FLOW", "PARAM_METADATA", "PARAM_OWNER", "PARAM_REDIRECT", "PARAM_RETURN_URL", "PARAM_SOURCE_ORDER", "PARAM_TOKEN", "PARAM_TYPE", "PARAM_USAGE", "PARAM_WECHAT", "createP24Params", "Lcom/stripe/android/model/SourceParams;", "amount", "", "currency", "name", "email", "returnUrl", "createAlipayReusableParams", "createAlipaySingleUseParams", "createWeChatPayParams", "weChatAppId", "statementDescriptor", "createKlarna", "klarnaParams", "Lcom/stripe/android/model/KlarnaSourceParams;", "createBancontactParams", "preferredLanguage", "createCustomParams", "type", "createSourceFromTokenParams", "tokenId", "createCardParams", "cardParams", "Lcom/stripe/android/model/CardParams;", "createCardParamsFromGooglePay", "googlePayPaymentData", "Lorg/json/JSONObject;", "createEPSParams", "createGiropayParams", "createIdealParams", "bank", "createMultibancoParams", "createSepaDebitParams", "iban", "addressLine1", "city", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "country", "createSofortParams", "createThreeDSecureParams", "cardId", "createVisaCheckoutParams", "callId", "createMasterpassParams", "transactionId", "cartId", "createRetrieveSourceParams", "", "clientSecret", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: SourceParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KlarnaSourceParams.LineItem.Type.values().length];
                try {
                    iArr[KlarnaSourceParams.LineItem.Type.Sku.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KlarnaSourceParams.LineItem.Type.Tax.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[KlarnaSourceParams.LineItem.Type.Shipping.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createP24Params(long amount, String currency, String name, String email, String returnUrl) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            OwnerParams ownerParams = new OwnerParams(null, email, name, null, 9, null);
            String str = "p24";
            TypeData typeData = null;
            Flow flow = null;
            String str2 = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            Object[] objArr = 0 == true ? 1 : 0;
            return new SourceParams(str, typeData, Long.valueOf(amount), currency, ownerParams, 0 == true ? 1 : 0, returnUrl, flow, 0 == true ? 1 : 0, str2, objArr, weChatParams, apiParams, set, 16290, null);
        }

        public static /* synthetic */ SourceParams createAlipayReusableParams$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return companion.createAlipayReusableParams(str, str2, str3, str4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createAlipayReusableParams(String currency, String name, String email, String returnUrl) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Source.Usage usage = Source.Usage.Reusable;
            Address address = null;
            String str = null;
            String str2 = "alipay";
            TypeData typeData = null;
            Long l = null;
            Flow flow = null;
            String str3 = null;
            Map map = null;
            ApiParams apiParams = null;
            Object[] objArr = 0 == true ? 1 : 0;
            return new SourceParams(str2, typeData, l, currency, new OwnerParams(address, email, name, str, 9, null), usage, returnUrl, flow, 0 == true ? 1 : 0, str3, map, 0 == true ? 1 : 0, apiParams, objArr, 16262, null);
        }

        public static /* synthetic */ SourceParams createAlipaySingleUseParams$default(Companion companion, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createAlipaySingleUseParams(j, str, str2, str3, str4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createAlipaySingleUseParams(long amount, String currency, String name, String email, String returnUrl) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            OwnerParams ownerParams = new OwnerParams(null, email, name, null, 9, null);
            String str = "alipay";
            TypeData typeData = null;
            Source.Usage usage = null;
            Flow flow = null;
            String str2 = null;
            Map map = null;
            ApiParams apiParams = null;
            Object[] objArr = 0 == true ? 1 : 0;
            return new SourceParams(str, typeData, Long.valueOf(amount), currency, ownerParams, usage, returnUrl, flow, 0 == true ? 1 : 0, str2, map, 0 == true ? 1 : 0, apiParams, objArr, 16290, null);
        }

        public static /* synthetic */ SourceParams createWeChatPayParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createWeChatPayParams(j, str, str2, str3);
        }

        @JvmStatic
        public final SourceParams createWeChatPayParams(long amount, String currency, String weChatAppId, String statementDescriptor) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(weChatAppId, "weChatAppId");
            return new SourceParams("wechat", null, Long.valueOf(amount), currency, null, null, null, null, null, null, null, new WeChatParams(weChatAppId, statementDescriptor), null, null, 14322, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createKlarna(String returnUrl, String currency, KlarnaSourceParams klarnaParams) {
            SourceOrderParams.Item.Type type;
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            String currency2 = currency;
            Intrinsics.checkNotNullParameter(currency2, "currency");
            Intrinsics.checkNotNullParameter(klarnaParams, "klarnaParams");
            Iterator<T> it = klarnaParams.getLineItems().iterator();
            int totalAmount = 0;
            while (it.hasNext()) {
                totalAmount += ((KlarnaSourceParams.LineItem) it.next()).getTotalAmount();
            }
            List<KlarnaSourceParams.LineItem> lineItems = klarnaParams.getLineItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lineItems, 10));
            Iterator<T> it2 = lineItems.iterator();
            while (true) {
                int i = 2;
                if (!it2.hasNext()) {
                    SourceOrderParams sourceOrderParams = new SourceOrderParams(arrayList, null, i, 0 == true ? 1 : 0);
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    return new SourceParams("klarna", null, Long.valueOf(totalAmount), currency, new OwnerParams(klarnaParams.getBillingAddress(), klarnaParams.getBillingEmail(), null, klarnaParams.getBillingPhone(), 4, defaultConstructorMarker), null, returnUrl, Flow.Redirect, sourceOrderParams, null, null, null, new ApiParams(klarnaParams.toParamMap()), null, 11810, defaultConstructorMarker);
                }
                KlarnaSourceParams.LineItem lineItem = (KlarnaSourceParams.LineItem) it2.next();
                int i2 = WhenMappings.$EnumSwitchMapping$0[lineItem.getItemType().ordinal()];
                if (i2 == 1) {
                    type = SourceOrderParams.Item.Type.Sku;
                } else if (i2 == 2) {
                    type = SourceOrderParams.Item.Type.Tax;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    type = SourceOrderParams.Item.Type.Shipping;
                }
                arrayList.add(new SourceOrderParams.Item(type, Integer.valueOf(lineItem.getTotalAmount()), currency2, lineItem.getItemDescription(), null, lineItem.getQuantity(), 16, null));
                currency2 = currency;
            }
        }

        public static /* synthetic */ SourceParams createBancontactParams$default(Companion companion, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return companion.createBancontactParams(j, str, str2, str3, str4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createBancontactParams(long amount, String name, String returnUrl, String statementDescriptor, String preferredLanguage) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            TypeData.Bancontact bancontact = new TypeData.Bancontact(statementDescriptor, preferredLanguage);
            OwnerParams ownerParams = new OwnerParams(null, null, name, null, 11, null);
            Flow flow = null;
            SourceOrderParams sourceOrderParams = null;
            String str = null;
            Map map = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            return new SourceParams("bancontact", bancontact, Long.valueOf(amount), Source.EURO, ownerParams, 0 == true ? 1 : 0, returnUrl, flow, sourceOrderParams, str, map, weChatParams, apiParams, set, 16288, null);
        }

        @JvmStatic
        public final SourceParams createCustomParams(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new SourceParams(type, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        }

        @JvmStatic
        public final SourceParams createSourceFromTokenParams(String tokenId) {
            Intrinsics.checkNotNullParameter(tokenId, "tokenId");
            return new SourceParams("card", null, null, null, null, null, null, null, null, tokenId, null, null, null, null, 15870, null);
        }

        @JvmStatic
        public final SourceParams createCardParams(CardParams cardParams) {
            Intrinsics.checkNotNullParameter(cardParams, "cardParams");
            TypeData.Card card = new TypeData.Card(cardParams.getNumber(), Integer.valueOf(cardParams.getExpMonth()), Integer.valueOf(cardParams.getExpYear()), cardParams.getCvc());
            return new SourceParams("card", card, null, null, new OwnerParams(cardParams.getAddress(), null, cardParams.getName(), null, 10, null), null, null, null, null, null, cardParams.getMetadata(), null, null, cardParams.getAttribution(), 7148, null);
        }

        @JvmStatic
        public final SourceParams createCardParamsFromGooglePay(JSONObject googlePayPaymentData) throws JSONException {
            Card card;
            TokenizationMethod tokenizationMethod;
            Intrinsics.checkNotNullParameter(googlePayPaymentData, "googlePayPaymentData");
            GooglePayResult googlePayResultFromJson = GooglePayResult.INSTANCE.fromJson(googlePayPaymentData);
            Token token = googlePayResultFromJson.getToken();
            String string = null;
            String id = token != null ? token.getId() : null;
            if (id == null) {
                id = "";
            }
            String str = id;
            if (token != null && (card = token.getCard()) != null && (tokenizationMethod = card.getTokenizationMethod()) != null) {
                string = tokenizationMethod.toString();
            }
            return new SourceParams("card", null, null, null, new OwnerParams(googlePayResultFromJson.getAddress(), googlePayResultFromJson.getEmail(), googlePayResultFromJson.getName(), googlePayResultFromJson.getPhoneNumber()), null, null, null, null, str, null, null, null, SetsKt.setOfNotNull(string), 7662, null);
        }

        public static /* synthetic */ SourceParams createEPSParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createEPSParams(j, str, str2, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createEPSParams(long amount, String name, String returnUrl, String statementDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            TypeData.Eps eps = new TypeData.Eps(statementDescriptor);
            OwnerParams ownerParams = new OwnerParams(null, null, name, null, 11, null);
            Flow flow = null;
            SourceOrderParams sourceOrderParams = null;
            String str = null;
            Map map = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            return new SourceParams("eps", eps, Long.valueOf(amount), Source.EURO, ownerParams, 0 == true ? 1 : 0, returnUrl, flow, sourceOrderParams, str, map, weChatParams, apiParams, set, 16288, null);
        }

        public static /* synthetic */ SourceParams createGiropayParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createGiropayParams(j, str, str2, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createGiropayParams(long amount, String name, String returnUrl, String statementDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            TypeData.Giropay giropay = new TypeData.Giropay(statementDescriptor);
            OwnerParams ownerParams = new OwnerParams(null, null, name, null, 11, null);
            Flow flow = null;
            SourceOrderParams sourceOrderParams = null;
            String str = null;
            Map map = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            return new SourceParams("giropay", giropay, Long.valueOf(amount), Source.EURO, ownerParams, 0 == true ? 1 : 0, returnUrl, flow, sourceOrderParams, str, map, weChatParams, apiParams, set, 16288, null);
        }

        public static /* synthetic */ SourceParams createIdealParams$default(Companion companion, long j, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return companion.createIdealParams(j, str, str2, str3, str4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createIdealParams(long amount, String name, String returnUrl, String statementDescriptor, String bank) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            TypeData.Ideal ideal = new TypeData.Ideal(statementDescriptor, bank);
            OwnerParams ownerParams = new OwnerParams(null, null, name, null, 11, null);
            Flow flow = null;
            SourceOrderParams sourceOrderParams = null;
            String str = null;
            Map map = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            return new SourceParams("ideal", ideal, Long.valueOf(amount), Source.EURO, ownerParams, 0 == true ? 1 : 0, returnUrl, flow, sourceOrderParams, str, map, weChatParams, apiParams, set, 16288, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createMultibancoParams(long amount, String returnUrl, String email) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(email, "email");
            OwnerParams ownerParams = new OwnerParams(null, email, null, null, 13, null);
            Flow flow = null;
            SourceOrderParams sourceOrderParams = null;
            String str = null;
            Map map = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            return new SourceParams("multibanco", null, Long.valueOf(amount), Source.EURO, ownerParams, 0 == true ? 1 : 0, returnUrl, flow, sourceOrderParams, str, map, weChatParams, apiParams, set, 16290, null);
        }

        @JvmStatic
        public final SourceParams createSepaDebitParams(String name, String iban, String addressLine1, String city, String postalCode, String country) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(iban, "iban");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            Intrinsics.checkNotNullParameter(country, "country");
            return createSepaDebitParams(name, iban, null, addressLine1, city, postalCode, country);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final SourceParams createSepaDebitParams(String name, String iban, String email, String addressLine1, String city, String postalCode, String country) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(iban, "iban");
            String str = null;
            String str2 = null;
            Flow flow = null;
            SourceOrderParams sourceOrderParams = null;
            String str3 = null;
            Map map = null;
            WeChatParams weChatParams = null;
            ApiParams apiParams = null;
            Set set = null;
            return new SourceParams("sepa_debit", new TypeData.SepaDebit(iban), null, Source.EURO, new OwnerParams(new Address.Builder().setLine1(addressLine1).setCity(city).setPostalCode(postalCode).setCountry(country).build(), email, name, str, 8, null), 0 == true ? 1 : 0, str2, flow, sourceOrderParams, str3, map, weChatParams, apiParams, set, 16356, null);
        }

        public static /* synthetic */ SourceParams createSofortParams$default(Companion companion, long j, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.createSofortParams(j, str, str2, str3);
        }

        @JvmStatic
        public final SourceParams createSofortParams(long amount, String returnUrl, String country, String statementDescriptor) {
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(country, "country");
            return new SourceParams("sofort", new TypeData.Sofort(country, statementDescriptor), Long.valueOf(amount), Source.EURO, null, null, returnUrl, null, null, null, null, null, null, null, 16304, null);
        }

        @JvmStatic
        public final SourceParams createThreeDSecureParams(long amount, String currency, String returnUrl, String cardId) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(returnUrl, "returnUrl");
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return new SourceParams("three_d_secure", new TypeData.ThreeDSecure(cardId), Long.valueOf(amount), currency, null, null, returnUrl, null, null, null, null, null, null, null, 16304, null);
        }

        @JvmStatic
        public final SourceParams createVisaCheckoutParams(String callId) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            return new SourceParams("card", new TypeData.VisaCheckout(callId), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        }

        @JvmStatic
        public final SourceParams createMasterpassParams(String transactionId, String cartId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(cartId, "cartId");
            return new SourceParams("card", new TypeData.Masterpass(transactionId, cartId), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        }

        @JvmStatic
        public final Map<String, String> createRetrieveSourceParams(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return MapsKt.mapOf(TuplesKt.to("client_secret", clientSecret));
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams;", "Landroid/os/Parcelable;", "value", "", "", "", "<init>", "(Ljava/util/Map;)V", "getValue", "()Ljava/util/Map;", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApiParams implements Parcelable {
        private final Map<String, Object> value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<ApiParams> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SourceParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ApiParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ApiParams.INSTANCE.create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApiParams[] newArray(int i) {
                return new ApiParams[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ApiParams() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiParams copy$default(ApiParams apiParams, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = apiParams.value;
            }
            return apiParams.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.value;
        }

        public final ApiParams copy(Map<String, ? extends Object> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ApiParams(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiParams) && Intrinsics.areEqual(this.value, ((ApiParams) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) throws JSONException {
            Intrinsics.checkNotNullParameter(dest, "dest");
            INSTANCE.write(this, dest, flags);
        }

        public ApiParams(Map<String, ? extends Object> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public /* synthetic */ ApiParams(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, Object> getValue() {
            return this.value;
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/SourceParams$ApiParams$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/model/SourceParams$ApiParams;", "<init>", "()V", "write", "", "parcel", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "", "create", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements Parceler<ApiParams> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlinx.parcelize.Parceler
            public ApiParams[] newArray(int i) {
                return (ApiParams[]) Parceler.DefaultImpls.newArray(this, i);
            }

            @Override // kotlinx.parcelize.Parceler
            public void write(ApiParams apiParams, Parcel parcel, int i) throws JSONException {
                Intrinsics.checkNotNullParameter(apiParams, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                JSONObject jSONObjectMapToJsonObject = StripeJsonUtils.INSTANCE.mapToJsonObject(apiParams.getValue());
                parcel.writeString(jSONObjectMapToJsonObject != null ? jSONObjectMapToJsonObject.toString() : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlinx.parcelize.Parceler
            public ApiParams create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                String string = parcel.readString();
                Map mapJsonObjectToMap = stripeJsonUtils.jsonObjectToMap(string != null ? new JSONObject(string) : null);
                if (mapJsonObjectToMap == null) {
                    mapJsonObjectToMap = MapsKt.emptyMap();
                }
                return new ApiParams(mapJsonObjectToMap);
            }
        }
    }

    /* compiled from: SourceParams.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000f0\u000fR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\n\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData;", "Landroid/os/Parcelable;", "<init>", "()V", "type", "", "getType", "()Ljava/lang/String;", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "createParams", "", "Card", "Eps", "Giropay", "Ideal", "Masterpass", "Sofort", "SepaDebit", "ThreeDSecure", "VisaCheckout", "Bancontact", "Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;", "Lcom/stripe/android/model/SourceParams$TypeData$Card;", "Lcom/stripe/android/model/SourceParams$TypeData$Eps;", "Lcom/stripe/android/model/SourceParams$TypeData$Giropay;", "Lcom/stripe/android/model/SourceParams$TypeData$Ideal;", "Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;", "Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;", "Lcom/stripe/android/model/SourceParams$TypeData$Sofort;", "Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;", "Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class TypeData implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract List<Pair<String, Object>> getParams();

        public abstract String getType();

        private TypeData() {
        }

        public final Map<String, Map<String, Object>> createParams() {
            Map<String, Map<String, Object>> mapMapOf;
            List<Pair<String, Object>> params = getParams();
            Map mapEmptyMap = MapsKt.emptyMap();
            Iterator<T> it = params.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                Object objComponent2 = pair.component2();
                mapMapOf = objComponent2 != null ? MapsKt.mapOf(TuplesKt.to(str, objComponent2)) : null;
                if (mapMapOf == null) {
                    mapMapOf = MapsKt.emptyMap();
                }
                mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
            }
            if (mapEmptyMap.isEmpty()) {
                mapEmptyMap = null;
            }
            mapMapOf = mapEmptyMap != null ? MapsKt.mapOf(TuplesKt.to(getType(), mapEmptyMap)) : null;
            return mapMapOf == null ? MapsKt.emptyMap() : mapMapOf;
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0005J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00058G¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Card;", "Lcom/stripe/android/model/SourceParams$TypeData;", Card.PARAM_NUMBER, "", "expMonth", "", "expYear", Card.PARAM_CVC, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getExpMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpYear", "getCvc", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/SourceParams$TypeData$Card;", "describeContents", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Card extends TypeData {
            private static final String PARAM_CVC = "cvc";
            private static final String PARAM_EXP_MONTH = "exp_month";
            private static final String PARAM_EXP_YEAR = "exp_year";
            private static final String PARAM_NUMBER = "number";
            private final String cvc;
            private final Integer expMonth;
            private final Integer expYear;
            private final String number;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Card> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            public static /* synthetic */ Card copy$default(Card card, String str, Integer num, Integer num2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = card.number;
                }
                if ((i & 2) != 0) {
                    num = card.expMonth;
                }
                if ((i & 4) != 0) {
                    num2 = card.expYear;
                }
                if ((i & 8) != 0) {
                    str2 = card.cvc;
                }
                return card.copy(str, num, num2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getExpMonth() {
                return this.expMonth;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getExpYear() {
                return this.expYear;
            }

            /* renamed from: component4, reason: from getter */
            public final String getCvc() {
                return this.cvc;
            }

            public final Card copy(String number, Integer expMonth, Integer expYear, String cvc) {
                return new Card(number, expMonth, expYear, cvc);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Card)) {
                    return false;
                }
                Card card = (Card) other;
                return Intrinsics.areEqual(this.number, card.number) && Intrinsics.areEqual(this.expMonth, card.expMonth) && Intrinsics.areEqual(this.expYear, card.expYear) && Intrinsics.areEqual(this.cvc, card.cvc);
            }

            public int hashCode() {
                String str = this.number;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.expMonth;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.expYear;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str2 = this.cvc;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Card(number=" + this.number + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvc=" + this.cvc + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.number);
                Integer num = this.expMonth;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num.intValue());
                }
                Integer num2 = this.expYear;
                if (num2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num2.intValue());
                }
                dest.writeString(this.cvc);
            }

            public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, num, num2, (i & 8) != 0 ? null : str2);
            }

            public final String getNumber() {
                return this.number;
            }

            public final Integer getExpMonth() {
                return this.expMonth;
            }

            public final Integer getExpYear() {
                return this.expYear;
            }

            public final String getCvc() {
                return this.cvc;
            }

            public Card(String str, Integer num, Integer num2, String str2) {
                super(null);
                this.number = str;
                this.expMonth = num;
                this.expYear = num2;
                this.cvc = str2;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, Object>> getParams() {
                return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_NUMBER, this.number), TuplesKt.to(PARAM_EXP_MONTH, this.expMonth), TuplesKt.to(PARAM_EXP_YEAR, this.expYear), TuplesKt.to(PARAM_CVC, this.cvc)});
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Card$Companion;", "", "<init>", "()V", "PARAM_NUMBER", "", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_CVC", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Eps;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "<init>", "(Ljava/lang/String;)V", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Eps extends TypeData {
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Eps> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Eps> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Eps createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Eps(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Eps[] newArray(int i) {
                    return new Eps[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Eps() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Eps copy$default(Eps eps, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eps.statementDescriptor;
                }
                return eps.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final Eps copy(String statementDescriptor) {
                return new Eps(statementDescriptor);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Eps) && Intrinsics.areEqual(this.statementDescriptor, ((Eps) other).statementDescriptor);
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Eps(statementDescriptor=" + this.statementDescriptor + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.statementDescriptor);
            }

            public /* synthetic */ Eps(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public Eps(String str) {
                super(null);
                this.statementDescriptor = str;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "eps";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf(TuplesKt.to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Eps$Companion;", "", "<init>", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Giropay;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "<init>", "(Ljava/lang/String;)V", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Giropay extends TypeData {
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Giropay> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Giropay> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Giropay createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Giropay(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Giropay[] newArray(int i) {
                    return new Giropay[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Giropay() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Giropay copy$default(Giropay giropay, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = giropay.statementDescriptor;
                }
                return giropay.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final Giropay copy(String statementDescriptor) {
                return new Giropay(statementDescriptor);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Giropay) && Intrinsics.areEqual(this.statementDescriptor, ((Giropay) other).statementDescriptor);
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Giropay(statementDescriptor=" + this.statementDescriptor + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.statementDescriptor);
            }

            public /* synthetic */ Giropay(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public Giropay(String str) {
                super(null);
                this.statementDescriptor = str;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "giropay";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf(TuplesKt.to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor));
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Giropay$Companion;", "", "<init>", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Ideal;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", Ideal.PARAM_BANK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "(Ljava/lang/String;)V", "getBank", "setBank", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Ideal extends TypeData {
            private static final String PARAM_BANK = "bank";
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String bank;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Ideal> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ideal createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Ideal(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ideal[] newArray(int i) {
                    return new Ideal[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Ideal() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ideal.statementDescriptor;
                }
                if ((i & 2) != 0) {
                    str2 = ideal.bank;
                }
                return ideal.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBank() {
                return this.bank;
            }

            public final Ideal copy(String statementDescriptor, String bank) {
                return new Ideal(statementDescriptor, bank);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ideal)) {
                    return false;
                }
                Ideal ideal = (Ideal) other;
                return Intrinsics.areEqual(this.statementDescriptor, ideal.statementDescriptor) && Intrinsics.areEqual(this.bank, ideal.bank);
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.bank;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Ideal(statementDescriptor=" + this.statementDescriptor + ", bank=" + this.bank + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.statementDescriptor);
                dest.writeString(this.bank);
            }

            public /* synthetic */ Ideal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public final String getBank() {
                return this.bank;
            }

            public final void setBank(String str) {
                this.bank = str;
            }

            public Ideal(String str, String str2) {
                super(null);
                this.statementDescriptor = str;
                this.bank = str2;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "ideal";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor), TuplesKt.to(PARAM_BANK, this.bank)});
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Ideal$Companion;", "", "<init>", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "PARAM_BANK", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR2\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00120\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Masterpass;", "Lcom/stripe/android/model/SourceParams$TypeData;", "transactionId", "", "cartId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "setTransactionId", "(Ljava/lang/String;)V", "getCartId", "setCartId", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Masterpass extends TypeData {
            private static final String PARAM_CART_ID = "cart_id";
            private static final String PARAM_MASTERPASS = "masterpass";
            private static final String PARAM_TRANSACTION_ID = "transaction_id";
            private String cartId;
            private String transactionId;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Masterpass> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Masterpass> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Masterpass createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Masterpass(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Masterpass[] newArray(int i) {
                    return new Masterpass[i];
                }
            }

            public static /* synthetic */ Masterpass copy$default(Masterpass masterpass, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = masterpass.transactionId;
                }
                if ((i & 2) != 0) {
                    str2 = masterpass.cartId;
                }
                return masterpass.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTransactionId() {
                return this.transactionId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCartId() {
                return this.cartId;
            }

            public final Masterpass copy(String transactionId, String cartId) {
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(cartId, "cartId");
                return new Masterpass(transactionId, cartId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Masterpass)) {
                    return false;
                }
                Masterpass masterpass = (Masterpass) other;
                return Intrinsics.areEqual(this.transactionId, masterpass.transactionId) && Intrinsics.areEqual(this.cartId, masterpass.cartId);
            }

            public int hashCode() {
                return (this.transactionId.hashCode() * 31) + this.cartId.hashCode();
            }

            public String toString() {
                return "Masterpass(transactionId=" + this.transactionId + ", cartId=" + this.cartId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.transactionId);
                dest.writeString(this.cartId);
            }

            public final String getTransactionId() {
                return this.transactionId;
            }

            public final void setTransactionId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.transactionId = str;
            }

            public final String getCartId() {
                return this.cartId;
            }

            public final void setCartId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.cartId = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Masterpass(String transactionId, String cartId) {
                super(null);
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                Intrinsics.checkNotNullParameter(cartId, "cartId");
                this.transactionId = transactionId;
                this.cartId = cartId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, Map<String, String>>> getParams() {
                return CollectionsKt.listOf(TuplesKt.to(PARAM_MASTERPASS, MapsKt.mapOf(TuplesKt.to(PARAM_TRANSACTION_ID, this.transactionId), TuplesKt.to(PARAM_CART_ID, this.cartId))));
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Masterpass$Companion;", "", "<init>", "()V", "PARAM_CART_ID", "", "PARAM_MASTERPASS", "PARAM_TRANSACTION_ID", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Sofort;", "Lcom/stripe/android/model/SourceParams$TypeData;", "country", "", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getStatementDescriptor", "setStatementDescriptor", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Sofort extends TypeData {
            private static final String PARAM_COUNTRY = "country";
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String country;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Sofort> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sofort createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Sofort(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Sofort[] newArray(int i) {
                    return new Sofort[i];
                }
            }

            public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sofort.country;
                }
                if ((i & 2) != 0) {
                    str2 = sofort.statementDescriptor;
                }
                return sofort.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final Sofort copy(String country, String statementDescriptor) {
                Intrinsics.checkNotNullParameter(country, "country");
                return new Sofort(country, statementDescriptor);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Sofort)) {
                    return false;
                }
                Sofort sofort = (Sofort) other;
                return Intrinsics.areEqual(this.country, sofort.country) && Intrinsics.areEqual(this.statementDescriptor, sofort.statementDescriptor);
            }

            public int hashCode() {
                int iHashCode = this.country.hashCode() * 31;
                String str = this.statementDescriptor;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Sofort(country=" + this.country + ", statementDescriptor=" + this.statementDescriptor + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.country);
                dest.writeString(this.statementDescriptor);
            }

            public /* synthetic */ Sofort(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            public final String getCountry() {
                return this.country;
            }

            public final void setCountry(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.country = str;
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sofort(String country, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(country, "country");
                this.country = country;
                this.statementDescriptor = str;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "sofort";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("country", this.country), TuplesKt.to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor)});
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Sofort$Companion;", "", "<init>", "()V", "PARAM_COUNTRY", "", "PARAM_STATEMENT_DESCRIPTOR", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit;", "Lcom/stripe/android/model/SourceParams$TypeData;", SepaDebit.PARAM_IBAN, "", "<init>", "(Ljava/lang/String;)V", "getIban", "()Ljava/lang/String;", "setIban", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SepaDebit extends TypeData {
            private static final String PARAM_IBAN = "iban";
            private String iban;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SepaDebit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SepaDebit createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SepaDebit(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SepaDebit[] newArray(int i) {
                    return new SepaDebit[i];
                }
            }

            public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sepaDebit.iban;
                }
                return sepaDebit.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIban() {
                return this.iban;
            }

            public final SepaDebit copy(String iban) {
                Intrinsics.checkNotNullParameter(iban, "iban");
                return new SepaDebit(iban);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SepaDebit) && Intrinsics.areEqual(this.iban, ((SepaDebit) other).iban);
            }

            public int hashCode() {
                return this.iban.hashCode();
            }

            public String toString() {
                return "SepaDebit(iban=" + this.iban + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.iban);
            }

            public final String getIban() {
                return this.iban;
            }

            public final void setIban(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.iban = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SepaDebit(String iban) {
                super(null);
                Intrinsics.checkNotNullParameter(iban, "iban");
                this.iban = iban;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "sepa_debit";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf(TuplesKt.to(PARAM_IBAN, this.iban));
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$SepaDebit$Companion;", "", "<init>", "()V", "PARAM_IBAN", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure;", "Lcom/stripe/android/model/SourceParams$TypeData;", "cardId", "", "<init>", "(Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "setCardId", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ThreeDSecure extends TypeData {
            private static final String PARAM_CARD = "card";
            private String cardId;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<ThreeDSecure> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ThreeDSecure> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecure createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ThreeDSecure(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecure[] newArray(int i) {
                    return new ThreeDSecure[i];
                }
            }

            public static /* synthetic */ ThreeDSecure copy$default(ThreeDSecure threeDSecure, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = threeDSecure.cardId;
                }
                return threeDSecure.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCardId() {
                return this.cardId;
            }

            public final ThreeDSecure copy(String cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                return new ThreeDSecure(cardId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThreeDSecure) && Intrinsics.areEqual(this.cardId, ((ThreeDSecure) other).cardId);
            }

            public int hashCode() {
                return this.cardId.hashCode();
            }

            public String toString() {
                return "ThreeDSecure(cardId=" + this.cardId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.cardId);
            }

            public final String getCardId() {
                return this.cardId;
            }

            public final void setCardId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.cardId = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThreeDSecure(String cardId) {
                super(null);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.cardId = cardId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "three_d_secure";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf(TuplesKt.to("card", this.cardId));
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$ThreeDSecure$Companion;", "", "<init>", "()V", "PARAM_CARD", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R(\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout;", "Lcom/stripe/android/model/SourceParams$TypeData;", "callId", "", "<init>", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "setCallId", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "", "getParams", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VisaCheckout extends TypeData {
            private static final String PARAM_CALL_ID = "callid";
            private static final String PARAM_VISA_CHECKOUT = "visa_checkout";
            private String callId;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<VisaCheckout> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VisaCheckout> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VisaCheckout createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new VisaCheckout(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VisaCheckout[] newArray(int i) {
                    return new VisaCheckout[i];
                }
            }

            public static /* synthetic */ VisaCheckout copy$default(VisaCheckout visaCheckout, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = visaCheckout.callId;
                }
                return visaCheckout.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            public final VisaCheckout copy(String callId) {
                Intrinsics.checkNotNullParameter(callId, "callId");
                return new VisaCheckout(callId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VisaCheckout) && Intrinsics.areEqual(this.callId, ((VisaCheckout) other).callId);
            }

            public int hashCode() {
                return this.callId.hashCode();
            }

            public String toString() {
                return "VisaCheckout(callId=" + this.callId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.callId);
            }

            public final String getCallId() {
                return this.callId;
            }

            public final void setCallId(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.callId = str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VisaCheckout(String callId) {
                super(null);
                Intrinsics.checkNotNullParameter(callId, "callId");
                this.callId = callId;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "card";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, Object>> getParams() {
                return CollectionsKt.listOf(TuplesKt.to(PARAM_VISA_CHECKOUT, MapsKt.mapOf(TuplesKt.to(PARAM_CALL_ID, this.callId))));
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$VisaCheckout$Companion;", "", "<init>", "()V", "PARAM_VISA_CHECKOUT", "", "PARAM_CALL_ID", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }

        /* compiled from: SourceParams.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Bancontact;", "Lcom/stripe/android/model/SourceParams$TypeData;", "statementDescriptor", "", "preferredLanguage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatementDescriptor", "()Ljava/lang/String;", "setStatementDescriptor", "(Ljava/lang/String;)V", "getPreferredLanguage", "setPreferredLanguage", "type", "getType", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lkotlin/Pair;", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Bancontact extends TypeData {
            private static final String PARAM_PREFERRED_LANGUAGE = "preferred_language";
            private static final String PARAM_STATEMENT_DESCRIPTOR = "statement_descriptor";
            private String preferredLanguage;
            private String statementDescriptor;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Bancontact> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: SourceParams.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Bancontact> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Bancontact createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Bancontact(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Bancontact[] newArray(int i) {
                    return new Bancontact[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Bancontact() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Bancontact copy$default(Bancontact bancontact, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bancontact.statementDescriptor;
                }
                if ((i & 2) != 0) {
                    str2 = bancontact.preferredLanguage;
                }
                return bancontact.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPreferredLanguage() {
                return this.preferredLanguage;
            }

            public final Bancontact copy(String statementDescriptor, String preferredLanguage) {
                return new Bancontact(statementDescriptor, preferredLanguage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Bancontact)) {
                    return false;
                }
                Bancontact bancontact = (Bancontact) other;
                return Intrinsics.areEqual(this.statementDescriptor, bancontact.statementDescriptor) && Intrinsics.areEqual(this.preferredLanguage, bancontact.preferredLanguage);
            }

            public int hashCode() {
                String str = this.statementDescriptor;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.preferredLanguage;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Bancontact(statementDescriptor=" + this.statementDescriptor + ", preferredLanguage=" + this.preferredLanguage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.statementDescriptor);
                dest.writeString(this.preferredLanguage);
            }

            public /* synthetic */ Bancontact(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final String getStatementDescriptor() {
                return this.statementDescriptor;
            }

            public final void setStatementDescriptor(String str) {
                this.statementDescriptor = str;
            }

            public final String getPreferredLanguage() {
                return this.preferredLanguage;
            }

            public final void setPreferredLanguage(String str) {
                this.preferredLanguage = str;
            }

            public Bancontact(String str, String str2) {
                super(null);
                this.statementDescriptor = str;
                this.preferredLanguage = str2;
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public String getType() {
                return "bancontact";
            }

            @Override // com.stripe.android.model.SourceParams.TypeData
            public List<Pair<String, String>> getParams() {
                return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(PARAM_STATEMENT_DESCRIPTOR, this.statementDescriptor), TuplesKt.to(PARAM_PREFERRED_LANGUAGE, this.preferredLanguage)});
            }

            /* compiled from: SourceParams.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceParams$TypeData$Bancontact$Companion;", "", "<init>", "()V", "PARAM_STATEMENT_DESCRIPTOR", "", "PARAM_PREFERRED_LANGUAGE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }
    }
}
