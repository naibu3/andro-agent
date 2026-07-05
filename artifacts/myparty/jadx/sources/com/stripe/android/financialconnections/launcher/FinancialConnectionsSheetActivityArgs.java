package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.security.InvalidParameterException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FinancialConnectionsSheetActivityArgs.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/os/Parcelable;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "validate", "", "isValid", "", "ForData", "ForToken", "ForInstantDebits", "Companion", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForInstantDebits;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FinancialConnectionsSheetActivityArgs implements Parcelable {
    public static final String EXTRA_ARGS = "FinancialConnectionsSheetActivityArgs";
    private final FinancialConnectionsSheetConfiguration configuration;
    private final ElementsSessionContext elementsSessionContext;

    public /* synthetic */ FinancialConnectionsSheetActivityArgs(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(financialConnectionsSheetConfiguration, elementsSessionContext);
    }

    private FinancialConnectionsSheetActivityArgs(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext) {
        this.configuration = financialConnectionsSheetConfiguration;
        this.elementsSessionContext = elementsSessionContext;
    }

    public FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    public ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    /* compiled from: FinancialConnectionsSheetActivityArgs.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ForData extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForData> CREATOR = new Creator();
        private final FinancialConnectionsSheetConfiguration configuration;
        private final ElementsSessionContext elementsSessionContext;

        /* compiled from: FinancialConnectionsSheetActivityArgs.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ForData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForData(FinancialConnectionsSheetConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ElementsSessionContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForData[] newArray(int i) {
                return new ForData[i];
            }
        }

        public static /* synthetic */ ForData copy$default(ForData forData, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetConfiguration = forData.configuration;
            }
            if ((i & 2) != 0) {
                elementsSessionContext = forData.elementsSessionContext;
            }
            return forData.copy(financialConnectionsSheetConfiguration, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final ForData copy(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ForData(configuration, elementsSessionContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForData)) {
                return false;
            }
            ForData forData = (ForData) other;
            return Intrinsics.areEqual(this.configuration, forData.configuration) && Intrinsics.areEqual(this.elementsSessionContext, forData.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = this.configuration.hashCode() * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public String toString() {
            return "ForData(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.configuration.writeToParcel(dest, flags);
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                elementsSessionContext.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ ForData(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(financialConnectionsSheetConfiguration, (i & 2) != 0 ? null : elementsSessionContext);
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForData(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
            super(configuration, elementsSessionContext, null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
            this.elementsSessionContext = elementsSessionContext;
        }
    }

    /* compiled from: FinancialConnectionsSheetActivityArgs.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ForToken extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForToken> CREATOR = new Creator();
        private final FinancialConnectionsSheetConfiguration configuration;
        private final ElementsSessionContext elementsSessionContext;

        /* compiled from: FinancialConnectionsSheetActivityArgs.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ForToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForToken createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForToken(FinancialConnectionsSheetConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ElementsSessionContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForToken[] newArray(int i) {
                return new ForToken[i];
            }
        }

        public static /* synthetic */ ForToken copy$default(ForToken forToken, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetConfiguration = forToken.configuration;
            }
            if ((i & 2) != 0) {
                elementsSessionContext = forToken.elementsSessionContext;
            }
            return forToken.copy(financialConnectionsSheetConfiguration, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final ForToken copy(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ForToken(configuration, elementsSessionContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForToken)) {
                return false;
            }
            ForToken forToken = (ForToken) other;
            return Intrinsics.areEqual(this.configuration, forToken.configuration) && Intrinsics.areEqual(this.elementsSessionContext, forToken.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = this.configuration.hashCode() * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public String toString() {
            return "ForToken(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.configuration.writeToParcel(dest, flags);
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                elementsSessionContext.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ ForToken(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(financialConnectionsSheetConfiguration, (i & 2) != 0 ? null : elementsSessionContext);
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForToken(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
            super(configuration, elementsSessionContext, null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
            this.elementsSessionContext = elementsSessionContext;
        }
    }

    /* compiled from: FinancialConnectionsSheetActivityArgs.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForInstantDebits;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ForInstantDebits extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForInstantDebits> CREATOR = new Creator();
        private final FinancialConnectionsSheetConfiguration configuration;
        private final ElementsSessionContext elementsSessionContext;

        /* compiled from: FinancialConnectionsSheetActivityArgs.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ForInstantDebits> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForInstantDebits createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForInstantDebits(FinancialConnectionsSheetConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ElementsSessionContext.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ForInstantDebits[] newArray(int i) {
                return new ForInstantDebits[i];
            }
        }

        public static /* synthetic */ ForInstantDebits copy$default(ForInstantDebits forInstantDebits, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetConfiguration = forInstantDebits.configuration;
            }
            if ((i & 2) != 0) {
                elementsSessionContext = forInstantDebits.elementsSessionContext;
            }
            return forInstantDebits.copy(financialConnectionsSheetConfiguration, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final ForInstantDebits copy(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new ForInstantDebits(configuration, elementsSessionContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForInstantDebits)) {
                return false;
            }
            ForInstantDebits forInstantDebits = (ForInstantDebits) other;
            return Intrinsics.areEqual(this.configuration, forInstantDebits.configuration) && Intrinsics.areEqual(this.elementsSessionContext, forInstantDebits.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = this.configuration.hashCode() * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public String toString() {
            return "ForInstantDebits(configuration=" + this.configuration + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.configuration.writeToParcel(dest, flags);
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                elementsSessionContext.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ ForInstantDebits(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(financialConnectionsSheetConfiguration, (i & 2) != 0 ? null : elementsSessionContext);
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForInstantDebits(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
            super(configuration, elementsSessionContext, null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
            this.elementsSessionContext = elementsSessionContext;
        }
    }

    public final void validate() {
        if (StringsKt.isBlank(getConfiguration().getFinancialConnectionsSessionClientSecret())) {
            throw new InvalidParameterException("The session client secret cannot be an empty string.");
        }
        if (StringsKt.isBlank(getConfiguration().getPublishableKey())) {
            throw new InvalidParameterException("The publishable key cannot be an empty string.");
        }
    }

    public final boolean isValid() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = this;
            validate();
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m9125isSuccessimpl(objM9118constructorimpl);
    }
}
