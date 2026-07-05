.class public final Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;
.super Ljava/lang/Object;
.source "DefaultLinkAnalyticsHelper.kt"

# interfaces
.implements Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;",
        "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "<init>",
        "(Lcom/stripe/android/link/analytics/LinkEventsReporter;)V",
        "onLinkLaunched",
        "",
        "onLinkResult",
        "linkActivityResult",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "onLinkPopupSkipped",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/analytics/LinkEventsReporter;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkEventsReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    return-void
.end method


# virtual methods
.method public onLinkLaunched()V
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v0}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onPopupShow()V

    return-void
.end method

.method public onLinkPopupSkipped()V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v0}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onPopupSkipped()V

    return-void
.end method

.method public onLinkResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "linkActivityResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-eqz v0, :cond_3

    .line 16
    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;->getReason()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 22
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onPopupLogout()V

    return-void

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onPopupCancel()V

    return-void

    .line 28
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    if-nez v0, :cond_6

    .line 29
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    if-eqz v0, :cond_4

    goto :goto_0

    .line 33
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    if-eqz v0, :cond_5

    .line 34
    iget-object v0, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onPopupError(Ljava/lang/Throwable;)V

    return-void

    .line 14
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 30
    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onPopupSuccess()V

    return-void
.end method
