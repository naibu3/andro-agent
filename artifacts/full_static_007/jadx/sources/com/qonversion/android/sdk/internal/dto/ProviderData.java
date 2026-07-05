package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderData.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/ProviderData;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "provider", "(Ljava/util/Map;Ljava/lang/String;)V", "getData", "()Ljava/util/Map;", "getProvider", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class ProviderData {
    private final Map<String, Object> data;
    private final String provider;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProviderData copy$default(ProviderData providerData, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = providerData.data;
        }
        if ((i & 2) != 0) {
            str = providerData.provider;
        }
        return providerData.copy(map, str);
    }

    public final Map<String, Object> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    public final ProviderData copy(@Json(name = "d") Map<String, ? extends Object> data, @Json(name = "provider") String provider) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new ProviderData(data, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderData)) {
            return false;
        }
        ProviderData providerData = (ProviderData) other;
        return Intrinsics.areEqual(this.data, providerData.data) && Intrinsics.areEqual(this.provider, providerData.provider);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.provider.hashCode();
    }

    public String toString() {
        return "ProviderData(data=" + this.data + ", provider=" + this.provider + ")";
    }

    public ProviderData(@Json(name = "d") Map<String, ? extends Object> data, @Json(name = "provider") String provider) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.data = data;
        this.provider = provider;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getProvider() {
        return this.provider;
    }
}
