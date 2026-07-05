.class public final Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;
.super Ljava/lang/Object;
.source "NoticeSheetPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\nH\u0002J\u0008\u0010\u000b\u001a\u00020\u000cH\u0002J\u0008\u0010\r\u001a\u00020\u000cH\u0002J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "legal",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;",
        "dataAccess",
        "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;",
        "dataAccessWithConnectedAccounts",
        "legalDetails",
        "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "dataAccessNotice",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "bullets",
        "",
        "Lcom/stripe/android/financialconnections/model/Bullet;",
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
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 17
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->legal()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->dataAccess()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 19
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->dataAccessWithConnectedAccounts()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    move-result-object v2

    aput-object v2, v0, v1

    .line 16
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final bullets()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/Bullet;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 77
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Bullet;

    .line 78
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 77
    new-instance v3, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 79
    const-string v4, "Account details"

    const/4 v5, 0x0

    .line 77
    invoke-direct {v3, v5, v1, v4}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x0

    aput-object v3, v0, v1

    .line 83
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 82
    new-instance v3, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 84
    const-string v4, "Balances"

    .line 82
    invoke-direct {v3, v5, v1, v4}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x1

    aput-object v3, v0, v1

    .line 88
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 87
    new-instance v2, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 89
    const-string v3, "Transactions"

    .line 87
    invoke-direct {v2, v5, v1, v3}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x2

    aput-object v2, v0, v1

    .line 76
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final dataAccess()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;
    .locals 11

    .line 26
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    .line 27
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->dataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v1

    const/16 v9, 0x6f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->copy$default(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    return-object v0
.end method

.method private final dataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 8

    .line 59
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v0, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 62
    new-instance v4, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 63
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->bullets()Ljava/util/List;

    move-result-object v0

    .line 62
    invoke-direct {v4, v0}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    .line 66
    new-instance v5, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    .line 68
    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 69
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->bullets()Ljava/util/List;

    move-result-object v2

    .line 68
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    .line 66
    const-string v2, "Connected account placeholder"

    invoke-direct {v5, v2, v0}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V

    .line 58
    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 65
    const-string v6, "Learn more about data access"

    .line 72
    const-string v7, "OK"

    .line 58
    const-string v2, "Goldilocks uses Stripe to link your accounts"

    const-string v3, "Goldilocks will use your account and routing number, balances and transactions:"

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final dataAccessWithConnectedAccounts()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;
    .locals 2

    .line 32
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;

    .line 33
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->dataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$DataAccess;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    return-object v0
.end method

.method private final legal()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;
    .locals 2

    .line 22
    new-instance v0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;

    .line 23
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->legalDetails()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$Legal;-><init>(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    return-object v0
.end method

.method private final legalDetails()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 7

    .line 38
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v0, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 42
    new-instance v4, Lcom/stripe/android/financialconnections/model/LegalDetailsBody;

    const/4 v0, 0x2

    .line 44
    new-array v2, v0, [Lcom/stripe/android/financialconnections/model/ServerLink;

    new-instance v3, Lcom/stripe/android/financialconnections/model/ServerLink;

    const-string v5, "Terms"

    const/4 v6, 0x0

    invoke-direct {v3, v5, v6, v0, v6}, Lcom/stripe/android/financialconnections/model/ServerLink;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    .line 47
    new-instance v3, Lcom/stripe/android/financialconnections/model/ServerLink;

    .line 48
    const-string v5, "Privacy Policy"

    .line 47
    invoke-direct {v3, v5, v6, v0, v6}, Lcom/stripe/android/financialconnections/model/ServerLink;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x1

    aput-object v3, v2, v0

    .line 43
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 42
    invoke-direct {v4, v0}, Lcom/stripe/android/financialconnections/model/LegalDetailsBody;-><init>(Ljava/util/List;)V

    .line 37
    new-instance v0, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    .line 53
    const-string v5, "OK"

    .line 52
    const-string v6, "Learn more"

    .line 37
    const-string v2, "Terms and privacy policy"

    const-string v3, "Stripe only uses your data and credentials as described in the Terms, such as to improve its services, manage loss, and mitigate fraud."

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
