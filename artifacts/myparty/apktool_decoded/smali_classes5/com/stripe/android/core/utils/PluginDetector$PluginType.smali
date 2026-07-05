.class public final enum Lcom/stripe/android/core/utils/PluginDetector$PluginType;
.super Ljava/lang/Enum;
.source "PluginDetector.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/utils/PluginDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PluginType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/core/utils/PluginDetector$PluginType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/core/utils/PluginDetector$PluginType;",
        "",
        "className",
        "",
        "pluginName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getClassName",
        "()Ljava/lang/String;",
        "getPluginName",
        "ReactNative",
        "Flutter",
        "Cordova",
        "Unity",
        "stripe-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/core/utils/PluginDetector$PluginType;

.field public static final enum Cordova:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

.field public static final enum Flutter:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

.field public static final enum ReactNative:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

.field public static final enum Unity:Lcom/stripe/android/core/utils/PluginDetector$PluginType;


# instance fields
.field private final className:Ljava/lang/String;

.field private final pluginName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/core/utils/PluginDetector$PluginType;
    .locals 4

    sget-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->ReactNative:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    sget-object v1, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->Flutter:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    sget-object v2, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->Cordova:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    sget-object v3, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->Unity:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 35
    new-instance v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    const-string v1, "com.facebook.react.bridge.NativeModule"

    const-string v2, "react-native"

    const-string v3, "ReactNative"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->ReactNative:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    .line 36
    new-instance v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    const-string v1, "io.flutter.embedding.engine.FlutterEngine"

    const-string v2, "flutter"

    const-string v3, "Flutter"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->Flutter:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    .line 37
    new-instance v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    const-string v1, "org.apache.cordova.CordovaActivity"

    const-string v2, "cordova"

    const-string v3, "Cordova"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->Cordova:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    .line 38
    new-instance v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    const-string v1, "com.unity3d.player.UnityPlayerActivity"

    const-string v2, "unity"

    const-string v3, "Unity"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->Unity:Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    invoke-static {}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->$values()[Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->$VALUES:[Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 32
    iput-object p3, p0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->className:Ljava/lang/String;

    .line 33
    iput-object p4, p0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->pluginName:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/core/utils/PluginDetector$PluginType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/core/utils/PluginDetector$PluginType;
    .locals 1

    const-class v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 39
    check-cast p0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/core/utils/PluginDetector$PluginType;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->$VALUES:[Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 39
    check-cast v0, [Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    return-object v0
.end method


# virtual methods
.method public final getClassName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->pluginName:Ljava/lang/String;

    return-object v0
.end method
