.class public final Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;
.super Ljava/lang/Object;
.source "NetworkingLinkVerificationPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0008\u0010\u0010\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "canonical",
        "submitting",
        "otpError",
        "unknownError",
        "payload",
        "Lcom/stripe/android/financialconnections/presentation/Async$Success;",
        "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
        "loading",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 16
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->loading()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 17
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->submitting()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 19
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->otpError()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->unknownError()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 15
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final canonical()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 3

    .line 23
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    .line 24
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->payload()Lcom/stripe/android/financialconnections/presentation/Async$Success;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 25
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 23
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final loading()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 4

    .line 63
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    .line 64
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v2, 0x2

    .line 63
    invoke-direct {v0, v1, v3, v2, v3}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final otpError()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 6

    .line 33
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    .line 34
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->payload()Lcom/stripe/android/financialconnections/presentation/Async$Success;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 35
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    .line 36
    new-instance v3, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;

    .line 37
    const-string v4, "12345678"

    .line 38
    sget-object v5, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;->EMAIL_CODE_EXPIRED:Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;

    .line 36
    invoke-direct {v3, v4, v5}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V

    check-cast v3, Ljava/lang/Throwable;

    .line 35
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 33
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final payload()Lcom/stripe/android/financialconnections/presentation/Async$Success;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async$Success<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;",
            ">;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 51
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    .line 54
    new-instance v4, Lcom/stripe/android/uicore/elements/OTPElement;

    .line 55
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v3, "otp"

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    .line 56
    new-instance v3, Lcom/stripe/android/uicore/elements/OTPController;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v3, v7, v5, v6}, Lcom/stripe/android/uicore/elements/OTPController;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    invoke-direct {v4, v2, v3}, Lcom/stripe/android/uicore/elements/OTPElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/OTPController;)V

    .line 58
    const-string v5, "12345678"

    .line 51
    const-string v2, "theLargestEmailYoulleverseeThatCouldBreakALayout@email.com"

    const-string v3, "12345678"

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    .line 50
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final submitting()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 5

    .line 28
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    .line 29
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->payload()Lcom/stripe/android/financialconnections/presentation/Async$Success;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 30
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 28
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method

.method private final unknownError()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;
    .locals 5

    .line 43
    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->payload()Lcom/stripe/android/financialconnections/presentation/Async$Success;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 45
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    .line 46
    new-instance v3, Ljava/lang/Exception;

    const-string v4, "Random error"

    invoke-direct {v3, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Throwable;

    .line 45
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 43
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;)V

    return-object v0
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
