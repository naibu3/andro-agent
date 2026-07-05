.class public final enum Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
.super Ljava/lang/Enum;
.source "ExecutionThread.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

.field public static final enum MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

.field public static final enum UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

.field public static final enum WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;


# direct methods
.method private static synthetic $values()[Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .locals 3

    .line 3
    sget-object v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    sget-object v1, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    sget-object v2, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    filled-new-array {v0, v1, v2}, [Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    const-string v1, "MAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->MAIN:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    new-instance v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    const-string v1, "UI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->UI:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    new-instance v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    const-string v1, "WORKER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->WORKER:Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    .line 3
    invoke-static {}, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->$values()[Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    move-result-object v0

    sput-object v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->$VALUES:[Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .locals 1

    .line 3
    const-class v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    return-object p0
.end method

.method public static values()[Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;
    .locals 1

    .line 3
    sget-object v0, Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->$VALUES:[Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    invoke-virtual {v0}, [Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appfeel/cordova/annotated/android/plugin/ExecutionThread;

    return-object v0
.end method
