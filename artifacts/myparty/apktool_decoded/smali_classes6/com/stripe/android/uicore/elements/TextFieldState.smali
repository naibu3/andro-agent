.class public interface abstract Lcom/stripe/android/uicore/elements/TextFieldState;
.super Ljava/lang/Object;
.source "TextFieldState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0008\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0008\u0010\u0008\u001a\u00020\u0003H&J\u0008\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "",
        "shouldShowError",
        "",
        "hasFocus",
        "isValid",
        "getError",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "isFull",
        "isBlank",
        "stripe-ui-core_release"
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
.method public abstract getError()Lcom/stripe/android/uicore/elements/FieldError;
.end method

.method public abstract isBlank()Z
.end method

.method public abstract isFull()Z
.end method

.method public abstract isValid()Z
.end method

.method public abstract shouldShowError(Z)Z
.end method
