.class public final Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
.super Ljava/lang/Object;
.source "NetworkingLinkVerificationViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u0016B\'\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\n\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
        "",
        "payload",
        "Lcom/stripe/android/financialconnections/presentation/Async;",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
        "confirmVerification",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V",
        "getPayload",
        "()Lcom/stripe/android/financialconnections/presentation/Async;",
        "getConfirmVerification",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Payload",
        "financial-connections_release"
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
.field public static final $stable:I


# instance fields
.field private final confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    sput v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmVerification"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 188
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 187
    sget-object p1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 188
    sget-object p2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 186
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->copy(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmVerification"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getConfirmVerification()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getPayload()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            ">;"
        }
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->confirmVerification:Lcom/stripe/android/financialconnections/presentation/Async;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NetworkingLinkVerificationState(payload="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", confirmVerification="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
