package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QUser.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/dto/QUser;", "", "qonversionId", "", "identityId", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentityId", "()Ljava/lang/String;", "getQonversionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QUser {
    private final String identityId;
    private final String qonversionId;

    public static /* synthetic */ QUser copy$default(QUser qUser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qUser.qonversionId;
        }
        if ((i & 2) != 0) {
            str2 = qUser.identityId;
        }
        return qUser.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQonversionId() {
        return this.qonversionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdentityId() {
        return this.identityId;
    }

    public final QUser copy(String qonversionId, String identityId) {
        Intrinsics.checkNotNullParameter(qonversionId, "qonversionId");
        return new QUser(qonversionId, identityId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QUser)) {
            return false;
        }
        QUser qUser = (QUser) other;
        return Intrinsics.areEqual(this.qonversionId, qUser.qonversionId) && Intrinsics.areEqual(this.identityId, qUser.identityId);
    }

    public int hashCode() {
        int iHashCode = this.qonversionId.hashCode() * 31;
        String str = this.identityId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "QUser(qonversionId=" + this.qonversionId + ", identityId=" + this.identityId + ")";
    }

    public QUser(String qonversionId, String str) {
        Intrinsics.checkNotNullParameter(qonversionId, "qonversionId");
        this.qonversionId = qonversionId;
        this.identityId = str;
    }

    public final String getQonversionId() {
        return this.qonversionId;
    }

    public final String getIdentityId() {
        return this.identityId;
    }
}
