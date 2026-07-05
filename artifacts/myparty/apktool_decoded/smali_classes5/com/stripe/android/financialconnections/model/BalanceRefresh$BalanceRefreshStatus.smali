.class public final enum Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
.super Ljava/lang/Enum;
.source "BalanceRefresh.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/BalanceRefresh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BalanceRefreshStatus"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode$financial_connections_core_release",
        "()Ljava/lang/String;",
        "FAILED",
        "PENDING",
        "SUCCEEDED",
        "UNKNOWN",
        "Companion",
        "financial-connections-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

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

.field public static final Companion:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;

.field public static final enum FAILED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "failed"
    .end annotation
.end field

.field public static final enum PENDING:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "pending"
    .end annotation
.end field

.field public static final enum SUCCEEDED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "succeeded"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$7IAZwS4bHc6O8148AuUyJQ6olu4()Lkotlinx/serialization/KSerializer;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->_init_$_anonymous_()Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .locals 4

    sget-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->FAILED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    sget-object v1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->PENDING:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    sget-object v2, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->SUCCEEDED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    sget-object v3, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 20
    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    const/4 v1, 0x0

    const-string v2, "failed"

    const-string v3, "FAILED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->FAILED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    .line 23
    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    const/4 v1, 0x1

    const-string v2, "pending"

    const-string v3, "PENDING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->PENDING:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    .line 26
    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    const/4 v1, 0x2

    const-string v2, "succeeded"

    const-string v3, "SUCCEEDED"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->SUCCEEDED:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    .line 28
    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    const/4 v1, 0x3

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->UNKNOWN:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$values()[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$VALUES:[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->Companion:Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;

    .line 17
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->code:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lkotlinx/serialization/KSerializer;
    .locals 8

    .line 17
    invoke-static {}, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->values()[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    const/4 v1, 0x4

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "failed"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "pending"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "succeeded"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const/4 v3, 0x3

    const/4 v7, 0x0

    aput-object v7, v2, v3

    new-array v1, v1, [[Ljava/lang/annotation/Annotation;

    aput-object v7, v1, v4

    aput-object v7, v1, v5

    aput-object v7, v1, v6

    aput-object v7, v1, v3

    const-string v3, "com.stripe.android.financialconnections.model.BalanceRefresh.BalanceRefreshStatus"

    invoke-static {v3, v0, v2, v1, v7}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 17
    sget-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 29
    check-cast p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->$VALUES:[Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 29
    check-cast v0, [Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;

    return-object v0
.end method


# virtual methods
.method public final getCode$financial_connections_core_release()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;->code:Ljava/lang/String;

    return-object v0
.end method
