.class public interface abstract Lcom/stripe/android/link/attestation/LinkAttestationCheck;
.super Ljava/lang/Object;
.source "LinkAttestationCheck.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck;",
        "",
        "invoke",
        "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Result",
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


# virtual methods
.method public abstract invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
