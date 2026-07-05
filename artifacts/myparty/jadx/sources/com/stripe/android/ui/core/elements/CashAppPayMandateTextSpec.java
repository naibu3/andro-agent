package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: CashAppPayMandateTextSpec.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0005J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0018HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005J%\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\r¨\u00061"}, d2 = {"Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "stringResId", "", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApiPath$annotations", "()V", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getStringResId", "()I", "mandateTextSpec", "Lcom/stripe/android/ui/core/elements/MandateTextSpec;", "getMandateTextSpec$annotations", ViewProps.TRANSFORM, "Lcom/stripe/android/uicore/elements/FormElement;", "merchantName", "", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "$serializer", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class CashAppPayMandateTextSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final MandateTextSpec mandateTextSpec;
    private final int stringResId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CashAppPayMandateTextSpec> CREATOR = new Creator();
    public static final int $stable = IdentifierSpec.$stable | IdentifierSpec.$stable;

    /* compiled from: CashAppPayMandateTextSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CashAppPayMandateTextSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashAppPayMandateTextSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashAppPayMandateTextSpec((IdentifierSpec) parcel.readParcelable(CashAppPayMandateTextSpec.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashAppPayMandateTextSpec[] newArray(int i) {
            return new CashAppPayMandateTextSpec[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashAppPayMandateTextSpec() {
        this((IdentifierSpec) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CashAppPayMandateTextSpec copy$default(CashAppPayMandateTextSpec cashAppPayMandateTextSpec, IdentifierSpec identifierSpec, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identifierSpec = cashAppPayMandateTextSpec.apiPath;
        }
        if ((i2 & 2) != 0) {
            i = cashAppPayMandateTextSpec.stringResId;
        }
        return cashAppPayMandateTextSpec.copy(identifierSpec, i);
    }

    @SerialName("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @Transient
    private static /* synthetic */ void getMandateTextSpec$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStringResId() {
        return this.stringResId;
    }

    public final CashAppPayMandateTextSpec copy(IdentifierSpec apiPath, int stringResId) {
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        return new CashAppPayMandateTextSpec(apiPath, stringResId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayMandateTextSpec)) {
            return false;
        }
        CashAppPayMandateTextSpec cashAppPayMandateTextSpec = (CashAppPayMandateTextSpec) other;
        return Intrinsics.areEqual(this.apiPath, cashAppPayMandateTextSpec.apiPath) && this.stringResId == cashAppPayMandateTextSpec.stringResId;
    }

    public int hashCode() {
        return (this.apiPath.hashCode() * 31) + Integer.hashCode(this.stringResId);
    }

    public String toString() {
        return "CashAppPayMandateTextSpec(apiPath=" + this.apiPath + ", stringResId=" + this.stringResId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.apiPath, flags);
        dest.writeInt(this.stringResId);
    }

    /* compiled from: CashAppPayMandateTextSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CashAppPayMandateTextSpec> serializer() {
            return CashAppPayMandateTextSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CashAppPayMandateTextSpec(int i, IdentifierSpec identifierSpec, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.apiPath = (i & 1) == 0 ? IdentifierSpec.INSTANCE.Generic("cashapp_mandate") : identifierSpec;
        if ((i & 2) == 0) {
            this.stringResId = R.string.stripe_cash_app_pay_mandate;
        } else {
            this.stringResId = i2;
        }
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), this.stringResId);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(CashAppPayMandateTextSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.getApiPath(), IdentifierSpec.INSTANCE.Generic("cashapp_mandate"))) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.stringResId == R.string.stripe_cash_app_pay_mandate) {
            return;
        }
        output.encodeIntElement(serialDesc, 1, self.stringResId);
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public /* synthetic */ CashAppPayMandateTextSpec(IdentifierSpec identifierSpec, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? IdentifierSpec.INSTANCE.Generic("cashapp_mandate") : identifierSpec, (i2 & 2) != 0 ? R.string.stripe_cash_app_pay_mandate : i);
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayMandateTextSpec(IdentifierSpec apiPath, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i;
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), i);
    }

    public final FormElement transform(String merchantName) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        return this.mandateTextSpec.transform(merchantName, merchantName);
    }
}
