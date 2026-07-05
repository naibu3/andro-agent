.class public final enum Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
.super Ljava/lang/Enum;
.source "QOfferingTag.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "",
        "tag",
        "",
        "(Ljava/lang/String;ILjava/lang/Integer;)V",
        "getTag",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Unknown",
        "None",
        "Main",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;

.field public static final enum Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

.field public static final enum None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;


# instance fields
.field private final tag:Ljava/lang/Integer;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 3

    sget-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    sget-object v1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    sget-object v2, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    filled-new-array {v0, v1, v2}, [Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Unknown"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "None"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    const/4 v1, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Main"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$values()[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$VALUES:[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Companion:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->tag:Ljava/lang/Integer;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$VALUES:[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    return-object v0
.end method


# virtual methods
.method public final getTag()Ljava/lang/Integer;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->tag:Ljava/lang/Integer;

    return-object v0
.end method
