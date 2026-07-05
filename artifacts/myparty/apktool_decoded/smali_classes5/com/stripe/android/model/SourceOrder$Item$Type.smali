.class public final enum Lcom/stripe/android/model/SourceOrder$Item$Type;
.super Ljava/lang/Enum;
.source "SourceOrder.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/SourceOrder$Item;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/SourceOrder$Item$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/SourceOrder$Item$Type;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Sku",
        "Tax",
        "Shipping",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/SourceOrder$Item$Type;

.field public static final Companion:Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;

.field public static final enum Shipping:Lcom/stripe/android/model/SourceOrder$Item$Type;

.field public static final enum Sku:Lcom/stripe/android/model/SourceOrder$Item$Type;

.field public static final enum Tax:Lcom/stripe/android/model/SourceOrder$Item$Type;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/SourceOrder$Item$Type;
    .locals 3

    sget-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->Sku:Lcom/stripe/android/model/SourceOrder$Item$Type;

    sget-object v1, Lcom/stripe/android/model/SourceOrder$Item$Type;->Tax:Lcom/stripe/android/model/SourceOrder$Item$Type;

    sget-object v2, Lcom/stripe/android/model/SourceOrder$Item$Type;->Shipping:Lcom/stripe/android/model/SourceOrder$Item$Type;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/model/SourceOrder$Item$Type;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 76
    new-instance v0, Lcom/stripe/android/model/SourceOrder$Item$Type;

    const/4 v1, 0x0

    const-string v2, "sku"

    const-string v3, "Sku"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceOrder$Item$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->Sku:Lcom/stripe/android/model/SourceOrder$Item$Type;

    .line 77
    new-instance v0, Lcom/stripe/android/model/SourceOrder$Item$Type;

    const/4 v1, 0x1

    const-string v2, "tax"

    const-string v3, "Tax"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceOrder$Item$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->Tax:Lcom/stripe/android/model/SourceOrder$Item$Type;

    .line 78
    new-instance v0, Lcom/stripe/android/model/SourceOrder$Item$Type;

    const/4 v1, 0x2

    const-string v2, "shipping"

    const-string v3, "Shipping"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/SourceOrder$Item$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->Shipping:Lcom/stripe/android/model/SourceOrder$Item$Type;

    invoke-static {}, Lcom/stripe/android/model/SourceOrder$Item$Type;->$values()[Lcom/stripe/android/model/SourceOrder$Item$Type;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->$VALUES:[Lcom/stripe/android/model/SourceOrder$Item$Type;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->Companion:Lcom/stripe/android/model/SourceOrder$Item$Type$Companion;

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

    .line 75
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/SourceOrder$Item$Type;->code:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getCode$p(Lcom/stripe/android/model/SourceOrder$Item$Type;)Ljava/lang/String;
    .locals 0

    .line 75
    iget-object p0, p0, Lcom/stripe/android/model/SourceOrder$Item$Type;->code:Ljava/lang/String;

    return-object p0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/SourceOrder$Item$Type;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/SourceOrder$Item$Type;
    .locals 1

    const-class v0, Lcom/stripe/android/model/SourceOrder$Item$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 86
    check-cast p0, Lcom/stripe/android/model/SourceOrder$Item$Type;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/SourceOrder$Item$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/SourceOrder$Item$Type;->$VALUES:[Lcom/stripe/android/model/SourceOrder$Item$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 86
    check-cast v0, [Lcom/stripe/android/model/SourceOrder$Item$Type;

    return-object v0
.end method
