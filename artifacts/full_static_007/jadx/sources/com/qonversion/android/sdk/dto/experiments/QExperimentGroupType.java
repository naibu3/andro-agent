package com.qonversion.android.sdk.dto.experiments;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QExperimentGroupType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Control", "Treatment", "Unknown", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QExperimentGroupType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QExperimentGroupType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final QExperimentGroupType Control = new QExperimentGroupType("Control", 0, "control");
    public static final QExperimentGroupType Treatment = new QExperimentGroupType("Treatment", 1, "treatment");
    public static final QExperimentGroupType Unknown = new QExperimentGroupType("Unknown", 2, "unknown");
    private final String type;

    private static final /* synthetic */ QExperimentGroupType[] $values() {
        return new QExperimentGroupType[]{Control, Treatment, Unknown};
    }

    public static EnumEntries<QExperimentGroupType> getEntries() {
        return $ENTRIES;
    }

    public static QExperimentGroupType valueOf(String str) {
        return (QExperimentGroupType) Enum.valueOf(QExperimentGroupType.class, str);
    }

    public static QExperimentGroupType[] values() {
        return (QExperimentGroupType[]) $VALUES.clone();
    }

    private QExperimentGroupType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        QExperimentGroupType[] qExperimentGroupTypeArr$values = $values();
        $VALUES = qExperimentGroupTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qExperimentGroupTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: QExperimentGroupType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final QExperimentGroupType fromType(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return Intrinsics.areEqual(type, "control") ? QExperimentGroupType.Control : Intrinsics.areEqual(type, "treatment") ? QExperimentGroupType.Treatment : QExperimentGroupType.Unknown;
        }
    }
}
