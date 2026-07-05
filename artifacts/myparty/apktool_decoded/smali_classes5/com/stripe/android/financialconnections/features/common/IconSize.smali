.class public final enum Lcom/stripe/android/financialconnections/features/common/IconSize;
.super Ljava/lang/Enum;
.source "ShapedIcon.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/features/common/IconSize;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShapedIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapedIcon.kt\ncom/stripe/android/financialconnections/features/common/IconSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,135:1\n149#2:136\n149#2:137\n149#2:138\n*S KotlinDebug\n*F\n+ 1 ShapedIcon.kt\ncom/stripe/android/financialconnections/features/common/IconSize\n*L\n131#1:136\n132#1:137\n133#1:138\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\n\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/common/IconSize;",
        "",
        "size",
        "Landroidx/compose/ui/unit/Dp;",
        "paddedSize",
        "<init>",
        "(Ljava/lang/String;IFF)V",
        "getSize-D9Ej5fM",
        "()F",
        "F",
        "getPaddedSize-D9Ej5fM",
        "Large",
        "Medium",
        "Small",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/features/common/IconSize;

.field public static final enum Large:Lcom/stripe/android/financialconnections/features/common/IconSize;

.field public static final enum Medium:Lcom/stripe/android/financialconnections/features/common/IconSize;

.field public static final enum Small:Lcom/stripe/android/financialconnections/features/common/IconSize;


# instance fields
.field private final paddedSize:F

.field private final size:F


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/features/common/IconSize;
    .locals 3

    sget-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->Large:Lcom/stripe/android/financialconnections/features/common/IconSize;

    sget-object v1, Lcom/stripe/android/financialconnections/features/common/IconSize;->Medium:Lcom/stripe/android/financialconnections/features/common/IconSize;

    sget-object v2, Lcom/stripe/android/financialconnections/features/common/IconSize;->Small:Lcom/stripe/android/financialconnections/features/common/IconSize;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/financialconnections/features/common/IconSize;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 131
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/IconSize;

    const/16 v1, 0x40

    int-to-float v1, v1

    .line 136
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    const/16 v2, 0x20

    int-to-float v2, v2

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 131
    const-string v3, "Large"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/financialconnections/features/common/IconSize;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->Large:Lcom/stripe/android/financialconnections/features/common/IconSize;

    .line 132
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/IconSize;

    const/16 v1, 0x38

    int-to-float v1, v1

    .line 137
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    const/16 v2, 0x14

    int-to-float v2, v2

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 132
    const-string v3, "Medium"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/financialconnections/features/common/IconSize;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->Medium:Lcom/stripe/android/financialconnections/features/common/IconSize;

    .line 133
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/IconSize;

    const/16 v1, 0x18

    int-to-float v1, v1

    .line 138
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 133
    const-string v3, "Small"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/financialconnections/features/common/IconSize;-><init>(Ljava/lang/String;IFF)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->Small:Lcom/stripe/android/financialconnections/features/common/IconSize;

    invoke-static {}, Lcom/stripe/android/financialconnections/features/common/IconSize;->$values()[Lcom/stripe/android/financialconnections/features/common/IconSize;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->$VALUES:[Lcom/stripe/android/financialconnections/features/common/IconSize;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IFF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)V"
        }
    .end annotation

    .line 130
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/stripe/android/financialconnections/features/common/IconSize;->size:F

    iput p4, p0, Lcom/stripe/android/financialconnections/features/common/IconSize;->paddedSize:F

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/features/common/IconSize;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/features/common/IconSize;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/features/common/IconSize;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 134
    check-cast p0, Lcom/stripe/android/financialconnections/features/common/IconSize;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/features/common/IconSize;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/features/common/IconSize;->$VALUES:[Lcom/stripe/android/financialconnections/features/common/IconSize;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 134
    check-cast v0, [Lcom/stripe/android/financialconnections/features/common/IconSize;

    return-object v0
.end method


# virtual methods
.method public final getPaddedSize-D9Ej5fM()F
    .locals 1

    .line 130
    iget v0, p0, Lcom/stripe/android/financialconnections/features/common/IconSize;->paddedSize:F

    return v0
.end method

.method public final getSize-D9Ej5fM()F
    .locals 1

    .line 130
    iget v0, p0, Lcom/stripe/android/financialconnections/features/common/IconSize;->size:F

    return v0
.end method
