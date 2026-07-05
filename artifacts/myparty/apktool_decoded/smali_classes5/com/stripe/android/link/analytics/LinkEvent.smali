.class public abstract Lcom/stripe/android/link/analytics/LinkEvent;
.super Ljava/lang/Object;
.source "LinkEvent.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;,
        Lcom/stripe/android/link/analytics/LinkEvent$PopupCancel;,
        Lcom/stripe/android/link/analytics/LinkEvent$PopupError;,
        Lcom/stripe/android/link/analytics/LinkEvent$PopupLogout;,
        Lcom/stripe/android/link/analytics/LinkEvent$PopupShow;,
        Lcom/stripe/android/link/analytics/LinkEvent$PopupSkipped;,
        Lcom/stripe/android/link/analytics/LinkEvent$PopupSuccess;,
        Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;,
        Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;,
        Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;,
        Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailureInvalidSessionState;,
        Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;,
        Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;,
        Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;,
        Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;,
        Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;,
        Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;,
        Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/LinkEvent;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "<init>",
        "()V",
        "SignUpCheckboxChecked",
        "SignUpFlowPresented",
        "SignUpStart",
        "SignUpComplete",
        "SignUpFailure",
        "SignUpFailureInvalidSessionState",
        "AccountLookupFailure",
        "TwoFAStart",
        "TwoFAStartFailure",
        "TwoFAComplete",
        "TwoFAFailure",
        "TwoFACancel",
        "PopupShow",
        "PopupSuccess",
        "PopupCancel",
        "PopupError",
        "PopupLogout",
        "PopupSkipped",
        "Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;",
        "Lcom/stripe/android/link/analytics/LinkEvent$PopupCancel;",
        "Lcom/stripe/android/link/analytics/LinkEvent$PopupError;",
        "Lcom/stripe/android/link/analytics/LinkEvent$PopupLogout;",
        "Lcom/stripe/android/link/analytics/LinkEvent$PopupShow;",
        "Lcom/stripe/android/link/analytics/LinkEvent$PopupSkipped;",
        "Lcom/stripe/android/link/analytics/LinkEvent$PopupSuccess;",
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;",
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;",
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;",
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailureInvalidSessionState;",
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;",
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;",
        "Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;",
        "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;",
        "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;",
        "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;",
        "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/analytics/LinkEvent;-><init>()V

    return-void
.end method
