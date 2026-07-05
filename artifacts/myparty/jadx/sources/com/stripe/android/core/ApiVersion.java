package com.stripe.android.core;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiVersion.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÀ\u0003¢\u0006\u0002\b\u0013J(\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÀ\u0001¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/core/ApiVersion;", "", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "", "betaCodes", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "betas", "(Ljava/util/Set;)V", "getVersion$stripe_core_release", "()Ljava/lang/String;", "getBetaCodes$stripe_core_release", "()Ljava/util/Set;", "code", "getCode", "component1", "component1$stripe_core_release", "component2", "component2$stripe_core_release", "copy", "copy$stripe_core_release", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ApiVersion {
    private final Set<String> betaCodes;
    private final String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String API_VERSION_CODE = "2020-03-02";
    private static final ApiVersion INSTANCE = new ApiVersion(API_VERSION_CODE, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiVersion copy$stripe_core_release$default(ApiVersion apiVersion, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiVersion.version;
        }
        if ((i & 2) != 0) {
            set = apiVersion.betaCodes;
        }
        return apiVersion.copy$stripe_core_release(str, set);
    }

    /* renamed from: component1$stripe_core_release, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final Set<String> component2$stripe_core_release() {
        return this.betaCodes;
    }

    public final ApiVersion copy$stripe_core_release(String version, Set<String> betaCodes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(betaCodes, "betaCodes");
        return new ApiVersion(version, betaCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiVersion)) {
            return false;
        }
        ApiVersion apiVersion = (ApiVersion) other;
        return Intrinsics.areEqual(this.version, apiVersion.version) && Intrinsics.areEqual(this.betaCodes, apiVersion.betaCodes);
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.betaCodes.hashCode();
    }

    public String toString() {
        return "ApiVersion(version=" + this.version + ", betaCodes=" + this.betaCodes + ")";
    }

    public ApiVersion(String version, Set<String> betaCodes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(betaCodes, "betaCodes");
        this.version = version;
        this.betaCodes = betaCodes;
    }

    public final String getVersion$stripe_core_release() {
        return this.version;
    }

    public /* synthetic */ ApiVersion(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? SetsKt.emptySet() : set);
    }

    public final Set<String> getBetaCodes$stripe_core_release() {
        return this.betaCodes;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiVersion(Set<String> betas) {
        this(API_VERSION_CODE, betas);
        Intrinsics.checkNotNullParameter(betas, "betas");
    }

    public final String getCode() {
        List listListOf = CollectionsKt.listOf(this.version);
        Set<String> set = this.betaCodes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return CollectionsKt.joinToString$default(CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList), ";", null, null, 0, null, null, 62, null);
    }

    /* compiled from: ApiVersion.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/core/ApiVersion$Companion;", "", "<init>", "()V", "API_VERSION_CODE", "", "INSTANCE", "Lcom/stripe/android/core/ApiVersion;", "get", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ ApiVersion get() {
            return ApiVersion.INSTANCE;
        }
    }
}
