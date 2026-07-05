.class public final Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;
.super Ljava/lang/Exception;
.source "ErrorExt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "errorType",
        "Lcom/stripe/attestation/AttestationError$ErrorType;",
        "prefillDetails",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
        "message",
        "",
        "cause",
        "",
        "<init>",
        "(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "getErrorType",
        "()Lcom/stripe/attestation/AttestationError$ErrorType;",
        "getPrefillDetails",
        "()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;",
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
.field private final errorType:Lcom/stripe/attestation/AttestationError$ErrorType;

.field private final prefillDetails:Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "errorType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0, p3, p4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;->errorType:Lcom/stripe/attestation/AttestationError$ErrorType;

    .line 37
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;->prefillDetails:Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 35
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;-><init>(Lcom/stripe/attestation/AttestationError$ErrorType;Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getErrorType()Lcom/stripe/attestation/AttestationError$ErrorType;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;->errorType:Lcom/stripe/attestation/AttestationError$ErrorType;

    return-object v0
.end method

.method public final getPrefillDetails()Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;->prefillDetails:Lcom/stripe/android/financialconnections/ElementsSessionContext$PrefillDetails;

    return-object v0
.end method
