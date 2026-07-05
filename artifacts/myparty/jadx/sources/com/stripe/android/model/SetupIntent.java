package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* compiled from: SetupIntent.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0004abcdBÁ\u0001\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010:09H\u0017J\b\u0010B\u001a\u00020\fH\u0016J\b\u0010C\u001a\u00020\fH\u0016J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÂ\u0003JÝ\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010V\u001a\u00020WJ\u0013\u0010X\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010Z\u001a\u00020WHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020WR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010(R\u0016\u0010@\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010 ¨\u0006e"}, d2 = {"Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/StripeIntent;", "id", "", "cancellationReason", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "created", "", "countryCode", "clientSecret", "description", NamedConstantsKt.IS_LIVE_MODE, "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "paymentMethodTypes", "", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "usage", "Lcom/stripe/android/model/StripeIntent$Usage;", "lastSetupError", "Lcom/stripe/android/model/SetupIntent$Error;", "unactivatedPaymentMethods", "linkFundingSources", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "paymentMethodOptionsJsonString", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCancellationReason", "()Lcom/stripe/android/model/SetupIntent$CancellationReason;", "getCreated", "()J", "getCountryCode", "getClientSecret", "getDescription", "()Z", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodId", "getPaymentMethodTypes", "()Ljava/util/List;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "getUsage", "()Lcom/stripe/android/model/StripeIntent$Usage;", "getLastSetupError", "()Lcom/stripe/android/model/SetupIntent$Error;", "getUnactivatedPaymentMethods", "getLinkFundingSources", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "getPaymentMethodOptions", "", "", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "isConfirmed", "lastErrorMessage", "getLastErrorMessage", "requiresAction", "requiresConfirmation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Error", "ClientSecret", "CancellationReason", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SetupIntent implements StripeIntent {
    private final CancellationReason cancellationReason;
    private final String clientSecret;
    private final String countryCode;
    private final long created;
    private final String description;
    private final String id;
    private final boolean isLiveMode;
    private final Error lastSetupError;
    private final List<String> linkFundingSources;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final String paymentMethodOptionsJsonString;
    private final List<String> paymentMethodTypes;
    private final StripeIntent.Status status;
    private final List<String> unactivatedPaymentMethods;
    private final StripeIntent.Usage usage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: SetupIntent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SetupIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetupIntent(parcel.readString(), parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(SetupIntent.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntent[] newArray(int i) {
            return new SetupIntent[i];
        }
    }

    /* renamed from: component17, reason: from getter */
    private final String getPaymentMethodOptionsJsonString() {
        return this.paymentMethodOptionsJsonString;
    }

    public static /* synthetic */ SetupIntent copy$default(SetupIntent setupIntent, String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List list2, List list3, StripeIntent.NextActionData nextActionData, String str6, int i, Object obj) {
        String str7;
        StripeIntent.NextActionData nextActionData2;
        String str8 = (i & 1) != 0 ? setupIntent.id : str;
        CancellationReason cancellationReason2 = (i & 2) != 0 ? setupIntent.cancellationReason : cancellationReason;
        long j2 = (i & 4) != 0 ? setupIntent.created : j;
        String str9 = (i & 8) != 0 ? setupIntent.countryCode : str2;
        String str10 = (i & 16) != 0 ? setupIntent.clientSecret : str3;
        String str11 = (i & 32) != 0 ? setupIntent.description : str4;
        boolean z2 = (i & 64) != 0 ? setupIntent.isLiveMode : z;
        PaymentMethod paymentMethod2 = (i & 128) != 0 ? setupIntent.paymentMethod : paymentMethod;
        String str12 = (i & 256) != 0 ? setupIntent.paymentMethodId : str5;
        List list4 = (i & 512) != 0 ? setupIntent.paymentMethodTypes : list;
        StripeIntent.Status status2 = (i & 1024) != 0 ? setupIntent.status : status;
        StripeIntent.Usage usage2 = (i & 2048) != 0 ? setupIntent.usage : usage;
        Error error2 = (i & 4096) != 0 ? setupIntent.lastSetupError : error;
        String str13 = str8;
        List list5 = (i & 8192) != 0 ? setupIntent.unactivatedPaymentMethods : list2;
        List list6 = (i & 16384) != 0 ? setupIntent.linkFundingSources : list3;
        StripeIntent.NextActionData nextActionData3 = (i & 32768) != 0 ? setupIntent.nextActionData : nextActionData;
        if ((i & 65536) != 0) {
            nextActionData2 = nextActionData3;
            str7 = setupIntent.paymentMethodOptionsJsonString;
        } else {
            str7 = str6;
            nextActionData2 = nextActionData3;
        }
        return setupIntent.copy(str13, cancellationReason2, j2, str9, str10, str11, z2, paymentMethod2, str12, list4, status2, usage2, error2, list5, list6, nextActionData2, str7);
    }

    @JvmStatic
    public static final SetupIntent fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.paymentMethodTypes;
    }

    /* renamed from: component11, reason: from getter */
    public final StripeIntent.Status getStatus() {
        return this.status;
    }

    /* renamed from: component12, reason: from getter */
    public final StripeIntent.Usage getUsage() {
        return this.usage;
    }

    /* renamed from: component13, reason: from getter */
    public final Error getLastSetupError() {
        return this.lastSetupError;
    }

    public final List<String> component14() {
        return this.unactivatedPaymentMethods;
    }

    public final List<String> component15() {
        return this.linkFundingSources;
    }

    /* renamed from: component16, reason: from getter */
    public final StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    /* renamed from: component2, reason: from getter */
    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* renamed from: component8, reason: from getter */
    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final SetupIntent copy(String id, CancellationReason cancellationReason, long created, String countryCode, String clientSecret, String description, boolean isLiveMode, PaymentMethod paymentMethod, String paymentMethodId, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error lastSetupError, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData, String paymentMethodOptionsJsonString) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        return new SetupIntent(id, cancellationReason, created, countryCode, clientSecret, description, isLiveMode, paymentMethod, paymentMethodId, paymentMethodTypes, status, usage, lastSetupError, unactivatedPaymentMethods, linkFundingSources, nextActionData, paymentMethodOptionsJsonString);
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
        if (!(other instanceof SetupIntent)) {
            return false;
        }
        SetupIntent setupIntent = (SetupIntent) other;
        return Intrinsics.areEqual(this.id, setupIntent.id) && this.cancellationReason == setupIntent.cancellationReason && this.created == setupIntent.created && Intrinsics.areEqual(this.countryCode, setupIntent.countryCode) && Intrinsics.areEqual(this.clientSecret, setupIntent.clientSecret) && Intrinsics.areEqual(this.description, setupIntent.description) && this.isLiveMode == setupIntent.isLiveMode && Intrinsics.areEqual(this.paymentMethod, setupIntent.paymentMethod) && Intrinsics.areEqual(this.paymentMethodId, setupIntent.paymentMethodId) && Intrinsics.areEqual(this.paymentMethodTypes, setupIntent.paymentMethodTypes) && this.status == setupIntent.status && this.usage == setupIntent.usage && Intrinsics.areEqual(this.lastSetupError, setupIntent.lastSetupError) && Intrinsics.areEqual(this.unactivatedPaymentMethods, setupIntent.unactivatedPaymentMethods) && Intrinsics.areEqual(this.linkFundingSources, setupIntent.linkFundingSources) && Intrinsics.areEqual(this.nextActionData, setupIntent.nextActionData) && Intrinsics.areEqual(this.paymentMethodOptionsJsonString, setupIntent.paymentMethodOptionsJsonString);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int iHashCode2 = (((iHashCode + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31) + Long.hashCode(this.created)) * 31;
        String str2 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientSecret;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isLiveMode)) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode6 = (iHashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str5 = this.paymentMethodId;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        StripeIntent.Status status = this.status;
        int iHashCode8 = (iHashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.usage;
        int iHashCode9 = (iHashCode8 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastSetupError;
        int iHashCode10 = (((((iHashCode9 + (error == null ? 0 : error.hashCode())) * 31) + this.unactivatedPaymentMethods.hashCode()) * 31) + this.linkFundingSources.hashCode()) * 31;
        StripeIntent.NextActionData nextActionData = this.nextActionData;
        int iHashCode11 = (iHashCode10 + (nextActionData == null ? 0 : nextActionData.hashCode())) * 31;
        String str6 = this.paymentMethodOptionsJsonString;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "SetupIntent(id=" + this.id + ", cancellationReason=" + this.cancellationReason + ", created=" + this.created + ", countryCode=" + this.countryCode + ", clientSecret=" + this.clientSecret + ", description=" + this.description + ", isLiveMode=" + this.isLiveMode + ", paymentMethod=" + this.paymentMethod + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodTypes=" + this.paymentMethodTypes + ", status=" + this.status + ", usage=" + this.usage + ", lastSetupError=" + this.lastSetupError + ", unactivatedPaymentMethods=" + this.unactivatedPaymentMethods + ", linkFundingSources=" + this.linkFundingSources + ", nextActionData=" + this.nextActionData + ", paymentMethodOptionsJsonString=" + this.paymentMethodOptionsJsonString + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cancellationReason.name());
        }
        dest.writeLong(this.created);
        dest.writeString(this.countryCode);
        dest.writeString(this.clientSecret);
        dest.writeString(this.description);
        dest.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethod.writeToParcel(dest, flags);
        }
        dest.writeString(this.paymentMethodId);
        dest.writeStringList(this.paymentMethodTypes);
        StripeIntent.Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        StripeIntent.Usage usage = this.usage;
        if (usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(usage.name());
        }
        Error error = this.lastSetupError;
        if (error == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            error.writeToParcel(dest, flags);
        }
        dest.writeStringList(this.unactivatedPaymentMethods);
        dest.writeStringList(this.linkFundingSources);
        dest.writeParcelable(this.nextActionData, flags);
        dest.writeString(this.paymentMethodOptionsJsonString);
    }

    public SetupIntent(String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.NextActionData nextActionData, String str6) {
        Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        Intrinsics.checkNotNullParameter(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        Intrinsics.checkNotNullParameter(linkFundingSources, "linkFundingSources");
        this.id = str;
        this.cancellationReason = cancellationReason;
        this.created = j;
        this.countryCode = str2;
        this.clientSecret = str3;
        this.description = str4;
        this.isLiveMode = z;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str5;
        this.paymentMethodTypes = paymentMethodTypes;
        this.status = status;
        this.usage = usage;
        this.lastSetupError = error;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.linkFundingSources = linkFundingSources;
        this.nextActionData = nextActionData;
        this.paymentMethodOptionsJsonString = str6;
    }

    public /* synthetic */ SetupIntent(String str, CancellationReason cancellationReason, long j, String str2, String str3, String str4, boolean z, PaymentMethod paymentMethod, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List list2, List list3, StripeIntent.NextActionData nextActionData, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cancellationReason, j, str2, str3, str4, z, (i & 128) != 0 ? null : paymentMethod, str5, list, status, usage, (i & 4096) != 0 ? null : error, list2, list3, nextActionData, (i & 65536) != 0 ? null : str6);
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.id;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    @Override // com.stripe.android.model.StripeIntent
    public long getCreated() {
        return this.created;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getDescription() {
        return this.description;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    public final StripeIntent.Usage getUsage() {
        return this.usage;
    }

    public final Error getLastSetupError() {
        return this.lastSetupError;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getUnactivatedPaymentMethods() {
        return this.unactivatedPaymentMethods;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getLinkFundingSources() {
        return this.linkFundingSources;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map<String, Object> getPaymentMethodOptions() {
        Map<String, Object> mapJsonObjectToMap;
        String str = this.paymentMethodOptionsJsonString;
        return (str == null || (mapJsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(str))) == null) ? MapsKt.emptyMap() : mapJsonObjectToMap;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType getNextActionType() {
        StripeIntent.NextActionData nextActionData = getNextActionData();
        if (nextActionData instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayBoletoDetails) {
            return StripeIntent.NextActionType.DisplayBoletoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayKonbiniDetails) {
            return StripeIntent.NextActionType.DisplayKonbiniDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayMultibancoDetails) {
            return StripeIntent.NextActionType.DisplayMultibancoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        if ((nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) || (nextActionData instanceof StripeIntent.NextActionData.BlikAuthorize) || (nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect) || (nextActionData instanceof StripeIntent.NextActionData.UpiAwaitNotification) || (nextActionData instanceof StripeIntent.NextActionData.SwishRedirect) || nextActionData == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isConfirmed() {
        return CollectionsKt.contains(SetsKt.setOf((Object[]) new StripeIntent.Status[]{StripeIntent.Status.Processing, StripeIntent.Status.Succeeded}), getStatus());
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getLastErrorMessage() {
        Error error = this.lastSetupError;
        if (error != null) {
            return error.getMessage();
        }
        return null;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresAction() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresConfirmation() {
        return getStatus() == StripeIntent.Status.RequiresConfirmation;
    }

    /* compiled from: SetupIntent.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BO\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jb\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÀ\u0001¢\u0006\u0002\b J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00060"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error;", "Lcom/stripe/android/core/model/StripeModel;", "code", "", "declineCode", "docUrl", "message", StripeErrorJsonParser.FIELD_PARAM, "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "type", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/SetupIntent$Error$Type;)V", "getCode", "()Ljava/lang/String;", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getType", "()Lcom/stripe/android/model/SetupIntent$Error$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "setup_intent_authentication_failure";
        private final String code;
        private final String declineCode;
        private final String docUrl;
        private final String message;
        private final String param;
        private final PaymentMethod paymentMethod;
        private final Type type;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SetupIntent.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Type.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public static /* synthetic */ Error copy$payments_core_release$default(Error error, String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.code;
            }
            if ((i & 2) != 0) {
                str2 = error.declineCode;
            }
            if ((i & 4) != 0) {
                str3 = error.docUrl;
            }
            if ((i & 8) != 0) {
                str4 = error.message;
            }
            if ((i & 16) != 0) {
                str5 = error.param;
            }
            if ((i & 32) != 0) {
                paymentMethod = error.paymentMethod;
            }
            if ((i & 64) != 0) {
                type = error.type;
            }
            PaymentMethod paymentMethod2 = paymentMethod;
            Type type2 = type;
            String str6 = str5;
            String str7 = str3;
            return error.copy$payments_core_release(str, str2, str7, str4, str6, paymentMethod2, type2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeclineCode() {
            return this.declineCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDocUrl() {
            return this.docUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component5, reason: from getter */
        public final String getParam() {
            return this.param;
        }

        /* renamed from: component6, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component7, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        public final Error copy$payments_core_release(String code, String declineCode, String docUrl, String message, String param, PaymentMethod paymentMethod, Type type) {
            return new Error(code, declineCode, docUrl, message, param, paymentMethod, type);
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
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.declineCode, error.declineCode) && Intrinsics.areEqual(this.docUrl, error.docUrl) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.param, error.param) && Intrinsics.areEqual(this.paymentMethod, error.paymentMethod) && this.type == error.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.declineCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.docUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.param;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int iHashCode6 = (iHashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type = this.type;
            return iHashCode6 + (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            return "Error(code=" + this.code + ", declineCode=" + this.declineCode + ", docUrl=" + this.docUrl + ", message=" + this.message + ", param=" + this.param + ", paymentMethod=" + this.paymentMethod + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code);
            dest.writeString(this.declineCode);
            dest.writeString(this.docUrl);
            dest.writeString(this.message);
            dest.writeString(this.param);
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                paymentMethod.writeToParcel(dest, flags);
            }
            Type type = this.type;
            if (type == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(type.name());
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type) {
            this.code = str;
            this.declineCode = str2;
            this.docUrl = str3;
            this.message = str4;
            this.param = str5;
            this.paymentMethod = paymentMethod;
            this.type = type;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDeclineCode() {
            return this.declineCode;
        }

        public final String getDocUrl() {
            return this.docUrl;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getParam() {
            return this.param;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Type getType() {
            return this.type;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SetupIntent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String code;
            public static final Type ApiConnectionError = new Type("ApiConnectionError", 0, "api_connection_error");
            public static final Type ApiError = new Type("ApiError", 1, "api_error");
            public static final Type AuthenticationError = new Type("AuthenticationError", 2, "authentication_error");
            public static final Type CardError = new Type("CardError", 3, "card_error");
            public static final Type IdempotencyError = new Type("IdempotencyError", 4, "idempotency_error");
            public static final Type InvalidRequestError = new Type("InvalidRequestError", 5, "invalid_request_error");
            public static final Type RateLimitError = new Type("RateLimitError", 6, "rate_limit_error");

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{ApiConnectionError, ApiError, AuthenticationError, CardError, IdempotencyError, InvalidRequestError, RateLimitError};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, String str2) {
                this.code = str2;
            }

            public final String getCode() {
                return this.code;
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
                INSTANCE = new Companion(null);
            }

            /* compiled from: SetupIntent.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Error$Type$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/SetupIntent$Error$Type;", "typeCode", "", "fromCode$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Type fromCode$payments_core_release(String typeCode) {
                    Type next;
                    Iterator<Type> it = Type.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(next.getCode(), typeCode)) {
                            break;
                        }
                    }
                    return next;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: SetupIntent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue$payments_core_release", "()Ljava/lang/String;", "setupIntentId", "getSetupIntentId$payments_core_release", "component1", "component1$payments_core_release", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClientSecret {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Pattern PATTERN = Pattern.compile("^seti_[^_]+_secret_[^_]+$");
        private final String setupIntentId;
        private final String value;

        public static /* synthetic */ ClientSecret copy$default(ClientSecret clientSecret, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientSecret.value;
            }
            return clientSecret.copy(str);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final ClientSecret copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ClientSecret(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientSecret) && Intrinsics.areEqual(this.value, ((ClientSecret) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.value + ")";
        }

        public ClientSecret(String value) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            List<String> listSplit = new Regex("_secret").split(value, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.setupIntentId = ((String[]) listEmptyList.toArray(new String[0]))[0];
            if (INSTANCE.isMatch(this.value)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.value).toString());
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        /* renamed from: getSetupIntentId$payments_core_release, reason: from getter */
        public final String getSetupIntentId() {
            return this.setupIntentId;
        }

        /* compiled from: SetupIntent.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/SetupIntent$ClientSecret$Companion;", "", "<init>", "()V", "PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "isMatch", "", "value", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final boolean isMatch(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClientSecret.PATTERN.matcher(value).matches();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetupIntent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Duplicate", "RequestedByCustomer", "Abandoned", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CancellationReason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CancellationReason[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final CancellationReason Duplicate = new CancellationReason("Duplicate", 0, "duplicate");
        public static final CancellationReason RequestedByCustomer = new CancellationReason("RequestedByCustomer", 1, "requested_by_customer");
        public static final CancellationReason Abandoned = new CancellationReason("Abandoned", 2, "abandoned");

        private static final /* synthetic */ CancellationReason[] $values() {
            return new CancellationReason[]{Duplicate, RequestedByCustomer, Abandoned};
        }

        public static EnumEntries<CancellationReason> getEntries() {
            return $ENTRIES;
        }

        private CancellationReason(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            CancellationReason[] cancellationReasonArr$values = $values();
            $VALUES = cancellationReasonArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(cancellationReasonArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: SetupIntent.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/SetupIntent$CancellationReason$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/SetupIntent$CancellationReason;", "code", "", "fromCode$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CancellationReason fromCode$payments_core_release(String code) {
                CancellationReason next;
                Iterator<CancellationReason> it = CancellationReason.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static CancellationReason valueOf(String str) {
            return (CancellationReason) Enum.valueOf(CancellationReason.class, str);
        }

        public static CancellationReason[] values() {
            return (CancellationReason[]) $VALUES.clone();
        }
    }

    /* compiled from: SetupIntent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/SetupIntent$Companion;", "", "<init>", "()V", "fromJson", "Lcom/stripe/android/model/SetupIntent;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SetupIntent fromJson(JSONObject jsonObject) {
            if (jsonObject != null) {
                return new SetupIntentJsonParser().parse(jsonObject);
            }
            return null;
        }
    }
}
