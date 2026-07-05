.class public interface abstract Lcom/qonversion/android/sdk/Qonversion;
.super Ljava/lang/Object;
.source "Qonversion.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/Qonversion$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 D2\u00020\u0001:\u0001DJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH&J$\u0010\u000c\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0012H&J\u001e\u0010\u0013\u001a\u00020\u00032\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0007\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u001bH&J\u0008\u0010\u001c\u001a\u00020\u001dH&J\u0008\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\"H&J \u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u0007\u001a\u00020\u0012H\'J(\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020\u0012H&J \u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u0012H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020-H&J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020-H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u000200H&J&\u0010/\u001a\u00020\u00032\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u00102\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u000200H&J\u0010\u00103\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0012H&J\u0018\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u000209H&J\u0018\u0010:\u001a\u00020\u00032\u0006\u00105\u001a\u00020;2\u0006\u00106\u001a\u00020\u0005H&J\u0008\u0010<\u001a\u00020\u0003H&J\u0008\u0010=\u001a\u00020\u0003H&J \u0010>\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u0007\u001a\u00020\u0012H\'J(\u0010>\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020\u0012H&J\u0010\u0010A\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u001bH&J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020CH&\u00a8\u0006E"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/Qonversion;",
        "",
        "attachUserToExperiment",
        "",
        "experimentId",
        "",
        "groupId",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "attribution",
        "data",
        "",
        "provider",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "checkEntitlements",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "checkTrialIntroEligibility",
        "productIds",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "identify",
        "userID",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "isFallbackFileAccessible",
        "",
        "logout",
        "offerings",
        "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;",
        "products",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "purchase",
        "context",
        "Landroid/app/Activity;",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "options",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "remoteConfig",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "contextKey",
        "remoteConfigList",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "includeEmptyContextKey",
        "restore",
        "setCustomUserProperty",
        "key",
        "value",
        "setEntitlementsUpdateListener",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "setUserProperty",
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        "syncHistoricalData",
        "syncPurchases",
        "updatePurchase",
        "purchaseUpdateModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "userInfo",
        "userProperties",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/Qonversion$Companion;->$$INSTANCE:Lcom/qonversion/android/sdk/Qonversion$Companion;

    sput-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    return-void
.end method

.method public static getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    move-result-object v0

    return-object v0
.end method

.method public static initialize(Lcom/qonversion/android/sdk/QonversionConfig;)Lcom/qonversion/android/sdk/Qonversion;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-virtual {v0, p0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->initialize(Lcom/qonversion/android/sdk/QonversionConfig;)Lcom/qonversion/android/sdk/Qonversion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
.end method

.method public abstract attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
.end method

.method public abstract attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
            ")V"
        }
    .end annotation
.end method

.method public abstract checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
.end method

.method public abstract checkTrialIntroEligibility(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
.end method

.method public abstract detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
.end method

.method public abstract identify(Ljava/lang/String;)V
.end method

.method public abstract identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
.end method

.method public abstract isFallbackFileAccessible()Z
.end method

.method public abstract logout()V
.end method

.method public abstract offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
.end method

.method public abstract products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V
.end method

.method public abstract purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the new purchase() method"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "purchase(context, TODO(\"pass product here\"), callback)"
            imports = {}
        .end subannotation
    .end annotation
.end method

.method public abstract purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
.end method

.method public abstract purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
.end method

.method public abstract remoteConfig(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
.end method

.method public abstract remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
.end method

.method public abstract remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
.end method

.method public abstract remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
.end method

.method public abstract setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
.end method

.method public abstract setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
.end method

.method public abstract syncHistoricalData()V
.end method

.method public abstract syncPurchases()V
.end method

.method public abstract updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the new updatePurchase() method"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "updatePurchase(context, TODO(\"pass product here\"), TODO(\"pass purchase options here\"), callback)"
            imports = {}
        .end subannotation
    .end annotation
.end method

.method public abstract updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
.end method

.method public abstract userInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
.end method

.method public abstract userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V
.end method
