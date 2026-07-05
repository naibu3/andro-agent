.class public final enum LAlignment;
.super Ljava/lang/Enum;
.source "FinancialConnectionsGenericInfoScreen.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAlignment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LAlignment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0081\u0081\u0002\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "LAlignment;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Left",
        "Center",
        "Right",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[LAlignment;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final enum Center:LAlignment;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "center"
    .end annotation
.end field

.field public static final Companion:LAlignment$Companion;

.field public static final enum Left:LAlignment;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "left"
    .end annotation
.end field

.field public static final enum Right:LAlignment;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "right"
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$82hkBwHBZ1fxy202RtJHkLphoSs()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, LAlignment;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[LAlignment;
    .locals 3

    sget-object v0, LAlignment;->Left:LAlignment;

    sget-object v1, LAlignment;->Center:LAlignment;

    sget-object v2, LAlignment;->Right:LAlignment;

    filled-new-array {v0, v1, v2}, [LAlignment;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 117
    new-instance v0, LAlignment;

    const-string v1, "Left"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAlignment;->Left:LAlignment;

    .line 120
    new-instance v0, LAlignment;

    const-string v1, "Center"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAlignment;->Center:LAlignment;

    .line 123
    new-instance v0, LAlignment;

    const-string v1, "Right"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, LAlignment;->Right:LAlignment;

    invoke-static {}, LAlignment;->$values()[LAlignment;

    move-result-object v0

    sput-object v0, LAlignment;->$VALUES:[LAlignment;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, LAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, LAlignment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAlignment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAlignment;->Companion:LAlignment$Companion;

    .line 115
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, LAlignment$$ExternalSyntheticLambda0;

    invoke-direct {v1}, LAlignment$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, LAlignment;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 115
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 7

    .line 115
    invoke-static {}, LAlignment;->values()[LAlignment;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "left"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "center"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "right"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    aput-object v3, v1, v4

    aput-object v3, v1, v5

    aput-object v3, v1, v6

    const-string v4, "Alignment"

    invoke-static {v4, v0, v2, v1, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 115
    sget-object v0, LAlignment;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "LAlignment;",
            ">;"
        }
    .end annotation

    sget-object v0, LAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LAlignment;
    .locals 1

    const-class v0, LAlignment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 125
    check-cast p0, LAlignment;

    return-object p0
.end method

.method public static values()[LAlignment;
    .locals 1

    sget-object v0, LAlignment;->$VALUES:[LAlignment;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 125
    check-cast v0, [LAlignment;

    return-object v0
.end method
