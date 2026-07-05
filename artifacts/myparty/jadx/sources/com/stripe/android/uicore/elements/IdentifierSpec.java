package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.uicore.elements.ParameterDestination;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: IdentifierSpec.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\fJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\fHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\fJ%\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006."}, d2 = {"Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Landroid/os/Parcelable;", "v1", "", "ignoreField", "", ShareConstants.DESTINATION, "Lcom/stripe/android/uicore/elements/ParameterDestination;", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/ParameterDestination;)V", "()V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLcom/stripe/android/uicore/elements/ParameterDestination;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getV1", "()Ljava/lang/String;", "getIgnoreField", "()Z", "getDestination", "()Lcom/stripe/android/uicore/elements/ParameterDestination;", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$stripe_ui_core_release", "Companion", "$serializer", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class IdentifierSpec implements Parcelable {
    public static final int $stable = 0;
    private static final IdentifierSpec Blik;
    private static final IdentifierSpec CardNumber;
    private static final IdentifierSpec Country;
    private static final IdentifierSpec Line1;
    private final ParameterDestination destination;
    private final boolean ignoreField;
    private final String v1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<IdentifierSpec> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(ParameterDestination.class), new Annotation[0])};
    private static final IdentifierSpec Name = new IdentifierSpec("billing_details[name]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardBrand = new IdentifierSpec("card[brand]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec PreferredCardBrand = new IdentifierSpec("card[networks][preferred]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardCvc = new IdentifierSpec("card[cvc]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardExpMonth = new IdentifierSpec("card[exp_month]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardExpYear = new IdentifierSpec("card[exp_year]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec BillingAddress = new IdentifierSpec("billing_details[address]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Email = new IdentifierSpec("billing_details[email]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private static final IdentifierSpec Phone = new IdentifierSpec("billing_details[phone]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Line2 = new IdentifierSpec("billing_details[address][line2]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec City = new IdentifierSpec("billing_details[address][city]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec DependentLocality = new IdentifierSpec("", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec PostalCode = new IdentifierSpec("billing_details[address][postal_code]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SortingCode = new IdentifierSpec("", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private static final IdentifierSpec State = new IdentifierSpec("billing_details[address][state]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SaveForFutureUse = new IdentifierSpec("save_for_future_use", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec OneLineAddress = new IdentifierSpec("address", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SameAsShipping = new IdentifierSpec("same_as_shipping", true, (ParameterDestination) null, 4, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SetAsDefaultPaymentMethod = new IdentifierSpec("set_as_default_payment_method", false, (ParameterDestination) ParameterDestination.Local.Extras, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Upi = new IdentifierSpec("upi", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private static final IdentifierSpec Vpa = new IdentifierSpec("upi[vpa]", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec BlikCode = new IdentifierSpec("blik[code]", false, (ParameterDestination) ParameterDestination.Api.Options, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec KonbiniConfirmationNumber = new IdentifierSpec("konbini[confirmation_number]", false, (ParameterDestination) ParameterDestination.Api.Options, 2, (DefaultConstructorMarker) null);
    private static final IdentifierSpec BacsDebitConfirmed = new IdentifierSpec("bacs_debit[confirmed]", false, (ParameterDestination) ParameterDestination.Local.Extras, 2, (DefaultConstructorMarker) null);

    /* compiled from: IdentifierSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdentifierSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifierSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentifierSpec(parcel.readString(), parcel.readInt() != 0, (ParameterDestination) parcel.readParcelable(IdentifierSpec.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentifierSpec[] newArray(int i) {
            return new IdentifierSpec[i];
        }
    }

    public static /* synthetic */ IdentifierSpec copy$default(IdentifierSpec identifierSpec, String str, boolean z, ParameterDestination parameterDestination, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identifierSpec.v1;
        }
        if ((i & 2) != 0) {
            z = identifierSpec.ignoreField;
        }
        if ((i & 4) != 0) {
            parameterDestination = identifierSpec.destination;
        }
        return identifierSpec.copy(str, z, parameterDestination);
    }

    /* renamed from: component1, reason: from getter */
    public final String getV1() {
        return this.v1;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIgnoreField() {
        return this.ignoreField;
    }

    /* renamed from: component3, reason: from getter */
    public final ParameterDestination getDestination() {
        return this.destination;
    }

    public final IdentifierSpec copy(String v1, boolean ignoreField, ParameterDestination destination) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new IdentifierSpec(v1, ignoreField, destination);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifierSpec)) {
            return false;
        }
        IdentifierSpec identifierSpec = (IdentifierSpec) other;
        return Intrinsics.areEqual(this.v1, identifierSpec.v1) && this.ignoreField == identifierSpec.ignoreField && Intrinsics.areEqual(this.destination, identifierSpec.destination);
    }

    public int hashCode() {
        return (((this.v1.hashCode() * 31) + Boolean.hashCode(this.ignoreField)) * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "IdentifierSpec(v1=" + this.v1 + ", ignoreField=" + this.ignoreField + ", destination=" + this.destination + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.v1);
        dest.writeInt(this.ignoreField ? 1 : 0);
        dest.writeParcelable(this.destination, flags);
    }

    public /* synthetic */ IdentifierSpec(int i, String str, boolean z, ParameterDestination parameterDestination, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, IdentifierSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.v1 = str;
        if ((i & 2) == 0) {
            this.ignoreField = false;
        } else {
            this.ignoreField = z;
        }
        if ((i & 4) == 0) {
            this.destination = ParameterDestination.Api.Params;
        } else {
            this.destination = parameterDestination;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$stripe_ui_core_release(IdentifierSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.v1);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ignoreField) {
            output.encodeBooleanElement(serialDesc, 1, self.ignoreField);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.destination == ParameterDestination.Api.Params) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.destination);
    }

    public IdentifierSpec(String v1, boolean z, ParameterDestination destination) {
        Intrinsics.checkNotNullParameter(v1, "v1");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.v1 = v1;
        this.ignoreField = z;
        this.destination = destination;
    }

    public final String getV1() {
        return this.v1;
    }

    public final boolean getIgnoreField() {
        return this.ignoreField;
    }

    public /* synthetic */ IdentifierSpec(String str, boolean z, ParameterDestination.Api api, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ParameterDestination.Api.Params : api);
    }

    public final ParameterDestination getDestination() {
        return this.destination;
    }

    public IdentifierSpec() {
        this("", false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
    }

    /* compiled from: IdentifierSpec.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u0007H\u0007J\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050DR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0011\u0010#\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0011\u0010'\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u0011\u0010)\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u0011\u0010-\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u0011\u0010/\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u0011\u00101\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\nR\u0016\u00103\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u0011\u00105\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\nR\u0011\u00107\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\nR\u0016\u00109\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\nR\u0016\u0010;\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\nR\u0013\u0010=\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\nR\u0013\u0010?\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\n¨\u0006E"}, d2 = {"Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;", "", "<init>", "()V", "Generic", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "_value", "", "Name", "getName", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "CardBrand", "getCardBrand", "PreferredCardBrand", "getPreferredCardBrand", "CardNumber", "getCardNumber", "CardCvc", "getCardCvc", "CardExpMonth", "getCardExpMonth", "CardExpYear", "getCardExpYear", "BillingAddress", "getBillingAddress", "Email", "getEmail", "Phone", "getPhone", "Line1", "getLine1", "Line2", "getLine2", "City", "getCity", "DependentLocality", "getDependentLocality", "PostalCode", "getPostalCode", "SortingCode", "getSortingCode", "State", "getState", "Country", "getCountry", "SaveForFutureUse", "getSaveForFutureUse", "OneLineAddress", "getOneLineAddress", "SameAsShipping", "getSameAsShipping", "SetAsDefaultPaymentMethod", "getSetAsDefaultPaymentMethod", "Upi", "getUpi", "Vpa", "getVpa", "Blik", "getBlik", "BlikCode", "getBlikCode", "KonbiniConfirmationNumber", "getKonbiniConfirmationNumber", "BacsDebitConfirmed", "getBacsDebitConfirmed", "get", "value", "serializer", "Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IdentifierSpec> serializer() {
            return IdentifierSpec$$serializer.INSTANCE;
        }

        public final IdentifierSpec Generic(String _value) {
            Intrinsics.checkNotNullParameter(_value, "_value");
            return new IdentifierSpec(_value, false, (ParameterDestination) null, 6, (DefaultConstructorMarker) null);
        }

        public final IdentifierSpec getName() {
            return IdentifierSpec.Name;
        }

        public final IdentifierSpec getCardBrand() {
            return IdentifierSpec.CardBrand;
        }

        public final IdentifierSpec getPreferredCardBrand() {
            return IdentifierSpec.PreferredCardBrand;
        }

        public final IdentifierSpec getCardNumber() {
            return IdentifierSpec.CardNumber;
        }

        public final IdentifierSpec getCardCvc() {
            return IdentifierSpec.CardCvc;
        }

        public final IdentifierSpec getCardExpMonth() {
            return IdentifierSpec.CardExpMonth;
        }

        public final IdentifierSpec getCardExpYear() {
            return IdentifierSpec.CardExpYear;
        }

        public final IdentifierSpec getBillingAddress() {
            return IdentifierSpec.BillingAddress;
        }

        public final IdentifierSpec getEmail() {
            return IdentifierSpec.Email;
        }

        public final IdentifierSpec getPhone() {
            return IdentifierSpec.Phone;
        }

        public final IdentifierSpec getLine1() {
            return IdentifierSpec.Line1;
        }

        public final IdentifierSpec getLine2() {
            return IdentifierSpec.Line2;
        }

        public final IdentifierSpec getCity() {
            return IdentifierSpec.City;
        }

        public final IdentifierSpec getDependentLocality() {
            return IdentifierSpec.DependentLocality;
        }

        public final IdentifierSpec getPostalCode() {
            return IdentifierSpec.PostalCode;
        }

        public final IdentifierSpec getSortingCode() {
            return IdentifierSpec.SortingCode;
        }

        public final IdentifierSpec getState() {
            return IdentifierSpec.State;
        }

        public final IdentifierSpec getCountry() {
            return IdentifierSpec.Country;
        }

        public final IdentifierSpec getSaveForFutureUse() {
            return IdentifierSpec.SaveForFutureUse;
        }

        public final IdentifierSpec getOneLineAddress() {
            return IdentifierSpec.OneLineAddress;
        }

        public final IdentifierSpec getSameAsShipping() {
            return IdentifierSpec.SameAsShipping;
        }

        public final IdentifierSpec getSetAsDefaultPaymentMethod() {
            return IdentifierSpec.SetAsDefaultPaymentMethod;
        }

        public final IdentifierSpec getUpi() {
            return IdentifierSpec.Upi;
        }

        public final IdentifierSpec getVpa() {
            return IdentifierSpec.Vpa;
        }

        public final IdentifierSpec getBlik() {
            return IdentifierSpec.Blik;
        }

        public final IdentifierSpec getBlikCode() {
            return IdentifierSpec.BlikCode;
        }

        public final IdentifierSpec getKonbiniConfirmationNumber() {
            return IdentifierSpec.KonbiniConfirmationNumber;
        }

        public final IdentifierSpec getBacsDebitConfirmed() {
            return IdentifierSpec.BacsDebitConfirmed;
        }

        public final IdentifierSpec get(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Intrinsics.areEqual(value, getCardBrand().getV1()) ? getCardBrand() : Intrinsics.areEqual(value, getCardNumber().getV1()) ? getCardNumber() : Intrinsics.areEqual(value, getCardCvc().getV1()) ? getCardCvc() : Intrinsics.areEqual(value, getCity().getV1()) ? getCity() : Intrinsics.areEqual(value, getCountry().getV1()) ? getCountry() : Intrinsics.areEqual(value, getEmail().getV1()) ? getEmail() : Intrinsics.areEqual(value, getLine1().getV1()) ? getLine1() : Intrinsics.areEqual(value, getLine2().getV1()) ? getLine2() : Intrinsics.areEqual(value, getName().getV1()) ? getName() : Intrinsics.areEqual(value, getPhone().getV1()) ? getPhone() : Intrinsics.areEqual(value, getPostalCode().getV1()) ? getPostalCode() : Intrinsics.areEqual(value, getSaveForFutureUse().getV1()) ? getSaveForFutureUse() : Intrinsics.areEqual(value, getState().getV1()) ? getState() : Intrinsics.areEqual(value, getOneLineAddress().getV1()) ? getOneLineAddress() : Generic(value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        CardNumber = new IdentifierSpec("card[number]", false, (ParameterDestination) null, 6, defaultConstructorMarker);
        Line1 = new IdentifierSpec("billing_details[address][line1]", false, (ParameterDestination) null, 6, defaultConstructorMarker);
        Country = new IdentifierSpec("billing_details[address][country]", false, (ParameterDestination) null, 6, defaultConstructorMarker);
        Blik = new IdentifierSpec("blik", false, (ParameterDestination) ParameterDestination.Api.Options, 2, defaultConstructorMarker);
    }
}
