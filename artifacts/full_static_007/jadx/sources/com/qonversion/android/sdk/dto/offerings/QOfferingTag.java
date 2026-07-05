package com.qonversion.android.sdk.dto.offerings;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QOfferingTag.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "", "tag", "", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Unknown", "None", "Main", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QOfferingTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QOfferingTag[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final Integer tag;
    public static final QOfferingTag Unknown = new QOfferingTag("Unknown", 0, -1);
    public static final QOfferingTag None = new QOfferingTag("None", 1, 0);
    public static final QOfferingTag Main = new QOfferingTag("Main", 2, 1);

    private static final /* synthetic */ QOfferingTag[] $values() {
        return new QOfferingTag[]{Unknown, None, Main};
    }

    public static EnumEntries<QOfferingTag> getEntries() {
        return $ENTRIES;
    }

    public static QOfferingTag valueOf(String str) {
        return (QOfferingTag) Enum.valueOf(QOfferingTag.class, str);
    }

    public static QOfferingTag[] values() {
        return (QOfferingTag[]) $VALUES.clone();
    }

    private QOfferingTag(String str, int i, Integer num) {
        this.tag = num;
    }

    public final Integer getTag() {
        return this.tag;
    }

    static {
        QOfferingTag[] qOfferingTagArr$values = $values();
        $VALUES = qOfferingTagArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qOfferingTagArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: QOfferingTag.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;", "", "()V", "fromTag", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "tag", "", "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final QOfferingTag fromTag(Integer tag) {
            int iIntValue = tag != null ? tag.intValue() : 0;
            if (iIntValue == 0) {
                return QOfferingTag.None;
            }
            if (iIntValue == 1) {
                return QOfferingTag.Main;
            }
            return QOfferingTag.Unknown;
        }
    }
}
