.class public final enum Lcom/stripe/android/stripe3ds2/init/DeviceParam;
.super Ljava/lang/Enum;
.source "DeviceParam.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/init/DeviceParam;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0003\u0008\u00af\u0001\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u00b1\u0001\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084j\u0002\u00085j\u0002\u00086j\u0002\u00087j\u0002\u00088j\u0002\u00089j\u0002\u0008:j\u0002\u0008;j\u0002\u0008<j\u0002\u0008=j\u0002\u0008>j\u0002\u0008?j\u0002\u0008@j\u0002\u0008Aj\u0002\u0008Bj\u0002\u0008Cj\u0002\u0008Dj\u0002\u0008Ej\u0002\u0008Fj\u0002\u0008Gj\u0002\u0008Hj\u0002\u0008Ij\u0002\u0008Jj\u0002\u0008Kj\u0002\u0008Lj\u0002\u0008Mj\u0002\u0008Nj\u0002\u0008Oj\u0002\u0008Pj\u0002\u0008Qj\u0002\u0008Rj\u0002\u0008Sj\u0002\u0008Tj\u0002\u0008Uj\u0002\u0008Vj\u0002\u0008Wj\u0002\u0008Xj\u0002\u0008Yj\u0002\u0008Zj\u0002\u0008[j\u0002\u0008\\j\u0002\u0008]j\u0002\u0008^j\u0002\u0008_j\u0002\u0008`j\u0002\u0008aj\u0002\u0008bj\u0002\u0008cj\u0002\u0008dj\u0002\u0008ej\u0002\u0008fj\u0002\u0008gj\u0002\u0008hj\u0002\u0008ij\u0002\u0008jj\u0002\u0008kj\u0002\u0008lj\u0002\u0008mj\u0002\u0008nj\u0002\u0008oj\u0002\u0008pj\u0002\u0008qj\u0002\u0008rj\u0002\u0008sj\u0002\u0008tj\u0002\u0008uj\u0002\u0008vj\u0002\u0008wj\u0002\u0008xj\u0002\u0008yj\u0002\u0008zj\u0002\u0008{j\u0002\u0008|j\u0002\u0008}j\u0002\u0008~j\u0002\u0008\u007fj\u0003\u0008\u0080\u0001j\u0003\u0008\u0081\u0001j\u0003\u0008\u0082\u0001j\u0003\u0008\u0083\u0001j\u0003\u0008\u0084\u0001j\u0003\u0008\u0085\u0001j\u0003\u0008\u0086\u0001j\u0003\u0008\u0087\u0001j\u0003\u0008\u0088\u0001j\u0003\u0008\u0089\u0001j\u0003\u0008\u008a\u0001j\u0003\u0008\u008b\u0001j\u0003\u0008\u008c\u0001j\u0003\u0008\u008d\u0001j\u0003\u0008\u008e\u0001j\u0003\u0008\u008f\u0001j\u0003\u0008\u0090\u0001j\u0003\u0008\u0091\u0001j\u0003\u0008\u0092\u0001j\u0003\u0008\u0093\u0001j\u0003\u0008\u0094\u0001j\u0003\u0008\u0095\u0001j\u0003\u0008\u0096\u0001j\u0003\u0008\u0097\u0001j\u0003\u0008\u0098\u0001j\u0003\u0008\u0099\u0001j\u0003\u0008\u009a\u0001j\u0003\u0008\u009b\u0001j\u0003\u0008\u009c\u0001j\u0003\u0008\u009d\u0001j\u0003\u0008\u009e\u0001j\u0003\u0008\u009f\u0001j\u0003\u0008\u00a0\u0001j\u0003\u0008\u00a1\u0001j\u0003\u0008\u00a2\u0001j\u0003\u0008\u00a3\u0001j\u0003\u0008\u00a4\u0001j\u0003\u0008\u00a5\u0001j\u0003\u0008\u00a6\u0001j\u0003\u0008\u00a7\u0001j\u0003\u0008\u00a8\u0001j\u0003\u0008\u00a9\u0001j\u0003\u0008\u00aa\u0001j\u0003\u0008\u00ab\u0001j\u0003\u0008\u00ac\u0001j\u0003\u0008\u00ad\u0001j\u0003\u0008\u00ae\u0001j\u0003\u0008\u00af\u0001j\u0003\u0008\u00b0\u0001\u00a8\u0006\u00b2\u0001"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DeviceParam;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "PARAM_PLATFORM",
        "PARAM_DEVICE_MODEL",
        "PARAM_OS_NAME",
        "PARAM_OS_VERSION",
        "PARAM_LOCALE",
        "PARAM_TIME_ZONE",
        "PARAM_SCREEN_RESOLUTION",
        "PARAM_DEVICE_NAME",
        "PARAM_IP_ADDRESS",
        "PARAM_LATITUDE",
        "PARAM_LONGITUDE",
        "PARAM_APP_PACKAGE_NAME",
        "PARAM_SDK_APP_ID",
        "PARAM_SDK_VERSION",
        "PARAM_SDK_REF_NUMBER",
        "PARAM_DATE_TIME",
        "PARAM_SDK_TRANS_ID",
        "PARAM_TELE_DEVICE_ID",
        "PARAM_TELE_SUBSCRIBER_ID",
        "PARAM_TELE_IMEI_SV",
        "PARAM_TELE_GROUP_IDENTIFIER_L1",
        "PARAM_TELE_LINE1_NUMBER",
        "PARAM_TELE_MMS_UA_PROFILE_URL",
        "PARAM_TELE_MMS_USER_AGENT",
        "PARAM_TELE_NETWORK_COUNTRY_ISO",
        "PARAM_TELE_NETWORK_OPERATOR",
        "PARAM_TELE_NETWORK_OPERATOR_NAME",
        "PARAM_TELE_NETWORK_TYPE",
        "PARAM_TELE_PHONE_COUNT",
        "PARAM_TELE_PHONE_TYPE",
        "PARAM_TELE_SIM_COUNTRY_ISO",
        "PARAM_TELE_SIM_OPERATOR",
        "PARAM_TELE_SIM_OPERATOR_NAME",
        "PARAM_TELE_SIM_SERIAL_NUMBER",
        "PARAM_TELE_SIM_STATE",
        "PARAM_TELE_VOICE_MAIL_ALPHA_TAG",
        "PARAM_TELE_VOICE_MAIL_NUMBER",
        "PARAM_TELE_HAS_ICC_CARD",
        "PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED",
        "PARAM_TELE_IS_NETWORK_ROAMING",
        "PARAM_TELE_IS_SMS_CAPABLE",
        "PARAM_TELE_IS_TTY_MODE_SUPPORTED",
        "PARAM_TELE_IS_VOICE_CAPABLE",
        "PARAM_TELE_IS_WORLD_PHONE",
        "PARAM_WIFI_MAC",
        "PARAM_WIFI_BSSID",
        "PARAM_WIFI_SSID",
        "PARAM_WIFI_NETWORK_ID",
        "PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED",
        "PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED",
        "PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED",
        "PARAM_WIFI_IS_P2P_SUPPORTED",
        "PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED",
        "PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE",
        "PARAM_WIFI_IS_TDLS_SUPPORTED",
        "PARAM_BLUETOOTH_ADDRESS",
        "PARAM_BLUETOOTH_BONDED_DEVICE",
        "PARAM_BLUETOOTH_IS_ENABLED",
        "PARAM_BUILD_BOARD",
        "PARAM_BUILD_BOOTLOADER",
        "PARAM_BUILD_BRAND",
        "PARAM_BUILD_DEVICE",
        "PARAM_BUILD_DISPLAY",
        "PARAM_BUILD_FINGERPRINT",
        "PARAM_BUILD_HARDWARE",
        "PARAM_BUILD_ID",
        "PARAM_BUILD_MANUFACTURER",
        "PARAM_BUILD_PRODUCT",
        "PARAM_BUILD_RADIO",
        "PARAM_BUILD_SERIAL",
        "PARAM_BUILD_SUPPORTED_32_BIT_ABIS",
        "PARAM_BUILD_SUPPORTED_64_BIT_ABIS",
        "PARAM_BUILD_TAGS",
        "PARAM_BUILD_TIME",
        "PARAM_BUILD_TYPE",
        "PARAM_BUILD_USER",
        "PARAM_BUILD_VERSION_CODENAME",
        "PARAM_BUILD_VERSION_INCREMENTAL",
        "PARAM_BUILD_VERSION_PREVIEW_SDK_INT",
        "PARAM_BUILD_VERSION_SDK_INT",
        "PARAM_BUILD_VERSION_SECURITY_PATCH",
        "PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED",
        "PARAM_SECURE_ACCESSIBILITY_ENABLED",
        "PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD",
        "PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS",
        "PARAM_SECURE_ANDROID_ID",
        "PARAM_SECURE_DATA_ROAMING",
        "PARAM_SECURE_DEFAULT_INPUT_METHOD",
        "PARAM_SECURE_DEVICE_PROVISIONED",
        "PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES",
        "PARAM_SECURE_ENABLED_INPUT_METHODS",
        "PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY",
        "PARAM_SECURE_INSTALL_NON_MARKET_APPS",
        "PARAM_SECURE_LOCATION_MODE",
        "PARAM_SECURE_SKIP_FIRST_USE_HINTS",
        "PARAM_SECURE_SYS_PROP_SETTING_VERSION",
        "PARAM_SECURE_TTS_DEFAULT_PITCH",
        "PARAM_SECURE_TTS_DEFAULT_RATE",
        "PARAM_SECURE_TTS_DEFAULT_SYNTH",
        "PARAM_SECURE_TTS_ENABLED_PLUGINS",
        "PARAM_GLOBAL_ADB_ENABLED",
        "PARAM_GLOBAL_AIRPLANE_MODE_RADIOS",
        "PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES",
        "PARAM_GLOBAL_ANIMATOR_DURATION_SCALE",
        "PARAM_GLOBAL_AUTO_TIME",
        "PARAM_GLOBAL_AUTO_TIME_ZONE",
        "PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED",
        "PARAM_GLOBAL_HTTP_PROXY",
        "PARAM_GLOBAL_NETWORK_PREFERENCE",
        "PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN",
        "PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE",
        "PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED",
        "PARAM_GLOBAL_USE_GOOGLE_MAIL",
        "PARAM_GLOBAL_WAIT_FOR_DEBUGGER",
        "PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON",
        "PARAM_SYSTEM_ACCELEROMETER_ROTATION",
        "PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY",
        "PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT",
        "PARAM_SYSTEM_DATE_FORMAT",
        "PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING",
        "PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING",
        "PARAM_SYSTEM_END_BUTTON_BEHAVIOR",
        "PARAM_SYSTEM_FONT_SCALE",
        "PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED",
        "PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED",
        "PARAM_SYSTEM_NOTIFICATION_SOUND",
        "PARAM_SYSTEM_MUTE_STREAMS_AFFECTED",
        "PARAM_SYSTEM_RINGTONE",
        "PARAM_SYSTEM_SCREEN_BRIGHTNESS",
        "PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE",
        "PARAM_SYSTEM_SCREEN_OFF_TIMEOUT",
        "PARAM_SYSTEM_SOUND_EFFECTS_ENABLED",
        "PARAM_SYSTEM_TEXT_AUTO_CAPS",
        "PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE",
        "PARAM_SYSTEM_TEXT_AUTO_REPLACE",
        "PARAM_SYSTEM_TEXT_SHOW_PASSWORD",
        "PARAM_SYSTEM_TIME_12_24",
        "PARAM_SYSTEM_USER_ROTATION",
        "PARAM_SYSTEM_VIBRATE_ON",
        "PARAM_SYSTEM_VIBRATE_WHEN_RINGING",
        "PARAM_PACKAGE_IS_SAFE_MODE",
        "PARAM_PACKAGE_GET_INSTALLED_APPS",
        "PARAM_PACKAGE_INSTALLER_PACKAGE_NAME",
        "PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES",
        "PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES",
        "PARAM_ENV_EXTERNAL_STORAGE_STATE",
        "PARAM_LOCALE_AVAILABLE_LOCALES",
        "PARAM_DISPLAY_DENSITY",
        "PARAM_DISPLAY_DENSITY_DPI",
        "PARAM_DISPLAY_SCALED_DENSITY",
        "PARAM_DISPLAY_XDPI",
        "PARAM_DISPLAY_YDPI",
        "PARAM_STAT_FS_TOTAL_BYTES",
        "PARAM_WEB_VIEW_USER_AGENT",
        "PARAM_SIM_CARRIER_ID",
        "PARAM_SIM_CARRIER_ID_NAME",
        "PARAM_MANUFACTURER_CODE",
        "PARAM_SIM_SPECIFIC_CARRIER_ID",
        "PARAM_SIM_SPECIFIC_CARRIER_ID_NAME",
        "PARAM_MULTI_SIM_SUPPORTED",
        "PARAM_SUBSCRIPTION_ID",
        "PARAM_6GHZ_BAND_SUPPORTED",
        "PARAM_PASSPOINT_FQDN",
        "PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME",
        "PARAM_BONDED_DEVICES_ALIAS",
        "PARAM_RTT_CALLING_MODE",
        "PARAM_SECURE_FRP_MODE",
        "PARAM_APPLY_RAMPING_RINGER",
        "PARAM_HARDWARE_SKU",
        "PARAM_SOC_MANUFACTURER",
        "PARAM_SOC_MODEL",
        "toString",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_6GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_APPLY_RAMPING_RINGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_APP_PACKAGE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BLUETOOTH_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BLUETOOTH_BONDED_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BLUETOOTH_IS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BONDED_DEVICES_ALIAS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_BOARD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_BOOTLOADER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_BRAND:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_DISPLAY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_FINGERPRINT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_HARDWARE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_PRODUCT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_RADIO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_SUPPORTED_32_BIT_ABIS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_SUPPORTED_64_BIT_ABIS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_TAGS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_USER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_VERSION_CODENAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_VERSION_INCREMENTAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_VERSION_PREVIEW_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_VERSION_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_BUILD_VERSION_SECURITY_PATCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DATE_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DEVICE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DISPLAY_DENSITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DISPLAY_DENSITY_DPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DISPLAY_SCALED_DENSITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DISPLAY_XDPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_DISPLAY_YDPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_ENV_EXTERNAL_STORAGE_STATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_ADB_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_AIRPLANE_MODE_RADIOS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_ANIMATOR_DURATION_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_AUTO_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_AUTO_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_HTTP_PROXY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_NETWORK_PREFERENCE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_USE_GOOGLE_MAIL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_WAIT_FOR_DEBUGGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_HARDWARE_SKU:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_IP_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_LATITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_LOCALE_AVAILABLE_LOCALES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_LONGITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_MANUFACTURER_CODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_MULTI_SIM_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PACKAGE_GET_INSTALLED_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PACKAGE_INSTALLER_PACKAGE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PACKAGE_IS_SAFE_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PASSPOINT_FQDN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_RTT_CALLING_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SDK_APP_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SDK_REF_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SDK_TRANS_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SDK_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ACCESSIBILITY_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ANDROID_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_DATA_ROAMING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_DEFAULT_INPUT_METHOD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_DEVICE_PROVISIONED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_ENABLED_INPUT_METHODS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_FRP_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_LOCATION_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_SKIP_FIRST_USE_HINTS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_SYS_PROP_SETTING_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_TTS_DEFAULT_PITCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_TTS_DEFAULT_RATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_TTS_DEFAULT_SYNTH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SECURE_TTS_ENABLED_PLUGINS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SIM_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SIM_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SIM_SPECIFIC_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SIM_SPECIFIC_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SOC_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SOC_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_STAT_FS_TOTAL_BYTES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SUBSCRIPTION_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_ACCELEROMETER_ROTATION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_DATE_FORMAT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_END_BUTTON_BEHAVIOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_FONT_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_MUTE_STREAMS_AFFECTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_NOTIFICATION_SOUND:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_RINGTONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_SCREEN_BRIGHTNESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_SCREEN_OFF_TIMEOUT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_SOUND_EFFECTS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_TEXT_AUTO_CAPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_TEXT_AUTO_REPLACE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_TEXT_SHOW_PASSWORD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_TIME_12_24:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_USER_ROTATION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_VIBRATE_ON:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_SYSTEM_VIBRATE_WHEN_RINGING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_DEVICE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_GROUP_IDENTIFIER_L1:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_HAS_ICC_CARD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IS_NETWORK_ROAMING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IS_SMS_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IS_VOICE_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_LINE1_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_MMS_UA_PROFILE_URL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_MMS_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_NETWORK_COUNTRY_ISO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_NETWORK_OPERATOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_NETWORK_OPERATOR_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_NETWORK_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_PHONE_COUNT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_PHONE_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_SIM_COUNTRY_ISO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_SIM_OPERATOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_SIM_OPERATOR_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_SIM_SERIAL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_SIM_STATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_SUBSCRIBER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_VOICE_MAIL_ALPHA_TAG:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TELE_VOICE_MAIL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WEB_VIEW_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_BSSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_P2P_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_IS_TDLS_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_MAC:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_NETWORK_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

.field public static final enum PARAM_WIFI_SSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/init/DeviceParam;
    .locals 172

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v5, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v6, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v7, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v8, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v9, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_IP_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v10, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LATITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v11, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LONGITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v12, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APP_PACKAGE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v13, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_APP_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v14, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v15, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_REF_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v16, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DATE_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v17, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_TRANS_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v18, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_DEVICE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v19, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SUBSCRIBER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v20, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v21, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_GROUP_IDENTIFIER_L1:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v22, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_LINE1_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v23, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_MMS_UA_PROFILE_URL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v24, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_MMS_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v25, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_COUNTRY_ISO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v26, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_OPERATOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v27, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_OPERATOR_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v28, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v29, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_PHONE_COUNT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v30, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_PHONE_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v31, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_COUNTRY_ISO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v32, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_OPERATOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v33, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_OPERATOR_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v34, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_SERIAL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v35, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_STATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v36, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_ALPHA_TAG:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v37, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v38, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_HAS_ICC_CARD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v39, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v40, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_NETWORK_ROAMING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v41, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_SMS_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v42, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v43, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_VOICE_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v44, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v45, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_MAC:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v46, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_BSSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v47, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_SSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v48, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_NETWORK_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v49, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v50, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v51, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v52, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_P2P_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v53, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v54, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v55, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_TDLS_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v56, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v57, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_BONDED_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v58, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_IS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v59, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_BOARD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v60, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_BOOTLOADER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v61, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_BRAND:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v62, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v63, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_DISPLAY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v64, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_FINGERPRINT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v65, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_HARDWARE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v66, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v67, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v68, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_PRODUCT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v69, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_RADIO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v70, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v71, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SUPPORTED_32_BIT_ABIS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v72, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SUPPORTED_64_BIT_ABIS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v73, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_TAGS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v74, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v75, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v76, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_USER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v77, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_CODENAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v78, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_INCREMENTAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v79, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_PREVIEW_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v80, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v81, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SECURITY_PATCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v82, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v83, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ACCESSIBILITY_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v84, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v85, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v86, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ANDROID_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v87, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_DATA_ROAMING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v88, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_DEFAULT_INPUT_METHOD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v89, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_DEVICE_PROVISIONED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v90, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v91, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ENABLED_INPUT_METHODS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v92, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v93, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v94, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_LOCATION_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v95, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_SKIP_FIRST_USE_HINTS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v96, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_SYS_PROP_SETTING_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v97, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_DEFAULT_PITCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v98, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_DEFAULT_RATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v99, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_DEFAULT_SYNTH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v100, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_ENABLED_PLUGINS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v101, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_ADB_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v102, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_AIRPLANE_MODE_RADIOS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v103, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v104, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_ANIMATOR_DURATION_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v105, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_AUTO_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v106, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_AUTO_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v107, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v108, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_HTTP_PROXY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v109, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_NETWORK_PREFERENCE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v110, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v111, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v112, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v113, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_USE_GOOGLE_MAIL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v114, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_WAIT_FOR_DEBUGGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v115, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v116, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_ACCELEROMETER_ROTATION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v117, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v118, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v119, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DATE_FORMAT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v120, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v121, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v122, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_END_BUTTON_BEHAVIOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v123, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_FONT_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v124, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v125, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v126, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_NOTIFICATION_SOUND:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v127, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_MUTE_STREAMS_AFFECTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v128, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_RINGTONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v129, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SCREEN_BRIGHTNESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v130, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v131, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SCREEN_OFF_TIMEOUT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v132, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SOUND_EFFECTS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v133, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_AUTO_CAPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v134, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v135, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_AUTO_REPLACE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v136, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_SHOW_PASSWORD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v137, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TIME_12_24:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v138, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_USER_ROTATION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v139, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_VIBRATE_ON:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v140, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_VIBRATE_WHEN_RINGING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v141, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_IS_SAFE_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v142, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_GET_INSTALLED_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v143, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_INSTALLER_PACKAGE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v144, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v145, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v146, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_ENV_EXTERNAL_STORAGE_STATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v147, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE_AVAILABLE_LOCALES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v148, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_DENSITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v149, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_DENSITY_DPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v150, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_SCALED_DENSITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v151, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_XDPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v152, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_YDPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v153, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_STAT_FS_TOTAL_BYTES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v154, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WEB_VIEW_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v155, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v156, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v157, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MANUFACTURER_CODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v158, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v159, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v160, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MULTI_SIM_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v161, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SUBSCRIPTION_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v162, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_6GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v163, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PASSPOINT_FQDN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v164, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v165, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BONDED_DEVICES_ALIAS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v166, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_RTT_CALLING_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v167, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_FRP_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v168, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APPLY_RAMPING_RINGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v169, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_SKU:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v170, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    sget-object v171, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    filled-new-array/range {v1 .. v171}, [Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 6
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x0

    const-string v2, "C001"

    const-string v3, "PARAM_PLATFORM"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 7
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x1

    const-string v2, "C002"

    const-string v3, "PARAM_DEVICE_MODEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 8
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x2

    const-string v2, "C003"

    const-string v3, "PARAM_OS_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 9
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x3

    const-string v2, "C004"

    const-string v3, "PARAM_OS_VERSION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 10
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x4

    const-string v2, "C005"

    const-string v3, "PARAM_LOCALE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 11
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x5

    const-string v2, "C006"

    const-string v3, "PARAM_TIME_ZONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 12
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x6

    const-string v2, "C008"

    const-string v3, "PARAM_SCREEN_RESOLUTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 13
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v1, 0x7

    const-string v2, "C009"

    const-string v3, "PARAM_DEVICE_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 14
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8

    const-string v2, "C010"

    const-string v3, "PARAM_IP_ADDRESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_IP_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 15
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9

    const-string v2, "C011"

    const-string v3, "PARAM_LATITUDE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LATITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 16
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa

    const-string v2, "C012"

    const-string v3, "PARAM_LONGITUDE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LONGITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 17
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xb

    const-string v2, "C013"

    const-string v3, "PARAM_APP_PACKAGE_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APP_PACKAGE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 18
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xc

    const-string v2, "C014"

    const-string v3, "PARAM_SDK_APP_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_APP_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 19
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xd

    const-string v2, "C015"

    const-string v3, "PARAM_SDK_VERSION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 20
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xe

    const-string v2, "C016"

    const-string v3, "PARAM_SDK_REF_NUMBER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_REF_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 21
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xf

    const-string v2, "C017"

    const-string v3, "PARAM_DATE_TIME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DATE_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 22
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x10

    const-string v2, "C018"

    const-string v3, "PARAM_SDK_TRANS_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_TRANS_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 27
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x11

    const-string v2, "A001"

    const-string v3, "PARAM_TELE_DEVICE_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_DEVICE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 28
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x12

    const-string v2, "A002"

    const-string v3, "PARAM_TELE_SUBSCRIBER_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SUBSCRIBER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 29
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x13

    const-string v2, "A003"

    const-string v3, "PARAM_TELE_IMEI_SV"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 30
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x14

    const-string v2, "A004"

    const-string v3, "PARAM_TELE_GROUP_IDENTIFIER_L1"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_GROUP_IDENTIFIER_L1:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 31
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x15

    const-string v2, "A005"

    const-string v3, "PARAM_TELE_LINE1_NUMBER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_LINE1_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 32
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x16

    const-string v2, "A006"

    const-string v3, "PARAM_TELE_MMS_UA_PROFILE_URL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_MMS_UA_PROFILE_URL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 33
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x17

    const-string v2, "A007"

    const-string v3, "PARAM_TELE_MMS_USER_AGENT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_MMS_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 34
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x18

    const-string v2, "A008"

    const-string v3, "PARAM_TELE_NETWORK_COUNTRY_ISO"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_COUNTRY_ISO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 35
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x19

    const-string v2, "A009"

    const-string v3, "PARAM_TELE_NETWORK_OPERATOR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_OPERATOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 36
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x1a

    const-string v2, "A010"

    const-string v3, "PARAM_TELE_NETWORK_OPERATOR_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_OPERATOR_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 37
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x1b

    const-string v2, "A011"

    const-string v3, "PARAM_TELE_NETWORK_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_NETWORK_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 38
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x1c

    const-string v2, "A012"

    const-string v3, "PARAM_TELE_PHONE_COUNT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_PHONE_COUNT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 39
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x1d

    const-string v2, "A013"

    const-string v3, "PARAM_TELE_PHONE_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_PHONE_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 40
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x1e

    const-string v2, "A014"

    const-string v3, "PARAM_TELE_SIM_COUNTRY_ISO"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_COUNTRY_ISO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 41
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x1f

    const-string v2, "A015"

    const-string v3, "PARAM_TELE_SIM_OPERATOR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_OPERATOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 42
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x20

    const-string v2, "A016"

    const-string v3, "PARAM_TELE_SIM_OPERATOR_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_OPERATOR_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 43
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x21

    const-string v2, "A017"

    const-string v3, "PARAM_TELE_SIM_SERIAL_NUMBER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_SERIAL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 44
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x22

    const-string v2, "A018"

    const-string v3, "PARAM_TELE_SIM_STATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_STATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 45
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x23

    const-string v2, "A019"

    const-string v3, "PARAM_TELE_VOICE_MAIL_ALPHA_TAG"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_ALPHA_TAG:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 46
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x24

    const-string v2, "A020"

    const-string v3, "PARAM_TELE_VOICE_MAIL_NUMBER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 47
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x25

    const-string v2, "A021"

    const-string v3, "PARAM_TELE_HAS_ICC_CARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_HAS_ICC_CARD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 48
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x26

    const-string v2, "A022"

    const-string v3, "PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 49
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x27

    const-string v2, "A023"

    const-string v3, "PARAM_TELE_IS_NETWORK_ROAMING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_NETWORK_ROAMING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 50
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x28

    const-string v2, "A024"

    const-string v3, "PARAM_TELE_IS_SMS_CAPABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_SMS_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 51
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x29

    const-string v2, "A025"

    const-string v3, "PARAM_TELE_IS_TTY_MODE_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 52
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x2a

    const-string v2, "A026"

    const-string v3, "PARAM_TELE_IS_VOICE_CAPABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_VOICE_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 53
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x2b

    const-string v2, "A027"

    const-string v3, "PARAM_TELE_IS_WORLD_PHONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 56
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x2c

    const-string v2, "A028"

    const-string v3, "PARAM_WIFI_MAC"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_MAC:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 57
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x2d

    const-string v2, "A029"

    const-string v3, "PARAM_WIFI_BSSID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_BSSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 58
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x2e

    const-string v2, "A030"

    const-string v3, "PARAM_WIFI_SSID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_SSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 59
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x2f

    const-string v2, "A031"

    const-string v3, "PARAM_WIFI_NETWORK_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_NETWORK_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 60
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x30

    const-string v2, "A032"

    const-string v3, "PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 61
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x31

    const-string v2, "A033"

    const-string v3, "PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 62
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x32

    const-string v2, "A034"

    const-string v3, "PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 63
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x33

    const-string v2, "A035"

    const-string v3, "PARAM_WIFI_IS_P2P_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_P2P_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 64
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x34

    const-string v2, "A036"

    const-string v3, "PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 65
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x35

    const-string v2, "A037"

    const-string v3, "PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 66
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x36

    const-string v2, "A038"

    const-string v3, "PARAM_WIFI_IS_TDLS_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_TDLS_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 69
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x37

    const-string v2, "A039"

    const-string v3, "PARAM_BLUETOOTH_ADDRESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 70
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x38

    const-string v2, "A040"

    const-string v3, "PARAM_BLUETOOTH_BONDED_DEVICE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_BONDED_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 71
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x39

    const-string v2, "A041"

    const-string v3, "PARAM_BLUETOOTH_IS_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_IS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 74
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x3a

    const-string v2, "A042"

    const-string v3, "PARAM_BUILD_BOARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_BOARD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 75
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x3b

    const-string v2, "A043"

    const-string v3, "PARAM_BUILD_BOOTLOADER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_BOOTLOADER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 76
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x3c

    const-string v2, "A044"

    const-string v3, "PARAM_BUILD_BRAND"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_BRAND:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 77
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x3d

    const-string v2, "A045"

    const-string v3, "PARAM_BUILD_DEVICE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 78
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x3e

    const-string v2, "A046"

    const-string v3, "PARAM_BUILD_DISPLAY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_DISPLAY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 79
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x3f

    const-string v2, "A047"

    const-string v3, "PARAM_BUILD_FINGERPRINT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_FINGERPRINT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 80
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x40

    const-string v2, "A048"

    const-string v3, "PARAM_BUILD_HARDWARE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_HARDWARE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 81
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x41

    const-string v2, "A049"

    const-string v3, "PARAM_BUILD_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 82
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x42

    const-string v2, "A050"

    const-string v3, "PARAM_BUILD_MANUFACTURER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 83
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x43

    const-string v2, "A051"

    const-string v3, "PARAM_BUILD_PRODUCT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_PRODUCT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 84
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x44

    const-string v2, "A052"

    const-string v3, "PARAM_BUILD_RADIO"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_RADIO:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 85
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x45

    const-string v2, "A053"

    const-string v3, "PARAM_BUILD_SERIAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 86
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x46

    const-string v2, "A054"

    const-string v3, "PARAM_BUILD_SUPPORTED_32_BIT_ABIS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SUPPORTED_32_BIT_ABIS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 87
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x47

    const-string v2, "A055"

    const-string v3, "PARAM_BUILD_SUPPORTED_64_BIT_ABIS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SUPPORTED_64_BIT_ABIS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 88
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x48

    const-string v2, "A056"

    const-string v3, "PARAM_BUILD_TAGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_TAGS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 89
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x49

    const-string v2, "A057"

    const-string v3, "PARAM_BUILD_TIME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 90
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x4a

    const-string v2, "A058"

    const-string v3, "PARAM_BUILD_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_TYPE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 91
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x4b

    const-string v2, "A059"

    const-string v3, "PARAM_BUILD_USER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_USER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 94
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x4c

    const-string v2, "A060"

    const-string v3, "PARAM_BUILD_VERSION_CODENAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_CODENAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 95
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x4d

    const-string v2, "A061"

    const-string v3, "PARAM_BUILD_VERSION_INCREMENTAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_INCREMENTAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 96
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x4e

    const-string v2, "A062"

    const-string v3, "PARAM_BUILD_VERSION_PREVIEW_SDK_INT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_PREVIEW_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 97
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x4f

    const-string v2, "A063"

    const-string v3, "PARAM_BUILD_VERSION_SDK_INT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 98
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x50

    const-string v2, "A064"

    const-string v3, "PARAM_BUILD_VERSION_SECURITY_PATCH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SECURITY_PATCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 101
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x51

    const-string v2, "A065"

    const-string v3, "PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 102
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x52

    const-string v2, "A066"

    const-string v3, "PARAM_SECURE_ACCESSIBILITY_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ACCESSIBILITY_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 103
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x53

    const-string v2, "A067"

    const-string v3, "PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ACCESSIBILITY_ACCESSIBILITY_SPEAK_PASSWORD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 104
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x54

    const-string v2, "A068"

    const-string v3, "PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ALLOWED_GEOLOCATION_ORIGINS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 105
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x55

    const-string v2, "A069"

    const-string v3, "PARAM_SECURE_ANDROID_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ANDROID_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 106
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x56

    const-string v2, "A070"

    const-string v3, "PARAM_SECURE_DATA_ROAMING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_DATA_ROAMING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 107
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x57

    const-string v2, "A071"

    const-string v3, "PARAM_SECURE_DEFAULT_INPUT_METHOD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_DEFAULT_INPUT_METHOD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 108
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x58

    const-string v2, "A072"

    const-string v3, "PARAM_SECURE_DEVICE_PROVISIONED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_DEVICE_PROVISIONED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 109
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x59

    const-string v2, "A073"

    const-string v3, "PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ENABLED_ACCESSIBILITY_SERVICES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 110
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x5a

    const-string v2, "A074"

    const-string v3, "PARAM_SECURE_ENABLED_INPUT_METHODS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_ENABLED_INPUT_METHODS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 111
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x5b

    const-string v2, "A075"

    const-string v3, "PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INPUT_METHOD_SELECTOR_VISIBILITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 112
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x5c

    const-string v2, "A076"

    const-string v3, "PARAM_SECURE_INSTALL_NON_MARKET_APPS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 113
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x5d

    const-string v2, "A077"

    const-string v3, "PARAM_SECURE_LOCATION_MODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_LOCATION_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 114
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x5e

    const-string v2, "A078"

    const-string v3, "PARAM_SECURE_SKIP_FIRST_USE_HINTS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_SKIP_FIRST_USE_HINTS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 115
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x5f

    const-string v2, "A079"

    const-string v3, "PARAM_SECURE_SYS_PROP_SETTING_VERSION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_SYS_PROP_SETTING_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 116
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x60

    const-string v2, "A080"

    const-string v3, "PARAM_SECURE_TTS_DEFAULT_PITCH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_DEFAULT_PITCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 117
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x61

    const-string v2, "A081"

    const-string v3, "PARAM_SECURE_TTS_DEFAULT_RATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_DEFAULT_RATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 118
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x62

    const-string v2, "A082"

    const-string v3, "PARAM_SECURE_TTS_DEFAULT_SYNTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_DEFAULT_SYNTH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 119
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x63

    const-string v2, "A083"

    const-string v3, "PARAM_SECURE_TTS_ENABLED_PLUGINS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_TTS_ENABLED_PLUGINS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 122
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x64

    const-string v2, "A084"

    const-string v3, "PARAM_GLOBAL_ADB_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_ADB_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 123
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x65

    const-string v2, "A085"

    const-string v3, "PARAM_GLOBAL_AIRPLANE_MODE_RADIOS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_AIRPLANE_MODE_RADIOS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 124
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x66

    const-string v2, "A086"

    const-string v3, "PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_ALWAYS_FINISH_ACTIVITIES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 125
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x67

    const-string v2, "A087"

    const-string v3, "PARAM_GLOBAL_ANIMATOR_DURATION_SCALE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_ANIMATOR_DURATION_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 126
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x68

    const-string v2, "A088"

    const-string v3, "PARAM_GLOBAL_AUTO_TIME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_AUTO_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 127
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x69

    const-string v2, "A089"

    const-string v3, "PARAM_GLOBAL_AUTO_TIME_ZONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_AUTO_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 128
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x6a

    const-string v2, "A090"

    const-string v3, "PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_DEVELOPMENT_SETTINGS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 129
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x6b

    const-string v2, "A091"

    const-string v3, "PARAM_GLOBAL_HTTP_PROXY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_HTTP_PROXY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 130
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x6c

    const-string v2, "A092"

    const-string v3, "PARAM_GLOBAL_NETWORK_PREFERENCE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_NETWORK_PREFERENCE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 131
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x6d

    const-string v2, "A093"

    const-string v3, "PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_STAY_ON_WHILE_PLUGGED_IN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 132
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x6e

    const-string v2, "A094"

    const-string v3, "PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_TRANSITION_ANIMATION_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 133
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x6f

    const-string v2, "A095"

    const-string v3, "PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_USB_MASS_STORAGE_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 134
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x70

    const-string v2, "A096"

    const-string v3, "PARAM_GLOBAL_USE_GOOGLE_MAIL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_USE_GOOGLE_MAIL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 135
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x71

    const-string v2, "A097"

    const-string v3, "PARAM_GLOBAL_WAIT_FOR_DEBUGGER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_WAIT_FOR_DEBUGGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 136
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x72

    const-string v2, "A098"

    const-string v3, "PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_GLOBAL_WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 139
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x73

    const-string v2, "A099"

    const-string v3, "PARAM_SYSTEM_ACCELEROMETER_ROTATION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_ACCELEROMETER_ROTATION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 140
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x74

    const-string v2, "A100"

    const-string v3, "PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 141
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x75

    const-string v2, "A101"

    const-string v3, "PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_BLUETOOTH_DISCOVERABILITY_TIMEOUT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 142
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x76

    const-string v2, "A102"

    const-string v3, "PARAM_SYSTEM_DATE_FORMAT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DATE_FORMAT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 143
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x77

    const-string v2, "A103"

    const-string v3, "PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 144
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x78

    const-string v2, "A104"

    const-string v3, "PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DTMF_TONE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 145
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x79

    const-string v2, "A105"

    const-string v3, "PARAM_SYSTEM_END_BUTTON_BEHAVIOR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_END_BUTTON_BEHAVIOR:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 146
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x7a

    const-string v2, "A106"

    const-string v3, "PARAM_SYSTEM_FONT_SCALE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_FONT_SCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 147
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x7b

    const-string v2, "A107"

    const-string v3, "PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_HAPTIC_FEEDBACK_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 148
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x7c

    const-string v2, "A108"

    const-string v3, "PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_MODE_RINGER_STREAMS_AFFECTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 149
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x7d

    const-string v2, "A109"

    const-string v3, "PARAM_SYSTEM_NOTIFICATION_SOUND"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_NOTIFICATION_SOUND:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 150
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x7e

    const-string v2, "A110"

    const-string v3, "PARAM_SYSTEM_MUTE_STREAMS_AFFECTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_MUTE_STREAMS_AFFECTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 151
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x7f

    const-string v2, "A111"

    const-string v3, "PARAM_SYSTEM_RINGTONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_RINGTONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 152
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x80

    const-string v2, "A112"

    const-string v3, "PARAM_SYSTEM_SCREEN_BRIGHTNESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SCREEN_BRIGHTNESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 153
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x81

    const-string v2, "A113"

    const-string v3, "PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SCREEN_BRIGHTNESS_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 154
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x82

    const-string v2, "A114"

    const-string v3, "PARAM_SYSTEM_SCREEN_OFF_TIMEOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SCREEN_OFF_TIMEOUT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 155
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x83

    const-string v2, "A115"

    const-string v3, "PARAM_SYSTEM_SOUND_EFFECTS_ENABLED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_SOUND_EFFECTS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 156
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x84

    const-string v2, "A116"

    const-string v3, "PARAM_SYSTEM_TEXT_AUTO_CAPS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_AUTO_CAPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 157
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x85

    const-string v2, "A117"

    const-string v3, "PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_AUTO_PUNCTUATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 158
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x86

    const-string v2, "A118"

    const-string v3, "PARAM_SYSTEM_TEXT_AUTO_REPLACE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_AUTO_REPLACE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 159
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x87

    const-string v2, "A119"

    const-string v3, "PARAM_SYSTEM_TEXT_SHOW_PASSWORD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TEXT_SHOW_PASSWORD:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 160
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x88

    const-string v2, "A120"

    const-string v3, "PARAM_SYSTEM_TIME_12_24"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_TIME_12_24:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 161
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x89

    const-string v2, "A121"

    const-string v3, "PARAM_SYSTEM_USER_ROTATION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_USER_ROTATION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 162
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8a

    const-string v2, "A122"

    const-string v3, "PARAM_SYSTEM_VIBRATE_ON"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_VIBRATE_ON:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 163
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8b

    const-string v2, "A123"

    const-string v3, "PARAM_SYSTEM_VIBRATE_WHEN_RINGING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_VIBRATE_WHEN_RINGING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 166
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8c

    const-string v2, "A124"

    const-string v3, "PARAM_PACKAGE_IS_SAFE_MODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_IS_SAFE_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 167
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8d

    const-string v2, "A125"

    const-string v3, "PARAM_PACKAGE_GET_INSTALLED_APPS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_GET_INSTALLED_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 168
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8e

    const-string v2, "A126"

    const-string v3, "PARAM_PACKAGE_INSTALLER_PACKAGE_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_INSTALLER_PACKAGE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 169
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x8f

    const-string v2, "A127"

    const-string v3, "PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_SYSTEM_AVAILABLE_FEATURES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 170
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x90

    const-string v2, "A128"

    const-string v3, "PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PACKAGE_SYSTEM_SHARED_LIBRARY_NAMES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 173
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x91

    const-string v2, "A129"

    const-string v3, "PARAM_ENV_EXTERNAL_STORAGE_STATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_ENV_EXTERNAL_STORAGE_STATE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 176
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x92

    const-string v2, "A130"

    const-string v3, "PARAM_LOCALE_AVAILABLE_LOCALES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE_AVAILABLE_LOCALES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 179
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x93

    const-string v2, "A131"

    const-string v3, "PARAM_DISPLAY_DENSITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_DENSITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 180
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x94

    const-string v2, "A132"

    const-string v3, "PARAM_DISPLAY_DENSITY_DPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_DENSITY_DPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 181
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x95

    const-string v2, "A133"

    const-string v3, "PARAM_DISPLAY_SCALED_DENSITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_SCALED_DENSITY:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 182
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x96

    const-string v2, "A134"

    const-string v3, "PARAM_DISPLAY_XDPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_XDPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 183
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x97

    const-string v2, "A135"

    const-string v3, "PARAM_DISPLAY_YDPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DISPLAY_YDPI:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 186
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x98

    const-string v2, "A136"

    const-string v3, "PARAM_STAT_FS_TOTAL_BYTES"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_STAT_FS_TOTAL_BYTES:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 189
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x99

    const-string v2, "A137"

    const-string v3, "PARAM_WEB_VIEW_USER_AGENT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WEB_VIEW_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 192
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9a

    const-string v2, "A138"

    const-string v3, "PARAM_SIM_CARRIER_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 193
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9b

    const-string v2, "A139"

    const-string v3, "PARAM_SIM_CARRIER_ID_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 194
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9c

    const-string v2, "A140"

    const-string v3, "PARAM_MANUFACTURER_CODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MANUFACTURER_CODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 195
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9d

    const-string v2, "A141"

    const-string v3, "PARAM_SIM_SPECIFIC_CARRIER_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 196
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9e

    const-string v2, "A142"

    const-string v3, "PARAM_SIM_SPECIFIC_CARRIER_ID_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 197
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0x9f

    const-string v2, "A143"

    const-string v3, "PARAM_MULTI_SIM_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MULTI_SIM_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 198
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa0

    const-string v2, "A145"

    const-string v3, "PARAM_SUBSCRIPTION_ID"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SUBSCRIPTION_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 200
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa1

    const-string v2, "A146"

    const-string v3, "PARAM_6GHZ_BAND_SUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_6GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 201
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa2

    const-string v2, "A147"

    const-string v3, "PARAM_PASSPOINT_FQDN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PASSPOINT_FQDN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 202
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa3

    const-string v2, "A148"

    const-string v3, "PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 203
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa4

    const-string v2, "A149"

    const-string v3, "PARAM_BONDED_DEVICES_ALIAS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BONDED_DEVICES_ALIAS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 204
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa5

    const-string v2, "A150"

    const-string v3, "PARAM_RTT_CALLING_MODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_RTT_CALLING_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 205
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa6

    const-string v2, "A151"

    const-string v3, "PARAM_SECURE_FRP_MODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_FRP_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 206
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa7

    const-string v2, "A152"

    const-string v3, "PARAM_APPLY_RAMPING_RINGER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APPLY_RAMPING_RINGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 207
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa8

    const-string v2, "A153"

    const-string v3, "PARAM_HARDWARE_SKU"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_SKU:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 208
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xa9

    const-string v2, "A154"

    const-string v3, "PARAM_SOC_MANUFACTURER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 209
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/16 v1, 0xaa

    const-string v2, "A155"

    const-string v3, "PARAM_SOC_MODEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->$values()[Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/stripe3ds2/init/DeviceParam;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/init/DeviceParam;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 214
    check-cast p0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/init/DeviceParam;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 214
    check-cast v0, [Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->code:Ljava/lang/String;

    return-object v0
.end method
