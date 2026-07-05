package com.stripe.android.payments.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.ElementsSessionContext;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountLauncher.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "Landroid/os/Parcelable;", "USBankAccount", "USBankAccountInternal", "InstantDebits", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CollectBankAccountConfiguration extends Parcelable {

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "name", "", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getEmail", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccount implements Parcelable, CollectBankAccountConfiguration {
        private final String email;
        private final String name;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CollectBankAccountLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uSBankAccount.name;
            }
            if ((i & 2) != 0) {
                str2 = uSBankAccount.email;
            }
            return uSBankAccount.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final USBankAccount copy(String name, String email) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new USBankAccount(name, email);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return Intrinsics.areEqual(this.name, uSBankAccount.name) && Intrinsics.areEqual(this.email, uSBankAccount.email);
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.email;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "USBankAccount(name=" + this.name + ", email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.email);
        }

        public USBankAccount(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.email = str;
        }

        public final String getName() {
            return this.name;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "name", "", "email", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getName", "()Ljava/lang/String;", "getEmail", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccountInternal implements Parcelable, CollectBankAccountConfiguration {
        private final ElementsSessionContext elementsSessionContext;
        private final String email;
        private final String name;
        public static final Parcelable.Creator<USBankAccountInternal> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CollectBankAccountLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccountInternal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccountInternal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccountInternal(parcel.readString(), parcel.readString(), (ElementsSessionContext) parcel.readParcelable(USBankAccountInternal.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccountInternal[] newArray(int i) {
                return new USBankAccountInternal[i];
            }
        }

        public static /* synthetic */ USBankAccountInternal copy$default(USBankAccountInternal uSBankAccountInternal, String str, String str2, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uSBankAccountInternal.name;
            }
            if ((i & 2) != 0) {
                str2 = uSBankAccountInternal.email;
            }
            if ((i & 4) != 0) {
                elementsSessionContext = uSBankAccountInternal.elementsSessionContext;
            }
            return uSBankAccountInternal.copy(str, str2, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final USBankAccountInternal copy(String name, String email, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new USBankAccountInternal(name, email, elementsSessionContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccountInternal)) {
                return false;
            }
            USBankAccountInternal uSBankAccountInternal = (USBankAccountInternal) other;
            return Intrinsics.areEqual(this.name, uSBankAccountInternal.name) && Intrinsics.areEqual(this.email, uSBankAccountInternal.email) && Intrinsics.areEqual(this.elementsSessionContext, uSBankAccountInternal.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccountInternal(name=" + this.name + ", email=" + this.email + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.email);
            dest.writeParcelable(this.elementsSessionContext, flags);
        }

        public USBankAccountInternal(String name, String str, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.email = str;
            this.elementsSessionContext = elementsSessionContext;
        }

        public final String getName() {
            return this.name;
        }

        public final String getEmail() {
            return this.email;
        }

        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }
    }

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "email", "", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getEmail", "()Ljava/lang/String;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstantDebits implements Parcelable, CollectBankAccountConfiguration {
        private final ElementsSessionContext elementsSessionContext;
        private final String email;
        public static final Parcelable.Creator<InstantDebits> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CollectBankAccountLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InstantDebits> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebits createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstantDebits(parcel.readString(), (ElementsSessionContext) parcel.readParcelable(InstantDebits.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebits[] newArray(int i) {
                return new InstantDebits[i];
            }
        }

        public static /* synthetic */ InstantDebits copy$default(InstantDebits instantDebits, String str, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instantDebits.email;
            }
            if ((i & 2) != 0) {
                elementsSessionContext = instantDebits.elementsSessionContext;
            }
            return instantDebits.copy(str, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final InstantDebits copy(String email, ElementsSessionContext elementsSessionContext) {
            return new InstantDebits(email, elementsSessionContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) other;
            return Intrinsics.areEqual(this.email, instantDebits.email) && Intrinsics.areEqual(this.elementsSessionContext, instantDebits.elementsSessionContext);
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(email=" + this.email + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.email);
            dest.writeParcelable(this.elementsSessionContext, flags);
        }

        public InstantDebits(String str, ElementsSessionContext elementsSessionContext) {
            this.email = str;
            this.elementsSessionContext = elementsSessionContext;
        }

        public final String getEmail() {
            return this.email;
        }

        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }
    }
}
