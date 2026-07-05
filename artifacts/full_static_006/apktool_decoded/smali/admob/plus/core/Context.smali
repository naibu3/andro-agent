.class public interface abstract Ladmob/plus/core/Context;
.super Ljava/lang/Object;
.source "Context.java"


# direct methods
.method public static intFromBool(Ladmob/plus/core/Context;Ljava/lang/String;III)Ljava/lang/Integer;
    .locals 1

    .line 23
    invoke-interface {p0, p1}, Ladmob/plus/core/Context;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 24
    :cond_0
    invoke-interface {p0, p1}, Ladmob/plus/core/Context;->optBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    if-nez p0, :cond_1

    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    move p3, p4

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public configure(Ladmob/plus/core/Helper;)V
    .locals 1

    .line 174
    invoke-interface {p0}, Ladmob/plus/core/Context;->optAppMuted()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->setAppMuted(Z)V

    .line 178
    :cond_0
    invoke-interface {p0}, Ladmob/plus/core/Context;->optAppVolume()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 180
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->setAppVolume(F)V

    .line 182
    :cond_1
    invoke-interface {p0}, Ladmob/plus/core/Context;->optRequestConfiguration()Lcom/google/android/gms/ads/RequestConfiguration;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->setRequestConfiguration(Lcom/google/android/gms/ads/RequestConfiguration;)V

    .line 183
    invoke-virtual {p1}, Ladmob/plus/core/Helper;->configForTestLab()V

    .line 184
    invoke-interface {p0}, Ladmob/plus/core/Context;->resolve()V

    return-void
.end method

.method public abstract has(Ljava/lang/String;)Z
.end method

.method public abstract opt(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public optAd()Ladmob/plus/core/Ad;
    .locals 1

    .line 86
    invoke-interface {p0}, Ladmob/plus/core/Context;->optId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ladmob/plus/core/Helper;->getAd(Ljava/lang/String;)Ladmob/plus/core/Ad;

    move-result-object v0

    return-object v0
.end method

.method public optAdOrError()Ladmob/plus/core/Ad;
    .locals 2

    .line 91
    invoke-interface {p0}, Ladmob/plus/core/Context;->optAd()Ladmob/plus/core/Ad;

    move-result-object v0

    if-nez v0, :cond_0

    .line 93
    const-string v1, "Ad not found"

    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public optAdRequest()Lcom/google/android/gms/ads/AdRequest;
    .locals 4

    .line 120
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    .line 121
    const-string v1, "contentUrl"

    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 122
    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->setContentUrl(Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    .line 124
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 125
    const-string v2, "npa"

    invoke-interface {p0, v2}, Ladmob/plus/core/Context;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 126
    invoke-interface {p0, v2}, Ladmob/plus/core/Context;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    :cond_1
    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    return-object v0
.end method

.method public optAdUnitID()Ljava/lang/String;
    .locals 1

    .line 100
    const-string v0, "adUnitId"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public optAppMuted()Ljava/lang/Boolean;
    .locals 1

    .line 105
    const-string v0, "appMuted"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->optBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public optAppVolume()Ljava/lang/Float;
    .locals 1

    .line 110
    const-string v0, "appVolume"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->optFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public abstract optBoolean(Ljava/lang/String;)Ljava/lang/Boolean;
.end method

.method public optDouble(Ljava/lang/String;D)D
    .locals 0

    .line 41
    invoke-interface {p0, p1}, Ladmob/plus/core/Context;->optDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_0

    return-wide p2

    .line 43
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    return-wide p1
.end method

.method public abstract optDouble(Ljava/lang/String;)Ljava/lang/Double;
.end method

.method public optFloat(Ljava/lang/String;)Ljava/lang/Float;
    .locals 0

    .line 48
    invoke-interface {p0, p1}, Ladmob/plus/core/Context;->optDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 50
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public optId()Ljava/lang/String;
    .locals 1

    .line 81
    const-string v0, "id"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract optInt(Ljava/lang/String;)Ljava/lang/Integer;
.end method

.method public abstract optObject(Ljava/lang/String;)Lorg/json/JSONObject;
.end method

.method public optPosition()Ljava/lang/String;
    .locals 1

    .line 115
    const-string v0, "position"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public optRequestConfiguration()Lcom/google/android/gms/ads/RequestConfiguration;
    .locals 5

    .line 133
    new-instance v0, Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;-><init>()V

    .line 134
    const-string v1, "maxAdContentRating"

    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 135
    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setMaxAdContentRating(Ljava/lang/String;)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 137
    :cond_0
    const-string v1, "tagForChildDirectedTreatment"

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v1, v2, v3, v4}, Ladmob/plus/core/Context;->intFromBool(Ladmob/plus/core/Context;Ljava/lang/String;III)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 142
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTagForChildDirectedTreatment(I)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 144
    :cond_1
    const-string v1, "tagForUnderAgeOfConsent"

    invoke-static {p0, v1, v2, v3, v4}, Ladmob/plus/core/Context;->intFromBool(Ladmob/plus/core/Context;Ljava/lang/String;III)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 149
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTagForUnderAgeOfConsent(I)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 151
    :cond_2
    const-string v1, "testDeviceIds"

    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 152
    invoke-interface {p0, v1}, Ladmob/plus/core/Context;->optStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTestDeviceIds(Ljava/util/List;)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 154
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->build()Lcom/google/android/gms/ads/RequestConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public optServerSideVerificationOptions()Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;
    .locals 4

    .line 160
    const-string v0, "serverSideVerification"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->optObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    new-instance v1, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;-><init>()V

    .line 164
    const-string v2, "customData"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 165
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;->setCustomData(Ljava/lang/String;)Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;

    .line 167
    :cond_1
    const-string v2, "userId"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 168
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;->setUserId(Ljava/lang/String;)Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;

    .line 170
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;->build()Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;

    move-result-object v0

    return-object v0
.end method

.method public abstract optString(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract optStringList(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public reject()V
    .locals 1

    .line 72
    const-string v0, "unknown error"

    invoke-interface {p0, v0}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    return-void
.end method

.method public reject(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 0

    .line 76
    invoke-virtual {p1}, Lcom/google/android/gms/ads/LoadAdError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ladmob/plus/core/Context;->reject(Ljava/lang/String;)V

    return-void
.end method

.method public abstract reject(Ljava/lang/String;)V
.end method

.method public abstract resolve()V
.end method

.method public abstract resolve(Z)V
.end method
