package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.SourceJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Source.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\nuvwxyz{|}~B\u008e\u0002\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u001d\b\u0002\u0010\u0018\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a¢\u0006\u0002\b\u001b\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u001e\u0010^\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a¢\u0006\u0002\b\u001b\u0018\u00010\u0019HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010`\u001a\u00020\u0004HÆ\u0003J\t\u0010a\u001a\u00020\u0004HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010#HÂ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010%HÂ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010'HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u009b\u0002\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u001d\b\u0002\u0010\u0018\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a¢\u0006\u0002\b\u001b\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004HÀ\u0001¢\u0006\u0004\bh\u0010iJ\u0006\u0010j\u001a\u00020kJ\u0013\u0010l\u001a\u00020\u000f2\b\u0010m\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010n\u001a\u00020kHÖ\u0001J\t\u0010o\u001a\u00020\u0004HÖ\u0001J\u0016\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020kR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010/\u001a\u0004\b3\u0010.R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00108\u001a\u0004\b\u000e\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R&\u0010\u0018\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u000b\u0012\t\u0018\u00010\u001a¢\u0006\u0002\b\u001b\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010,R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010,R\u0011\u0010L\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006\u007f"}, d2 = {"Lcom/stripe/android/model/Source;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "clientSecret", "codeVerification", "Lcom/stripe/android/model/Source$CodeVerification;", "created", "currency", "flow", "Lcom/stripe/android/model/Source$Flow;", NamedConstantsKt.IS_LIVE_MODE, "", "owner", "Lcom/stripe/android/model/Source$Owner;", NotificationsService.RECEIVER_KEY, "Lcom/stripe/android/model/Source$Receiver;", "redirect", "Lcom/stripe/android/model/Source$Redirect;", "status", "Lcom/stripe/android/model/Source$Status;", "sourceTypeData", "", "", "Lkotlinx/parcelize/RawValue;", "sourceTypeModel", "Lcom/stripe/android/model/SourceTypeModel;", "type", "typeRaw", "usage", "Lcom/stripe/android/model/Source$Usage;", "_weChat", "Lcom/stripe/android/model/WeChat;", "_klarna", "Lcom/stripe/android/model/Source$Klarna;", "sourceOrder", "Lcom/stripe/android/model/SourceOrder;", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClientSecret", "getCodeVerification", "()Lcom/stripe/android/model/Source$CodeVerification;", "getCreated", "getCurrency", "getFlow", "()Lcom/stripe/android/model/Source$Flow;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOwner", "()Lcom/stripe/android/model/Source$Owner;", "getReceiver", "()Lcom/stripe/android/model/Source$Receiver;", "getRedirect", "()Lcom/stripe/android/model/Source$Redirect;", "getStatus", "()Lcom/stripe/android/model/Source$Status;", "getSourceTypeData", "()Ljava/util/Map;", "getSourceTypeModel", "()Lcom/stripe/android/model/SourceTypeModel;", "getType", "getTypeRaw", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "getSourceOrder", "()Lcom/stripe/android/model/SourceOrder;", "getStatementDescriptor", "weChat", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "klarna", "getKlarna", "()Lcom/stripe/android/model/Source$Klarna;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "copy$payments_core_release", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "SourceType", "Status", "Usage", "Flow", "Redirect", "CodeVerification", "Receiver", "Owner", "Klarna", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Source implements StripeModel, StripePaymentSource {
    public static final String EURO = "eur";
    public static final String USD = "usd";
    private final Klarna _klarna;
    private final WeChat _weChat;
    private final Long amount;
    private final String clientSecret;
    private final CodeVerification codeVerification;
    private final Long created;
    private final String currency;
    private final Flow flow;
    private final String id;
    private final Boolean isLiveMode;
    private final Owner owner;
    private final Receiver receiver;
    private final Redirect redirect;
    private final SourceOrder sourceOrder;
    private final Map<String, Object> sourceTypeData;
    private final SourceTypeModel sourceTypeModel;
    private final String statementDescriptor;
    private final Status status;
    private final String type;
    private final String typeRaw;
    private final Usage usage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Source> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: Source.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            LinkedHashMap linkedHashMap;
            Boolean bool;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            CodeVerification codeVerificationCreateFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Flow flowValueOf = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Owner ownerCreateFromParcel = parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel);
            Receiver receiverCreateFromParcel = parcel.readInt() == 0 ? null : Receiver.CREATOR.createFromParcel(parcel);
            Redirect redirectCreateFromParcel = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status statusValueOf = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i2);
                while (true) {
                    bool = boolValueOf;
                    if (i == i2) {
                        break;
                    }
                    linkedHashMap.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i++;
                    boolValueOf = bool;
                    string = string;
                }
            } else {
                linkedHashMap = null;
                bool = boolValueOf;
            }
            return new Source(string, lValueOf, string2, codeVerificationCreateFromParcel, lValueOf2, string3, flowValueOf, bool, ownerCreateFromParcel, receiverCreateFromParcel, redirectCreateFromParcel, statusValueOf, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WeChat.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Klarna.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SourceOrder.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Source[] newArray(int i) {
            return new Source[i];
        }
    }

    @JvmStatic
    public static final String asSourceType(String str) {
        return INSTANCE.asSourceType(str);
    }

    /* renamed from: component18, reason: from getter */
    private final WeChat get_weChat() {
        return this._weChat;
    }

    /* renamed from: component19, reason: from getter */
    private final Klarna get_klarna() {
        return this._klarna;
    }

    public static /* synthetic */ Source copy$payments_core_release$default(Source source, String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str6, int i, Object obj) {
        String str7;
        SourceOrder sourceOrder2;
        String str8 = (i & 1) != 0 ? source.id : str;
        Long l3 = (i & 2) != 0 ? source.amount : l;
        String str9 = (i & 4) != 0 ? source.clientSecret : str2;
        CodeVerification codeVerification2 = (i & 8) != 0 ? source.codeVerification : codeVerification;
        Long l4 = (i & 16) != 0 ? source.created : l2;
        String str10 = (i & 32) != 0 ? source.currency : str3;
        Flow flow2 = (i & 64) != 0 ? source.flow : flow;
        Boolean bool2 = (i & 128) != 0 ? source.isLiveMode : bool;
        Owner owner2 = (i & 256) != 0 ? source.owner : owner;
        Receiver receiver2 = (i & 512) != 0 ? source.receiver : receiver;
        Redirect redirect2 = (i & 1024) != 0 ? source.redirect : redirect;
        Status status2 = (i & 2048) != 0 ? source.status : status;
        Map map2 = (i & 4096) != 0 ? source.sourceTypeData : map;
        SourceTypeModel sourceTypeModel2 = (i & 8192) != 0 ? source.sourceTypeModel : sourceTypeModel;
        String str11 = str8;
        String str12 = (i & 16384) != 0 ? source.type : str4;
        String str13 = (i & 32768) != 0 ? source.typeRaw : str5;
        Usage usage2 = (i & 65536) != 0 ? source.usage : usage;
        WeChat weChat2 = (i & 131072) != 0 ? source._weChat : weChat;
        Klarna klarna2 = (i & 262144) != 0 ? source._klarna : klarna;
        SourceOrder sourceOrder3 = (i & 524288) != 0 ? source.sourceOrder : sourceOrder;
        if ((i & 1048576) != 0) {
            sourceOrder2 = sourceOrder3;
            str7 = source.statementDescriptor;
        } else {
            str7 = str6;
            sourceOrder2 = sourceOrder3;
        }
        return source.copy$payments_core_release(str11, l3, str9, codeVerification2, l4, str10, flow2, bool2, owner2, receiver2, redirect2, status2, map2, sourceTypeModel2, str12, str13, usage2, weChat2, klarna2, sourceOrder2, str7);
    }

    @JvmStatic
    public static final Source fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Receiver getReceiver() {
        return this.receiver;
    }

    /* renamed from: component11, reason: from getter */
    public final Redirect getRedirect() {
        return this.redirect;
    }

    /* renamed from: component12, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final Map<String, Object> component13() {
        return this.sourceTypeData;
    }

    /* renamed from: component14, reason: from getter */
    public final SourceTypeModel getSourceTypeModel() {
        return this.sourceTypeModel;
    }

    /* renamed from: component15, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTypeRaw() {
        return this.typeRaw;
    }

    /* renamed from: component17, reason: from getter */
    public final Usage getUsage() {
        return this.usage;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* renamed from: component20, reason: from getter */
    public final SourceOrder getSourceOrder() {
        return this.sourceOrder;
    }

    /* renamed from: component21, reason: from getter */
    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: component4, reason: from getter */
    public final CodeVerification getCodeVerification() {
        return this.codeVerification;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getCreated() {
        return this.created;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component7, reason: from getter */
    public final Flow getFlow() {
        return this.flow;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    /* renamed from: component9, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    public final Source copy$payments_core_release(String id, Long amount, String clientSecret, CodeVerification codeVerification, Long created, String currency, Flow flow, Boolean isLiveMode, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> sourceTypeData, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat _weChat, Klarna _klarna, SourceOrder sourceOrder, String statementDescriptor) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        return new Source(id, amount, clientSecret, codeVerification, created, currency, flow, isLiveMode, owner, receiver, redirect, status, sourceTypeData, sourceTypeModel, type, typeRaw, usage, _weChat, _klarna, sourceOrder, statementDescriptor);
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
        if (!(other instanceof Source)) {
            return false;
        }
        Source source = (Source) other;
        return Intrinsics.areEqual(this.id, source.id) && Intrinsics.areEqual(this.amount, source.amount) && Intrinsics.areEqual(this.clientSecret, source.clientSecret) && Intrinsics.areEqual(this.codeVerification, source.codeVerification) && Intrinsics.areEqual(this.created, source.created) && Intrinsics.areEqual(this.currency, source.currency) && this.flow == source.flow && Intrinsics.areEqual(this.isLiveMode, source.isLiveMode) && Intrinsics.areEqual(this.owner, source.owner) && Intrinsics.areEqual(this.receiver, source.receiver) && Intrinsics.areEqual(this.redirect, source.redirect) && this.status == source.status && Intrinsics.areEqual(this.sourceTypeData, source.sourceTypeData) && Intrinsics.areEqual(this.sourceTypeModel, source.sourceTypeModel) && Intrinsics.areEqual(this.type, source.type) && Intrinsics.areEqual(this.typeRaw, source.typeRaw) && this.usage == source.usage && Intrinsics.areEqual(this._weChat, source._weChat) && Intrinsics.areEqual(this._klarna, source._klarna) && Intrinsics.areEqual(this.sourceOrder, source.sourceOrder) && Intrinsics.areEqual(this.statementDescriptor, source.statementDescriptor);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.amount;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.clientSecret;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.codeVerification;
        int iHashCode4 = (iHashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l2 = this.created;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.flow;
        int iHashCode7 = (iHashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.isLiveMode;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Owner owner = this.owner;
        int iHashCode9 = (iHashCode8 + (owner == null ? 0 : owner.hashCode())) * 31;
        Receiver receiver = this.receiver;
        int iHashCode10 = (iHashCode9 + (receiver == null ? 0 : receiver.hashCode())) * 31;
        Redirect redirect = this.redirect;
        int iHashCode11 = (iHashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.status;
        int iHashCode12 = (iHashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map<String, Object> map = this.sourceTypeData;
        int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.sourceTypeModel;
        int iHashCode14 = (((((iHashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.type.hashCode()) * 31) + this.typeRaw.hashCode()) * 31;
        Usage usage = this.usage;
        int iHashCode15 = (iHashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        WeChat weChat = this._weChat;
        int iHashCode16 = (iHashCode15 + (weChat == null ? 0 : weChat.hashCode())) * 31;
        Klarna klarna = this._klarna;
        int iHashCode17 = (iHashCode16 + (klarna == null ? 0 : klarna.hashCode())) * 31;
        SourceOrder sourceOrder = this.sourceOrder;
        int iHashCode18 = (iHashCode17 + (sourceOrder == null ? 0 : sourceOrder.hashCode())) * 31;
        String str4 = this.statementDescriptor;
        return iHashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Source(id=" + this.id + ", amount=" + this.amount + ", clientSecret=" + this.clientSecret + ", codeVerification=" + this.codeVerification + ", created=" + this.created + ", currency=" + this.currency + ", flow=" + this.flow + ", isLiveMode=" + this.isLiveMode + ", owner=" + this.owner + ", receiver=" + this.receiver + ", redirect=" + this.redirect + ", status=" + this.status + ", sourceTypeData=" + this.sourceTypeData + ", sourceTypeModel=" + this.sourceTypeModel + ", type=" + this.type + ", typeRaw=" + this.typeRaw + ", usage=" + this.usage + ", _weChat=" + this._weChat + ", _klarna=" + this._klarna + ", sourceOrder=" + this.sourceOrder + ", statementDescriptor=" + this.statementDescriptor + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Long l = this.amount;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeString(this.clientSecret);
        CodeVerification codeVerification = this.codeVerification;
        if (codeVerification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            codeVerification.writeToParcel(dest, flags);
        }
        Long l2 = this.created;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l2.longValue());
        }
        dest.writeString(this.currency);
        Flow flow = this.flow;
        if (flow == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(flow.name());
        }
        Boolean bool = this.isLiveMode;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Owner owner = this.owner;
        if (owner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            owner.writeToParcel(dest, flags);
        }
        Receiver receiver = this.receiver;
        if (receiver == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            receiver.writeToParcel(dest, flags);
        }
        Redirect redirect = this.redirect;
        if (redirect == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            redirect.writeToParcel(dest, flags);
        }
        Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
        Map<String, Object> map = this.sourceTypeData;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        dest.writeParcelable(this.sourceTypeModel, flags);
        dest.writeString(this.type);
        dest.writeString(this.typeRaw);
        Usage usage = this.usage;
        if (usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(usage.name());
        }
        WeChat weChat = this._weChat;
        if (weChat == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            weChat.writeToParcel(dest, flags);
        }
        Klarna klarna = this._klarna;
        if (klarna == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            klarna.writeToParcel(dest, flags);
        }
        SourceOrder sourceOrder = this.sourceOrder;
        if (sourceOrder == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sourceOrder.writeToParcel(dest, flags);
        }
        dest.writeString(this.statementDescriptor);
    }

    public Source(String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeRaw, "typeRaw");
        this.id = str;
        this.amount = l;
        this.clientSecret = str2;
        this.codeVerification = codeVerification;
        this.created = l2;
        this.currency = str3;
        this.flow = flow;
        this.isLiveMode = bool;
        this.owner = owner;
        this.receiver = receiver;
        this.redirect = redirect;
        this.status = status;
        this.sourceTypeData = map;
        this.sourceTypeModel = sourceTypeModel;
        this.type = type;
        this.typeRaw = typeRaw;
        this.usage = usage;
        this._weChat = weChat;
        this._klarna = klarna;
        this.sourceOrder = sourceOrder;
        this.statementDescriptor = str4;
    }

    public /* synthetic */ Source(String str, Long l, String str2, CodeVerification codeVerification, Long l2, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : codeVerification, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : flow, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : owner, (i & 512) != 0 ? null : receiver, (i & 1024) != 0 ? null : redirect, (i & 2048) != 0 ? null : status, (i & 4096) != 0 ? null : map, (i & 8192) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i) != 0 ? null : usage, (131072 & i) != 0 ? null : weChat, (262144 & i) != 0 ? null : klarna, (524288 & i) != 0 ? null : sourceOrder, (i & 1048576) != 0 ? null : str6);
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.id;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final CodeVerification getCodeVerification() {
        return this.codeVerification;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Flow getFlow() {
        return this.flow;
    }

    public final Boolean isLiveMode() {
        return this.isLiveMode;
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final Receiver getReceiver() {
        return this.receiver;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Map<String, Object> getSourceTypeData() {
        return this.sourceTypeData;
    }

    public final SourceTypeModel getSourceTypeModel() {
        return this.sourceTypeModel;
    }

    public final String getType() {
        return this.type;
    }

    public final String getTypeRaw() {
        return this.typeRaw;
    }

    public final Usage getUsage() {
        return this.usage;
    }

    public final SourceOrder getSourceOrder() {
        return this.sourceOrder;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final WeChat getWeChat() {
        if (!Intrinsics.areEqual("wechat", this.type)) {
            throw new IllegalStateException("Source type must be 'wechat'".toString());
        }
        WeChat weChat = this._weChat;
        if (weChat != null) {
            return weChat;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final Klarna getKlarna() {
        if (!Intrinsics.areEqual("klarna", this.type)) {
            throw new IllegalStateException("Source type must be 'klarna'".toString());
        }
        Klarna klarna = this._klarna;
        if (klarna != null) {
            return klarna;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/model/Source$SourceType;", "", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SourceType {
        public static final String ALIPAY = "alipay";
        public static final String BANCONTACT = "bancontact";
        public static final String CARD = "card";

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String EPS = "eps";
        public static final String GIROPAY = "giropay";
        public static final String IDEAL = "ideal";
        public static final String KLARNA = "klarna";
        public static final String MULTIBANCO = "multibanco";
        public static final String P24 = "p24";
        public static final String SEPA_DEBIT = "sepa_debit";
        public static final String SOFORT = "sofort";
        public static final String THREE_D_SECURE = "three_d_secure";
        public static final String UNKNOWN = "unknown";
        public static final String WECHAT = "wechat";

        /* compiled from: Source.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/Source$SourceType$Companion;", "", "<init>", "()V", "ALIPAY", "", "CARD", "THREE_D_SECURE", "GIROPAY", "SEPA_DEBIT", "IDEAL", "SOFORT", "BANCONTACT", "P24", "EPS", "MULTIBANCO", "WECHAT", "KLARNA", "UNKNOWN", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String ALIPAY = "alipay";
            public static final String BANCONTACT = "bancontact";
            public static final String CARD = "card";
            public static final String EPS = "eps";
            public static final String GIROPAY = "giropay";
            public static final String IDEAL = "ideal";
            public static final String KLARNA = "klarna";
            public static final String MULTIBANCO = "multibanco";
            public static final String P24 = "p24";
            public static final String SEPA_DEBIT = "sepa_debit";
            public static final String SOFORT = "sofort";
            public static final String THREE_D_SECURE = "three_d_secure";
            public static final String UNKNOWN = "unknown";
            public static final String WECHAT = "wechat";

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/Source$Status;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Canceled", "Chargeable", "Consumed", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Pending", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Status Canceled = new Status("Canceled", 0, "canceled");
        public static final Status Chargeable = new Status("Chargeable", 1, "chargeable");
        public static final Status Consumed = new Status("Consumed", 2, "consumed");
        public static final Status Failed = new Status(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 3, "failed");
        public static final Status Pending = new Status("Pending", 4, "pending");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Canceled, Chargeable, Consumed, Failed, Pending};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: Source.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Source$Status$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/Source$Status;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Status fromCode(String code) {
                Status next;
                Iterator<Status> it = Status.getEntries().iterator();
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

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/Source$Usage;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Reusable", "SingleUse", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Usage {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Usage[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Usage Reusable = new Usage("Reusable", 0, "reusable");
        public static final Usage SingleUse = new Usage("SingleUse", 1, "single_use");
        private final String code;

        private static final /* synthetic */ Usage[] $values() {
            return new Usage[]{Reusable, SingleUse};
        }

        public static EnumEntries<Usage> getEntries() {
            return $ENTRIES;
        }

        private Usage(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            Usage[] usageArr$values = $values();
            $VALUES = usageArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(usageArr$values);
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: Source.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Source$Usage$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/Source$Usage;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Usage fromCode(String code) {
                Usage next;
                Iterator<Usage> it = Usage.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/Source$Flow;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Redirect", "Receiver", "CodeVerification", "None", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String code;
        public static final Flow Redirect = new Flow("Redirect", 0, "redirect");
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
            INSTANCE = new Companion(null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: Source.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Source$Flow$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/Source$Flow;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Flow fromCode(String code) {
                Flow next;
                Iterator<Flow> it = Flow.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.getCode(), code)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/stripe/android/model/Source$Redirect;", "Lcom/stripe/android/core/model/StripeModel;", "returnUrl", "", "status", "Lcom/stripe/android/model/Source$Redirect$Status;", "url", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)V", "getReturnUrl", "()Ljava/lang/String;", "getStatus", "()Lcom/stripe/android/model/Source$Redirect$Status;", "getUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Status", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Redirect implements StripeModel {
        private final String returnUrl;
        private final Status status;
        private final String url;
        public static final Parcelable.Creator<Redirect> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Source.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Redirect> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Redirect[] newArray(int i) {
                return new Redirect[i];
            }
        }

        public static /* synthetic */ Redirect copy$default(Redirect redirect, String str, Status status, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirect.returnUrl;
            }
            if ((i & 2) != 0) {
                status = redirect.status;
            }
            if ((i & 4) != 0) {
                str2 = redirect.url;
            }
            return redirect.copy(str, status, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Redirect copy(String returnUrl, Status status, String url) {
            return new Redirect(returnUrl, status, url);
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
            if (!(other instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) other;
            return Intrinsics.areEqual(this.returnUrl, redirect.returnUrl) && this.status == redirect.status && Intrinsics.areEqual(this.url, redirect.url);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.returnUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.status;
            int iHashCode2 = (iHashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.url;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.returnUrl + ", status=" + this.status + ", url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.returnUrl);
            Status status = this.status;
            if (status == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(status.name());
            }
            dest.writeString(this.url);
        }

        public Redirect(String str, Status status, String str2) {
            this.returnUrl = str;
            this.status = status;
            this.url = str2;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Source.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Pending", "Succeeded", "NotRequired", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String code;
            public static final Status Pending = new Status("Pending", 0, "pending");
            public static final Status Succeeded = new Status("Succeeded", 1, "succeeded");
            public static final Status NotRequired = new Status("NotRequired", 2, "not_required");
            public static final Status Failed = new Status(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 3, "failed");

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{Pending, Succeeded, NotRequired, Failed};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i, String str2) {
                this.code = str2;
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
                INSTANCE = new Companion(null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }

            /* compiled from: Source.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/Source$Redirect$Status;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Status fromCode(String code) {
                    Status next;
                    Iterator<Status> it = Status.getEntries().iterator();
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

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÀ\u0001¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification;", "Lcom/stripe/android/core/model/StripeModel;", "attemptsRemaining", "", "status", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "<init>", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)V", "getAttemptsRemaining", "()I", "getStatus", "()Lcom/stripe/android/model/Source$CodeVerification$Status;", "component1", "component2", "copy", "copy$payments_core_release", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Status", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CodeVerification implements StripeModel {
        private final int attemptsRemaining;
        private final Status status;
        public static final Parcelable.Creator<CodeVerification> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Source.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CodeVerification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CodeVerification[] newArray(int i) {
                return new CodeVerification[i];
            }
        }

        public static /* synthetic */ CodeVerification copy$payments_core_release$default(CodeVerification codeVerification, int i, Status status, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = codeVerification.attemptsRemaining;
            }
            if ((i2 & 2) != 0) {
                status = codeVerification.status;
            }
            return codeVerification.copy$payments_core_release(i, status);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        /* renamed from: component2, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        public final CodeVerification copy$payments_core_release(int attemptsRemaining, Status status) {
            return new CodeVerification(attemptsRemaining, status);
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
            if (!(other instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) other;
            return this.attemptsRemaining == codeVerification.attemptsRemaining && this.status == codeVerification.status;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.attemptsRemaining) * 31;
            Status status = this.status;
            return iHashCode + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.attemptsRemaining + ", status=" + this.status + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.attemptsRemaining);
            Status status = this.status;
            if (status == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(status.name());
            }
        }

        public CodeVerification(int i, Status status) {
            this.attemptsRemaining = i;
            this.status = status;
        }

        public final int getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public final Status getStatus() {
            return this.status;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Source.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Pending", "Succeeded", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Status {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String code;
            public static final Status Pending = new Status("Pending", 0, "pending");
            public static final Status Succeeded = new Status("Succeeded", 1, "succeeded");
            public static final Status Failed = new Status(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 2, "failed");

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{Pending, Succeeded, Failed};
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i, String str2) {
                this.code = str2;
            }

            static {
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
                INSTANCE = new Companion(null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }

            /* compiled from: Source.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "code", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Status fromCode(String code) {
                    Status next;
                    Iterator<Status> it = Status.getEntries().iterator();
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

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, d2 = {"Lcom/stripe/android/model/Source$Receiver;", "Lcom/stripe/android/core/model/StripeModel;", "address", "", "amountCharged", "", "amountReceived", "amountReturned", "<init>", "(Ljava/lang/String;JJJ)V", "getAddress", "()Ljava/lang/String;", "getAmountCharged", "()J", "getAmountReceived", "getAmountReturned", "component1", "component2", "component3", "component4", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Receiver implements StripeModel {
        private final String address;
        private final long amountCharged;
        private final long amountReceived;
        private final long amountReturned;
        public static final Parcelable.Creator<Receiver> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Source.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Receiver> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Receiver(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Receiver[] newArray(int i) {
                return new Receiver[i];
            }
        }

        public static /* synthetic */ Receiver copy$payments_core_release$default(Receiver receiver, String str, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = receiver.address;
            }
            if ((i & 2) != 0) {
                j = receiver.amountCharged;
            }
            if ((i & 4) != 0) {
                j2 = receiver.amountReceived;
            }
            if ((i & 8) != 0) {
                j3 = receiver.amountReturned;
            }
            long j4 = j3;
            return receiver.copy$payments_core_release(str, j, j2, j4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAmountCharged() {
            return this.amountCharged;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAmountReceived() {
            return this.amountReceived;
        }

        /* renamed from: component4, reason: from getter */
        public final long getAmountReturned() {
            return this.amountReturned;
        }

        public final Receiver copy$payments_core_release(String address, long amountCharged, long amountReceived, long amountReturned) {
            return new Receiver(address, amountCharged, amountReceived, amountReturned);
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
            if (!(other instanceof Receiver)) {
                return false;
            }
            Receiver receiver = (Receiver) other;
            return Intrinsics.areEqual(this.address, receiver.address) && this.amountCharged == receiver.amountCharged && this.amountReceived == receiver.amountReceived && this.amountReturned == receiver.amountReturned;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.address;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.amountCharged)) * 31) + Long.hashCode(this.amountReceived)) * 31) + Long.hashCode(this.amountReturned);
        }

        public String toString() {
            return "Receiver(address=" + this.address + ", amountCharged=" + this.amountCharged + ", amountReceived=" + this.amountReceived + ", amountReturned=" + this.amountReturned + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.address);
            dest.writeLong(this.amountCharged);
            dest.writeLong(this.amountReceived);
            dest.writeLong(this.amountReturned);
        }

        public Receiver(String str, long j, long j2, long j3) {
            this.address = str;
            this.amountCharged = j;
            this.amountReceived = j2;
            this.amountReturned = j3;
        }

        public final String getAddress() {
            return this.address;
        }

        public final long getAmountCharged() {
            return this.amountCharged;
        }

        public final long getAmountReceived() {
            return this.amountReceived;
        }

        public final long getAmountReturned() {
            return this.amountReturned;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÀ\u0001¢\u0006\u0002\b!J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006/"}, d2 = {"Lcom/stripe/android/model/Source$Owner;", "Lcom/stripe/android/core/model/StripeModel;", "address", "Lcom/stripe/android/model/Address;", "email", "", "name", "phone", "verifiedAddress", "verifiedEmail", "verifiedName", "verifiedPhone", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhone", "getVerifiedAddress", "getVerifiedEmail", "getVerifiedName", "getVerifiedPhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Owner implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Owner> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;
        private final Address verifiedAddress;
        private final String verifiedEmail;
        private final String verifiedName;
        private final String verifiedPhone;

        /* compiled from: Source.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Owner> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Owner(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Owner[] newArray(int i) {
                return new Owner[i];
            }
        }

        public static /* synthetic */ Owner copy$payments_core_release$default(Owner owner, Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                address = owner.address;
            }
            if ((i & 2) != 0) {
                str = owner.email;
            }
            if ((i & 4) != 0) {
                str2 = owner.name;
            }
            if ((i & 8) != 0) {
                str3 = owner.phone;
            }
            if ((i & 16) != 0) {
                address2 = owner.verifiedAddress;
            }
            if ((i & 32) != 0) {
                str4 = owner.verifiedEmail;
            }
            if ((i & 64) != 0) {
                str5 = owner.verifiedName;
            }
            if ((i & 128) != 0) {
                str6 = owner.verifiedPhone;
            }
            String str7 = str5;
            String str8 = str6;
            Address address3 = address2;
            String str9 = str4;
            return owner.copy$payments_core_release(address, str, str2, str3, address3, str9, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component5, reason: from getter */
        public final Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        /* renamed from: component6, reason: from getter */
        public final String getVerifiedEmail() {
            return this.verifiedEmail;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVerifiedName() {
            return this.verifiedName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getVerifiedPhone() {
            return this.verifiedPhone;
        }

        public final Owner copy$payments_core_release(Address address, String email, String name, String phone, Address verifiedAddress, String verifiedEmail, String verifiedName, String verifiedPhone) {
            return new Owner(address, email, name, phone, verifiedAddress, verifiedEmail, verifiedName, verifiedPhone);
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
            if (!(other instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) other;
            return Intrinsics.areEqual(this.address, owner.address) && Intrinsics.areEqual(this.email, owner.email) && Intrinsics.areEqual(this.name, owner.name) && Intrinsics.areEqual(this.phone, owner.phone) && Intrinsics.areEqual(this.verifiedAddress, owner.verifiedAddress) && Intrinsics.areEqual(this.verifiedEmail, owner.verifiedEmail) && Intrinsics.areEqual(this.verifiedName, owner.verifiedName) && Intrinsics.areEqual(this.verifiedPhone, owner.verifiedPhone);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address2 = this.verifiedAddress;
            int iHashCode5 = (iHashCode4 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str4 = this.verifiedEmail;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifiedName;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifiedPhone;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ", verifiedAddress=" + this.verifiedAddress + ", verifiedEmail=" + this.verifiedEmail + ", verifiedName=" + this.verifiedName + ", verifiedPhone=" + this.verifiedPhone + ")";
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
            Address address2 = this.verifiedAddress;
            if (address2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                address2.writeToParcel(dest, flags);
            }
            dest.writeString(this.verifiedEmail);
            dest.writeString(this.verifiedName);
            dest.writeString(this.verifiedPhone);
        }

        public Owner(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address2;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final Address getVerifiedAddress() {
            return this.verifiedAddress;
        }

        public final String getVerifiedEmail() {
            return this.verifiedEmail;
        }

        public final String getVerifiedName() {
            return this.verifiedName;
        }

        public final String getVerifiedPhone() {
            return this.verifiedPhone;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003Jé\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0001J\u0006\u0010?\u001a\u00020@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020@HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020@R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*¨\u0006L"}, d2 = {"Lcom/stripe/android/model/Source$Klarna;", "Lcom/stripe/android/core/model/StripeModel;", "firstName", "", "lastName", "purchaseCountry", "clientToken", "payNowAssetUrlsDescriptive", "payNowAssetUrlsStandard", "payNowName", "payNowRedirectUrl", "payLaterAssetUrlsDescriptive", "payLaterAssetUrlsStandard", "payLaterName", "payLaterRedirectUrl", "payOverTimeAssetUrlsDescriptive", "payOverTimeAssetUrlsStandard", "payOverTimeName", "payOverTimeRedirectUrl", "paymentMethodCategories", "", "customPaymentMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getPurchaseCountry", "getClientToken", "getPayNowAssetUrlsDescriptive", "getPayNowAssetUrlsStandard", "getPayNowName", "getPayNowRedirectUrl", "getPayLaterAssetUrlsDescriptive", "getPayLaterAssetUrlsStandard", "getPayLaterName", "getPayLaterRedirectUrl", "getPayOverTimeAssetUrlsDescriptive", "getPayOverTimeAssetUrlsStandard", "getPayOverTimeName", "getPayOverTimeRedirectUrl", "getPaymentMethodCategories", "()Ljava/util/Set;", "getCustomPaymentMethods", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Klarna implements StripeModel {
        private final String clientToken;
        private final Set<String> customPaymentMethods;
        private final String firstName;
        private final String lastName;
        private final String payLaterAssetUrlsDescriptive;
        private final String payLaterAssetUrlsStandard;
        private final String payLaterName;
        private final String payLaterRedirectUrl;
        private final String payNowAssetUrlsDescriptive;
        private final String payNowAssetUrlsStandard;
        private final String payNowName;
        private final String payNowRedirectUrl;
        private final String payOverTimeAssetUrlsDescriptive;
        private final String payOverTimeAssetUrlsStandard;
        private final String payOverTimeName;
        private final String payOverTimeRedirectUrl;
        private final Set<String> paymentMethodCategories;
        private final String purchaseCountry;
        public static final Parcelable.Creator<Klarna> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Source.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Klarna> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
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
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int i2 = 0;
                while (i2 != i) {
                    linkedHashSet.add(parcel.readString());
                    i2++;
                    i = i;
                }
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                int i4 = 0;
                while (i4 != i3) {
                    linkedHashSet3.add(parcel.readString());
                    i4++;
                    i3 = i3;
                }
                return new Klarna(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, linkedHashSet2, linkedHashSet3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Klarna[] newArray(int i) {
                return new Klarna[i];
            }
        }

        public static /* synthetic */ Klarna copy$default(Klarna klarna, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set set, Set set2, int i, Object obj) {
            Set set3;
            Set set4;
            String str17 = (i & 1) != 0 ? klarna.firstName : str;
            String str18 = (i & 2) != 0 ? klarna.lastName : str2;
            String str19 = (i & 4) != 0 ? klarna.purchaseCountry : str3;
            String str20 = (i & 8) != 0 ? klarna.clientToken : str4;
            String str21 = (i & 16) != 0 ? klarna.payNowAssetUrlsDescriptive : str5;
            String str22 = (i & 32) != 0 ? klarna.payNowAssetUrlsStandard : str6;
            String str23 = (i & 64) != 0 ? klarna.payNowName : str7;
            String str24 = (i & 128) != 0 ? klarna.payNowRedirectUrl : str8;
            String str25 = (i & 256) != 0 ? klarna.payLaterAssetUrlsDescriptive : str9;
            String str26 = (i & 512) != 0 ? klarna.payLaterAssetUrlsStandard : str10;
            String str27 = (i & 1024) != 0 ? klarna.payLaterName : str11;
            String str28 = (i & 2048) != 0 ? klarna.payLaterRedirectUrl : str12;
            String str29 = (i & 4096) != 0 ? klarna.payOverTimeAssetUrlsDescriptive : str13;
            String str30 = (i & 8192) != 0 ? klarna.payOverTimeAssetUrlsStandard : str14;
            String str31 = str17;
            String str32 = (i & 16384) != 0 ? klarna.payOverTimeName : str15;
            String str33 = (i & 32768) != 0 ? klarna.payOverTimeRedirectUrl : str16;
            Set set5 = (i & 65536) != 0 ? klarna.paymentMethodCategories : set;
            if ((i & 131072) != 0) {
                set4 = set5;
                set3 = klarna.customPaymentMethods;
            } else {
                set3 = set2;
                set4 = set5;
            }
            return klarna.copy(str31, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str32, str33, set4, set3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component10, reason: from getter */
        public final String getPayLaterAssetUrlsStandard() {
            return this.payLaterAssetUrlsStandard;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPayLaterName() {
            return this.payLaterName;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPayLaterRedirectUrl() {
            return this.payLaterRedirectUrl;
        }

        /* renamed from: component13, reason: from getter */
        public final String getPayOverTimeAssetUrlsDescriptive() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        /* renamed from: component14, reason: from getter */
        public final String getPayOverTimeAssetUrlsStandard() {
            return this.payOverTimeAssetUrlsStandard;
        }

        /* renamed from: component15, reason: from getter */
        public final String getPayOverTimeName() {
            return this.payOverTimeName;
        }

        /* renamed from: component16, reason: from getter */
        public final String getPayOverTimeRedirectUrl() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> component17() {
            return this.paymentMethodCategories;
        }

        public final Set<String> component18() {
            return this.customPaymentMethods;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPurchaseCountry() {
            return this.purchaseCountry;
        }

        /* renamed from: component4, reason: from getter */
        public final String getClientToken() {
            return this.clientToken;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPayNowAssetUrlsDescriptive() {
            return this.payNowAssetUrlsDescriptive;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPayNowAssetUrlsStandard() {
            return this.payNowAssetUrlsStandard;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPayNowName() {
            return this.payNowName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPayNowRedirectUrl() {
            return this.payNowRedirectUrl;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPayLaterAssetUrlsDescriptive() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final Klarna copy(String firstName, String lastName, String purchaseCountry, String clientToken, String payNowAssetUrlsDescriptive, String payNowAssetUrlsStandard, String payNowName, String payNowRedirectUrl, String payLaterAssetUrlsDescriptive, String payLaterAssetUrlsStandard, String payLaterName, String payLaterRedirectUrl, String payOverTimeAssetUrlsDescriptive, String payOverTimeAssetUrlsStandard, String payOverTimeName, String payOverTimeRedirectUrl, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            Intrinsics.checkNotNullParameter(paymentMethodCategories, "paymentMethodCategories");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            return new Klarna(firstName, lastName, purchaseCountry, clientToken, payNowAssetUrlsDescriptive, payNowAssetUrlsStandard, payNowName, payNowRedirectUrl, payLaterAssetUrlsDescriptive, payLaterAssetUrlsStandard, payLaterName, payLaterRedirectUrl, payOverTimeAssetUrlsDescriptive, payOverTimeAssetUrlsStandard, payOverTimeName, payOverTimeRedirectUrl, paymentMethodCategories, customPaymentMethods);
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
            if (!(other instanceof Klarna)) {
                return false;
            }
            Klarna klarna = (Klarna) other;
            return Intrinsics.areEqual(this.firstName, klarna.firstName) && Intrinsics.areEqual(this.lastName, klarna.lastName) && Intrinsics.areEqual(this.purchaseCountry, klarna.purchaseCountry) && Intrinsics.areEqual(this.clientToken, klarna.clientToken) && Intrinsics.areEqual(this.payNowAssetUrlsDescriptive, klarna.payNowAssetUrlsDescriptive) && Intrinsics.areEqual(this.payNowAssetUrlsStandard, klarna.payNowAssetUrlsStandard) && Intrinsics.areEqual(this.payNowName, klarna.payNowName) && Intrinsics.areEqual(this.payNowRedirectUrl, klarna.payNowRedirectUrl) && Intrinsics.areEqual(this.payLaterAssetUrlsDescriptive, klarna.payLaterAssetUrlsDescriptive) && Intrinsics.areEqual(this.payLaterAssetUrlsStandard, klarna.payLaterAssetUrlsStandard) && Intrinsics.areEqual(this.payLaterName, klarna.payLaterName) && Intrinsics.areEqual(this.payLaterRedirectUrl, klarna.payLaterRedirectUrl) && Intrinsics.areEqual(this.payOverTimeAssetUrlsDescriptive, klarna.payOverTimeAssetUrlsDescriptive) && Intrinsics.areEqual(this.payOverTimeAssetUrlsStandard, klarna.payOverTimeAssetUrlsStandard) && Intrinsics.areEqual(this.payOverTimeName, klarna.payOverTimeName) && Intrinsics.areEqual(this.payOverTimeRedirectUrl, klarna.payOverTimeRedirectUrl) && Intrinsics.areEqual(this.paymentMethodCategories, klarna.paymentMethodCategories) && Intrinsics.areEqual(this.customPaymentMethods, klarna.customPaymentMethods);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.firstName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.purchaseCountry;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientToken;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.payNowAssetUrlsDescriptive;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.payNowAssetUrlsStandard;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.payNowName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.payNowRedirectUrl;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payLaterAssetUrlsDescriptive;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.payLaterAssetUrlsStandard;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.payLaterName;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.payLaterRedirectUrl;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.payOverTimeAssetUrlsStandard;
            int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.payOverTimeName;
            int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.payOverTimeRedirectUrl;
            return ((((iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.paymentMethodCategories.hashCode()) * 31) + this.customPaymentMethods.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.firstName + ", lastName=" + this.lastName + ", purchaseCountry=" + this.purchaseCountry + ", clientToken=" + this.clientToken + ", payNowAssetUrlsDescriptive=" + this.payNowAssetUrlsDescriptive + ", payNowAssetUrlsStandard=" + this.payNowAssetUrlsStandard + ", payNowName=" + this.payNowName + ", payNowRedirectUrl=" + this.payNowRedirectUrl + ", payLaterAssetUrlsDescriptive=" + this.payLaterAssetUrlsDescriptive + ", payLaterAssetUrlsStandard=" + this.payLaterAssetUrlsStandard + ", payLaterName=" + this.payLaterName + ", payLaterRedirectUrl=" + this.payLaterRedirectUrl + ", payOverTimeAssetUrlsDescriptive=" + this.payOverTimeAssetUrlsDescriptive + ", payOverTimeAssetUrlsStandard=" + this.payOverTimeAssetUrlsStandard + ", payOverTimeName=" + this.payOverTimeName + ", payOverTimeRedirectUrl=" + this.payOverTimeRedirectUrl + ", paymentMethodCategories=" + this.paymentMethodCategories + ", customPaymentMethods=" + this.customPaymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.firstName);
            dest.writeString(this.lastName);
            dest.writeString(this.purchaseCountry);
            dest.writeString(this.clientToken);
            dest.writeString(this.payNowAssetUrlsDescriptive);
            dest.writeString(this.payNowAssetUrlsStandard);
            dest.writeString(this.payNowName);
            dest.writeString(this.payNowRedirectUrl);
            dest.writeString(this.payLaterAssetUrlsDescriptive);
            dest.writeString(this.payLaterAssetUrlsStandard);
            dest.writeString(this.payLaterName);
            dest.writeString(this.payLaterRedirectUrl);
            dest.writeString(this.payOverTimeAssetUrlsDescriptive);
            dest.writeString(this.payOverTimeAssetUrlsStandard);
            dest.writeString(this.payOverTimeName);
            dest.writeString(this.payOverTimeRedirectUrl);
            Set<String> set = this.paymentMethodCategories;
            dest.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next());
            }
            Set<String> set2 = this.customPaymentMethods;
            dest.writeInt(set2.size());
            Iterator<String> it2 = set2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next());
            }
        }

        public Klarna(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            Intrinsics.checkNotNullParameter(paymentMethodCategories, "paymentMethodCategories");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            this.firstName = str;
            this.lastName = str2;
            this.purchaseCountry = str3;
            this.clientToken = str4;
            this.payNowAssetUrlsDescriptive = str5;
            this.payNowAssetUrlsStandard = str6;
            this.payNowName = str7;
            this.payNowRedirectUrl = str8;
            this.payLaterAssetUrlsDescriptive = str9;
            this.payLaterAssetUrlsStandard = str10;
            this.payLaterName = str11;
            this.payLaterRedirectUrl = str12;
            this.payOverTimeAssetUrlsDescriptive = str13;
            this.payOverTimeAssetUrlsStandard = str14;
            this.payOverTimeName = str15;
            this.payOverTimeRedirectUrl = str16;
            this.paymentMethodCategories = paymentMethodCategories;
            this.customPaymentMethods = customPaymentMethods;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getPurchaseCountry() {
            return this.purchaseCountry;
        }

        public final String getClientToken() {
            return this.clientToken;
        }

        public final String getPayNowAssetUrlsDescriptive() {
            return this.payNowAssetUrlsDescriptive;
        }

        public final String getPayNowAssetUrlsStandard() {
            return this.payNowAssetUrlsStandard;
        }

        public final String getPayNowName() {
            return this.payNowName;
        }

        public final String getPayNowRedirectUrl() {
            return this.payNowRedirectUrl;
        }

        public final String getPayLaterAssetUrlsDescriptive() {
            return this.payLaterAssetUrlsDescriptive;
        }

        public final String getPayLaterAssetUrlsStandard() {
            return this.payLaterAssetUrlsStandard;
        }

        public final String getPayLaterName() {
            return this.payLaterName;
        }

        public final String getPayLaterRedirectUrl() {
            return this.payLaterRedirectUrl;
        }

        public final String getPayOverTimeAssetUrlsDescriptive() {
            return this.payOverTimeAssetUrlsDescriptive;
        }

        public final String getPayOverTimeAssetUrlsStandard() {
            return this.payOverTimeAssetUrlsStandard;
        }

        public final String getPayOverTimeName() {
            return this.payOverTimeName;
        }

        public final String getPayOverTimeRedirectUrl() {
            return this.payOverTimeRedirectUrl;
        }

        public final Set<String> getPaymentMethodCategories() {
            return this.paymentMethodCategories;
        }

        public final Set<String> getCustomPaymentMethods() {
            return this.customPaymentMethods;
        }
    }

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/Source$Companion;", "", "<init>", "()V", "EURO", "", "USD", "fromJson", "Lcom/stripe/android/model/Source;", "jsonObject", "Lorg/json/JSONObject;", "asSourceType", "sourceType", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Source fromJson(JSONObject jsonObject) {
            if (jsonObject != null) {
                return new SourceJsonParser().parse(jsonObject);
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @JvmStatic
        public final String asSourceType(String sourceType) {
            if (sourceType != null) {
                switch (sourceType.hashCode()) {
                    case -1920743119:
                        if (sourceType.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (sourceType.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -896955097:
                        if (sourceType.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (sourceType.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (sourceType.equals("wechat")) {
                            return "wechat";
                        }
                        break;
                    case -284840886:
                        sourceType.equals("unknown");
                        break;
                    case 100648:
                        if (sourceType.equals("eps")) {
                            return "eps";
                        }
                        break;
                    case 109234:
                        if (sourceType.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (sourceType.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (sourceType.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (sourceType.equals("ideal")) {
                            return "ideal";
                        }
                        break;
                    case 1251821346:
                        if (sourceType.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (sourceType.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }
    }
}
