package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodExtraParams.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nH ¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodExtraParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Type;)V", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "toParamMap", "", "BacsDebit", "Card", "Link", "SepaDebit", "USBankAccount", "Lcom/stripe/android/model/PaymentMethodExtraParams$BacsDebit;", "Lcom/stripe/android/model/PaymentMethodExtraParams$Card;", "Lcom/stripe/android/model/PaymentMethodExtraParams$Link;", "Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;", "Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PaymentMethodExtraParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    private final PaymentMethod.Type type;

    public /* synthetic */ PaymentMethodExtraParams(PaymentMethod.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public abstract List<Pair<String, Object>> createTypeParams$payments_core_release();

    private PaymentMethodExtraParams(PaymentMethod.Type type) {
        this.type = type;
    }

    public final PaymentMethod.Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public final Map<String, Object> toParamMap() {
        List<Pair<String, Object>> listCreateTypeParams$payments_core_release = createTypeParams$payments_core_release();
        Map mapEmptyMap = MapsKt.emptyMap();
        Iterator<T> it = listCreateTypeParams$payments_core_release.iterator();
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
        return !mapEmptyMap.isEmpty() ? MapsKt.mapOf(TuplesKt.to(this.type.code, mapEmptyMap)) : MapsKt.emptyMap();
    }

    /* compiled from: PaymentMethodExtraParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\u000bH\u0010¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0017\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PaymentMethodExtraParams$BacsDebit;", "Lcom/stripe/android/model/PaymentMethodExtraParams;", BacsDebit.PARAM_CONFIRMED, "", "<init>", "(Ljava/lang/Boolean;)V", "getConfirmed", "()Ljava/lang/Boolean;", "setConfirmed", "Ljava/lang/Boolean;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PaymentMethodExtraParams$BacsDebit;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BacsDebit extends PaymentMethodExtraParams {
        public static final String PARAM_CONFIRMED = "confirmed";
        private Boolean confirmed;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethodExtraParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BacsDebit(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BacsDebit() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = bacsDebit.confirmed;
            }
            return bacsDebit.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getConfirmed() {
            return this.confirmed;
        }

        public final BacsDebit copy(Boolean confirmed) {
            return new BacsDebit(confirmed);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BacsDebit) && Intrinsics.areEqual(this.confirmed, ((BacsDebit) other).confirmed);
        }

        public int hashCode() {
            Boolean bool = this.confirmed;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "BacsDebit(confirmed=" + this.confirmed + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.confirmed;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public /* synthetic */ BacsDebit(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final Boolean getConfirmed() {
            return this.confirmed;
        }

        public final void setConfirmed(Boolean bool) {
            this.confirmed = bool;
        }

        public BacsDebit(Boolean bool) {
            super(PaymentMethod.Type.BacsDebit, null);
            this.confirmed = bool;
        }

        @Override // com.stripe.android.model.PaymentMethodExtraParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            Boolean bool = this.confirmed;
            return CollectionsKt.listOf(TuplesKt.to(PARAM_CONFIRMED, bool != null ? bool.toString() : null));
        }
    }

    /* compiled from: PaymentMethodExtraParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nH\u0010¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethodExtraParams$Card;", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "setAsDefault", "", "<init>", "(Ljava/lang/Boolean;)V", "getSetAsDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PaymentMethodExtraParams$Card;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Card extends PaymentMethodExtraParams {
        private final Boolean setAsDefault;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethodExtraParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Card(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Card() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Card copy$default(Card card, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = card.setAsDefault;
            }
            return card.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public final Card copy(Boolean setAsDefault) {
            return new Card(setAsDefault);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Card) && Intrinsics.areEqual(this.setAsDefault, ((Card) other).setAsDefault);
        }

        public int hashCode() {
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "Card(setAsDefault=" + this.setAsDefault + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public /* synthetic */ Card(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public Card(Boolean bool) {
            super(PaymentMethod.Type.Card, null);
            this.setAsDefault = bool;
        }

        @Override // com.stripe.android.model.PaymentMethodExtraParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            Boolean bool = this.setAsDefault;
            return CollectionsKt.listOf(TuplesKt.to("set_as_default_payment_method", bool != null ? bool.toString() : null));
        }
    }

    /* compiled from: PaymentMethodExtraParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nH\u0010¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethodExtraParams$Link;", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "setAsDefault", "", "<init>", "(Ljava/lang/Boolean;)V", "getSetAsDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PaymentMethodExtraParams$Link;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link extends PaymentMethodExtraParams {
        private final Boolean setAsDefault;
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethodExtraParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Link(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Link() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Link copy$default(Link link, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = link.setAsDefault;
            }
            return link.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public final Link copy(Boolean setAsDefault) {
            return new Link(setAsDefault);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && Intrinsics.areEqual(this.setAsDefault, ((Link) other).setAsDefault);
        }

        public int hashCode() {
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "Link(setAsDefault=" + this.setAsDefault + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public /* synthetic */ Link(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public Link(Boolean bool) {
            super(PaymentMethod.Type.Link, null);
            this.setAsDefault = bool;
        }

        @Override // com.stripe.android.model.PaymentMethodExtraParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            Boolean bool = this.setAsDefault;
            return CollectionsKt.listOf(TuplesKt.to("set_as_default_payment_method", bool != null ? bool.toString() : null));
        }
    }

    /* compiled from: PaymentMethodExtraParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nH\u0010¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "setAsDefault", "", "<init>", "(Ljava/lang/Boolean;)V", "getSetAsDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PaymentMethodExtraParams$SepaDebit;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SepaDebit extends PaymentMethodExtraParams {
        private final Boolean setAsDefault;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethodExtraParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SepaDebit(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SepaDebit() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = sepaDebit.setAsDefault;
            }
            return sepaDebit.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public final SepaDebit copy(Boolean setAsDefault) {
            return new SepaDebit(setAsDefault);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SepaDebit) && Intrinsics.areEqual(this.setAsDefault, ((SepaDebit) other).setAsDefault);
        }

        public int hashCode() {
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "SepaDebit(setAsDefault=" + this.setAsDefault + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public /* synthetic */ SepaDebit(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public SepaDebit(Boolean bool) {
            super(PaymentMethod.Type.SepaDebit, null);
            this.setAsDefault = bool;
        }

        @Override // com.stripe.android.model.PaymentMethodExtraParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            Boolean bool = this.setAsDefault;
            return CollectionsKt.listOf(TuplesKt.to("set_as_default_payment_method", bool != null ? bool.toString() : null));
        }
    }

    /* compiled from: PaymentMethodExtraParams.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\nH\u0010¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0017\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "setAsDefault", "", "<init>", "(Ljava/lang/Boolean;)V", "getSetAsDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "createTypeParams", "", "Lkotlin/Pair;", "", "", "createTypeParams$payments_core_release", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PaymentMethodExtraParams$USBankAccount;", "describeContents", "", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccount extends PaymentMethodExtraParams {
        private final Boolean setAsDefault;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentMethodExtraParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new USBankAccount(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public USBankAccount() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = uSBankAccount.setAsDefault;
            }
            return uSBankAccount.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public final USBankAccount copy(Boolean setAsDefault) {
            return new USBankAccount(setAsDefault);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof USBankAccount) && Intrinsics.areEqual(this.setAsDefault, ((USBankAccount) other).setAsDefault);
        }

        public int hashCode() {
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "USBankAccount(setAsDefault=" + this.setAsDefault + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.setAsDefault;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
        }

        public /* synthetic */ USBankAccount(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }

        public final Boolean getSetAsDefault() {
            return this.setAsDefault;
        }

        public USBankAccount(Boolean bool) {
            super(PaymentMethod.Type.USBankAccount, null);
            this.setAsDefault = bool;
        }

        @Override // com.stripe.android.model.PaymentMethodExtraParams
        public List<Pair<String, Object>> createTypeParams$payments_core_release() {
            Boolean bool = this.setAsDefault;
            return CollectionsKt.listOf(TuplesKt.to("set_as_default_payment_method", bool != null ? bool.toString() : null));
        }
    }
}
