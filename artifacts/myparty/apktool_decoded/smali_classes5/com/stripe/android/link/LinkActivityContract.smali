.class public final Lcom/stripe/android/link/LinkActivityContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "LinkActivityContract.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityContract$Args;,
        Lcom/stripe/android/link/LinkActivityContract$Companion;,
        Lcom/stripe/android/link/LinkActivityContract$Result;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0015\u0016\u0017B!\u0008\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "nativeLinkActivityContract",
        "Lcom/stripe/android/link/NativeLinkActivityContract;",
        "webLinkActivityContract",
        "Lcom/stripe/android/link/WebLinkActivityContract;",
        "linkGateFactory",
        "Lcom/stripe/android/link/gate/LinkGate$Factory;",
        "<init>",
        "(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lcom/stripe/android/link/gate/LinkGate$Factory;)V",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "Args",
        "Result",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/link/LinkActivityContract$Companion;

.field public static final EXTRA_RESULT:Ljava/lang/String; = "com.stripe.android.link.LinkActivityContract.extra_result"


# instance fields
.field private final linkGateFactory:Lcom/stripe/android/link/gate/LinkGate$Factory;

.field private final nativeLinkActivityContract:Lcom/stripe/android/link/NativeLinkActivityContract;

.field private final webLinkActivityContract:Lcom/stripe/android/link/WebLinkActivityContract;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/LinkActivityContract$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/LinkActivityContract;->Companion:Lcom/stripe/android/link/LinkActivityContract$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkActivityContract;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lcom/stripe/android/link/gate/LinkGate$Factory;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "nativeLinkActivityContract"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webLinkActivityContract"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkGateFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityContract;->nativeLinkActivityContract:Lcom/stripe/android/link/NativeLinkActivityContract;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract;->webLinkActivityContract:Lcom/stripe/android/link/WebLinkActivityContract;

    .line 15
    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityContract;->linkGateFactory:Lcom/stripe/android/link/gate/LinkGate$Factory;

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->linkGateFactory:Lcom/stripe/android/link/gate/LinkGate$Factory;

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getConfiguration$paymentsheet_release()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/stripe/android/link/gate/LinkGate$Factory;->create(Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/link/gate/LinkGate;

    move-result-object v0

    .line 20
    invoke-interface {v0}, Lcom/stripe/android/link/gate/LinkGate;->getUseNativeLink()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->nativeLinkActivityContract:Lcom/stripe/android/link/NativeLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/NativeLinkActivityContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->webLinkActivityContract:Lcom/stripe/android/link/WebLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 12
    check-cast p2, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;
    .locals 1

    const v0, 0x11f5b

    if-ne p1, v0, :cond_0

    .line 30
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->nativeLinkActivityContract:Lcom/stripe/android/link/NativeLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/NativeLinkActivityContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    return-object p1

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract;->webLinkActivityContract:Lcom/stripe/android/link/WebLinkActivityContract;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/WebLinkActivityContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/link/LinkActivityResult;

    move-result-object p1

    return-object p1
.end method
