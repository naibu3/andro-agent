.class public interface abstract Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;
.super Ljava/lang/Object;
.source "LinkSignupHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0008\u0010\u000b\u001a\u00020\u0008H&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;",
        "",
        "performSignup",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "state",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "handleSignupFailure",
        "",
        "error",
        "",
        "navigateToVerification",
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


# virtual methods
.method public abstract handleSignupFailure(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Ljava/lang/Throwable;)V
.end method

.method public abstract navigateToVerification()V
.end method

.method public abstract performSignup(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
