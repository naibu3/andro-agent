package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: DeviceParamNotAvailableFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0010¢\u0006\u0004\b\u0004\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\rR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "apiVersion", "", "<init>", "(I)V", "()V", "create", "", "", "marketOrRegionRestrictionParams", "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations", "getMarketOrRegionRestrictionParams$3ds2sdk_release", "()Ljava/util/Map;", "platformVersionParams", "getPlatformVersionParams$3ds2sdk_release$annotations", "getPlatformVersionParams$3ds2sdk_release", "permissionParams", "getPermissionParams$3ds2sdk_release$annotations", "getPermissionParams$3ds2sdk_release", "unavailableParams", "getUnavailableParams", "Reason", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceParamNotAvailableFactoryImpl implements DeviceParamNotAvailableFactory {
    private final int apiVersion;

    public static /* synthetic */ void getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getPermissionParams$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getPlatformVersionParams$3ds2sdk_release$annotations() {
    }

    public DeviceParamNotAvailableFactoryImpl(int i) {
        this.apiVersion = i;
    }

    public DeviceParamNotAvailableFactoryImpl() {
        this(Build.VERSION.SDK_INT);
    }

    @Override // com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory
    public Map<String, String> create() {
        return MapsKt.plus(MapsKt.plus(MapsKt.plus(getMarketOrRegionRestrictionParams$3ds2sdk_release(), getPlatformVersionParams$3ds2sdk_release()), getPermissionParams$3ds2sdk_release()), getUnavailableParams());
    }

    public final Map<String, String> getMarketOrRegionRestrictionParams$3ds2sdk_release() {
        HashMap map = new HashMap();
        List listListOf = CollectionsKt.listOf((Object[]) new DeviceParam[]{DeviceParam.PARAM_PLATFORM, DeviceParam.PARAM_DEVICE_MODEL, DeviceParam.PARAM_OS_NAME, DeviceParam.PARAM_OS_VERSION, DeviceParam.PARAM_LOCALE, DeviceParam.PARAM_TIME_ZONE, DeviceParam.PARAM_SCREEN_RESOLUTION, DeviceParam.PARAM_SDK_APP_ID, DeviceParam.PARAM_SDK_VERSION, DeviceParam.PARAM_SDK_REF_NUMBER, DeviceParam.PARAM_DATE_TIME, DeviceParam.PARAM_SDK_TRANS_ID, DeviceParam.PARAM_WEB_VIEW_USER_AGENT, DeviceParam.PARAM_SIM_CARRIER_ID, DeviceParam.PARAM_SECURE_FRP_MODE, DeviceParam.PARAM_APPLY_RAMPING_RINGER, DeviceParam.PARAM_HARDWARE_SKU, DeviceParam.PARAM_SOC_MANUFACTURER, DeviceParam.PARAM_SOC_MODEL, DeviceParam.PARAM_SIM_CARRIER_ID_NAME, DeviceParam.PARAM_MANUFACTURER_CODE, DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID, DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME, DeviceParam.PARAM_MULTI_SIM_SUPPORTED, DeviceParam.PARAM_SUBSCRIPTION_ID, DeviceParam.PARAM_RTT_CALLING_MODE});
        for (DeviceParam deviceParam : DeviceParam.getEntries()) {
            if (!listListOf.contains(deviceParam)) {
                map.put(deviceParam.getCode(), Reason.MARKET_OR_REGION_RESTRICTION.toString());
            }
        }
        return map;
    }

    public final Map<String, String> getPlatformVersionParams$3ds2sdk_release() {
        HashMap map = new HashMap();
        if (this.apiVersion < 26) {
            HashMap map2 = map;
            map2.put(DeviceParam.PARAM_TELE_IMEI_SV.getCode(), Reason.PLATFORM_VERSION.toString());
            map2.put(DeviceParam.PARAM_BUILD_SERIAL.getCode(), Reason.PLATFORM_VERSION.toString());
            map2.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 23) {
            HashMap map3 = map;
            map3.put(DeviceParam.PARAM_TELE_PHONE_COUNT.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_BUILD_VERSION_PREVIEW_SDK_INT.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_BUILD_VERSION_SDK_INT.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_BUILD_VERSION_SECURITY_PATCH.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.getCode(), Reason.PLATFORM_VERSION.toString());
            map3.put(DeviceParam.PARAM_SYSTEM_VIBRATE_WHEN_RINGING.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion > 23) {
            map.put(DeviceParam.PARAM_SECURE_SYS_PROP_SETTING_VERSION.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 22) {
            map.put(DeviceParam.PARAM_TELE_IS_VOICE_CAPABLE.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 28) {
            HashMap map4 = map;
            map4.put(DeviceParam.PARAM_SIM_CARRIER_ID.getCode(), Reason.PLATFORM_VERSION.toString());
            map4.put(DeviceParam.PARAM_SIM_CARRIER_ID_NAME.getCode(), Reason.PLATFORM_VERSION.toString());
            map4.put(DeviceParam.PARAM_RTT_CALLING_MODE.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 29) {
            HashMap map5 = map;
            map5.put(DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID.getCode(), Reason.PLATFORM_VERSION.toString());
            map5.put(DeviceParam.PARAM_SIM_SPECIFIC_CARRIER_ID_NAME.getCode(), Reason.PLATFORM_VERSION.toString());
            map5.put(DeviceParam.PARAM_MULTI_SIM_SUPPORTED.getCode(), Reason.PLATFORM_VERSION.toString());
            map5.put(DeviceParam.PARAM_APPLY_RAMPING_RINGER.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 30) {
            HashMap map6 = map;
            map6.put(DeviceParam.PARAM_SUBSCRIPTION_ID.getCode(), Reason.PLATFORM_VERSION.toString());
            map6.put(DeviceParam.PARAM_BONDED_DEVICES_ALIAS.getCode(), Reason.PLATFORM_VERSION.toString());
            map6.put(DeviceParam.PARAM_SECURE_FRP_MODE.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 31) {
            HashMap map7 = map;
            map7.put(DeviceParam.PARAM_HARDWARE_SKU.getCode(), Reason.PLATFORM_VERSION.toString());
            map7.put(DeviceParam.PARAM_SOC_MANUFACTURER.getCode(), Reason.PLATFORM_VERSION.toString());
            map7.put(DeviceParam.PARAM_SOC_MODEL.getCode(), Reason.PLATFORM_VERSION.toString());
        }
        return map;
    }

    public final Map<String, String> getPermissionParams$3ds2sdk_release() {
        HashMap map = new HashMap();
        map.put(DeviceParam.PARAM_WIFI_MAC.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_BSSID.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_SSID.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_NETWORK_ID.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_P2P_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_WIFI_IS_TDLS_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_LATITUDE.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_LONGITUDE.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_DEVICE_NAME.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_BLUETOOTH_ADDRESS.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_BLUETOOTH_BONDED_DEVICE.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_BLUETOOTH_IS_ENABLED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_DEVICE_ID.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_SUBSCRIBER_ID.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_IMEI_SV.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_GROUP_IDENTIFIER_L1.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_SIM_SERIAL_NUMBER.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_VOICE_MAIL_ALPHA_TAG.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_VOICE_MAIL_NUMBER.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_BUILD_SERIAL.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_MULTI_SIM_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_6GHZ_BAND_SUPPORTED.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_PASSPOINT_FQDN.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME.getCode(), Reason.PERMISSION.toString());
        map.put(DeviceParam.PARAM_BONDED_DEVICES_ALIAS.getCode(), Reason.PERMISSION.toString());
        return map;
    }

    private final Map<String, String> getUnavailableParams() {
        HashMap map = new HashMap();
        map.put(DeviceParam.PARAM_MANUFACTURER_CODE.getCode(), Reason.UNAVAILABLE.toString());
        return map;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceParamNotAvailableFactoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MARKET_OR_REGION_RESTRICTION", "PLATFORM_VERSION", "PERMISSION", "UNAVAILABLE", InAppPurchaseConstants.METHOD_TO_STRING, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reason {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        private final String code;
        public static final Reason MARKET_OR_REGION_RESTRICTION = new Reason("MARKET_OR_REGION_RESTRICTION", 0, "RE01");
        public static final Reason PLATFORM_VERSION = new Reason("PLATFORM_VERSION", 1, "RE02");
        public static final Reason PERMISSION = new Reason("PERMISSION", 2, "RE03");
        public static final Reason UNAVAILABLE = new Reason("UNAVAILABLE", 3, "RE04");

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{MARKET_OR_REGION_RESTRICTION, PLATFORM_VERSION, PERMISSION, UNAVAILABLE};
        }

        public static EnumEntries<Reason> getEntries() {
            return $ENTRIES;
        }

        private Reason(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(reasonArr$values);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }
}
