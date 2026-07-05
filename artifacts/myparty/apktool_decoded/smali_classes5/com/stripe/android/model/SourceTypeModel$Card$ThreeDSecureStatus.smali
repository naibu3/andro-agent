.class public final enum Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;
.super Ljava/lang/Enum;
.source "SourceTypeModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/SourceTypeModel$Card;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ThreeDSecureStatus"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000b\u001a\u00020\u0003H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Required",
        "Optional",
        "NotSupported",
        "Recommended",
        "Unknown",
        "toString",
        "Companion",
        "payments-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

.field public static final Companion:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;

.field public static final enum NotSupported:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

.field public static final enum Optional:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

.field public static final enum Recommended:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

.field public static final enum Required:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

.field public static final enum Unknown:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;
    .locals 5

    sget-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Required:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    sget-object v1, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Optional:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    sget-object v2, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->NotSupported:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    sget-object v3, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Recommended:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    sget-object v4, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Unknown:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 27
    new-instance v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    const/4 v1, 0x0

    const-string v2, "required"

    const-string v3, "Required"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Required:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    .line 28
    new-instance v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    const/4 v1, 0x1

    const-string v2, "optional"

    const-string v3, "Optional"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Optional:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    .line 29
    new-instance v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    const/4 v1, 0x2

    const-string v2, "not_supported"

    const-string v3, "NotSupported"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->NotSupported:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    .line 30
    new-instance v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    const/4 v1, 0x3

    const-string v2, "recommended"

    const-string v3, "Recommended"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Recommended:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    .line 31
    new-instance v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    const/4 v1, 0x4

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Unknown:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    invoke-static {}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->$values()[Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->$VALUES:[Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->Companion:Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;

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

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->code:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getCode$p(Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;)Ljava/lang/String;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->code:Ljava/lang/String;

    return-object p0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;
    .locals 1

    const-class v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 39
    check-cast p0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->$VALUES:[Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 39
    check-cast v0, [Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;->code:Ljava/lang/String;

    return-object v0
.end method
