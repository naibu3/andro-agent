package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Environment.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/Environment;", "", "app_version", "", "carrier", "deviceId", "locale", "manufacturer", "model", "os", "osVersion", "timezone", "platform", "country", "advertiserId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertiserId", "()Ljava/lang/String;", "getApp_version", "getCarrier", "getCountry", "getDeviceId", "getLocale", "getManufacturer", "getModel", "getOs", "getOsVersion", "getPlatform", "getTimezone", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class Environment {
    private final String advertiserId;
    private final String app_version;
    private final String carrier;
    private final String country;
    private final String deviceId;
    private final String locale;
    private final String manufacturer;
    private final String model;
    private final String os;
    private final String osVersion;
    private final String platform;
    private final String timezone;

    /* renamed from: component1, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAdvertiserId() {
        return this.advertiserId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component5, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    public final Environment copy(@Json(name = "app_version") String app_version, @Json(name = "carrier") String carrier, @Json(name = "device_id") String deviceId, @Json(name = "locale") String locale, @Json(name = "manufacturer") String manufacturer, @Json(name = "model") String model, @Json(name = "os") String os, @Json(name = "os_version") String osVersion, @Json(name = "timezone") String timezone, @Json(name = "platform") String platform, @Json(name = "country") String country, @Json(name = "advertiser_id") String advertiserId) {
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(country, "country");
        return new Environment(app_version, carrier, deviceId, locale, manufacturer, model, os, osVersion, timezone, platform, country, advertiserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return Intrinsics.areEqual(this.app_version, environment.app_version) && Intrinsics.areEqual(this.carrier, environment.carrier) && Intrinsics.areEqual(this.deviceId, environment.deviceId) && Intrinsics.areEqual(this.locale, environment.locale) && Intrinsics.areEqual(this.manufacturer, environment.manufacturer) && Intrinsics.areEqual(this.model, environment.model) && Intrinsics.areEqual(this.os, environment.os) && Intrinsics.areEqual(this.osVersion, environment.osVersion) && Intrinsics.areEqual(this.timezone, environment.timezone) && Intrinsics.areEqual(this.platform, environment.platform) && Intrinsics.areEqual(this.country, environment.country) && Intrinsics.areEqual(this.advertiserId, environment.advertiserId);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.app_version.hashCode() * 31) + this.carrier.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.manufacturer.hashCode()) * 31) + this.model.hashCode()) * 31) + this.os.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.country.hashCode()) * 31;
        String str = this.advertiserId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Environment(app_version=" + this.app_version + ", carrier=" + this.carrier + ", deviceId=" + this.deviceId + ", locale=" + this.locale + ", manufacturer=" + this.manufacturer + ", model=" + this.model + ", os=" + this.os + ", osVersion=" + this.osVersion + ", timezone=" + this.timezone + ", platform=" + this.platform + ", country=" + this.country + ", advertiserId=" + this.advertiserId + ")";
    }

    public Environment(@Json(name = "app_version") String app_version, @Json(name = "carrier") String carrier, @Json(name = "device_id") String deviceId, @Json(name = "locale") String locale, @Json(name = "manufacturer") String manufacturer, @Json(name = "model") String model, @Json(name = "os") String os, @Json(name = "os_version") String osVersion, @Json(name = "timezone") String timezone, @Json(name = "platform") String platform, @Json(name = "country") String country, @Json(name = "advertiser_id") String str) {
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(country, "country");
        this.app_version = app_version;
        this.carrier = carrier;
        this.deviceId = deviceId;
        this.locale = locale;
        this.manufacturer = manufacturer;
        this.model = model;
        this.os = os;
        this.osVersion = osVersion;
        this.timezone = timezone;
        this.platform = platform;
        this.country = country;
        this.advertiserId = str;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getAdvertiserId() {
        return this.advertiserId;
    }
}
