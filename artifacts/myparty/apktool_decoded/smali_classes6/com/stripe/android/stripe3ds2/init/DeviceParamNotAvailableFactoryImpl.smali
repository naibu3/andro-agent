.class public final Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;
.super Ljava/lang/Object;
.source "DeviceParamNotAvailableFactoryImpl.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceParamNotAvailableFactoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceParamNotAvailableFactoryImpl.kt\ncom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1863#2,2:255\n*S KotlinDebug\n*F\n+ 1 DeviceParamNotAvailableFactoryImpl.kt\ncom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl\n*L\n60#1:255,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\t\u0008\u0010\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00088@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u000c\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00088@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000f\u0010\u0006\u001a\u0004\u0008\u0010\u0010\rR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00088@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0012\u0010\u0006\u001a\u0004\u0008\u0013\u0010\rR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;",
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;",
        "apiVersion",
        "",
        "<init>",
        "(I)V",
        "()V",
        "create",
        "",
        "",
        "marketOrRegionRestrictionParams",
        "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations",
        "getMarketOrRegionRestrictionParams$3ds2sdk_release",
        "()Ljava/util/Map;",
        "platformVersionParams",
        "getPlatformVersionParams$3ds2sdk_release$annotations",
        "getPlatformVersionParams$3ds2sdk_release",
        "permissionParams",
        "getPermissionParams$3ds2sdk_release$annotations",
        "getPermissionParams$3ds2sdk_release",
        "unavailableParams",
        "getUnavailableParams",
        "Reason",
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


# instance fields
.field private final apiVersion:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    invoke-direct {p0, v0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    return-void
.end method

.method public static synthetic getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPermissionParams$3ds2sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPlatformVersionParams$3ds2sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getUnavailableParams()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 235
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 237
    check-cast v0, Ljava/util/Map;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MANUFACTURER_CODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 238
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->UNAVAILABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public create()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 20
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getMarketOrRegionRestrictionParams$3ds2sdk_release()Ljava/util/Map;

    move-result-object v0

    .line 21
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getPlatformVersionParams$3ds2sdk_release()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getPermissionParams$3ds2sdk_release()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 23
    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->getUnavailableParams()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getMarketOrRegionRestrictionParams$3ds2sdk_release()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x1a

    .line 32
    new-array v1, v1, [Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    const/4 v2, 0x0

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PLATFORM:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    .line 33
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    .line 34
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    .line 35
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_OS_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    .line 36
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LOCALE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    .line 37
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TIME_ZONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    .line 38
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SCREEN_RESOLUTION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    .line 39
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_APP_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    .line 40
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    .line 41
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_REF_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0xa

    .line 42
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DATE_TIME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0xb

    .line 43
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SDK_TRANS_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0xc

    .line 44
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WEB_VIEW_USER_AGENT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0xd

    .line 45
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0xe

    .line 46
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_FRP_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0xf

    .line 47
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APPLY_RAMPING_RINGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x10

    .line 48
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_SKU:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x11

    .line 49
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x12

    .line 50
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x13

    .line 51
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x14

    .line 52
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MANUFACTURER_CODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x15

    .line 53
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x16

    .line 54
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x17

    .line 55
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MULTI_SIM_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x18

    .line 56
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SUBSCRIPTION_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    const/16 v2, 0x19

    .line 57
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_RTT_CALLING_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    aput-object v3, v1, v2

    .line 31
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 60
    invoke-static {}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 255
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    .line 61
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 62
    move-object v4, v0

    check-cast v4, Ljava/util/Map;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->MARKET_OR_REGION_RESTRICTION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 66
    :cond_1
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final getPermissionParams$3ds2sdk_release()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 158
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 160
    check-cast v0, Ljava/util/Map;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_MAC:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 161
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_BSSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 163
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_SSID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 165
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_NETWORK_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 167
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 169
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 171
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 173
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_P2P_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 175
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 177
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 179
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_WIFI_IS_TDLS_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 181
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LATITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_LONGITUDE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_DEVICE_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 187
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_ADDRESS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 189
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_BONDED_DEVICE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 191
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BLUETOOTH_IS_ENABLED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 193
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_DEVICE_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 196
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SUBSCRIBER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 198
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 200
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_GROUP_IDENTIFIER_L1:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 202
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_SIM_SERIAL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 204
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_ALPHA_TAG:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 206
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_VOICE_MAIL_NUMBER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 208
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 210
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 212
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 214
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 217
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MULTI_SIM_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 220
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_6GHZ_BAND_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 222
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PASSPOINT_FQDN:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 224
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_PASSPOINT_PROVIDER_FRIENDLY_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 226
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    sget-object v1, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BONDED_DEVICES_ALIAS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v1}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v1

    .line 228
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PERMISSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final getPlatformVersionParams$3ds2sdk_release()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 74
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    .line 75
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IMEI_SV:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 76
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_SERIAL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 78
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_INSTALL_NON_MARKET_APPS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 80
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_0
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_1

    .line 84
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_PHONE_COUNT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 85
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 87
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_TTY_MODE_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 89
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_WORLD_PHONE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 91
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_PREVIEW_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 93
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SDK_INT:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 95
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BUILD_VERSION_SECURITY_PATCH:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 97
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 99
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SYSTEM_VIBRATE_WHEN_RINGING:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v3

    .line 101
    sget-object v4, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v4}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    :cond_1
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    if-le v1, v2, :cond_2

    .line 105
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_SYS_PROP_SETTING_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 106
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    :cond_2
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x16

    if-ge v1, v2, :cond_3

    .line 110
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_TELE_IS_VOICE_CAPABLE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 111
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_3
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x1c

    if-ge v1, v2, :cond_4

    .line 115
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 116
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 118
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_RTT_CALLING_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 120
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    :cond_4
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x1d

    if-ge v1, v2, :cond_5

    .line 124
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 125
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SIM_SPECIFIC_CARRIER_ID_NAME:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 127
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_MULTI_SIM_SUPPORTED:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 129
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_APPLY_RAMPING_RINGER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 131
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    :cond_5
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_6

    .line 135
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SUBSCRIPTION_ID:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 136
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_BONDED_DEVICES_ALIAS:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 138
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SECURE_FRP_MODE:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 140
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    :cond_6
    iget v1, p0, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;->apiVersion:I

    const/16 v2, 0x1f

    if-ge v1, v2, :cond_7

    .line 144
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_HARDWARE_SKU:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 145
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MANUFACTURER:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 147
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->PARAM_SOC_MODEL:Lcom/stripe/android/stripe3ds2/init/DeviceParam;

    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParam;->toString()Ljava/lang/String;

    move-result-object v2

    .line 149
    sget-object v3, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->PLATFORM_VERSION:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    :cond_7
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
