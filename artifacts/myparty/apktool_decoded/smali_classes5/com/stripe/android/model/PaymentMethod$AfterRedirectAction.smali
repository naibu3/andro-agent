.class public interface abstract Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;
.super Ljava/lang/Object;
.source "PaymentMethod.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AfterRedirectAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;,
        Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;,
        Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001:\u0003\n\u000b\u000cR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0003\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;",
        "Landroid/os/Parcelable;",
        "shouldRefresh",
        "",
        "getShouldRefresh",
        "()Z",
        "retryCount",
        "",
        "getRetryCount",
        "()I",
        "None",
        "Poll",
        "Refresh",
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;",
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;",
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;",
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


# virtual methods
.method public abstract getRetryCount()I
.end method

.method public abstract getShouldRefresh()Z
.end method
