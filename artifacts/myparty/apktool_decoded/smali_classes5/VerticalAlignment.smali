.class public final enum LVerticalAlignment;
.super Ljava/lang/Enum;
.source "FinancialConnectionsGenericInfoScreen.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVerticalAlignment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LVerticalAlignment;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0081\u0081\u0002\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "LVerticalAlignment;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Default",
        "Centered",
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

.field private static final synthetic $VALUES:[LVerticalAlignment;

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

.field public static final enum Centered:LVerticalAlignment;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "centered"
    .end annotation
.end field

.field public static final Companion:LVerticalAlignment$Companion;

.field public static final enum Default:LVerticalAlignment;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "default"
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$hEXS2NHfT9IzCJew-0AwCHWpUm0()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, LVerticalAlignment;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[LVerticalAlignment;
    .locals 2

    sget-object v0, LVerticalAlignment;->Default:LVerticalAlignment;

    sget-object v1, LVerticalAlignment;->Centered:LVerticalAlignment;

    filled-new-array {v0, v1}, [LVerticalAlignment;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 129
    new-instance v0, LVerticalAlignment;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LVerticalAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVerticalAlignment;->Default:LVerticalAlignment;

    .line 132
    new-instance v0, LVerticalAlignment;

    const-string v1, "Centered"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LVerticalAlignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, LVerticalAlignment;->Centered:LVerticalAlignment;

    invoke-static {}, LVerticalAlignment;->$values()[LVerticalAlignment;

    move-result-object v0

    sput-object v0, LVerticalAlignment;->$VALUES:[LVerticalAlignment;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, LVerticalAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, LVerticalAlignment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LVerticalAlignment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LVerticalAlignment;->Companion:LVerticalAlignment$Companion;

    .line 127
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, LVerticalAlignment$$ExternalSyntheticLambda0;

    invoke-direct {v1}, LVerticalAlignment$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, LVerticalAlignment;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 127
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 6

    .line 127
    invoke-static {}, LVerticalAlignment;->values()[LVerticalAlignment;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "default"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "centered"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    aput-object v3, v1, v4

    aput-object v3, v1, v5

    const-string v4, "VerticalAlignment"

    invoke-static {v4, v0, v2, v1, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 127
    sget-object v0, LVerticalAlignment;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "LVerticalAlignment;",
            ">;"
        }
    .end annotation

    sget-object v0, LVerticalAlignment;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LVerticalAlignment;
    .locals 1

    const-class v0, LVerticalAlignment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 134
    check-cast p0, LVerticalAlignment;

    return-object p0
.end method

.method public static values()[LVerticalAlignment;
    .locals 1

    sget-object v0, LVerticalAlignment;->$VALUES:[LVerticalAlignment;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 134
    check-cast v0, [LVerticalAlignment;

    return-object v0
.end method
