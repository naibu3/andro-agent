.class public final enum Lcom/google/accompanist/flowlayout/MainAxisAlignment;
.super Ljava/lang/Enum;
.source "Flow.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/accompanist/flowlayout/MainAxisAlignment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/google/accompanist/flowlayout/MainAxisAlignment;",
        "",
        "arrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V",
        "getArrangement$flowlayout_release",
        "()Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "Center",
        "Start",
        "End",
        "SpaceEvenly",
        "SpaceBetween",
        "SpaceAround",
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

.field private static final synthetic $VALUES:[Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field public static final enum Center:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field public static final enum End:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field public static final enum SpaceAround:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field public static final enum SpaceBetween:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field public static final enum SpaceEvenly:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

.field public static final enum Start:Lcom/google/accompanist/flowlayout/MainAxisAlignment;


# instance fields
.field private final arrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;


# direct methods
.method private static final synthetic $values()[Lcom/google/accompanist/flowlayout/MainAxisAlignment;
    .locals 6

    sget-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->Center:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->Start:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v2, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->End:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v3, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->SpaceEvenly:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v4, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->SpaceBetween:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v5, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->SpaceAround:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    filled-new-array/range {v0 .. v5}, [Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 348
    new-instance v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    const-string v2, "Center"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;-><init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->Center:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    .line 353
    new-instance v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v1

    const-string v2, "Start"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;-><init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->Start:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    .line 358
    new-instance v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getBottom()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v1

    const-string v2, "End"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;-><init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->End:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    .line 364
    new-instance v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceEvenly()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    const-string v2, "SpaceEvenly"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;-><init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->SpaceEvenly:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    .line 370
    new-instance v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    const-string v2, "SpaceBetween"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;-><init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->SpaceBetween:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    .line 377
    new-instance v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceAround()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    const-string v2, "SpaceAround"

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3, v1}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;-><init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->SpaceAround:Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    invoke-static {}, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->$values()[Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    move-result-object v0

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->$VALUES:[Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            ")V"
        }
    .end annotation

    .line 342
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->arrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/google/accompanist/flowlayout/MainAxisAlignment;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/accompanist/flowlayout/MainAxisAlignment;
    .locals 1

    const-class v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    return-object p0
.end method

.method public static values()[Lcom/google/accompanist/flowlayout/MainAxisAlignment;
    .locals 1

    sget-object v0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->$VALUES:[Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/accompanist/flowlayout/MainAxisAlignment;

    return-object v0
.end method


# virtual methods
.method public final getArrangement$flowlayout_release()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/google/accompanist/flowlayout/MainAxisAlignment;->arrangement:Landroidx/compose/foundation/layout/Arrangement$Vertical;

    return-object v0
.end method
