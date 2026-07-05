package com.qonversion.android.sdk.internal.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RateLimiter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/RateLimiter;", "", "maxRequestsPerSecond", "", "(I)V", "requests", "", "Lcom/qonversion/android/sdk/internal/api/RequestType;", "", "Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;", "isRateLimitExceeded", "", "requestType", "hash", "removeOutdatedRequests", "", "saveRequest", "Request", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class RateLimiter {
    private final int maxRequestsPerSecond;
    private final Map<RequestType, List<Request>> requests = new LinkedHashMap();

    public RateLimiter(int i) {
        this.maxRequestsPerSecond = i;
    }

    public final synchronized void saveRequest(RequestType requestType, int hash) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.requests.containsKey(requestType)) {
            this.requests.put(requestType, new ArrayList());
        }
        Request request = new Request(hash, jCurrentTimeMillis);
        List<Request> list = this.requests.get(requestType);
        if (list != null) {
            list.add(request);
        }
    }

    public final synchronized boolean isRateLimitExceeded(RequestType requestType, int hash) {
        int i;
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        removeOutdatedRequests(requestType);
        List<Request> listEmptyList = this.requests.get(requestType);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Iterator<Request> it = listEmptyList.iterator();
        i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Request next = it.next();
            if (i >= this.maxRequestsPerSecond) {
                break;
            }
            if (next.getHash() != hash) {
                z = false;
            }
            i += ExtensionsKt.toInt(z);
        }
        return i >= this.maxRequestsPerSecond;
    }

    private final synchronized void removeOutdatedRequests(RequestType requestType) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Request> listEmptyList = this.requests.get(requestType);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Map<RequestType, List<Request>> map = this.requests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            if (jCurrentTimeMillis - ((Request) obj).getTimestamp() < 1000) {
                arrayList.add(obj);
            }
        }
        map.put(requestType, CollectionsKt.toMutableList((Collection) arrayList));
    }

    /* compiled from: RateLimiter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/qonversion/android/sdk/internal/api/RateLimiter$Request;", "", "hash", "", "timestamp", "", "(IJ)V", "getHash", "()I", "getTimestamp", "()J", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class Request {
        private final int hash;
        private final long timestamp;

        public Request(int i, long j) {
            this.hash = i;
            this.timestamp = j;
        }

        public final int getHash() {
            return this.hash;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }
}
