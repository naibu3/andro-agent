.class public final enum Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;
.super Ljava/lang/Enum;
.source "PopupPayload.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/serialization/PopupPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IntentMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;",
        "",
        "type",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Payment",
        "Setup",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

.field public static final enum Payment:Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

.field public static final enum Setup:Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;
    .locals 2

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->Payment:Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->Setup:Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    filled-new-array {v0, v1}, [Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 111
    new-instance v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    const/4 v1, 0x0

    const-string v2, "payment"

    const-string v3, "Payment"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->Payment:Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    .line 112
    new-instance v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    const/4 v1, 0x1

    const-string v2, "setup"

    const-string v3, "Setup"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->Setup:Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    invoke-static {}, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->$values()[Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->$VALUES:[Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 110
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->type:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;
    .locals 1

    const-class v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 113
    check-cast p0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->$VALUES:[Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 113
    check-cast v0, [Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;->type:Ljava/lang/String;

    return-object v0
.end method
