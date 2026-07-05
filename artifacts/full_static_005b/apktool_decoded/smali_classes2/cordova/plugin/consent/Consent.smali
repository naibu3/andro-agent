.class public Lcordova/plugin/consent/Consent;
.super Lorg/apache/cordova/CordovaPlugin;
.source "Consent.java"


# static fields
.field private static final forms:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/ump/ConsentForm;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final eventQueue:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/apache/cordova/PluginResult;",
            ">;"
        }
    .end annotation
.end field

.field private readyCallbackContext:Lorg/apache/cordova/CallbackContext;


# direct methods
.method public static synthetic $r8$lambda$wRoK7vyvnrwZfucY9VU1JDn_0bE(Lorg/apache/cordova/CallbackContext;)V
    .locals 0

    invoke-virtual {p0}, Lorg/apache/cordova/CallbackContext;->success()V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcordova/plugin/consent/Consent;->forms:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcordova/plugin/consent/Consent;->eventQueue:Ljava/util/ArrayList;

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcordova/plugin/consent/Consent;->TAG:Ljava/lang/String;

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcordova/plugin/consent/Consent;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    return-void
.end method

.method private executeCanRequestAds(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 1

    .line 123
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentInformation()Lcom/google/android/ump/ConsentInformation;

    move-result-object v0

    .line 124
    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->canRequestAds()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    .line 125
    iget-object p1, p1, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeLoadAndShowIfRequired(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 2

    .line 130
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda0;-><init>(Lcordova/plugin/consent/Consent;Lcordova/plugin/consent/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeLoadForm(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 2

    .line 164
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda2;-><init>(Lcordova/plugin/consent/Consent;Lcordova/plugin/consent/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executePrivacyOptionsRequirementStatus(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 4

    .line 115
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentInformation()Lcom/google/android/ump/ConsentInformation;

    move-result-object v0

    .line 116
    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->getPrivacyOptionsRequirementStatus()Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->name()Ljava/lang/String;

    move-result-object v0

    .line 117
    iget-object v1, p0, Lcordova/plugin/consent/Consent;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "privacy status: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    iget-object p1, p1, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeReady(Lorg/apache/cordova/CallbackContext;)Z
    .locals 2

    .line 89
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    if-nez v0, :cond_1

    .line 90
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->eventQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/cordova/PluginResult;

    .line 91
    invoke-virtual {p1, v1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto :goto_0

    .line 93
    :cond_0
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->eventQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    .line 95
    :cond_1
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->TAG:Ljava/lang/String;

    const-string v1, "Ready action should only be called once."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    :goto_1
    iput-object p1, p0, Lcordova/plugin/consent/Consent;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    .line 98
    const-string p1, "consent.ready"

    invoke-virtual {p0, p1}, Lcordova/plugin/consent/Consent;->emit(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeRequestInfoUpdate(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 5

    .line 103
    invoke-virtual {p1}, Lcordova/plugin/consent/ExecuteContext;->optConsentRequestParameters()Lcom/google/android/ump/ConsentRequestParameters;

    move-result-object v0

    .line 104
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentInformation()Lcom/google/android/ump/ConsentInformation;

    move-result-object v1

    .line 105
    iget-object v2, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 106
    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    iget-object v3, p1, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    .line 108
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda7;

    invoke-direct {v4, v3}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda7;-><init>(Lorg/apache/cordova/CallbackContext;)V

    new-instance v3, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda8;

    invoke-direct {v3, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda8;-><init>(Lcordova/plugin/consent/ExecuteContext;)V

    .line 105
    invoke-interface {v1, v2, v0, v4, v3}, Lcom/google/android/ump/ConsentInformation;->requestConsentInfoUpdate(Landroid/app/Activity;Lcom/google/android/ump/ConsentRequestParameters;Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateSuccessListener;Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateFailureListener;)V

    const/4 p1, 0x1

    return p1
.end method

.method private executeShowForm(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 4

    .line 183
    sget-object v0, Lcordova/plugin/consent/Consent;->forms:Landroid/util/SparseArray;

    invoke-virtual {p1}, Lcordova/plugin/consent/ExecuteContext;->optId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/ump/ConsentForm;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 185
    iget-object p1, p1, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    const-string v0, "Consent form not found or already used."

    invoke-virtual {p1, v0}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    return v1

    .line 189
    :cond_0
    iget-object v2, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v2}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v2

    new-instance v3, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;

    invoke-direct {v3, p0, v0, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda1;-><init>(Lcordova/plugin/consent/Consent;Lcom/google/android/ump/ConsentForm;Lcordova/plugin/consent/ExecuteContext;)V

    invoke-virtual {v2, v3}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return v1
.end method

.method private executeShowPrivacyOptionsForm(Lcordova/plugin/consent/ExecuteContext;)Z
    .locals 2

    .line 148
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda9;

    invoke-direct {v1, p0, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda9;-><init>(Lcordova/plugin/consent/Consent;Lcordova/plugin/consent/ExecuteContext;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AppCompatActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private getConsentInformation()Lcom/google/android/ump/ConsentInformation;
    .locals 1

    .line 205
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/ump/UserMessagingPlatform;->getConsentInformation(Landroid/content/Context;)Lcom/google/android/ump/ConsentInformation;

    move-result-object v0

    return-object v0
.end method

.method private getConsentStatus()I
    .locals 3

    .line 77
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentInformation()Lcom/google/android/ump/ConsentInformation;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->getConsentStatus()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    return v2

    :cond_1
    return v1
.end method

.method static synthetic lambda$executeLoadAndShowIfRequired$1(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/FormError;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 135
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 137
    :cond_0
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    const-string p1, "success"

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic lambda$executeLoadForm$5(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/ConsentForm;)V
    .locals 2

    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 169
    sget-object v1, Lcordova/plugin/consent/Consent;->forms:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 170
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p0, v0}, Lorg/apache/cordova/CallbackContext;->success(I)V

    return-void
.end method

.method static synthetic lambda$executeLoadForm$6(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/FormError;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 174
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$executeRequestInfoUpdate$0(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/FormError;)V
    .locals 0

    .line 109
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic lambda$executeShowForm$8(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/FormError;)V
    .locals 2

    .line 193
    sget-object v0, Lcordova/plugin/consent/Consent;->forms:Landroid/util/SparseArray;

    invoke-virtual {p0}, Lcordova/plugin/consent/ExecuteContext;->optId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    if-nez p1, :cond_0

    .line 195
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    invoke-virtual {p0}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_0

    .line 197
    :cond_0
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic lambda$executeShowPrivacyOptionsForm$3(Lcordova/plugin/consent/ExecuteContext;Lcom/google/android/ump/FormError;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 153
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 155
    :cond_0
    iget-object p0, p0, Lcordova/plugin/consent/ExecuteContext;->callbackContext:Lorg/apache/cordova/CallbackContext;

    const-string p1, "success"

    invoke-virtual {p0, p1}, Lorg/apache/cordova/CallbackContext;->success(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 215
    invoke-virtual {p0, p1, v0}, Lcordova/plugin/consent/Consent;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public emit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 219
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 221
    :try_start_0
    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    const-string p1, "data"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 224
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 227
    :goto_0
    new-instance p1, Lorg/apache/cordova/PluginResult;

    sget-object p2, Lorg/apache/cordova/PluginResult$Status;->OK:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {p1, p2, v0}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONObject;)V

    const/4 p2, 0x1

    .line 228
    invoke-virtual {p1, p2}, Lorg/apache/cordova/PluginResult;->setKeepCallback(Z)V

    .line 229
    iget-object p2, p0, Lcordova/plugin/consent/Consent;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    if-nez p2, :cond_0

    .line 230
    iget-object p2, p0, Lcordova/plugin/consent/Consent;->eventQueue:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 232
    :cond_0
    invoke-virtual {p2, p1}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    :goto_1
    return-void
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 5

    .line 39
    new-instance v0, Lcordova/plugin/consent/ExecuteContext;

    invoke-direct {v0, p1, p2, p3}, Lcordova/plugin/consent/ExecuteContext;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V

    .line 40
    iget-object p2, p0, Lcordova/plugin/consent/Consent;->TAG:Ljava/lang/String;

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string p2, "loadForm"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string p2, "loadAndShowIfRequired"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string p2, "privacyOptionsRequirementStatus"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string p2, "requestInfoUpdate"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_4
    const-string p2, "reset"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_5
    const-string p2, "ready"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_6
    const-string p2, "showForm"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_7
    const-string p2, "getFormStatus"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_8
    const-string p2, "getConsentStatus"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move v4, v1

    goto :goto_0

    :sswitch_9
    const-string p2, "showPrivacyOptionsForm"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    move v4, v3

    goto :goto_0

    :sswitch_a
    const-string p2, "canRequestAds"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    move v4, v2

    :goto_0
    packed-switch v4, :pswitch_data_0

    return v2

    .line 54
    :pswitch_0
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executeLoadForm(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    .line 66
    :pswitch_1
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executeLoadAndShowIfRequired(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    .line 62
    :pswitch_2
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executePrivacyOptionsRequirementStatus(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    .line 52
    :pswitch_3
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executeRequestInfoUpdate(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    .line 58
    :pswitch_4
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentInformation()Lcom/google/android/ump/ConsentInformation;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/ump/ConsentInformation;->reset()V

    .line 59
    invoke-virtual {p3}, Lorg/apache/cordova/CallbackContext;->success()V

    goto :goto_1

    .line 44
    :pswitch_5
    invoke-direct {p0, p3}, Lcordova/plugin/consent/Consent;->executeReady(Lorg/apache/cordova/CallbackContext;)Z

    move-result p1

    return p1

    .line 56
    :pswitch_6
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executeShowForm(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    .line 49
    :pswitch_7
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentInformation()Lcom/google/android/ump/ConsentInformation;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/ump/ConsentInformation;->isConsentFormAvailable()Z

    move-result p1

    if-eqz p1, :cond_b

    move v1, v3

    :cond_b
    invoke-virtual {p3, v1}, Lorg/apache/cordova/CallbackContext;->success(I)V

    goto :goto_1

    .line 46
    :pswitch_8
    invoke-direct {p0}, Lcordova/plugin/consent/Consent;->getConsentStatus()I

    move-result p1

    invoke-virtual {p3, p1}, Lorg/apache/cordova/CallbackContext;->success(I)V

    :goto_1
    return v3

    .line 68
    :pswitch_9
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executeShowPrivacyOptionsForm(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    .line 64
    :pswitch_a
    invoke-direct {p0, v0}, Lcordova/plugin/consent/Consent;->executeCanRequestAds(Lcordova/plugin/consent/ExecuteContext;)Z

    move-result p1

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x65b8586f -> :sswitch_a
        -0x5d7a4649 -> :sswitch_9
        -0x4a64c30a -> :sswitch_8
        -0x16502234 -> :sswitch_7
        -0x14386a9f -> :sswitch_6
        0x675d9a3 -> :sswitch_5
        0x6761d4f -> :sswitch_4
        0x1dd1f706 -> :sswitch_3
        0x2dab52bf -> :sswitch_2
        0x4cdcf42a -> :sswitch_1
        0x6dfb62ca -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V
    .locals 0

    .line 33
    invoke-super {p0, p1, p2}, Lorg/apache/cordova/CordovaPlugin;->initialize(Lorg/apache/cordova/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 34
    sput-object p0, Lcordova/plugin/consent/ExecuteContext;->plugin:Lcordova/plugin/consent/Consent;

    return-void
.end method

.method synthetic lambda$executeLoadAndShowIfRequired$2$cordova-plugin-consent-Consent(Lcordova/plugin/consent/ExecuteContext;)V
    .locals 2

    .line 131
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 132
    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda6;

    invoke-direct {v1, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda6;-><init>(Lcordova/plugin/consent/ExecuteContext;)V

    .line 131
    invoke-static {v0, v1}, Lcom/google/android/ump/UserMessagingPlatform;->loadAndShowConsentFormIfRequired(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    return-void
.end method

.method synthetic lambda$executeLoadForm$7$cordova-plugin-consent-Consent(Lcordova/plugin/consent/ExecuteContext;)V
    .locals 3

    .line 165
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 166
    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda4;

    invoke-direct {v1, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda4;-><init>(Lcordova/plugin/consent/ExecuteContext;)V

    new-instance v2, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda5;

    invoke-direct {v2, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda5;-><init>(Lcordova/plugin/consent/ExecuteContext;)V

    .line 165
    invoke-static {v0, v1, v2}, Lcom/google/android/ump/UserMessagingPlatform;->loadConsentForm(Landroid/content/Context;Lcom/google/android/ump/UserMessagingPlatform$OnConsentFormLoadSuccessListener;Lcom/google/android/ump/UserMessagingPlatform$OnConsentFormLoadFailureListener;)V

    return-void
.end method

.method synthetic lambda$executeShowForm$9$cordova-plugin-consent-Consent(Lcom/google/android/ump/ConsentForm;Lcordova/plugin/consent/ExecuteContext;)V
    .locals 2

    .line 190
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 191
    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda3;

    invoke-direct {v1, p2}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda3;-><init>(Lcordova/plugin/consent/ExecuteContext;)V

    .line 190
    invoke-interface {p1, v0, v1}, Lcom/google/android/ump/ConsentForm;->show(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    return-void
.end method

.method synthetic lambda$executeShowPrivacyOptionsForm$4$cordova-plugin-consent-Consent(Lcordova/plugin/consent/ExecuteContext;)V
    .locals 2

    .line 149
    iget-object v0, p0, Lcordova/plugin/consent/Consent;->cordova:Lorg/apache/cordova/CordovaInterface;

    .line 150
    invoke-interface {v0}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroidx/appcompat/app/AppCompatActivity;

    move-result-object v0

    new-instance v1, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda10;

    invoke-direct {v1, p1}, Lcordova/plugin/consent/Consent$$ExternalSyntheticLambda10;-><init>(Lcordova/plugin/consent/ExecuteContext;)V

    .line 149
    invoke-static {v0, v1}, Lcom/google/android/ump/UserMessagingPlatform;->showPrivacyOptionsForm(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 210
    iput-object v0, p0, Lcordova/plugin/consent/Consent;->readyCallbackContext:Lorg/apache/cordova/CallbackContext;

    .line 211
    invoke-super {p0}, Lorg/apache/cordova/CordovaPlugin;->onDestroy()V

    return-void
.end method
