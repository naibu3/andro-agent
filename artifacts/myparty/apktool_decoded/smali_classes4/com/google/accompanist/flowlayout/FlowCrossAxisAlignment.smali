.class public final enum Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;
.super Ljava/lang/Enum;
.source "Flow.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\naccompanist/FlowCrossAxisAlignment is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;",
        "",
        "(Ljava/lang/String;I)V",
        "Center",
        "Start",
        "End",
        "flowlayout_release"
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

.field private static final synthetic $VALUES:[Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

.field public static final enum Center:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

.field public static final enum End:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

.field public static final enum Start:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;


# direct methods
.method private static final synthetic $values()[Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;
    .locals 3

    sget-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->Center:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    sget-object v1, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->Start:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    sget-object v2, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->End:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    filled-new-array {v0, v1, v2}, [Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 145
    new-instance v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    const-string v1, "Center"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->Center:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    .line 149
    new-instance v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    const-string v1, "Start"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->Start:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    .line 153
    new-instance v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    const-string v1, "End"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->End:Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    invoke-static {}, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->$values()[Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    move-result-object v0

    sput-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->$VALUES:[Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 135
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;
    .locals 1

    const-class v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    return-object p0
.end method

.method public static values()[Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;
    .locals 1

    sget-object v0, Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;->$VALUES:[Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;

    return-object v0
.end method
