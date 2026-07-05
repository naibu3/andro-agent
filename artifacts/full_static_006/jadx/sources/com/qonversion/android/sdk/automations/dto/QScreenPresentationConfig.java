package com.qonversion.android.sdk.automations.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QScreenPresentationConfig.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;", "", "presentationStyle", "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)V", "getPresentationStyle", "()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QScreenPresentationConfig {
    private final QScreenPresentationStyle presentationStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public QScreenPresentationConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QScreenPresentationConfig copy$default(QScreenPresentationConfig qScreenPresentationConfig, QScreenPresentationStyle qScreenPresentationStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            qScreenPresentationStyle = qScreenPresentationConfig.presentationStyle;
        }
        return qScreenPresentationConfig.copy(qScreenPresentationStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final QScreenPresentationStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    public final QScreenPresentationConfig copy(QScreenPresentationStyle presentationStyle) {
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        return new QScreenPresentationConfig(presentationStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QScreenPresentationConfig) && this.presentationStyle == ((QScreenPresentationConfig) other).presentationStyle;
    }

    public int hashCode() {
        return this.presentationStyle.hashCode();
    }

    public String toString() {
        return "QScreenPresentationConfig(presentationStyle=" + this.presentationStyle + ")";
    }

    public QScreenPresentationConfig(QScreenPresentationStyle presentationStyle) {
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        this.presentationStyle = presentationStyle;
    }

    public /* synthetic */ QScreenPresentationConfig(QScreenPresentationStyle qScreenPresentationStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? QScreenPresentationStyle.Push : qScreenPresentationStyle);
    }

    public final QScreenPresentationStyle getPresentationStyle() {
        return this.presentationStyle;
    }
}
