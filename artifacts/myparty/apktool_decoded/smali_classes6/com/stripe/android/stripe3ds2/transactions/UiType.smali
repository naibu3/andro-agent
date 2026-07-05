.class public final enum Lcom/stripe/android/stripe3ds2/transactions/UiType;
.super Ljava/lang/Enum;
.source "UiType.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u00112\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
        "",
        "code",
        "",
        "requiresSubmitButton",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Z)V",
        "getCode",
        "()Ljava/lang/String;",
        "getRequiresSubmitButton$3ds2sdk_release",
        "()Z",
        "Text",
        "SingleSelect",
        "MultiSelect",
        "OutOfBand",
        "Html",
        "Companion",
        "3ds2sdk_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field public static final Companion:Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;

.field public static final enum Html:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field public static final enum MultiSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field public static final enum OutOfBand:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field public static final enum SingleSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

.field public static final enum Text:Lcom/stripe/android/stripe3ds2/transactions/UiType;


# instance fields
.field private final code:Ljava/lang/String;

.field private final requiresSubmitButton:Z


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/transactions/UiType;
    .locals 5

    sget-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Text:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    sget-object v1, Lcom/stripe/android/stripe3ds2/transactions/UiType;->SingleSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/UiType;->MultiSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    sget-object v3, Lcom/stripe/android/stripe3ds2/transactions/UiType;->OutOfBand:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    sget-object v4, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Html:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 7
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const-string v1, "Text"

    const/4 v2, 0x0

    const-string v3, "01"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/stripe3ds2/transactions/UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Text:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    .line 8
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const-string v1, "SingleSelect"

    const-string v3, "02"

    invoke-direct {v0, v1, v4, v3, v4}, Lcom/stripe/android/stripe3ds2/transactions/UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->SingleSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    .line 9
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v1, 0x2

    const-string v3, "03"

    const-string v5, "MultiSelect"

    invoke-direct {v0, v5, v1, v3, v4}, Lcom/stripe/android/stripe3ds2/transactions/UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->MultiSelect:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    .line 15
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v1, 0x3

    const-string v3, "04"

    const-string v4, "OutOfBand"

    invoke-direct {v0, v4, v1, v3, v2}, Lcom/stripe/android/stripe3ds2/transactions/UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->OutOfBand:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    .line 17
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    const/4 v1, 0x4

    const-string v3, "05"

    const-string v4, "Html"

    invoke-direct {v0, v4, v1, v3, v2}, Lcom/stripe/android/stripe3ds2/transactions/UiType;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Html:Lcom/stripe/android/stripe3ds2/transactions/UiType;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/transactions/UiType;->$values()[Lcom/stripe/android/stripe3ds2/transactions/UiType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->$VALUES:[Lcom/stripe/android/stripe3ds2/transactions/UiType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->Companion:Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->code:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->requiresSubmitButton:Z

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/stripe3ds2/transactions/UiType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/UiType;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 24
    check-cast p0, Lcom/stripe/android/stripe3ds2/transactions/UiType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/transactions/UiType;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->$VALUES:[Lcom/stripe/android/stripe3ds2/transactions/UiType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 24
    check-cast v0, [Lcom/stripe/android/stripe3ds2/transactions/UiType;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequiresSubmitButton$3ds2sdk_release()Z
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transactions/UiType;->requiresSubmitButton:Z

    return v0
.end method
