.class public final enum Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;
.super Ljava/lang/Enum;
.source "MacrosType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0080\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;",
        "",
        "type",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Unknown",
        "Price",
        "SubscriptionDuration",
        "TrialDuration",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;

.field public static final enum Price:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

.field public static final enum SubscriptionDuration:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

.field public static final enum TrialDuration:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;
    .locals 4

    sget-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Unknown:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    sget-object v1, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Price:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    sget-object v2, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->SubscriptionDuration:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    sget-object v3, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->TrialDuration:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    const/4 v1, 0x0

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Unknown:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    const/4 v1, 0x1

    const-string v2, "price"

    const-string v3, "Price"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Price:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    const/4 v1, 0x2

    const-string v2, "duration_subscription"

    const-string v3, "SubscriptionDuration"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->SubscriptionDuration:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    const/4 v1, 0x3

    const-string v2, "duration_trial"

    const-string v3, "TrialDuration"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->TrialDuration:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    invoke-static {}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->$values()[Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->$VALUES:[Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Companion:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;

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

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->type:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->$VALUES:[Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->type:Ljava/lang/String;

    return-object v0
.end method
