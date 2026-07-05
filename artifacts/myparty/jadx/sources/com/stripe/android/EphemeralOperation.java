package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EphemeralOperation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/EphemeralOperation;", "Landroid/os/Parcelable;", "<init>", "()V", "id", "", "getId$payments_core_release", "()Ljava/lang/String;", NamedConstantsKt.PRODUCT_USAGE, "", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "RetrieveKey", "Customer", "Issuing", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class EphemeralOperation implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ EphemeralOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId$payments_core_release();

    public abstract Set<String> getProductUsage$payments_core_release();

    private EphemeralOperation() {
    }

    /* compiled from: EphemeralOperation.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÀ\u0003¢\u0006\u0002\b\u000fJ#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/EphemeralOperation$RetrieveKey;", "Lcom/stripe/android/EphemeralOperation;", "id", "", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RetrieveKey extends EphemeralOperation {
        private final String id;
        private final Set<String> productUsage;
        public static final Parcelable.Creator<RetrieveKey> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: EphemeralOperation.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RetrieveKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetrieveKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new RetrieveKey(string, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RetrieveKey[] newArray(int i) {
                return new RetrieveKey[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RetrieveKey copy$default(RetrieveKey retrieveKey, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = retrieveKey.id;
            }
            if ((i & 2) != 0) {
                set = retrieveKey.productUsage;
            }
            return retrieveKey.copy(str, set);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Set<String> component2$payments_core_release() {
            return this.productUsage;
        }

        public final RetrieveKey copy(String id, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new RetrieveKey(id, productUsage);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RetrieveKey)) {
                return false;
            }
            RetrieveKey retrieveKey = (RetrieveKey) other;
            return Intrinsics.areEqual(this.id, retrieveKey.id) && Intrinsics.areEqual(this.productUsage, retrieveKey.productUsage);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            return "RetrieveKey(id=" + this.id + ", productUsage=" + this.productUsage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            Set<String> set = this.productUsage;
            dest.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next());
            }
        }

        @Override // com.stripe.android.EphemeralOperation
        public String getId$payments_core_release() {
            return this.id;
        }

        @Override // com.stripe.android.EphemeralOperation
        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetrieveKey(String id, Set<String> productUsage) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.id = id;
            this.productUsage = productUsage;
        }
    }

    /* compiled from: EphemeralOperation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation;", "<init>", "()V", "AddSource", "DeleteSource", "AttachPaymentMethod", "DetachPaymentMethod", "GetPaymentMethods", "UpdateShipping", "UpdateDefaultSource", "Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Customer extends EphemeralOperation {
        public static final int $stable = 0;

        public /* synthetic */ Customer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Customer() {
            super(null);
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÀ\u0003¢\u0006\u0002\b\u0015J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AddSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "sourceType", "id", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getSourceId", "()Ljava/lang/String;", "getSourceType", "getId$payments_core_release", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddSource extends Customer {
            private final String id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;
            public static final Parcelable.Creator<AddSource> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AddSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddSource createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AddSource(string, string2, string3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddSource[] newArray(int i) {
                    return new AddSource[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AddSource copy$default(AddSource addSource, String str, String str2, String str3, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = addSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = addSource.sourceType;
                }
                if ((i & 4) != 0) {
                    str3 = addSource.id;
                }
                if ((i & 8) != 0) {
                    set = addSource.productUsage;
                }
                return addSource.copy(str, str2, str3, set);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSourceId() {
                return this.sourceId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSourceType() {
                return this.sourceType;
            }

            /* renamed from: component3$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component4$payments_core_release() {
                return this.productUsage;
            }

            public final AddSource copy(String sourceId, String sourceType, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new AddSource(sourceId, sourceType, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddSource)) {
                    return false;
                }
                AddSource addSource = (AddSource) other;
                return Intrinsics.areEqual(this.sourceId, addSource.sourceId) && Intrinsics.areEqual(this.sourceType, addSource.sourceType) && Intrinsics.areEqual(this.id, addSource.id) && Intrinsics.areEqual(this.productUsage, addSource.productUsage);
            }

            public int hashCode() {
                return (((((this.sourceId.hashCode() * 31) + this.sourceType.hashCode()) * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "AddSource(sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.sourceId);
                dest.writeString(this.sourceType);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddSource(String sourceId, String sourceType, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.sourceType = sourceType;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÀ\u0003¢\u0006\u0002\b\u0012J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DeleteSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "id", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getSourceId", "()Ljava/lang/String;", "getId$payments_core_release", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DeleteSource extends Customer {
            private final String id;
            private final Set<String> productUsage;
            private final String sourceId;
            public static final Parcelable.Creator<DeleteSource> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DeleteSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeleteSource createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DeleteSource(string, string2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeleteSource[] newArray(int i) {
                    return new DeleteSource[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DeleteSource copy$default(DeleteSource deleteSource, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = deleteSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = deleteSource.id;
                }
                if ((i & 4) != 0) {
                    set = deleteSource.productUsage;
                }
                return deleteSource.copy(str, str2, set);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSourceId() {
                return this.sourceId;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component3$payments_core_release() {
                return this.productUsage;
            }

            public final DeleteSource copy(String sourceId, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new DeleteSource(sourceId, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeleteSource)) {
                    return false;
                }
                DeleteSource deleteSource = (DeleteSource) other;
                return Intrinsics.areEqual(this.sourceId, deleteSource.sourceId) && Intrinsics.areEqual(this.id, deleteSource.id) && Intrinsics.areEqual(this.productUsage, deleteSource.productUsage);
            }

            public int hashCode() {
                return (((this.sourceId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "DeleteSource(sourceId=" + this.sourceId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.sourceId);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteSource(String sourceId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÀ\u0003¢\u0006\u0002\b\u0012J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "paymentMethodId", "", "id", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getPaymentMethodId", "()Ljava/lang/String;", "getId$payments_core_release", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AttachPaymentMethod extends Customer {
            private final String id;
            private final String paymentMethodId;
            private final Set<String> productUsage;
            public static final Parcelable.Creator<AttachPaymentMethod> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AttachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AttachPaymentMethod(string, string2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod[] newArray(int i) {
                    return new AttachPaymentMethod[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AttachPaymentMethod copy$default(AttachPaymentMethod attachPaymentMethod, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = attachPaymentMethod.paymentMethodId;
                }
                if ((i & 2) != 0) {
                    str2 = attachPaymentMethod.id;
                }
                if ((i & 4) != 0) {
                    set = attachPaymentMethod.productUsage;
                }
                return attachPaymentMethod.copy(str, str2, set);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component3$payments_core_release() {
                return this.productUsage;
            }

            public final AttachPaymentMethod copy(String paymentMethodId, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new AttachPaymentMethod(paymentMethodId, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AttachPaymentMethod)) {
                    return false;
                }
                AttachPaymentMethod attachPaymentMethod = (AttachPaymentMethod) other;
                return Intrinsics.areEqual(this.paymentMethodId, attachPaymentMethod.paymentMethodId) && Intrinsics.areEqual(this.id, attachPaymentMethod.id) && Intrinsics.areEqual(this.productUsage, attachPaymentMethod.productUsage);
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "AttachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.paymentMethodId);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AttachPaymentMethod(String paymentMethodId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u000f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÀ\u0003¢\u0006\u0002\b\u0012J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "paymentMethodId", "", "id", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getPaymentMethodId", "()Ljava/lang/String;", "getId$payments_core_release", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DetachPaymentMethod extends Customer {
            private final String id;
            private final String paymentMethodId;
            private final Set<String> productUsage;
            public static final Parcelable.Creator<DetachPaymentMethod> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DetachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DetachPaymentMethod(string, string2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod[] newArray(int i) {
                    return new DetachPaymentMethod[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DetachPaymentMethod copy$default(DetachPaymentMethod detachPaymentMethod, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = detachPaymentMethod.paymentMethodId;
                }
                if ((i & 2) != 0) {
                    str2 = detachPaymentMethod.id;
                }
                if ((i & 4) != 0) {
                    set = detachPaymentMethod.productUsage;
                }
                return detachPaymentMethod.copy(str, str2, set);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component3$payments_core_release() {
                return this.productUsage;
            }

            public final DetachPaymentMethod copy(String paymentMethodId, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new DetachPaymentMethod(paymentMethodId, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DetachPaymentMethod)) {
                    return false;
                }
                DetachPaymentMethod detachPaymentMethod = (DetachPaymentMethod) other;
                return Intrinsics.areEqual(this.paymentMethodId, detachPaymentMethod.paymentMethodId) && Intrinsics.areEqual(this.id, detachPaymentMethod.id) && Intrinsics.areEqual(this.productUsage, detachPaymentMethod.productUsage);
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "DetachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.paymentMethodId);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            public final String getPaymentMethodId() {
                return this.paymentMethodId;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetachPaymentMethod(String paymentMethodId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0019\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÀ\u0003¢\u0006\u0002\b$JV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0005J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00063"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "limit", "", "endingBefore", "", "startingAfter", "id", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "getLimit$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndingBefore$payments_core_release", "()Ljava/lang/String;", "getStartingAfter$payments_core_release", "getId$payments_core_release", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "copy", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GetPaymentMethods extends Customer {
            private final String endingBefore;
            private final String id;
            private final Integer limit;
            private final Set<String> productUsage;
            private final String startingAfter;
            private final PaymentMethod.Type type;
            public static final Parcelable.Creator<GetPaymentMethods> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<GetPaymentMethods> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    PaymentMethod.Type typeCreateFromParcel = PaymentMethod.Type.CREATOR.createFromParcel(parcel);
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new GetPaymentMethods(typeCreateFromParcel, numValueOf, string, string2, string3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods[] newArray(int i) {
                    return new GetPaymentMethods[i];
                }
            }

            public static /* synthetic */ GetPaymentMethods copy$default(GetPaymentMethods getPaymentMethods, PaymentMethod.Type type, Integer num, String str, String str2, String str3, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    type = getPaymentMethods.type;
                }
                if ((i & 2) != 0) {
                    num = getPaymentMethods.limit;
                }
                if ((i & 4) != 0) {
                    str = getPaymentMethods.endingBefore;
                }
                if ((i & 8) != 0) {
                    str2 = getPaymentMethods.startingAfter;
                }
                if ((i & 16) != 0) {
                    str3 = getPaymentMethods.id;
                }
                if ((i & 32) != 0) {
                    set = getPaymentMethods.productUsage;
                }
                String str4 = str3;
                Set set2 = set;
                return getPaymentMethods.copy(type, num, str, str2, str4, set2);
            }

            /* renamed from: component1$payments_core_release, reason: from getter */
            public final PaymentMethod.Type getType() {
                return this.type;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final Integer getLimit() {
                return this.limit;
            }

            /* renamed from: component3$payments_core_release, reason: from getter */
            public final String getEndingBefore() {
                return this.endingBefore;
            }

            /* renamed from: component4$payments_core_release, reason: from getter */
            public final String getStartingAfter() {
                return this.startingAfter;
            }

            /* renamed from: component5$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component6$payments_core_release() {
                return this.productUsage;
            }

            public final GetPaymentMethods copy(PaymentMethod.Type type, Integer limit, String endingBefore, String startingAfter, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new GetPaymentMethods(type, limit, endingBefore, startingAfter, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetPaymentMethods)) {
                    return false;
                }
                GetPaymentMethods getPaymentMethods = (GetPaymentMethods) other;
                return this.type == getPaymentMethods.type && Intrinsics.areEqual(this.limit, getPaymentMethods.limit) && Intrinsics.areEqual(this.endingBefore, getPaymentMethods.endingBefore) && Intrinsics.areEqual(this.startingAfter, getPaymentMethods.startingAfter) && Intrinsics.areEqual(this.id, getPaymentMethods.id) && Intrinsics.areEqual(this.productUsage, getPaymentMethods.productUsage);
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Integer num = this.limit;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.endingBefore;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.startingAfter;
                return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "GetPaymentMethods(type=" + this.type + ", limit=" + this.limit + ", endingBefore=" + this.endingBefore + ", startingAfter=" + this.startingAfter + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.type.writeToParcel(dest, flags);
                Integer num = this.limit;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeString(this.endingBefore);
                dest.writeString(this.startingAfter);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ GetPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, String str3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
                Set set2;
                String str4;
                String str5;
                num = (i & 2) != 0 ? null : num;
                str = (i & 4) != 0 ? null : str;
                if ((i & 8) != 0) {
                    set2 = set;
                    str4 = str3;
                    str5 = null;
                } else {
                    set2 = set;
                    str4 = str3;
                    str5 = str2;
                }
                this(type, num, str, str5, str4, set2);
            }

            public final PaymentMethod.Type getType$payments_core_release() {
                return this.type;
            }

            public final Integer getLimit$payments_core_release() {
                return this.limit;
            }

            public final String getEndingBefore$payments_core_release() {
                return this.endingBefore;
            }

            public final String getStartingAfter$payments_core_release() {
                return this.startingAfter;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetPaymentMethods(PaymentMethod.Type type, Integer num, String str, String str2, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.type = type;
                this.limit = num;
                this.endingBefore = str;
                this.startingAfter = str2;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÀ\u0003¢\u0006\u0002\b\u0014J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "id", "", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Ljava/util/Set;)V", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getId$payments_core_release", "()Ljava/lang/String;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateShipping extends Customer {
            private final String id;
            private final Set<String> productUsage;
            private final ShippingInformation shippingInformation;
            public static final Parcelable.Creator<UpdateShipping> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UpdateShipping> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ShippingInformation shippingInformationCreateFromParcel = ShippingInformation.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateShipping(shippingInformationCreateFromParcel, string, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping[] newArray(int i) {
                    return new UpdateShipping[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdateShipping copy$default(UpdateShipping updateShipping, ShippingInformation shippingInformation, String str, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    shippingInformation = updateShipping.shippingInformation;
                }
                if ((i & 2) != 0) {
                    str = updateShipping.id;
                }
                if ((i & 4) != 0) {
                    set = updateShipping.productUsage;
                }
                return updateShipping.copy(shippingInformation, str, set);
            }

            /* renamed from: component1, reason: from getter */
            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component3$payments_core_release() {
                return this.productUsage;
            }

            public final UpdateShipping copy(ShippingInformation shippingInformation, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new UpdateShipping(shippingInformation, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateShipping)) {
                    return false;
                }
                UpdateShipping updateShipping = (UpdateShipping) other;
                return Intrinsics.areEqual(this.shippingInformation, updateShipping.shippingInformation) && Intrinsics.areEqual(this.id, updateShipping.id) && Intrinsics.areEqual(this.productUsage, updateShipping.productUsage);
            }

            public int hashCode() {
                return (((this.shippingInformation.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "UpdateShipping(shippingInformation=" + this.shippingInformation + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.shippingInformation.writeToParcel(dest, flags);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateShipping(ShippingInformation shippingInformation, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.shippingInformation = shippingInformation;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÀ\u0003¢\u0006\u0002\b\u0015J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateDefaultSource;", "Lcom/stripe/android/EphemeralOperation$Customer;", "sourceId", "", "sourceType", "id", NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getSourceId", "()Ljava/lang/String;", "getSourceType", "getId$payments_core_release", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "component1", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateDefaultSource extends Customer {
            private final String id;
            private final Set<String> productUsage;
            private final String sourceId;
            private final String sourceType;
            public static final Parcelable.Creator<UpdateDefaultSource> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UpdateDefaultSource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateDefaultSource createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateDefaultSource(string, string2, string3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateDefaultSource[] newArray(int i) {
                    return new UpdateDefaultSource[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UpdateDefaultSource copy$default(UpdateDefaultSource updateDefaultSource, String str, String str2, String str3, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updateDefaultSource.sourceId;
                }
                if ((i & 2) != 0) {
                    str2 = updateDefaultSource.sourceType;
                }
                if ((i & 4) != 0) {
                    str3 = updateDefaultSource.id;
                }
                if ((i & 8) != 0) {
                    set = updateDefaultSource.productUsage;
                }
                return updateDefaultSource.copy(str, str2, str3, set);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSourceId() {
                return this.sourceId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSourceType() {
                return this.sourceType;
            }

            /* renamed from: component3$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Set<String> component4$payments_core_release() {
                return this.productUsage;
            }

            public final UpdateDefaultSource copy(String sourceId, String sourceType, String id, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new UpdateDefaultSource(sourceId, sourceType, id, productUsage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateDefaultSource)) {
                    return false;
                }
                UpdateDefaultSource updateDefaultSource = (UpdateDefaultSource) other;
                return Intrinsics.areEqual(this.sourceId, updateDefaultSource.sourceId) && Intrinsics.areEqual(this.sourceType, updateDefaultSource.sourceType) && Intrinsics.areEqual(this.id, updateDefaultSource.id) && Intrinsics.areEqual(this.productUsage, updateDefaultSource.productUsage);
            }

            public int hashCode() {
                return (((((this.sourceId.hashCode() * 31) + this.sourceType.hashCode()) * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "UpdateDefaultSource(sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.sourceId);
                dest.writeString(this.sourceType);
                dest.writeString(this.id);
                Set<String> set = this.productUsage;
                dest.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next());
                }
            }

            public final String getSourceId() {
                return this.sourceId;
            }

            public final String getSourceType() {
                return this.sourceType;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            @Override // com.stripe.android.EphemeralOperation
            public Set<String> getProductUsage$payments_core_release() {
                return this.productUsage;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateDefaultSource(String sourceId, String sourceType, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                Intrinsics.checkNotNullParameter(sourceType, "sourceType");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.sourceId = sourceId;
                this.sourceType = sourceType;
                this.id = id;
                this.productUsage = productUsage;
            }
        }
    }

    /* compiled from: EphemeralOperation.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\t\nB\u0019\b\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing;", "Lcom/stripe/android/EphemeralOperation;", NamedConstantsKt.PRODUCT_USAGE, "", "", "<init>", "(Ljava/util/Set;)V", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "RetrievePin", "UpdatePin", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Issuing extends EphemeralOperation {
        public static final int $stable = 8;
        private final Set<String> productUsage;

        public /* synthetic */ Issuing(Set set, DefaultConstructorMarker defaultConstructorMarker) {
            this(set);
        }

        public /* synthetic */ Issuing(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SetsKt.emptySet() : set, null);
        }

        @Override // com.stripe.android.EphemeralOperation
        public Set<String> getProductUsage$payments_core_release() {
            return this.productUsage;
        }

        private Issuing(Set<String> set) {
            super(null);
            this.productUsage = set;
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "cardId", "", "verificationId", "userOneTimeCode", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getVerificationId", "getUserOneTimeCode", "getId$payments_core_release", "component1", "component2", "component3", "component4", "component4$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RetrievePin extends Issuing {
            private final String cardId;
            private final String id;
            private final String userOneTimeCode;
            private final String verificationId;
            public static final Parcelable.Creator<RetrievePin> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RetrievePin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RetrievePin createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RetrievePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RetrievePin[] newArray(int i) {
                    return new RetrievePin[i];
                }
            }

            public static /* synthetic */ RetrievePin copy$default(RetrievePin retrievePin, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = retrievePin.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = retrievePin.verificationId;
                }
                if ((i & 4) != 0) {
                    str3 = retrievePin.userOneTimeCode;
                }
                if ((i & 8) != 0) {
                    str4 = retrievePin.id;
                }
                return retrievePin.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCardId() {
                return this.cardId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVerificationId() {
                return this.verificationId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            /* renamed from: component4$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final RetrievePin copy(String cardId, String verificationId, String userOneTimeCode, String id) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                return new RetrievePin(cardId, verificationId, userOneTimeCode, id);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RetrievePin)) {
                    return false;
                }
                RetrievePin retrievePin = (RetrievePin) other;
                return Intrinsics.areEqual(this.cardId, retrievePin.cardId) && Intrinsics.areEqual(this.verificationId, retrievePin.verificationId) && Intrinsics.areEqual(this.userOneTimeCode, retrievePin.userOneTimeCode) && Intrinsics.areEqual(this.id, retrievePin.id);
            }

            public int hashCode() {
                return (((((this.cardId.hashCode() * 31) + this.verificationId.hashCode()) * 31) + this.userOneTimeCode.hashCode()) * 31) + this.id.hashCode();
            }

            public String toString() {
                return "RetrievePin(cardId=" + this.cardId + ", verificationId=" + this.verificationId + ", userOneTimeCode=" + this.userOneTimeCode + ", id=" + this.id + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.cardId);
                dest.writeString(this.verificationId);
                dest.writeString(this.userOneTimeCode);
                dest.writeString(this.id);
            }

            public final String getCardId() {
                return this.cardId;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public RetrievePin(String cardId, String verificationId, String userOneTimeCode, String id) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                this.cardId = cardId;
                this.verificationId = verificationId;
                this.userOneTimeCode = userOneTimeCode;
                this.id = id;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0014\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0015J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "Lcom/stripe/android/EphemeralOperation$Issuing;", "cardId", "", "newPin", "verificationId", "userOneTimeCode", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getNewPin", "getVerificationId", "getUserOneTimeCode", "getId$payments_core_release", "component1", "component2", "component3", "component4", "component5", "component5$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdatePin extends Issuing {
            private final String cardId;
            private final String id;
            private final String newPin;
            private final String userOneTimeCode;
            private final String verificationId;
            public static final Parcelable.Creator<UpdatePin> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UpdatePin> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdatePin createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UpdatePin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdatePin[] newArray(int i) {
                    return new UpdatePin[i];
                }
            }

            public static /* synthetic */ UpdatePin copy$default(UpdatePin updatePin, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = updatePin.cardId;
                }
                if ((i & 2) != 0) {
                    str2 = updatePin.newPin;
                }
                if ((i & 4) != 0) {
                    str3 = updatePin.verificationId;
                }
                if ((i & 8) != 0) {
                    str4 = updatePin.userOneTimeCode;
                }
                if ((i & 16) != 0) {
                    str5 = updatePin.id;
                }
                String str6 = str5;
                String str7 = str3;
                return updatePin.copy(str, str2, str7, str4, str6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCardId() {
                return this.cardId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getNewPin() {
                return this.newPin;
            }

            /* renamed from: component3, reason: from getter */
            public final String getVerificationId() {
                return this.verificationId;
            }

            /* renamed from: component4, reason: from getter */
            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            /* renamed from: component5$payments_core_release, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final UpdatePin copy(String cardId, String newPin, String verificationId, String userOneTimeCode, String id) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(newPin, "newPin");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                return new UpdatePin(cardId, newPin, verificationId, userOneTimeCode, id);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdatePin)) {
                    return false;
                }
                UpdatePin updatePin = (UpdatePin) other;
                return Intrinsics.areEqual(this.cardId, updatePin.cardId) && Intrinsics.areEqual(this.newPin, updatePin.newPin) && Intrinsics.areEqual(this.verificationId, updatePin.verificationId) && Intrinsics.areEqual(this.userOneTimeCode, updatePin.userOneTimeCode) && Intrinsics.areEqual(this.id, updatePin.id);
            }

            public int hashCode() {
                return (((((((this.cardId.hashCode() * 31) + this.newPin.hashCode()) * 31) + this.verificationId.hashCode()) * 31) + this.userOneTimeCode.hashCode()) * 31) + this.id.hashCode();
            }

            public String toString() {
                return "UpdatePin(cardId=" + this.cardId + ", newPin=" + this.newPin + ", verificationId=" + this.verificationId + ", userOneTimeCode=" + this.userOneTimeCode + ", id=" + this.id + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.cardId);
                dest.writeString(this.newPin);
                dest.writeString(this.verificationId);
                dest.writeString(this.userOneTimeCode);
                dest.writeString(this.id);
            }

            public final String getCardId() {
                return this.cardId;
            }

            public final String getNewPin() {
                return this.newPin;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public final String getUserOneTimeCode() {
                return this.userOneTimeCode;
            }

            @Override // com.stripe.android.EphemeralOperation
            public String getId$payments_core_release() {
                return this.id;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public UpdatePin(String cardId, String newPin, String verificationId, String userOneTimeCode, String id) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(newPin, "newPin");
                Intrinsics.checkNotNullParameter(verificationId, "verificationId");
                Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
                Intrinsics.checkNotNullParameter(id, "id");
                this.cardId = cardId;
                this.newPin = newPin;
                this.verificationId = verificationId;
                this.userOneTimeCode = userOneTimeCode;
                this.id = id;
            }
        }
    }
}
