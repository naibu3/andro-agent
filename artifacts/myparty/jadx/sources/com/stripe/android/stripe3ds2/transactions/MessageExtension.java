package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MessageExtension.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0015\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0016J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bHÂ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bHÀ\u0001¢\u0006\u0002\b\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006("}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "Landroid/os/Parcelable;", "name", "", "id", MessageExtension.FIELD_CRITICALITY_INDICATOR, "", "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "getName", "()Ljava/lang/String;", "getId$3ds2sdk_release", "getCriticalityIndicator", "()Z", "isProcessable", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "component1", "component2", "component2$3ds2sdk_release", "component3", "component4", "copy", "copy$3ds2sdk_release", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MessageExtension implements Parcelable {
    private static final int DATA_VALUE_MAX_LENGTH = 8059;
    public static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
    public static final String FIELD_DATA = "data";
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    private static final int ID_MAX_LENGTH = 64;
    private static final int MESSAGE_EXTENSIONS_MAX_COUNT = 10;
    private static final int NAME_MAX_LENGTH = 64;
    private final boolean criticalityIndicator;
    private final Map<String, String> data;
    private final String id;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
    private static final List<String> SUPPORTED_MESSAGE_EXTENSIONS = CollectionsKt.emptyList();

    /* compiled from: MessageExtension.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageExtension> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MessageExtension(string, string2, z, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension[] newArray(int i) {
            return new MessageExtension[i];
        }
    }

    private final Map<String, String> component4() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageExtension copy$3ds2sdk_release$default(MessageExtension messageExtension, String str, String str2, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageExtension.name;
        }
        if ((i & 2) != 0) {
            str2 = messageExtension.id;
        }
        if ((i & 4) != 0) {
            z = messageExtension.criticalityIndicator;
        }
        if ((i & 8) != 0) {
            map = messageExtension.data;
        }
        return messageExtension.copy$3ds2sdk_release(str, str2, z, map);
    }

    @JvmStatic
    public static final List<MessageExtension> fromJson(JSONArray jSONArray) throws ChallengeResponseParseException {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    public static final JSONArray toJsonArray(List<MessageExtension> list) throws JSONException {
        return INSTANCE.toJsonArray(list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2$3ds2sdk_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final MessageExtension copy$3ds2sdk_release(String name, String id, boolean criticalityIndicator, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        return new MessageExtension(name, id, criticalityIndicator, data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageExtension)) {
            return false;
        }
        MessageExtension messageExtension = (MessageExtension) other;
        return Intrinsics.areEqual(this.name, messageExtension.name) && Intrinsics.areEqual(this.id, messageExtension.id) && this.criticalityIndicator == messageExtension.criticalityIndicator && Intrinsics.areEqual(this.data, messageExtension.data);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.criticalityIndicator)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "MessageExtension(name=" + this.name + ", id=" + this.id + ", criticalityIndicator=" + this.criticalityIndicator + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.id);
        dest.writeInt(this.criticalityIndicator ? 1 : 0);
        Map<String, String> map = this.data;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public MessageExtension(String name, String id, boolean z, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.name = name;
        this.id = id;
        this.criticalityIndicator = z;
        this.data = data;
    }

    public final String getName() {
        return this.name;
    }

    public final String getId$3ds2sdk_release() {
        return this.id;
    }

    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public /* synthetic */ MessageExtension(String str, String str2, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final boolean isProcessable() {
        return SUPPORTED_MESSAGE_EXTENSIONS.contains(this.name);
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.name).put("id", this.id).put(FIELD_CRITICALITY_INDICATOR, this.criticalityIndicator).put("data", new JSONObject(this.data));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* compiled from: MessageExtension.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fH\u0007J\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension$Companion;", "", "<init>", "()V", "FIELD_NAME", "", "FIELD_ID", "FIELD_CRITICALITY_INDICATOR", "FIELD_DATA", "ID_MAX_LENGTH", "", "NAME_MAX_LENGTH", "DATA_VALUE_MAX_LENGTH", "MESSAGE_EXTENSIONS_MAX_COUNT", "SUPPORTED_MESSAGE_EXTENSIONS", "", "toJsonArray", "Lorg/json/JSONArray;", ChallengeRequestData.FIELD_MESSAGE_EXTENSION, "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "fromJson", "messageExtensionsJson", "messageExtensionJson", "Lorg/json/JSONObject;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final JSONArray toJsonArray(List<MessageExtension> messageExtensions) throws JSONException {
            if (messageExtensions == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = messageExtensions.iterator();
            while (it.hasNext()) {
                jSONArray.put(((MessageExtension) it.next()).toJson$3ds2sdk_release());
            }
            return jSONArray;
        }

        @JvmStatic
        public final List<MessageExtension> fromJson(JSONArray messageExtensionsJson) throws ChallengeResponseParseException {
            if (messageExtensionsJson == null) {
                return null;
            }
            IntRange intRangeUntil = RangesKt.until(0, messageExtensionsJson.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = messageExtensionsJson.optJSONObject(((IntIterator) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(MessageExtension.INSTANCE.fromJson((JSONObject) it2.next()));
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList4.size() <= 10) {
                return arrayList4;
            }
            throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat(ChallengeRequestData.FIELD_MESSAGE_EXTENSION);
        }

        private final MessageExtension fromJson(JSONObject messageExtensionJson) throws ChallengeResponseParseException {
            String strOptString = messageExtensionJson.optString("name");
            if (strOptString.length() > 64) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtension.name");
            }
            String strOptString2 = messageExtensionJson.optString("id");
            if (strOptString2.length() > 64) {
                throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtension.id");
            }
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = messageExtensionJson.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString3 = jSONObjectOptJSONObject.optString(next);
                    if (strOptString3.length() > MessageExtension.DATA_VALUE_MAX_LENGTH) {
                        throw ChallengeResponseParseException.INSTANCE.createInvalidDataElementFormat("messageExtension.data.value");
                    }
                    map.put(next, strOptString3);
                }
            }
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            return new MessageExtension(strOptString, strOptString2, messageExtensionJson.optBoolean(MessageExtension.FIELD_CRITICALITY_INDICATOR), map);
        }
    }
}
