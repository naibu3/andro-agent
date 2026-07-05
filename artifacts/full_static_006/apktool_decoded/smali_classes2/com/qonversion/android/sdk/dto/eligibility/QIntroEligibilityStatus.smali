.class public final enum Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
.super Ljava/lang/Enum;
.source "QIntroEligibilityStatus.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;",
        "",
        "type",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "NonIntroOrTrialProduct",
        "Eligible",
        "Ineligible",
        "Unknown",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;

.field public static final enum Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

.field public static final enum Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

.field public static final enum NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 4

    sget-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    sget-object v1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    sget-object v2, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    sget-object v3, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    filled-new-array {v0, v1, v2, v3}, [Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    const/4 v1, 0x0

    const-string v2, "non_intro_or_trial_product"

    const-string v3, "NonIntroOrTrialProduct"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 7
    new-instance v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    const/4 v1, 0x1

    const-string v2, "intro_or_trial_eligible"

    const-string v3, "Eligible"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 8
    new-instance v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    const/4 v1, 0x2

    const-string v2, "intro_or_trial_ineligible"

    const-string v3, "Ineligible"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 9
    new-instance v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    const/4 v1, 0x3

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->$values()[Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->$VALUES:[Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Companion:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;

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

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->type:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->$VALUES:[Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->type:Ljava/lang/String;

    return-object v0
.end method
