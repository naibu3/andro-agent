.class public final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;
.super Ljava/lang/Object;
.source "PartnerAuthPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002J\u0008\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0012\u001a\u00020\u0013H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "count",
        "",
        "getCount",
        "()I",
        "canonical",
        "prepaneLoading",
        "browserLoading",
        "session",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "oauthPrepane",
        "Lcom/stripe/android/financialconnections/model/OauthPrepane;",
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
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
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

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 22
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 23
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->prepaneLoading()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 24
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->browserLoading()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 21
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final browserLoading()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 12

    .line 60
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 61
    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    .line 63
    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v9, 0x0

    .line 66
    const-string v10, "url"

    const/4 v3, 0x1

    .line 63
    const-string v4, "id"

    const/4 v5, 0x0

    const-string v6, "name"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 73
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->session()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v3

    const/4 v4, 0x0

    .line 61
    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;-><init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    .line 60
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 77
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 59
    new-instance v4, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    .line 60
    move-object v6, v0

    check-cast v6, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 77
    move-object v8, v1

    check-cast v8, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 59
    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private final canonical()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 11

    .line 31
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 32
    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;

    .line 34
    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v9, 0x0

    .line 37
    const-string v10, "url"

    const/4 v3, 0x1

    .line 34
    const-string v4, "id"

    const/4 v5, 0x0

    const-string v6, "name"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->session()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v3

    const/4 v4, 0x0

    .line 32
    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;-><init>(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    .line 31
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 47
    sget-object v1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 49
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 30
    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    .line 31
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 47
    move-object v6, v1

    check-cast v6, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x10

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 30
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private final oauthPrepane()Lcom/stripe/android/financialconnections/model/OauthPrepane;
    .locals 10

    .line 102
    new-instance v1, Lcom/stripe/android/financialconnections/model/Body;

    const/4 v0, 0x2

    .line 104
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Entry;

    new-instance v2, Lcom/stripe/android/financialconnections/model/Entry$Image;

    .line 105
    new-instance v3, Lcom/stripe/android/financialconnections/model/Image;

    const-string v4, "https://b.stripecdn.com/connections-statics-srv/assets/PrepaneAsset--account_numbers-capitalone-2x.gif"

    invoke-direct {v3, v4}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 104
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/model/Entry$Image;-><init>(Lcom/stripe/android/financialconnections/model/Image;)V

    const/4 v3, 0x0

    aput-object v2, v0, v3

    .line 107
    new-instance v2, Lcom/stripe/android/financialconnections/model/Entry$Text;

    .line 108
    const-string v3, "Dynamic content placeholder that will show below image."

    .line 107
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/model/Entry$Text;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    aput-object v2, v0, v3

    .line 103
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 102
    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/model/Body;-><init>(Ljava/util/List;)V

    .line 112
    new-instance v2, Lcom/stripe/android/financialconnections/model/Cta;

    const/4 v0, 0x0

    .line 114
    const-string v3, "Continue!"

    .line 112
    invoke-direct {v2, v0, v3}, Lcom/stripe/android/financialconnections/model/Cta;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    .line 116
    new-instance v3, Lcom/stripe/android/financialconnections/model/Image;

    const-string v0, "www.image.url"

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    move-object v0, v4

    .line 117
    new-instance v4, Lcom/stripe/android/financialconnections/model/PartnerNotice;

    .line 118
    new-instance v5, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v5, v0}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 119
    const-string v0, "Stripe works with partners like MX to reliably offer access to thousands of financial institutions. Learn more"

    .line 117
    invoke-direct {v4, v5, v0}, Lcom/stripe/android/financialconnections/model/PartnerNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lcom/stripe/android/financialconnections/model/OauthPrepane;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-string v6, "Sign in with Sample bank"

    const-string v7, "Next, you\'ll be prompted to log in and connect your accounts."

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/model/OauthPrepane;-><init>(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final prepaneLoading()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;
    .locals 10

    .line 53
    new-instance v0, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    sget-object v1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    .line 56
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 52
    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    .line 53
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 54
    move-object v6, v1

    check-cast v6, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 52
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private final session()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 22

    .line 87
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 89
    new-instance v10, Lcom/stripe/android/financialconnections/model/Display;

    .line 90
    new-instance v11, Lcom/stripe/android/financialconnections/model/TextUpdate;

    .line 91
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->oauthPrepane()Lcom/stripe/android/financialconnections/model/OauthPrepane;

    move-result-object v16

    const/16 v20, 0xef

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 90
    invoke-direct/range {v11 .. v21}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    invoke-direct {v10, v11}, Lcom/stripe/android/financialconnections/model/Display;-><init>(Lcom/stripe/android/financialconnections/model/TextUpdate;)V

    .line 83
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const/4 v1, 0x1

    .line 85
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/16 v11, 0xe8

    .line 83
    const-string v1, "1234"

    const-string v3, "FINICITY_CONNECT_V2_OAUTH"

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v5

    invoke-direct/range {v0 .. v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 28
    invoke-super {p0}, Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;->getCount()I

    move-result v0

    return v0
.end method

.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
