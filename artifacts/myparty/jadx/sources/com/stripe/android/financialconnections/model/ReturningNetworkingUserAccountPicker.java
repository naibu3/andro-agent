package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TextUpdate.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002?@BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010,\u001a\u00020\u0010J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010J%\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$¨\u0006A"}, d2 = {"Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "Landroid/os/Parcelable;", "title", "", "defaultCta", "addNewAccount", "Lcom/stripe/android/financialconnections/model/AddNewAccount;", "accounts", "", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "aboveCta", "multipleAccountTypesSelectedDataAccessNotice", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getDefaultCta$annotations", "getDefaultCta", "getAddNewAccount$annotations", "getAddNewAccount", "()Lcom/stripe/android/financialconnections/model/AddNewAccount;", "getAccounts$annotations", "getAccounts", "()Ljava/util/List;", "getAboveCta$annotations", "getAboveCta", "getMultipleAccountTypesSelectedDataAccessNotice$annotations", "getMultipleAccountTypesSelectedDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class ReturningNetworkingUserAccountPicker implements Parcelable {
    private final String aboveCta;
    private final List<NetworkedAccount> accounts;
    private final AddNewAccount addNewAccount;
    private final String defaultCta;
    private final DataAccessNotice multipleAccountTypesSelectedDataAccessNotice;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ReturningNetworkingUserAccountPicker> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(NetworkedAccount$$serializer.INSTANCE), null, null};

    /* compiled from: TextUpdate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReturningNetworkingUserAccountPicker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturningNetworkingUserAccountPicker createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            AddNewAccount addNewAccountCreateFromParcel = AddNewAccount.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(NetworkedAccount.CREATOR.createFromParcel(parcel));
            }
            return new ReturningNetworkingUserAccountPicker(string, string2, addNewAccountCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturningNetworkingUserAccountPicker[] newArray(int i) {
            return new ReturningNetworkingUserAccountPicker[i];
        }
    }

    public static /* synthetic */ ReturningNetworkingUserAccountPicker copy$default(ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker, String str, String str2, AddNewAccount addNewAccount, List list, String str3, DataAccessNotice dataAccessNotice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returningNetworkingUserAccountPicker.title;
        }
        if ((i & 2) != 0) {
            str2 = returningNetworkingUserAccountPicker.defaultCta;
        }
        if ((i & 4) != 0) {
            addNewAccount = returningNetworkingUserAccountPicker.addNewAccount;
        }
        if ((i & 8) != 0) {
            list = returningNetworkingUserAccountPicker.accounts;
        }
        if ((i & 16) != 0) {
            str3 = returningNetworkingUserAccountPicker.aboveCta;
        }
        if ((i & 32) != 0) {
            dataAccessNotice = returningNetworkingUserAccountPicker.multipleAccountTypesSelectedDataAccessNotice;
        }
        String str4 = str3;
        DataAccessNotice dataAccessNotice2 = dataAccessNotice;
        return returningNetworkingUserAccountPicker.copy(str, str2, addNewAccount, list, str4, dataAccessNotice2);
    }

    @SerialName("above_cta")
    @Serializable(with = MarkdownToHtmlSerializer.class)
    public static /* synthetic */ void getAboveCta$annotations() {
    }

    @SerialName("accounts")
    public static /* synthetic */ void getAccounts$annotations() {
    }

    @SerialName("add_new_account")
    public static /* synthetic */ void getAddNewAccount$annotations() {
    }

    @SerialName("default_cta")
    public static /* synthetic */ void getDefaultCta$annotations() {
    }

    @SerialName("multiple_account_types_selected_data_access_notice")
    public static /* synthetic */ void getMultipleAccountTypesSelectedDataAccessNotice$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDefaultCta() {
        return this.defaultCta;
    }

    /* renamed from: component3, reason: from getter */
    public final AddNewAccount getAddNewAccount() {
        return this.addNewAccount;
    }

    public final List<NetworkedAccount> component4() {
        return this.accounts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    /* renamed from: component6, reason: from getter */
    public final DataAccessNotice getMultipleAccountTypesSelectedDataAccessNotice() {
        return this.multipleAccountTypesSelectedDataAccessNotice;
    }

    public final ReturningNetworkingUserAccountPicker copy(String title, String defaultCta, AddNewAccount addNewAccount, List<NetworkedAccount> accounts, String aboveCta, DataAccessNotice multipleAccountTypesSelectedDataAccessNotice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(defaultCta, "defaultCta");
        Intrinsics.checkNotNullParameter(addNewAccount, "addNewAccount");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        return new ReturningNetworkingUserAccountPicker(title, defaultCta, addNewAccount, accounts, aboveCta, multipleAccountTypesSelectedDataAccessNotice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturningNetworkingUserAccountPicker)) {
            return false;
        }
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = (ReturningNetworkingUserAccountPicker) other;
        return Intrinsics.areEqual(this.title, returningNetworkingUserAccountPicker.title) && Intrinsics.areEqual(this.defaultCta, returningNetworkingUserAccountPicker.defaultCta) && Intrinsics.areEqual(this.addNewAccount, returningNetworkingUserAccountPicker.addNewAccount) && Intrinsics.areEqual(this.accounts, returningNetworkingUserAccountPicker.accounts) && Intrinsics.areEqual(this.aboveCta, returningNetworkingUserAccountPicker.aboveCta) && Intrinsics.areEqual(this.multipleAccountTypesSelectedDataAccessNotice, returningNetworkingUserAccountPicker.multipleAccountTypesSelectedDataAccessNotice);
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.defaultCta.hashCode()) * 31) + this.addNewAccount.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        String str = this.aboveCta;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
        return iHashCode2 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0);
    }

    public String toString() {
        return "ReturningNetworkingUserAccountPicker(title=" + this.title + ", defaultCta=" + this.defaultCta + ", addNewAccount=" + this.addNewAccount + ", accounts=" + this.accounts + ", aboveCta=" + this.aboveCta + ", multipleAccountTypesSelectedDataAccessNotice=" + this.multipleAccountTypesSelectedDataAccessNotice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.defaultCta);
        this.addNewAccount.writeToParcel(dest, flags);
        List<NetworkedAccount> list = this.accounts;
        dest.writeInt(list.size());
        Iterator<NetworkedAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.aboveCta);
        DataAccessNotice dataAccessNotice = this.multipleAccountTypesSelectedDataAccessNotice;
        if (dataAccessNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dataAccessNotice.writeToParcel(dest, flags);
        }
    }

    /* compiled from: TextUpdate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReturningNetworkingUserAccountPicker> serializer() {
            return ReturningNetworkingUserAccountPicker$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReturningNetworkingUserAccountPicker(int i, String str, String str2, AddNewAccount addNewAccount, List list, String str3, DataAccessNotice dataAccessNotice, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.defaultCta = str2;
        this.addNewAccount = addNewAccount;
        this.accounts = list;
        if ((i & 16) == 0) {
            this.aboveCta = null;
        } else {
            this.aboveCta = str3;
        }
        if ((i & 32) == 0) {
            this.multipleAccountTypesSelectedDataAccessNotice = null;
        } else {
            this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(ReturningNetworkingUserAccountPicker self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.defaultCta);
        output.encodeSerializableElement(serialDesc, 2, AddNewAccount$$serializer.INSTANCE, self.addNewAccount);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.accounts);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.aboveCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, MarkdownToHtmlSerializer.INSTANCE, self.aboveCta);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.multipleAccountTypesSelectedDataAccessNotice == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, DataAccessNotice$$serializer.INSTANCE, self.multipleAccountTypesSelectedDataAccessNotice);
    }

    public ReturningNetworkingUserAccountPicker(String title, String defaultCta, AddNewAccount addNewAccount, List<NetworkedAccount> accounts, String str, DataAccessNotice dataAccessNotice) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(defaultCta, "defaultCta");
        Intrinsics.checkNotNullParameter(addNewAccount, "addNewAccount");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.title = title;
        this.defaultCta = defaultCta;
        this.addNewAccount = addNewAccount;
        this.accounts = accounts;
        this.aboveCta = str;
        this.multipleAccountTypesSelectedDataAccessNotice = dataAccessNotice;
    }

    public /* synthetic */ ReturningNetworkingUserAccountPicker(String str, String str2, AddNewAccount addNewAccount, List list, String str3, DataAccessNotice dataAccessNotice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, addNewAccount, list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : dataAccessNotice);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDefaultCta() {
        return this.defaultCta;
    }

    public final AddNewAccount getAddNewAccount() {
        return this.addNewAccount;
    }

    public final List<NetworkedAccount> getAccounts() {
        return this.accounts;
    }

    public final String getAboveCta() {
        return this.aboveCta;
    }

    public final DataAccessNotice getMultipleAccountTypesSelectedDataAccessNotice() {
        return this.multipleAccountTypesSelectedDataAccessNotice;
    }
}
