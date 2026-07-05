package com.stripe.android.common.analytics.experiment;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.utils.MapUtilsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggableExperiment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0012B5\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0001\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;", "", "experiment", "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;", "arbId", "", "group", "dimensions", "", "<init>", "(Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getExperiment", "()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;", "getArbId", "()Ljava/lang/String;", "getGroup", "getDimensions", "()Ljava/util/Map;", "LinkHoldback", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LoggableExperiment {
    public static final int $stable = 8;
    private final String arbId;
    private final Map<String, String> dimensions;
    private final ElementsSession.ExperimentAssignment experiment;
    private final String group;

    public /* synthetic */ LoggableExperiment(ElementsSession.ExperimentAssignment experimentAssignment, String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(experimentAssignment, str, str2, map);
    }

    private LoggableExperiment(ElementsSession.ExperimentAssignment experimentAssignment, String str, String str2, Map<String, String> map) {
        this.experiment = experimentAssignment;
        this.arbId = str;
        this.group = str2;
        this.dimensions = map;
    }

    public ElementsSession.ExperimentAssignment getExperiment() {
        return this.experiment;
    }

    public String getArbId() {
        return this.arbId;
    }

    public String getGroup() {
        return this.group;
    }

    public Map<String, String> getDimensions() {
        return this.dimensions;
    }

    /* compiled from: LoggableExperiment.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000223BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003Jo\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00064"}, d2 = {"Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback;", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment;", "arbId", "", "group", "experiment", "Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;", "isReturningLinkUser", "", "useLinkNative", "emailRecognitionSource", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;", "providedDefaultValues", "Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;", "spmEnabled", "integrationShape", "linkDisplayed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;ZZLcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;ZLjava/lang/String;Z)V", "getArbId", "()Ljava/lang/String;", "getGroup", "getExperiment", "()Lcom/stripe/android/model/ElementsSession$ExperimentAssignment;", "()Z", "getUseLinkNative", "getEmailRecognitionSource", "()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;", "getProvidedDefaultValues", "()Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;", "getSpmEnabled", "getIntegrationShape", "getLinkDisplayed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "EmailRecognitionSource", "ProvidedDefaultValues", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkHoldback extends LoggableExperiment {
        public static final int $stable = 0;
        private final String arbId;
        private final EmailRecognitionSource emailRecognitionSource;
        private final ElementsSession.ExperimentAssignment experiment;
        private final String group;
        private final String integrationShape;
        private final boolean isReturningLinkUser;
        private final boolean linkDisplayed;
        private final ProvidedDefaultValues providedDefaultValues;
        private final boolean spmEnabled;
        private final boolean useLinkNative;

        public static /* synthetic */ LinkHoldback copy$default(LinkHoldback linkHoldback, String str, String str2, ElementsSession.ExperimentAssignment experimentAssignment, boolean z, boolean z2, EmailRecognitionSource emailRecognitionSource, ProvidedDefaultValues providedDefaultValues, boolean z3, String str3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linkHoldback.arbId;
            }
            if ((i & 2) != 0) {
                str2 = linkHoldback.group;
            }
            if ((i & 4) != 0) {
                experimentAssignment = linkHoldback.experiment;
            }
            if ((i & 8) != 0) {
                z = linkHoldback.isReturningLinkUser;
            }
            if ((i & 16) != 0) {
                z2 = linkHoldback.useLinkNative;
            }
            if ((i & 32) != 0) {
                emailRecognitionSource = linkHoldback.emailRecognitionSource;
            }
            if ((i & 64) != 0) {
                providedDefaultValues = linkHoldback.providedDefaultValues;
            }
            if ((i & 128) != 0) {
                z3 = linkHoldback.spmEnabled;
            }
            if ((i & 256) != 0) {
                str3 = linkHoldback.integrationShape;
            }
            if ((i & 512) != 0) {
                z4 = linkHoldback.linkDisplayed;
            }
            String str4 = str3;
            boolean z5 = z4;
            ProvidedDefaultValues providedDefaultValues2 = providedDefaultValues;
            boolean z6 = z3;
            boolean z7 = z2;
            EmailRecognitionSource emailRecognitionSource2 = emailRecognitionSource;
            return linkHoldback.copy(str, str2, experimentAssignment, z, z7, emailRecognitionSource2, providedDefaultValues2, z6, str4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getArbId() {
            return this.arbId;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getLinkDisplayed() {
            return this.linkDisplayed;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGroup() {
            return this.group;
        }

        /* renamed from: component3, reason: from getter */
        public final ElementsSession.ExperimentAssignment getExperiment() {
            return this.experiment;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsReturningLinkUser() {
            return this.isReturningLinkUser;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getUseLinkNative() {
            return this.useLinkNative;
        }

        /* renamed from: component6, reason: from getter */
        public final EmailRecognitionSource getEmailRecognitionSource() {
            return this.emailRecognitionSource;
        }

        /* renamed from: component7, reason: from getter */
        public final ProvidedDefaultValues getProvidedDefaultValues() {
            return this.providedDefaultValues;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getSpmEnabled() {
            return this.spmEnabled;
        }

        /* renamed from: component9, reason: from getter */
        public final String getIntegrationShape() {
            return this.integrationShape;
        }

        public final LinkHoldback copy(String arbId, String group, ElementsSession.ExperimentAssignment experiment, boolean isReturningLinkUser, boolean useLinkNative, EmailRecognitionSource emailRecognitionSource, ProvidedDefaultValues providedDefaultValues, boolean spmEnabled, String integrationShape, boolean linkDisplayed) {
            Intrinsics.checkNotNullParameter(arbId, "arbId");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            Intrinsics.checkNotNullParameter(providedDefaultValues, "providedDefaultValues");
            Intrinsics.checkNotNullParameter(integrationShape, "integrationShape");
            return new LinkHoldback(arbId, group, experiment, isReturningLinkUser, useLinkNative, emailRecognitionSource, providedDefaultValues, spmEnabled, integrationShape, linkDisplayed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkHoldback)) {
                return false;
            }
            LinkHoldback linkHoldback = (LinkHoldback) other;
            return Intrinsics.areEqual(this.arbId, linkHoldback.arbId) && Intrinsics.areEqual(this.group, linkHoldback.group) && this.experiment == linkHoldback.experiment && this.isReturningLinkUser == linkHoldback.isReturningLinkUser && this.useLinkNative == linkHoldback.useLinkNative && this.emailRecognitionSource == linkHoldback.emailRecognitionSource && Intrinsics.areEqual(this.providedDefaultValues, linkHoldback.providedDefaultValues) && this.spmEnabled == linkHoldback.spmEnabled && Intrinsics.areEqual(this.integrationShape, linkHoldback.integrationShape) && this.linkDisplayed == linkHoldback.linkDisplayed;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.arbId.hashCode() * 31) + this.group.hashCode()) * 31) + this.experiment.hashCode()) * 31) + Boolean.hashCode(this.isReturningLinkUser)) * 31) + Boolean.hashCode(this.useLinkNative)) * 31;
            EmailRecognitionSource emailRecognitionSource = this.emailRecognitionSource;
            return ((((((((iHashCode + (emailRecognitionSource == null ? 0 : emailRecognitionSource.hashCode())) * 31) + this.providedDefaultValues.hashCode()) * 31) + Boolean.hashCode(this.spmEnabled)) * 31) + this.integrationShape.hashCode()) * 31) + Boolean.hashCode(this.linkDisplayed);
        }

        public String toString() {
            return "LinkHoldback(arbId=" + this.arbId + ", group=" + this.group + ", experiment=" + this.experiment + ", isReturningLinkUser=" + this.isReturningLinkUser + ", useLinkNative=" + this.useLinkNative + ", emailRecognitionSource=" + this.emailRecognitionSource + ", providedDefaultValues=" + this.providedDefaultValues + ", spmEnabled=" + this.spmEnabled + ", integrationShape=" + this.integrationShape + ", linkDisplayed=" + this.linkDisplayed + ")";
        }

        @Override // com.stripe.android.common.analytics.experiment.LoggableExperiment
        public String getArbId() {
            return this.arbId;
        }

        @Override // com.stripe.android.common.analytics.experiment.LoggableExperiment
        public String getGroup() {
            return this.group;
        }

        @Override // com.stripe.android.common.analytics.experiment.LoggableExperiment
        public ElementsSession.ExperimentAssignment getExperiment() {
            return this.experiment;
        }

        public final boolean isReturningLinkUser() {
            return this.isReturningLinkUser;
        }

        public final boolean getUseLinkNative() {
            return this.useLinkNative;
        }

        public final EmailRecognitionSource getEmailRecognitionSource() {
            return this.emailRecognitionSource;
        }

        public final ProvidedDefaultValues getProvidedDefaultValues() {
            return this.providedDefaultValues;
        }

        public final boolean getSpmEnabled() {
            return this.spmEnabled;
        }

        public final String getIntegrationShape() {
            return this.integrationShape;
        }

        public final boolean getLinkDisplayed() {
            return this.linkDisplayed;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public LinkHoldback(String arbId, String group, ElementsSession.ExperimentAssignment experiment, boolean z, boolean z2, EmailRecognitionSource emailRecognitionSource, ProvidedDefaultValues providedDefaultValues, boolean z3, String integrationShape, boolean z4) {
            Intrinsics.checkNotNullParameter(arbId, "arbId");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            Intrinsics.checkNotNullParameter(providedDefaultValues, "providedDefaultValues");
            Intrinsics.checkNotNullParameter(integrationShape, "integrationShape");
            Pair[] pairArr = new Pair[8];
            pairArr[0] = TuplesKt.to("integration_type", "mpe_android");
            pairArr[1] = TuplesKt.to("is_returning_link_user", String.valueOf(z));
            pairArr[2] = TuplesKt.to("dvs_provided", providedDefaultValues.toDimension());
            pairArr[3] = TuplesKt.to("use_link_native", String.valueOf(z2));
            pairArr[4] = TuplesKt.to("recognition_type", emailRecognitionSource != null ? emailRecognitionSource.getDimension() : null);
            pairArr[5] = TuplesKt.to("has_spms", String.valueOf(z3));
            pairArr[6] = TuplesKt.to("integration_shape", integrationShape);
            pairArr[7] = TuplesKt.to("link_displayed", String.valueOf(z4));
            super(experiment, arbId, group, MapUtilsKt.filterNotNullValues(MapsKt.mapOf(pairArr)), null);
            this.arbId = arbId;
            this.group = group;
            this.experiment = experiment;
            this.isReturningLinkUser = z;
            this.useLinkNative = z2;
            this.emailRecognitionSource = emailRecognitionSource;
            this.providedDefaultValues = providedDefaultValues;
            this.spmEnabled = z3;
            this.integrationShape = integrationShape;
            this.linkDisplayed = z4;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LoggableExperiment.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$EmailRecognitionSource;", "", "dimension", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDimension", "()Ljava/lang/String;", "EMAIL", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class EmailRecognitionSource {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EmailRecognitionSource[] $VALUES;
            public static final EmailRecognitionSource EMAIL = new EmailRecognitionSource("EMAIL", 0, "email");
            private final String dimension;

            private static final /* synthetic */ EmailRecognitionSource[] $values() {
                return new EmailRecognitionSource[]{EMAIL};
            }

            public static EnumEntries<EmailRecognitionSource> getEntries() {
                return $ENTRIES;
            }

            private EmailRecognitionSource(String str, int i, String str2) {
                this.dimension = str2;
            }

            public final String getDimension() {
                return this.dimension;
            }

            static {
                EmailRecognitionSource[] emailRecognitionSourceArr$values = $values();
                $VALUES = emailRecognitionSourceArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(emailRecognitionSourceArr$values);
            }

            public static EmailRecognitionSource valueOf(String str) {
                return (EmailRecognitionSource) Enum.valueOf(EmailRecognitionSource.class, str);
            }

            public static EmailRecognitionSource[] values() {
                return (EmailRecognitionSource[]) $VALUES.clone();
            }
        }

        /* compiled from: LoggableExperiment.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/common/analytics/experiment/LoggableExperiment$LinkHoldback$ProvidedDefaultValues;", "", "email", "", "name", "phone", "<init>", "(ZZZ)V", "getEmail", "()Z", "getName", "getPhone", "toDimension", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ProvidedDefaultValues {
            public static final int $stable = 0;
            private final boolean email;
            private final boolean name;
            private final boolean phone;

            public static /* synthetic */ ProvidedDefaultValues copy$default(ProvidedDefaultValues providedDefaultValues, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = providedDefaultValues.email;
                }
                if ((i & 2) != 0) {
                    z2 = providedDefaultValues.name;
                }
                if ((i & 4) != 0) {
                    z3 = providedDefaultValues.phone;
                }
                return providedDefaultValues.copy(z, z2, z3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEmail() {
                return this.email;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getName() {
                return this.name;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getPhone() {
                return this.phone;
            }

            public final ProvidedDefaultValues copy(boolean email, boolean name, boolean phone) {
                return new ProvidedDefaultValues(email, name, phone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProvidedDefaultValues)) {
                    return false;
                }
                ProvidedDefaultValues providedDefaultValues = (ProvidedDefaultValues) other;
                return this.email == providedDefaultValues.email && this.name == providedDefaultValues.name && this.phone == providedDefaultValues.phone;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.email) * 31) + Boolean.hashCode(this.name)) * 31) + Boolean.hashCode(this.phone);
            }

            public String toString() {
                return "ProvidedDefaultValues(email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
            }

            public ProvidedDefaultValues(boolean z, boolean z2, boolean z3) {
                this.email = z;
                this.name = z2;
                this.phone = z3;
            }

            public final boolean getEmail() {
                return this.email;
            }

            public final boolean getName() {
                return this.name;
            }

            public final boolean getPhone() {
                return this.phone;
            }

            public final String toDimension() {
                String[] strArr = new String[3];
                strArr[0] = this.email ? "email" : null;
                strArr[1] = this.name ? "name" : null;
                strArr[2] = this.phone ? "phone" : null;
                return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), " ", null, null, 0, null, null, 62, null);
            }
        }
    }
}
