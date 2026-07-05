.class public final Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt;
.super Ljava/lang/Object;
.source "LinkContentScrollHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "LocalLinkContentScrollHandler",
        "Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "Lcom/stripe/android/link/ui/LinkContentScrollHandler;",
        "getLocalLinkContentScrollHandler",
        "()Landroidx/compose/runtime/ProvidableCompositionLocal;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final LocalLinkContentScrollHandler:Landroidx/compose/runtime/ProvidableCompositionLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/link/ui/LinkContentScrollHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$PHSTX_M8M_sstJns6857OHrAns0()Lcom/stripe/android/link/ui/LinkContentScrollHandler;
    .locals 1

    invoke-static {}, Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt;->LocalLinkContentScrollHandler$lambda$0()Lcom/stripe/android/link/ui/LinkContentScrollHandler;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 5
    new-instance v0, Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt$$ExternalSyntheticLambda0;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Landroidx/compose/runtime/CompositionLocalKt;->compositionLocalOf$default(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt;->LocalLinkContentScrollHandler:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-void
.end method

.method private static final LocalLinkContentScrollHandler$lambda$0()Lcom/stripe/android/link/ui/LinkContentScrollHandler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final getLocalLinkContentScrollHandler()Landroidx/compose/runtime/ProvidableCompositionLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/ProvidableCompositionLocal<",
            "Lcom/stripe/android/link/ui/LinkContentScrollHandler;",
            ">;"
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt;->LocalLinkContentScrollHandler:Landroidx/compose/runtime/ProvidableCompositionLocal;

    return-object v0
.end method
