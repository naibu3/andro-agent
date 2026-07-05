package com.stripe.android.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: BecsDebitBanks.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks;", "", "banks", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "shouldIncludeTestBank", "", "<init>", "(Ljava/util/List;Z)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Z)V", "getBanks$payments_core_release", "()Ljava/util/List;", "byPrefix", "bsb", "", "Bank", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BecsDebitBanks {
    private final List<Bank> banks;
    private final boolean shouldIncludeTestBank;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Bank STRIPE_TEST_BANK = new Bank("00", "Stripe Test Bank");

    public BecsDebitBanks(List<Bank> banks, boolean z) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.banks = banks;
        this.shouldIncludeTestBank = z;
    }

    public /* synthetic */ BecsDebitBanks(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<Bank>) list, (i & 2) != 0 ? true : z);
    }

    public final List<Bank> getBanks$payments_core_release() {
        return this.banks;
    }

    public /* synthetic */ BecsDebitBanks(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBanks(Context context, boolean z) {
        this((List<Bank>) Companion.createBanksData(context), z);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Bank byPrefix(String bsb) {
        Intrinsics.checkNotNullParameter(bsb, "bsb");
        List<Bank> list = this.banks;
        Bank bank = STRIPE_TEST_BANK;
        Object obj = null;
        if (!this.shouldIncludeTestBank) {
            bank = null;
        }
        Iterator it = CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOfNotNull(bank)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.startsWith$default(bsb, ((Bank) next).getPrefix(), false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        return (Bank) obj;
    }

    /* compiled from: BecsDebitBanks.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Bank;", "Landroid/os/Parcelable;", "prefix", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Bank implements Parcelable {
        private final String name;
        private final String prefix;
        public static final Parcelable.Creator<Bank> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: BecsDebitBanks.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Bank> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bank createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bank(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bank[] newArray(int i) {
                return new Bank[i];
            }
        }

        public static /* synthetic */ Bank copy$default(Bank bank, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bank.prefix;
            }
            if ((i & 2) != 0) {
                str2 = bank.name;
            }
            return bank.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Bank copy(String prefix, String name) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Bank(prefix, name);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bank)) {
                return false;
            }
            Bank bank = (Bank) other;
            return Intrinsics.areEqual(this.prefix, bank.prefix) && Intrinsics.areEqual(this.name, bank.name);
        }

        public int hashCode() {
            return (this.prefix.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Bank(prefix=" + this.prefix + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.prefix);
            dest.writeString(this.name);
        }

        public Bank(String prefix, String name) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(name, "name");
            this.prefix = prefix;
            this.name = name;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: BecsDebitBanks.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Companion;", "", "<init>", "()V", "createBanksData", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "context", "Landroid/content/Context;", "readFile", "", "STRIPE_TEST_BANK", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Bank> createBanksData(Context context) {
            Map mapJsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(readFile(context)));
            if (mapJsonObjectToMap == null) {
                mapJsonObjectToMap = MapsKt.emptyMap();
            }
            ArrayList arrayList = new ArrayList(mapJsonObjectToMap.size());
            for (Map.Entry entry : mapJsonObjectToMap.entrySet()) {
                arrayList.add(new Bank((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String readFile(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            return next;
        }
    }
}
