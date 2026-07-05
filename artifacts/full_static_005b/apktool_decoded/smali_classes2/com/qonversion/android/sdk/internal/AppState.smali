.class public final enum Lcom/qonversion/android/sdk/internal/AppState;
.super Ljava/lang/Enum;
.source "AppState.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/internal/AppState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/AppState;",
        "",
        "(Ljava/lang/String;I)V",
        "isBackground",
        "",
        "Foreground",
        "Background",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/internal/AppState;

.field public static final enum Background:Lcom/qonversion/android/sdk/internal/AppState;

.field public static final enum Foreground:Lcom/qonversion/android/sdk/internal/AppState;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/internal/AppState;
    .locals 2

    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Foreground:Lcom/qonversion/android/sdk/internal/AppState;

    sget-object v1, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    filled-new-array {v0, v1}, [Lcom/qonversion/android/sdk/internal/AppState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/internal/AppState;

    const-string v1, "Foreground"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/AppState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Foreground:Lcom/qonversion/android/sdk/internal/AppState;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/internal/AppState;

    const-string v1, "Background"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/AppState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/AppState;->$values()[Lcom/qonversion/android/sdk/internal/AppState;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/AppState;->$VALUES:[Lcom/qonversion/android/sdk/internal/AppState;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/AppState;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/internal/AppState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/AppState;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/internal/AppState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/AppState;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/internal/AppState;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->$VALUES:[Lcom/qonversion/android/sdk/internal/AppState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/internal/AppState;

    return-object v0
.end method


# virtual methods
.method public final isBackground()Z
    .locals 1

    .line 8
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
