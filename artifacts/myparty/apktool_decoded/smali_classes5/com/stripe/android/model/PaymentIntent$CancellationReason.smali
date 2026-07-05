.class public final enum Lcom/stripe/android/model/PaymentIntent$CancellationReason;
.super Ljava/lang/Enum;
.source "PaymentIntent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CancellationReason"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/PaymentIntent$CancellationReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentIntent$CancellationReason;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Duplicate",
        "Fraudulent",
        "RequestedByCustomer",
        "Abandoned",
        "FailedInvoice",
        "VoidInvoice",
        "Automatic",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final enum Abandoned:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final enum Automatic:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final Companion:Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;

.field public static final enum Duplicate:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final enum FailedInvoice:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final enum Fraudulent:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final enum RequestedByCustomer:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

.field public static final enum VoidInvoice:Lcom/stripe/android/model/PaymentIntent$CancellationReason;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/PaymentIntent$CancellationReason;
    .locals 7

    sget-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Duplicate:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    sget-object v1, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Fraudulent:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    sget-object v2, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->RequestedByCustomer:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    sget-object v3, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Abandoned:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    sget-object v4, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->FailedInvoice:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    sget-object v5, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->VoidInvoice:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    sget-object v6, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Automatic:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 437
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x0

    const-string v2, "duplicate"

    const-string v3, "Duplicate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Duplicate:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    .line 438
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x1

    const-string v2, "fraudulent"

    const-string v3, "Fraudulent"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Fraudulent:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    .line 439
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x2

    const-string v2, "requested_by_customer"

    const-string v3, "RequestedByCustomer"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->RequestedByCustomer:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    .line 440
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x3

    const-string v2, "abandoned"

    const-string v3, "Abandoned"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Abandoned:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    .line 441
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x4

    const-string v2, "failed_invoice"

    const-string v3, "FailedInvoice"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->FailedInvoice:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    .line 442
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x5

    const-string v2, "void_invoice"

    const-string v3, "VoidInvoice"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->VoidInvoice:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    .line 443
    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    const/4 v1, 0x6

    const-string v2, "automatic"

    const-string v3, "Automatic"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Automatic:Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    invoke-static {}, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->$values()[Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->$VALUES:[Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->Companion:Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;

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

    .line 436
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->code:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getCode$p(Lcom/stripe/android/model/PaymentIntent$CancellationReason;)Ljava/lang/String;
    .locals 0

    .line 436
    iget-object p0, p0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->code:Ljava/lang/String;

    return-object p0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/PaymentIntent$CancellationReason;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$CancellationReason;
    .locals 1

    const-class v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 448
    check-cast p0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/PaymentIntent$CancellationReason;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/PaymentIntent$CancellationReason;->$VALUES:[Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 448
    check-cast v0, [Lcom/stripe/android/model/PaymentIntent$CancellationReason;

    return-object v0
.end method
