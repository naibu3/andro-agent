package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QEnvironment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/qonversion/android/sdk/dto/QEnvironment;", "", "(Ljava/lang/String;I)V", "Sandbox", "Production", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QEnvironment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QEnvironment[] $VALUES;
    public static final QEnvironment Sandbox = new QEnvironment("Sandbox", 0);
    public static final QEnvironment Production = new QEnvironment("Production", 1);

    private static final /* synthetic */ QEnvironment[] $values() {
        return new QEnvironment[]{Sandbox, Production};
    }

    public static EnumEntries<QEnvironment> getEntries() {
        return $ENTRIES;
    }

    public static QEnvironment valueOf(String str) {
        return (QEnvironment) Enum.valueOf(QEnvironment.class, str);
    }

    public static QEnvironment[] values() {
        return (QEnvironment[]) $VALUES.clone();
    }

    private QEnvironment(String str, int i) {
    }

    static {
        QEnvironment[] qEnvironmentArr$values = $values();
        $VALUES = qEnvironmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qEnvironmentArr$values);
    }
}
