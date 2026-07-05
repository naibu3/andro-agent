.class public final Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;
.super Ljava/lang/Object;
.source "LinkStepUpVerificationViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;",
        "",
        "email",
        "",
        "phoneNumber",
        "otpElement",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "consumerSessionClientSecret",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)V",
        "getEmail",
        "()Ljava/lang/String;",
        "getPhoneNumber",
        "getOtpElement",
        "()Lcom/stripe/android/uicore/elements/OTPElement;",
        "getConsumerSessionClientSecret",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final consumerSessionClientSecret:Ljava/lang/String;

.field private final email:Ljava/lang/String;

.field private final otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field private final phoneNumber:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/stripe/android/uicore/elements/OTPElement;->$stable:I

    sput v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)V
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otpElement"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionClientSecret"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 215
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    .line 216
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    .line 217
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    .line 218
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/uicore/elements/OTPElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumber"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otpElement"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionClientSecret"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getConsumerSessionClientSecret()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    return-object v0
.end method

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/OTPElement;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->email:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->phoneNumber:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Payload(email="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", phoneNumber="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", otpElement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consumerSessionClientSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
