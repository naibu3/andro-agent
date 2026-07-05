package com.qonversion.android.sdk.internal.dto.app;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: App.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/app/App;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "version", "build", "bundle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuild", "()Ljava/lang/String;", "getBundle", "getName", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class App {
    private final String build;
    private final String bundle;
    private final String name;
    private final String version;

    public static /* synthetic */ App copy$default(App app, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = app.name;
        }
        if ((i & 2) != 0) {
            str2 = app.version;
        }
        if ((i & 4) != 0) {
            str3 = app.build;
        }
        if ((i & 8) != 0) {
            str4 = app.bundle;
        }
        return app.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBuild() {
        return this.build;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    public final App copy(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "version") String version, @Json(name = "build") String build, @Json(name = "bundle") String bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(build, "build");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new App(name, version, build, bundle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app = (App) other;
        return Intrinsics.areEqual(this.name, app.name) && Intrinsics.areEqual(this.version, app.version) && Intrinsics.areEqual(this.build, app.build) && Intrinsics.areEqual(this.bundle, app.bundle);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.version.hashCode()) * 31) + this.build.hashCode()) * 31) + this.bundle.hashCode();
    }

    public String toString() {
        return "App(name=" + this.name + ", version=" + this.version + ", build=" + this.build + ", bundle=" + this.bundle + ")";
    }

    public App(@Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "version") String version, @Json(name = "build") String build, @Json(name = "bundle") String bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(build, "build");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.name = name;
        this.version = version;
        this.build = build;
        this.bundle = bundle;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getBuild() {
        return this.build;
    }

    public final String getBundle() {
        return this.bundle;
    }
}
