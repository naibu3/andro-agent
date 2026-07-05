.class public final enum Lio/qonversion/sandwich/AutomationsEventListener$Event;
.super Ljava/lang/Enum;
.source "AutomationsEventListener.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/qonversion/sandwich/AutomationsEventListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Event"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/qonversion/sandwich/AutomationsEventListener$Event;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/qonversion/sandwich/AutomationsEventListener$Event;",
        "",
        "key",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "ScreenShown",
        "ActionStarted",
        "ActionFailed",
        "ActionFinished",
        "AutomationsFinished",
        "sandwich_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lio/qonversion/sandwich/AutomationsEventListener$Event;

.field public static final enum ActionFailed:Lio/qonversion/sandwich/AutomationsEventListener$Event;

.field public static final enum ActionFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

.field public static final enum ActionStarted:Lio/qonversion/sandwich/AutomationsEventListener$Event;

.field public static final enum AutomationsFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

.field public static final enum ScreenShown:Lio/qonversion/sandwich/AutomationsEventListener$Event;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/qonversion/sandwich/AutomationsEventListener$Event;
    .locals 5

    sget-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ScreenShown:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    sget-object v1, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionStarted:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    sget-object v2, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionFailed:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    sget-object v3, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    sget-object v4, Lio/qonversion/sandwich/AutomationsEventListener$Event;->AutomationsFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    filled-new-array {v0, v1, v2, v3, v4}, [Lio/qonversion/sandwich/AutomationsEventListener$Event;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 8
    new-instance v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    const/4 v1, 0x0

    const-string v2, "automations_screen_shown"

    const-string v3, "ScreenShown"

    invoke-direct {v0, v3, v1, v2}, Lio/qonversion/sandwich/AutomationsEventListener$Event;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ScreenShown:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    .line 9
    new-instance v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    const/4 v1, 0x1

    const-string v2, "automations_action_started"

    const-string v3, "ActionStarted"

    invoke-direct {v0, v3, v1, v2}, Lio/qonversion/sandwich/AutomationsEventListener$Event;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionStarted:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    .line 10
    new-instance v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    const/4 v1, 0x2

    const-string v2, "automations_action_failed"

    const-string v3, "ActionFailed"

    invoke-direct {v0, v3, v1, v2}, Lio/qonversion/sandwich/AutomationsEventListener$Event;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionFailed:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    .line 11
    new-instance v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    const/4 v1, 0x3

    const-string v2, "automations_action_finished"

    const-string v3, "ActionFinished"

    invoke-direct {v0, v3, v1, v2}, Lio/qonversion/sandwich/AutomationsEventListener$Event;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->ActionFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    .line 12
    new-instance v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    const/4 v1, 0x4

    const-string v2, "automations_finished"

    const-string v3, "AutomationsFinished"

    invoke-direct {v0, v3, v1, v2}, Lio/qonversion/sandwich/AutomationsEventListener$Event;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->AutomationsFinished:Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-static {}, Lio/qonversion/sandwich/AutomationsEventListener$Event;->$values()[Lio/qonversion/sandwich/AutomationsEventListener$Event;

    move-result-object v0

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->$VALUES:[Lio/qonversion/sandwich/AutomationsEventListener$Event;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->key:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lio/qonversion/sandwich/AutomationsEventListener$Event;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/qonversion/sandwich/AutomationsEventListener$Event;
    .locals 1

    const-class v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/qonversion/sandwich/AutomationsEventListener$Event;

    return-object p0
.end method

.method public static values()[Lio/qonversion/sandwich/AutomationsEventListener$Event;
    .locals 1

    sget-object v0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->$VALUES:[Lio/qonversion/sandwich/AutomationsEventListener$Event;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/qonversion/sandwich/AutomationsEventListener$Event;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsEventListener$Event;->key:Ljava/lang/String;

    return-object v0
.end method
