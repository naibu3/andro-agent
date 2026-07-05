.class public final enum Lby/chemerisuk/cordova/support/ExecutionThread;
.super Ljava/lang/Enum;
.source "ExecutionThread.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lby/chemerisuk/cordova/support/ExecutionThread;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lby/chemerisuk/cordova/support/ExecutionThread;

.field public static final enum MAIN:Lby/chemerisuk/cordova/support/ExecutionThread;

.field public static final enum UI:Lby/chemerisuk/cordova/support/ExecutionThread;

.field public static final enum WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;


# direct methods
.method private static synthetic $values()[Lby/chemerisuk/cordova/support/ExecutionThread;
    .locals 3

    .line 3
    sget-object v0, Lby/chemerisuk/cordova/support/ExecutionThread;->MAIN:Lby/chemerisuk/cordova/support/ExecutionThread;

    sget-object v1, Lby/chemerisuk/cordova/support/ExecutionThread;->UI:Lby/chemerisuk/cordova/support/ExecutionThread;

    sget-object v2, Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;

    filled-new-array {v0, v1, v2}, [Lby/chemerisuk/cordova/support/ExecutionThread;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lby/chemerisuk/cordova/support/ExecutionThread;

    const-string v1, "MAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lby/chemerisuk/cordova/support/ExecutionThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lby/chemerisuk/cordova/support/ExecutionThread;->MAIN:Lby/chemerisuk/cordova/support/ExecutionThread;

    new-instance v0, Lby/chemerisuk/cordova/support/ExecutionThread;

    const-string v1, "UI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lby/chemerisuk/cordova/support/ExecutionThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lby/chemerisuk/cordova/support/ExecutionThread;->UI:Lby/chemerisuk/cordova/support/ExecutionThread;

    new-instance v0, Lby/chemerisuk/cordova/support/ExecutionThread;

    const-string v1, "WORKER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lby/chemerisuk/cordova/support/ExecutionThread;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lby/chemerisuk/cordova/support/ExecutionThread;->WORKER:Lby/chemerisuk/cordova/support/ExecutionThread;

    .line 3
    invoke-static {}, Lby/chemerisuk/cordova/support/ExecutionThread;->$values()[Lby/chemerisuk/cordova/support/ExecutionThread;

    move-result-object v0

    sput-object v0, Lby/chemerisuk/cordova/support/ExecutionThread;->$VALUES:[Lby/chemerisuk/cordova/support/ExecutionThread;

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

.method public static valueOf(Ljava/lang/String;)Lby/chemerisuk/cordova/support/ExecutionThread;
    .locals 1

    .line 3
    const-class v0, Lby/chemerisuk/cordova/support/ExecutionThread;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lby/chemerisuk/cordova/support/ExecutionThread;

    return-object p0
.end method

.method public static values()[Lby/chemerisuk/cordova/support/ExecutionThread;
    .locals 1

    .line 3
    sget-object v0, Lby/chemerisuk/cordova/support/ExecutionThread;->$VALUES:[Lby/chemerisuk/cordova/support/ExecutionThread;

    invoke-virtual {v0}, [Lby/chemerisuk/cordova/support/ExecutionThread;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lby/chemerisuk/cordova/support/ExecutionThread;

    return-object v0
.end method
