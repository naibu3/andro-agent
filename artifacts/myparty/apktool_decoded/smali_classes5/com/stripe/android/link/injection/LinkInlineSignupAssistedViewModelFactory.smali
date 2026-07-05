.class public interface abstract Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;
.super Ljava/lang/Object;
.source "LinkInlineSignupAssistedViewModelFactory.kt"


# annotations
.annotation runtime Ldagger/assisted/AssistedFactory;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;",
        "",
        "create",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;",
        "signupMode",
        "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "initialUserInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
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
.method public abstract create(Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/ui/inline/UserInput;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
.end method
