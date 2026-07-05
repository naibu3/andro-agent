.class public final Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
.super Ljava/lang/Object;
.source "TopAppBarState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001Bc\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Je\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00032\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0011\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;",
        "",
        "hideStripeLogo",
        "",
        "forceHideStripeLogo",
        "allowBackNavigation",
        "theme",
        "Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "isTestMode",
        "allowElevation",
        "isContentScrolled",
        "error",
        "",
        "canCloseWithoutConfirmation",
        "<init>",
        "(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)V",
        "getHideStripeLogo",
        "()Z",
        "getForceHideStripeLogo",
        "getAllowBackNavigation",
        "getTheme",
        "()Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "getAllowElevation",
        "getError",
        "()Ljava/lang/Throwable;",
        "getCanCloseWithoutConfirmation",
        "isElevated",
        "apply",
        "update",
        "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "financial-connections_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final allowBackNavigation:Z

.field private final allowElevation:Z

.field private final canCloseWithoutConfirmation:Z

.field private final error:Ljava/lang/Throwable;

.field private final forceHideStripeLogo:Z

.field private final hideStripeLogo:Z

.field private final isContentScrolled:Z

.field private final isTestMode:Z

.field private final theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;-><init>(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)V
    .locals 1

    const-string v0, "theme"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    .line 8
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    .line 9
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    .line 10
    iput-object p4, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 11
    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    .line 12
    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    .line 13
    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    .line 14
    iput-object p8, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    .line 15
    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x1

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    const/4 v1, 0x0

    if-eqz p11, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    .line 10
    sget-object p4, Lcom/stripe/android/financialconnections/ui/theme/Theme;->Companion:Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;->getDefault()Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object p4

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v1

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v1

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    const/4 p8, 0x0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v1

    goto :goto_0

    :cond_8
    move p10, p9

    :goto_0
    move-object p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 6
    invoke-direct/range {p1 .. p10}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;-><init>(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    :cond_8
    move-object p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move-object p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->copy(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final apply(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 13

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;->getHideStripeLogo()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    :goto_0
    move v2, v0

    .line 23
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;->getAllowBackNavigation()Z

    move-result v4

    .line 24
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;->getAllowElevation()Z

    move-result v7

    .line 25
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;->getError()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    :cond_1
    move-object v9, v0

    .line 26
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;->getCanCloseWithoutConfirmation()Z

    move-result v10

    const/16 v11, 0x58

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v12}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->copy$default(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    return v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    return v0
.end method

.method public final component8()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    return v0
.end method

.method public final copy(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;
    .locals 11

    const-string v0, "theme"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;-><init>(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAllowBackNavigation()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    return v0
.end method

.method public final getAllowElevation()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    return v0
.end method

.method public final getCanCloseWithoutConfirmation()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    return v0
.end method

.method public final getError()Ljava/lang/Throwable;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getForceHideStripeLogo()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    return v0
.end method

.method public final getHideStripeLogo()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    return v0
.end method

.method public final getTheme()Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/theme/Theme;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isContentScrolled()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    return v0
.end method

.method public final isElevated()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isTestMode()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->hideStripeLogo:Z

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->forceHideStripeLogo:Z

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowBackNavigation:Z

    iget-object v3, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->theme:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isTestMode:Z

    iget-boolean v5, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->allowElevation:Z

    iget-boolean v6, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->isContentScrolled:Z

    iget-object v7, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->error:Ljava/lang/Throwable;

    iget-boolean v8, p0, Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;->canCloseWithoutConfirmation:Z

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "TopAppBarState(hideStripeLogo="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ", forceHideStripeLogo="

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowBackNavigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isTestMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowElevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isContentScrolled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canCloseWithoutConfirmation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
