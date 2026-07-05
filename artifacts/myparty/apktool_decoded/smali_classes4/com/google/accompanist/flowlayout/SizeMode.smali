.class public final enum Lcom/google/accompanist/flowlayout/SizeMode;
.super Ljava/lang/Enum;
.source "Flow.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/accompanist/flowlayout/SizeMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "\naccompanist/SizeMode is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/google/accompanist/flowlayout/SizeMode;",
        "",
        "(Ljava/lang/String;I)V",
        "Wrap",
        "Expand",
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

.field private static final synthetic $VALUES:[Lcom/google/accompanist/flowlayout/SizeMode;

.field public static final enum Expand:Lcom/google/accompanist/flowlayout/SizeMode;

.field public static final enum Wrap:Lcom/google/accompanist/flowlayout/SizeMode;


# direct methods
.method private static final synthetic $values()[Lcom/google/accompanist/flowlayout/SizeMode;
    .locals 2

    sget-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->Wrap:Lcom/google/accompanist/flowlayout/SizeMode;

    sget-object v1, Lcom/google/accompanist/flowlayout/SizeMode;->Expand:Lcom/google/accompanist/flowlayout/SizeMode;

    filled-new-array {v0, v1}, [Lcom/google/accompanist/flowlayout/SizeMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 334
    new-instance v0, Lcom/google/accompanist/flowlayout/SizeMode;

    const-string v1, "Wrap"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/accompanist/flowlayout/SizeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->Wrap:Lcom/google/accompanist/flowlayout/SizeMode;

    .line 339
    new-instance v0, Lcom/google/accompanist/flowlayout/SizeMode;

    const-string v1, "Expand"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/accompanist/flowlayout/SizeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->Expand:Lcom/google/accompanist/flowlayout/SizeMode;

    invoke-static {}, Lcom/google/accompanist/flowlayout/SizeMode;->$values()[Lcom/google/accompanist/flowlayout/SizeMode;

    move-result-object v0

    sput-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->$VALUES:[Lcom/google/accompanist/flowlayout/SizeMode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 323
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/google/accompanist/flowlayout/SizeMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/accompanist/flowlayout/SizeMode;
    .locals 1

    const-class v0, Lcom/google/accompanist/flowlayout/SizeMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/accompanist/flowlayout/SizeMode;

    return-object p0
.end method

.method public static values()[Lcom/google/accompanist/flowlayout/SizeMode;
    .locals 1

    sget-object v0, Lcom/google/accompanist/flowlayout/SizeMode;->$VALUES:[Lcom/google/accompanist/flowlayout/SizeMode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/accompanist/flowlayout/SizeMode;

    return-object v0
.end method
