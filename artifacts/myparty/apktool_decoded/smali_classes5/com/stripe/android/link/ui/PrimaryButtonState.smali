.class public final enum Lcom/stripe/android/link/ui/PrimaryButtonState;
.super Ljava/lang/Enum;
.source "PrimaryButton.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "",
        "isBlocking",
        "",
        "<init>",
        "(Ljava/lang/String;IZ)V",
        "()Z",
        "Enabled",
        "Disabled",
        "Processing",
        "Completed",
        "paymentsheet_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/link/ui/PrimaryButtonState;

.field public static final enum Completed:Lcom/stripe/android/link/ui/PrimaryButtonState;

.field public static final enum Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

.field public static final enum Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

.field public static final enum Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;


# instance fields
.field private final isBlocking:Z


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/link/ui/PrimaryButtonState;
    .locals 4

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    sget-object v1, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    sget-object v2, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    sget-object v3, Lcom/stripe/android/link/ui/PrimaryButtonState;->Completed:Lcom/stripe/android/link/ui/PrimaryButtonState;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 141
    new-instance v0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    const-string v1, "Enabled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/stripe/android/link/ui/PrimaryButtonState;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    .line 142
    new-instance v0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    const-string v1, "Disabled"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/android/link/ui/PrimaryButtonState;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    .line 143
    new-instance v0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    const-string v1, "Processing"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/link/ui/PrimaryButtonState;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    .line 144
    new-instance v0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    const-string v1, "Completed"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/link/ui/PrimaryButtonState;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Completed:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-static {}, Lcom/stripe/android/link/ui/PrimaryButtonState;->$values()[Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->$VALUES:[Lcom/stripe/android/link/ui/PrimaryButtonState;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 140
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking:Z

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/link/ui/PrimaryButtonState;
    .locals 1

    const-class v0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 145
    check-cast p0, Lcom/stripe/android/link/ui/PrimaryButtonState;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/link/ui/PrimaryButtonState;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->$VALUES:[Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 145
    check-cast v0, [Lcom/stripe/android/link/ui/PrimaryButtonState;

    return-object v0
.end method


# virtual methods
.method public final isBlocking()Z
    .locals 1

    .line 140
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking:Z

    return v0
.end method
