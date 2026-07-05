.class public final Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
.super Ljava/lang/Object;
.source "SharedPartnerAuthState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;,
        Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ClickableText;,
        Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;,
        Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0004*+,-BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eB\u0011\u0008\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000f\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u000cH\u00c6\u0003JI\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u00c6\u0001J\u0013\u0010$\u001a\u00020\u000c2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001a\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
        "",
        "pane",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "payload",
        "Lcom/stripe/android/financialconnections/presentation/Async;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
        "viewEffect",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;",
        "authenticationStatus",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;",
        "inModal",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)V",
        "args",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;",
        "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;)V",
        "getPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getPayload",
        "()Lcom/stripe/android/financialconnections/presentation/Async;",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;",
        "getAuthenticationStatus",
        "getInModal",
        "()Z",
        "isNetworkingRelinkSession",
        "canNavigateBack",
        "getCanNavigateBack",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Payload",
        "AuthenticationStatus",
        "ViewEffect",
        "ClickableText",
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
.field private final authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;",
            ">;"
        }
    .end annotation
.end field

.field private final inModal:Z

.field private final pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final payload:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;)V
    .locals 9

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;->getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    .line 25
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;->getInModal()Z

    move-result v6

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    .line 23
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticationStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 15
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    .line 16
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 17
    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 14
    sget-object p2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p2, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 16
    sget-object p2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    move-object p4, p2

    check-cast p4, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/4 p5, 0x0

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;",
            ">;Z)",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;"
        }
    .end annotation

    const-string v0, "pane"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authenticationStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAuthenticationStatus()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getCanNavigateBack()Z
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    instance-of v1, v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    if-nez v1, :cond_0

    .line 47
    instance-of v0, v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    instance-of v0, v0, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->isNetworkingRelinkSession()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getInModal()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    return v0
.end method

.method public final getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getPayload()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isNetworkingRelinkSession()Z
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->BANK_AUTH_REPAIR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->pane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->authenticationStatus:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;->inModal:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SharedPartnerAuthState(pane="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", payload="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", viewEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", authenticationStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", inModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
