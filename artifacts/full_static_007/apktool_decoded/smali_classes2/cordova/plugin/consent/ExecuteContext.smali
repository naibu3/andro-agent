.class public Lcordova/plugin/consent/ExecuteContext;
.super Ljava/lang/Object;
.source "ExecuteContext.java"


# static fields
.field public static plugin:Lcordova/plugin/consent/Consent;


# instance fields
.field public final actionKey:Ljava/lang/String;

.field public final args:Lorg/json/JSONArray;

.field public final callbackContext:Lorg/apache/cordova/CallbackContext;

.field public final opts:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcordova/plugin/consent/ExecuteContext;->actionKey:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcordova/plugin/consent/ExecuteContext;->args:Lorg/json/JSONArray;

    .line 24
    iput-object p3, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    const/4 p1, 0x0

    .line 25
    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    return-void
.end method

.method private getActivity()Landroid/app/Activity;
    .locals 1

    .line 75
    sget-object v0, Lcordova/plugin/consent/ExecuteContext;->plugin:Lcordova/plugin/consent/Consent;

    iget-object v0, v0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public optConsentDebugSettings()Lcom/google/android/ump/ConsentDebugSettings;
    .locals 5

    .line 49
    new-instance v0, Lcom/google/android/ump/ConsentDebugSettings$Builder;

    invoke-direct {p0}, Lcordova/plugin/consent/ExecuteContext;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/ump/ConsentDebugSettings$Builder;-><init>(Landroid/content/Context;)V

    .line 51
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    if-nez v1, :cond_0

    .line 52
    invoke-virtual {v0}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->build()Lcom/google/android/ump/ConsentDebugSettings;

    move-result-object v0

    return-object v0

    .line 55
    :cond_0
    const-string v2, "debugGeography"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->setDebugGeography(I)Lcom/google/android/ump/ConsentDebugSettings$Builder;

    .line 59
    :cond_1
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    const-string v2, "testDeviceIds"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 60
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    .line 62
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 63
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 64
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 65
    invoke-virtual {v0, v3}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->addTestDeviceHashedId(Ljava/lang/String;)Lcom/google/android/ump/ConsentDebugSettings$Builder;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->build()Lcom/google/android/ump/ConsentDebugSettings;

    move-result-object v0

    return-object v0
.end method

.method public optConsentRequestParameters()Lcom/google/android/ump/ConsentRequestParameters;
    .locals 3

    .line 33
    new-instance v0, Lcom/google/android/ump/ConsentRequestParameters$Builder;

    invoke-direct {v0}, Lcom/google/android/ump/ConsentRequestParameters$Builder;-><init>()V

    .line 35
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    if-eqz v1, :cond_2

    .line 36
    const-string v2, "tagForUnderAgeOfConsent"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 37
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->setTagForUnderAgeOfConsent(Z)Lcom/google/android/ump/ConsentRequestParameters$Builder;

    .line 40
    :cond_0
    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    const-string v2, "debugGeography"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    const-string v2, "testDeviceIds"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcordova/plugin/consent/ExecuteContext;->optConsentDebugSettings()Lcom/google/android/ump/ConsentDebugSettings;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->setConsentDebugSettings(Lcom/google/android/ump/ConsentDebugSettings;)Lcom/google/android/ump/ConsentRequestParameters$Builder;

    .line 45
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->build()Lcom/google/android/ump/ConsentRequestParameters;

    move-result-object v0

    return-object v0
.end method

.method public optId()I
    .locals 2

    .line 29
    iget-object v0, p0, Lcordova/plugin/consent/ExecuteContext;->opts:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    const-string v1, "id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method
