package com.stripe.android.ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: BacsDebitBankAccountSpec.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0002\u0010\fJ\u001c\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J%\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003R\u0014\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u001a\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "()V", "seen0", "", "sortCodeIdentifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "accountNumberIdentifier", "apiPath", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSortCodeIdentifier$annotations", "getAccountNumberIdentifier$annotations", "getApiPath$annotations", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", ViewProps.TRANSFORM, "Lcom/stripe/android/uicore/elements/SectionElement;", NamedConstantsKt.INITIAL_VALUES, "", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_ui_core_release", "Companion", "$serializer", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class BacsDebitBankAccountSpec extends FormItemSpec {

    @Deprecated
    public static final String ACCOUNT_NUMBER_API_PATH = "bacs_debit[account_number]";

    @Deprecated
    public static final String SORT_CODE_API_PATH = "bacs_debit[sort_code]";
    private final IdentifierSpec accountNumberIdentifier;
    private final IdentifierSpec apiPath;
    private final IdentifierSpec sortCodeIdentifier;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BacsDebitBankAccountSpec> CREATOR = new Creator();
    public static final int $stable = (IdentifierSpec.$stable | IdentifierSpec.$stable) | IdentifierSpec.$stable;

    /* compiled from: BacsDebitBankAccountSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BacsDebitBankAccountSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacsDebitBankAccountSpec createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new BacsDebitBankAccountSpec();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacsDebitBankAccountSpec[] newArray(int i) {
            return new BacsDebitBankAccountSpec[i];
        }
    }

    private static /* synthetic */ void getAccountNumberIdentifier$annotations() {
    }

    public static /* synthetic */ void getApiPath$annotations() {
    }

    private static /* synthetic */ void getSortCodeIdentifier$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public /* synthetic */ BacsDebitBankAccountSpec(int i, IdentifierSpec identifierSpec, IdentifierSpec identifierSpec2, IdentifierSpec identifierSpec3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.sortCodeIdentifier = (i & 1) == 0 ? IdentifierSpec.INSTANCE.Generic(SORT_CODE_API_PATH) : identifierSpec;
        if ((i & 2) == 0) {
            this.accountNumberIdentifier = IdentifierSpec.INSTANCE.Generic(ACCOUNT_NUMBER_API_PATH);
        } else {
            this.accountNumberIdentifier = identifierSpec2;
        }
        if ((i & 4) == 0) {
            this.apiPath = new IdentifierSpec();
        } else {
            this.apiPath = identifierSpec3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_ui_core_release(BacsDebitBankAccountSpec self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.sortCodeIdentifier, IdentifierSpec.INSTANCE.Generic(SORT_CODE_API_PATH))) {
            output.encodeSerializableElement(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.sortCodeIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.accountNumberIdentifier, IdentifierSpec.INSTANCE.Generic(ACCOUNT_NUMBER_API_PATH))) {
            output.encodeSerializableElement(serialDesc, 1, IdentifierSpec$$serializer.INSTANCE, self.accountNumberIdentifier);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.getApiPath(), new IdentifierSpec())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
    }

    public BacsDebitBankAccountSpec() {
        super(null);
        this.sortCodeIdentifier = IdentifierSpec.INSTANCE.Generic(SORT_CODE_API_PATH);
        this.accountNumberIdentifier = IdentifierSpec.INSTANCE.Generic(ACCOUNT_NUMBER_API_PATH);
        this.apiPath = new IdentifierSpec();
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        return createSectionElement$payments_ui_core_release(CollectionsKt.listOf((Object[]) new SimpleTextElement[]{new SimpleTextElement(this.sortCodeIdentifier, new SimpleTextFieldController(new BacsDebitSortCodeConfig(), false, initialValues.get(this.sortCodeIdentifier), null, 10, null)), new SimpleTextElement(this.accountNumberIdentifier, new SimpleTextFieldController(new BacsDebitAccountNumberConfig(), false, initialValues.get(this.accountNumberIdentifier), null, 10, null))}), ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_bacs_bank_account_title, new Object[0], null, 4, null));
    }

    /* compiled from: BacsDebitBankAccountSpec.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Companion;", "", "<init>", "()V", "SORT_CODE_API_PATH", "", "ACCOUNT_NUMBER_API_PATH", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BacsDebitBankAccountSpec> serializer() {
            return BacsDebitBankAccountSpec$$serializer.INSTANCE;
        }
    }
}
