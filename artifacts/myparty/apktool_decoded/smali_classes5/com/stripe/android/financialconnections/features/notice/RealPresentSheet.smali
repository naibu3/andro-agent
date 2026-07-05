.class public final Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;
.super Ljava/lang/Object;
.source "PresentSheet.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/features/notice/PresentSheet;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;",
        "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;",
        "navigationManager",
        "Lcom/stripe/android/uicore/navigation/NavigationManager;",
        "noticeSheetContentRepository",
        "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;",
        "accountUpdateRequiredContentRepository",
        "Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;",
        "<init>",
        "(Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;)V",
        "invoke",
        "",
        "content",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        "referrer",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
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
.field private final accountUpdateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;

.field private final navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

.field private final noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "navigationManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noticeSheetContentRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountUpdateRequiredContentRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->accountUpdateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;

    return-void
.end method


# virtual methods
.method public invoke(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V
    .locals 9

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referrer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->accountUpdateRequiredContentRepository:Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;

    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;->set(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;)V

    .line 25
    sget-object p1, Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p1, p2, v2, v1, v2}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 26
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->noticeSheetContentRepository:Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;->set(Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;)V

    .line 30
    sget-object p1, Lcom/stripe/android/financialconnections/navigation/Destination$Notice;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Notice;

    check-cast p1, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-static {p1, p2, v2, v1, v2}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 31
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;->navigationManager:Lcom/stripe/android/uicore/navigation/NavigationManager;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    return-void
.end method
