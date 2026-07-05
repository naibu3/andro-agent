package com.qonversion.android.sdk.internal.dto.request.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.purchase.Purchase;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitRequestData.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "", "installDate", "", "idfa", "", "purchases", "", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "requestTrigger", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V", "getCallback", "()Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "getIdfa", "()Ljava/lang/String;", "getInstallDate", "()J", "getPurchases", "()Ljava/util/List;", "getRequestTrigger", "()Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class InitRequestData {
    private final QonversionLaunchCallback callback;
    private final String idfa;
    private final long installDate;
    private final List<Purchase> purchases;
    private final RequestTrigger requestTrigger;

    public static /* synthetic */ InitRequestData copy$default(InitRequestData initRequestData, long j, String str, List list, QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger, int i, Object obj) {
        if ((i & 1) != 0) {
            j = initRequestData.installDate;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = initRequestData.idfa;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = initRequestData.purchases;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            qonversionLaunchCallback = initRequestData.callback;
        }
        QonversionLaunchCallback qonversionLaunchCallback2 = qonversionLaunchCallback;
        if ((i & 16) != 0) {
            requestTrigger = initRequestData.requestTrigger;
        }
        return initRequestData.copy(j2, str2, list2, qonversionLaunchCallback2, requestTrigger);
    }

    /* renamed from: component1, reason: from getter */
    public final long getInstallDate() {
        return this.installDate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdfa() {
        return this.idfa;
    }

    public final List<Purchase> component3() {
        return this.purchases;
    }

    /* renamed from: component4, reason: from getter */
    public final QonversionLaunchCallback getCallback() {
        return this.callback;
    }

    /* renamed from: component5, reason: from getter */
    public final RequestTrigger getRequestTrigger() {
        return this.requestTrigger;
    }

    public final InitRequestData copy(long installDate, String idfa, List<Purchase> purchases, QonversionLaunchCallback callback, RequestTrigger requestTrigger) {
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        return new InitRequestData(installDate, idfa, purchases, callback, requestTrigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitRequestData)) {
            return false;
        }
        InitRequestData initRequestData = (InitRequestData) other;
        return this.installDate == initRequestData.installDate && Intrinsics.areEqual(this.idfa, initRequestData.idfa) && Intrinsics.areEqual(this.purchases, initRequestData.purchases) && Intrinsics.areEqual(this.callback, initRequestData.callback) && this.requestTrigger == initRequestData.requestTrigger;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.installDate) * 31;
        String str = this.idfa;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Purchase> list = this.purchases;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        QonversionLaunchCallback qonversionLaunchCallback = this.callback;
        return ((iHashCode3 + (qonversionLaunchCallback != null ? qonversionLaunchCallback.hashCode() : 0)) * 31) + this.requestTrigger.hashCode();
    }

    public String toString() {
        return "InitRequestData(installDate=" + this.installDate + ", idfa=" + this.idfa + ", purchases=" + this.purchases + ", callback=" + this.callback + ", requestTrigger=" + this.requestTrigger + ")";
    }

    public InitRequestData(long j, String str, List<Purchase> list, QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger) {
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        this.installDate = j;
        this.idfa = str;
        this.purchases = list;
        this.callback = qonversionLaunchCallback;
        this.requestTrigger = requestTrigger;
    }

    public /* synthetic */ InitRequestData(long j, String str, List list, QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : qonversionLaunchCallback, requestTrigger);
    }

    public final long getInstallDate() {
        return this.installDate;
    }

    public final String getIdfa() {
        return this.idfa;
    }

    public final List<Purchase> getPurchases() {
        return this.purchases;
    }

    public final QonversionLaunchCallback getCallback() {
        return this.callback;
    }

    public final RequestTrigger getRequestTrigger() {
        return this.requestTrigger;
    }
}
