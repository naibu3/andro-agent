package com.stripe.android.financialconnections.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Required;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: LinkAccountSessionPaymentAccount.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 32\u00020\u0001:\u0003123B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "", "id", "", "microdepositVerificationMethod", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "networkingSuccessful", "", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getMicrodepositVerificationMethod$annotations", "getMicrodepositVerificationMethod", "()Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "getNetworkingSuccessful$annotations", "getNetworkingSuccessful", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNextPane$annotations", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "MicrodepositVerificationMethod", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class LinkAccountSessionPaymentAccount {
    public static final int $stable = 0;
    private final String id;
    private final MicrodepositVerificationMethod microdepositVerificationMethod;
    private final Boolean networkingSuccessful;
    private final FinancialConnectionsSessionManifest.Pane nextPane;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, MicrodepositVerificationMethod.INSTANCE.serializer(), null, null};

    public static /* synthetic */ LinkAccountSessionPaymentAccount copy$default(LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount, String str, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool, FinancialConnectionsSessionManifest.Pane pane, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkAccountSessionPaymentAccount.id;
        }
        if ((i & 2) != 0) {
            microdepositVerificationMethod = linkAccountSessionPaymentAccount.microdepositVerificationMethod;
        }
        if ((i & 4) != 0) {
            bool = linkAccountSessionPaymentAccount.networkingSuccessful;
        }
        if ((i & 8) != 0) {
            pane = linkAccountSessionPaymentAccount.nextPane;
        }
        return linkAccountSessionPaymentAccount.copy(str, microdepositVerificationMethod, bool, pane);
    }

    @SerialName("id")
    @Required
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("microdeposit_verification_method")
    public static /* synthetic */ void getMicrodepositVerificationMethod$annotations() {
    }

    @SerialName("networking_successful")
    public static /* synthetic */ void getNetworkingSuccessful$annotations() {
    }

    @SerialName("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final MicrodepositVerificationMethod getMicrodepositVerificationMethod() {
        return this.microdepositVerificationMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getNetworkingSuccessful() {
        return this.networkingSuccessful;
    }

    /* renamed from: component4, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    public final LinkAccountSessionPaymentAccount copy(String id, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean networkingSuccessful, FinancialConnectionsSessionManifest.Pane nextPane) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        return new LinkAccountSessionPaymentAccount(id, microdepositVerificationMethod, networkingSuccessful, nextPane);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccountSessionPaymentAccount)) {
            return false;
        }
        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) other;
        return Intrinsics.areEqual(this.id, linkAccountSessionPaymentAccount.id) && this.microdepositVerificationMethod == linkAccountSessionPaymentAccount.microdepositVerificationMethod && Intrinsics.areEqual(this.networkingSuccessful, linkAccountSessionPaymentAccount.networkingSuccessful) && this.nextPane == linkAccountSessionPaymentAccount.nextPane;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.microdepositVerificationMethod.hashCode()) * 31;
        Boolean bool = this.networkingSuccessful;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        return iHashCode2 + (pane != null ? pane.hashCode() : 0);
    }

    public String toString() {
        return "LinkAccountSessionPaymentAccount(id=" + this.id + ", microdepositVerificationMethod=" + this.microdepositVerificationMethod + ", networkingSuccessful=" + this.networkingSuccessful + ", nextPane=" + this.nextPane + ")";
    }

    /* compiled from: LinkAccountSessionPaymentAccount.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkAccountSessionPaymentAccount> serializer() {
            return LinkAccountSessionPaymentAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkAccountSessionPaymentAccount(int i, String str, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool, FinancialConnectionsSessionManifest.Pane pane, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, LinkAccountSessionPaymentAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.microdepositVerificationMethod = MicrodepositVerificationMethod.UNKNOWN;
        } else {
            this.microdepositVerificationMethod = microdepositVerificationMethod;
        }
        if ((i & 4) == 0) {
            this.networkingSuccessful = null;
        } else {
            this.networkingSuccessful = bool;
        }
        if ((i & 8) == 0) {
            this.nextPane = null;
        } else {
            this.nextPane = pane;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(LinkAccountSessionPaymentAccount self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.microdepositVerificationMethod != MicrodepositVerificationMethod.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.microdepositVerificationMethod);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.networkingSuccessful != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.networkingSuccessful);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.nextPane == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPane);
    }

    public LinkAccountSessionPaymentAccount(String id, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool, FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(microdepositVerificationMethod, "microdepositVerificationMethod");
        this.id = id;
        this.microdepositVerificationMethod = microdepositVerificationMethod;
        this.networkingSuccessful = bool;
        this.nextPane = pane;
    }

    public final String getId() {
        return this.id;
    }

    public final MicrodepositVerificationMethod getMicrodepositVerificationMethod() {
        return this.microdepositVerificationMethod;
    }

    public /* synthetic */ LinkAccountSessionPaymentAccount(String str, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool, FinancialConnectionsSessionManifest.Pane pane, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? MicrodepositVerificationMethod.UNKNOWN : microdepositVerificationMethod, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : pane);
    }

    public final Boolean getNetworkingSuccessful() {
        return this.networkingSuccessful;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkAccountSessionPaymentAccount.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AMOUNTS", "DESCRIPTOR_CODE", "UNKNOWN", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class MicrodepositVerificationMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MicrodepositVerificationMethod[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("amounts")
        public static final MicrodepositVerificationMethod AMOUNTS = new MicrodepositVerificationMethod("AMOUNTS", 0, "amounts");

        @SerialName("descriptor_code")
        public static final MicrodepositVerificationMethod DESCRIPTOR_CODE = new MicrodepositVerificationMethod("DESCRIPTOR_CODE", 1, "descriptor_code");

        @SerialName("unknown")
        public static final MicrodepositVerificationMethod UNKNOWN = new MicrodepositVerificationMethod("UNKNOWN", 2, "unknown");

        private static final /* synthetic */ MicrodepositVerificationMethod[] $values() {
            return new MicrodepositVerificationMethod[]{AMOUNTS, DESCRIPTOR_CODE, UNKNOWN};
        }

        public static EnumEntries<MicrodepositVerificationMethod> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: LinkAccountSessionPaymentAccount.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) MicrodepositVerificationMethod.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<MicrodepositVerificationMethod> serializer() {
                return get$cachedSerializer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod", values(), new String[]{"amounts", "descriptor_code", "unknown"}, new Annotation[][]{null, null, null}, null);
        }

        private MicrodepositVerificationMethod(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            MicrodepositVerificationMethod[] microdepositVerificationMethodArr$values = $values();
            $VALUES = microdepositVerificationMethodArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(microdepositVerificationMethodArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod._init_$_anonymous_();
                }
            });
        }

        public static MicrodepositVerificationMethod valueOf(String str) {
            return (MicrodepositVerificationMethod) Enum.valueOf(MicrodepositVerificationMethod.class, str);
        }

        public static MicrodepositVerificationMethod[] values() {
            return (MicrodepositVerificationMethod[]) $VALUES.clone();
        }
    }
}
