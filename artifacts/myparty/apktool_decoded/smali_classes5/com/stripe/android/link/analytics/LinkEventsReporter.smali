.class public interface abstract Lcom/stripe/android/link/analytics/LinkEventsReporter;
.super Ljava/lang/Object;
.source "LinkEventsReporter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/analytics/LinkEventsReporter$DefaultImpls;,
        Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u000e\u0008`\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0003H&J\u0008\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u0010\u001a\u00020\u0003H&J\u0008\u0010\u0011\u001a\u00020\u0003H&J\u0008\u0010\u0012\u001a\u00020\u0003H&J\u0008\u0010\u0013\u001a\u00020\u0003H&J\u0008\u0010\u0014\u001a\u00020\u0003H&J\u0008\u0010\u0015\u001a\u00020\u0003H&J\u0008\u0010\u0016\u001a\u00020\u0003H&J\u0008\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0008\u0010\u0019\u001a\u00020\u0003H&J\u0008\u0010\u001a\u001a\u00020\u0003H&\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "",
        "onInvalidSessionState",
        "",
        "state",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;",
        "onInlineSignupCheckboxChecked",
        "onSignupFlowPresented",
        "onSignupStarted",
        "isInline",
        "",
        "onSignupCompleted",
        "onSignupFailure",
        "error",
        "",
        "onAccountLookupFailure",
        "on2FAStart",
        "on2FAStartFailure",
        "on2FAComplete",
        "on2FAFailure",
        "on2FACancel",
        "onPopupShow",
        "onPopupSuccess",
        "onPopupCancel",
        "onPopupError",
        "onPopupLogout",
        "onPopupSkipped",
        "SessionState",
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
.method public abstract on2FACancel()V
.end method

.method public abstract on2FAComplete()V
.end method

.method public abstract on2FAFailure()V
.end method

.method public abstract on2FAStart()V
.end method

.method public abstract on2FAStartFailure()V
.end method

.method public abstract onAccountLookupFailure(Ljava/lang/Throwable;)V
.end method

.method public abstract onInlineSignupCheckboxChecked()V
.end method

.method public abstract onInvalidSessionState(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)V
.end method

.method public abstract onPopupCancel()V
.end method

.method public abstract onPopupError(Ljava/lang/Throwable;)V
.end method

.method public abstract onPopupLogout()V
.end method

.method public abstract onPopupShow()V
.end method

.method public abstract onPopupSkipped()V
.end method

.method public abstract onPopupSuccess()V
.end method

.method public abstract onSignupCompleted(Z)V
.end method

.method public abstract onSignupFailure(ZLjava/lang/Throwable;)V
.end method

.method public abstract onSignupFlowPresented()V
.end method

.method public abstract onSignupStarted(Z)V
.end method
