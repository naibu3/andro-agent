package com.qonversion.android.sdk.automations.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomationsEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÂ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;", "", "type", "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;", "date", "Ljava/util/Date;", "productId", "", "(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getType", "()Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class AutomationsEvent {
    private final Date date;
    private final String productId;
    private final AutomationsEventType type;

    /* renamed from: component3, reason: from getter */
    private final String getProductId() {
        return this.productId;
    }

    public static /* synthetic */ AutomationsEvent copy$default(AutomationsEvent automationsEvent, AutomationsEventType automationsEventType, Date date, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            automationsEventType = automationsEvent.type;
        }
        if ((i & 2) != 0) {
            date = automationsEvent.date;
        }
        if ((i & 4) != 0) {
            str = automationsEvent.productId;
        }
        return automationsEvent.copy(automationsEventType, date, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AutomationsEventType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    public final AutomationsEvent copy(AutomationsEventType type, Date date, String productId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        return new AutomationsEvent(type, date, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutomationsEvent)) {
            return false;
        }
        AutomationsEvent automationsEvent = (AutomationsEvent) other;
        return this.type == automationsEvent.type && Intrinsics.areEqual(this.date, automationsEvent.date) && Intrinsics.areEqual(this.productId, automationsEvent.productId);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.date.hashCode()) * 31;
        String str = this.productId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AutomationsEvent(type=" + this.type + ", date=" + this.date + ", productId=" + this.productId + ")";
    }

    public AutomationsEvent(AutomationsEventType type, Date date, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        this.type = type;
        this.date = date;
        this.productId = str;
    }

    public final AutomationsEventType getType() {
        return this.type;
    }

    public final Date getDate() {
        return this.date;
    }
}
