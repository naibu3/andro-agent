.class public final Lcom/stripe/android/link/ui/verification/VerificationViewState;
.super Ljava/lang/Object;
.source "VerificationViewState.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003Jq\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u00032\u0008\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020)H\u00d6\u0001J\t\u0010.\u001a\u00020\nH\u00d6\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
        "Landroid/os/Parcelable;",
        "isProcessing",
        "",
        "requestFocus",
        "errorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isSendingNewCode",
        "didSendNewCode",
        "redactedPhoneNumber",
        "",
        "email",
        "isDialog",
        "allowLogout",
        "defaultPayment",
        "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;",
        "<init>",
        "(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)V",
        "()Z",
        "getRequestFocus",
        "getErrorMessage",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getDidSendNewCode",
        "getRedactedPhoneNumber",
        "()Ljava/lang/String;",
        "getEmail",
        "getAllowLogout",
        "getDefaultPayment",
        "()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final allowLogout:Z

.field private final defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

.field private final didSendNewCode:Z

.field private final email:Ljava/lang/String;

.field private final errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

.field private final isDialog:Z

.field private final isProcessing:Z

.field private final isSendingNewCode:Z

.field private final redactedPhoneNumber:Ljava/lang/String;

.field private final requestFocus:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/verification/VerificationViewState$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/verification/VerificationViewState$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)V
    .locals 1

    const-string v0, "redactedPhoneNumber"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-boolean p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    .line 13
    iput-boolean p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    .line 14
    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    .line 15
    iput-boolean p4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    .line 16
    iput-boolean p5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    .line 17
    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    .line 18
    iput-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    .line 19
    iput-boolean p8, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    .line 20
    iput-boolean p9, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    .line 21
    iput-object p10, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;ILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-boolean p8, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    :cond_9
    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    return v0
.end method

.method public final component10()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    return v0
.end method

.method public final copy(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 12

    const-string v0, "redactedPhoneNumber"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/link/ui/verification/VerificationViewState;-><init>(ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    iget-object p1, p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAllowLogout()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    return v0
.end method

.method public final getDefaultPayment()Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    return-object v0
.end method

.method public final getDidSendNewCode()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    return v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getRedactedPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestFocus()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isDialog()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    return v0
.end method

.method public final isProcessing()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    return v0
.end method

.method public final isSendingNewCode()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    iget-object v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    iget-boolean v4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    iget-object v5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    iget-boolean v8, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    iget-object v9, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "VerificationViewState(isProcessing="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, ", requestFocus="

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSendingNewCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", didSendNewCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redactedPhoneNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowLogout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultPayment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->requestFocus:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isSendingNewCode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->didSendNewCode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->redactedPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->email:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isDialog:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->allowLogout:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewState;->defaultPayment:Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
