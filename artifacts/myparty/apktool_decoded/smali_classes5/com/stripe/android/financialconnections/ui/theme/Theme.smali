.class public final enum Lcom/stripe/android/financialconnections/ui/theme/Theme;
.super Ljava/lang/Enum;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;,
        Lcom/stripe/android/financialconnections/ui/theme/Theme$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0080\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/theme/Theme;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DefaultLight",
        "LinkLight",
        "colors",
        "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
        "getColors",
        "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;",
        "icon",
        "",
        "getIcon",
        "()I",
        "Companion",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/ui/theme/Theme;

.field public static final Companion:Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;

.field public static final enum DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

.field public static final enum LinkLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

.field private static final default:Lcom/stripe/android/financialconnections/ui/theme/Theme;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 2

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    sget-object v1, Lcom/stripe/android/financialconnections/ui/theme/Theme;->LinkLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    filled-new-array {v0, v1}, [Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 35
    new-instance v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;

    const-string v1, "DefaultLight"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/ui/theme/Theme;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 36
    new-instance v1, Lcom/stripe/android/financialconnections/ui/theme/Theme;

    const-string v2, "LinkLight"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/ui/theme/Theme;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/stripe/android/financialconnections/ui/theme/Theme;->LinkLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/Theme;->$values()[Lcom/stripe/android/financialconnections/ui/theme/Theme;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/ui/theme/Theme;->$VALUES:[Lcom/stripe/android/financialconnections/ui/theme/Theme;

    check-cast v1, [Ljava/lang/Enum;

    invoke-static {v1}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/ui/theme/Theme;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v1, Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/financialconnections/ui/theme/Theme;->Companion:Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;

    .line 52
    sput-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->default:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->default:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/ui/theme/Theme;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 54
    check-cast p0, Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/ui/theme/Theme;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme;->$VALUES:[Lcom/stripe/android/financialconnections/ui/theme/Theme;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 54
    check-cast v0, [Lcom/stripe/android/financialconnections/ui/theme/Theme;

    return-object v0
.end method


# virtual methods
.method public final getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;
    .locals 3

    const v0, 0x2b6f64f9

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.ui.theme.Theme.<get-colors> (Theme.kt:39)"

    .line 40
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lcom/stripe/android/financialconnections/ui/theme/Theme$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/theme/Theme;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    const p2, 0x5a9901ff

    .line 42
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->access$getInstantDebitsDarkModeColors$p()Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->access$getInstantDebitsColors$p()Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p2

    :goto_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2

    :cond_2
    const p2, 0x5a98f343

    .line 40
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    const p2, 0x5a98f7e6

    .line 41
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {p1, v1}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->access$getDarkThemeColors$p()Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p2

    goto :goto_1

    :cond_4
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->access$getColors$p()Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p2

    :goto_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 40
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public final getIcon()I
    .locals 2

    .line 46
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/Theme$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/ui/theme/Theme;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 48
    sget v0, Lcom/stripe/android/financialconnections/R$drawable;->stripe_link_logo:I

    return v0

    .line 46
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 47
    :cond_1
    sget v0, Lcom/stripe/android/financialconnections/R$drawable;->stripe_logo:I

    return v0
.end method
