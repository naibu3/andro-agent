.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;
.super Ljava/lang/Object;
.source "ConsentPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002J\u0008\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u0002H\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;",
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
        "withPlatformLogos",
        "withConnectedAccountLogos",
        "manualEntryPlusMicrodeposits",
        "instantDebits",
        "sampleConsent",
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "bullets",
        "",
        "Lcom/stripe/android/financialconnections/model/Bullet;",
        "ConsentPreviewState",
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
            "Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;",
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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 26
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->withPlatformLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 27
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->withConnectedAccountLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 28
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->manualEntryPlusMicrodeposits()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 29
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->instantDebits()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 25
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

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

    .line 172
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Bullet;

    .line 173
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 172
    new-instance v3, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 174
    const-string v4, "Account details"

    const/4 v5, 0x0

    .line 172
    invoke-direct {v3, v5, v1, v4}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x0

    aput-object v3, v0, v1

    .line 178
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 177
    new-instance v3, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 179
    const-string v4, "Balances"

    .line 177
    invoke-direct {v3, v5, v1, v4}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x1

    aput-object v3, v0, v1

    .line 183
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 182
    new-instance v2, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 184
    const-string v3, "Transactions"

    .line 182
    invoke-direct {v2, v5, v1, v3}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x2

    aput-object v2, v0, v1

    .line 171
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final instantDebits()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;
    .locals 9

    .line 94
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    .line 95
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    .line 96
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 97
    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    .line 98
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    const/4 v5, 0x2

    .line 100
    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "www.logo1.com"

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/4 v6, 0x1

    .line 101
    const-string v8, "www.logo2.com"

    aput-object v8, v5, v6

    .line 99
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 97
    invoke-direct {v3, v4, v5, v7, v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V

    .line 96
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 95
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/Theme;->LinkLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 94
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/ui/theme/Theme;)V

    return-object v0
.end method

.method private final manualEntryPlusMicrodeposits()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;
    .locals 9

    .line 75
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    .line 76
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    .line 77
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 78
    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    .line 79
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    const/4 v5, 0x2

    .line 81
    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "www.logo1.com"

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 82
    const-string v6, "www.logo2.com"

    const/4 v8, 0x1

    aput-object v6, v5, v8

    .line 80
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 78
    invoke-direct {v3, v4, v5, v7, v8}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V

    .line 77
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 76
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/Theme;->DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 75
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/ui/theme/Theme;)V

    return-object v0
.end method

.method private final sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 14

    .line 114
    new-instance v3, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    const/4 v0, 0x3

    .line 116
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Bullet;

    .line 117
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 116
    new-instance v4, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 118
    const-string v5, "Stripe will allow Goldilocks to access only the data requested"

    .line 116
    invoke-direct {v4, v5, v1, v5}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x0

    aput-object v4, v0, v1

    .line 121
    new-instance v5, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 122
    new-instance v7, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v7, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v6, 0x0

    .line 121
    const-string v8, "Stripe will allow Goldilocks to access only the data requested"

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x1

    aput-object v5, v0, v4

    .line 125
    new-instance v6, Lcom/stripe/android/financialconnections/model/Bullet;

    .line 126
    new-instance v8, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v8, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v7, 0x0

    .line 125
    const-string v9, "Stripe will allow Goldilocks to access only the data requested"

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x2

    aput-object v6, v0, v5

    .line 115
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 114
    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;-><init>(Ljava/util/List;)V

    .line 136
    new-instance v7, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v7, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 139
    new-instance v10, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 140
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->bullets()Ljava/util/List;

    move-result-object v0

    .line 139
    invoke-direct {v10, v0}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    .line 143
    new-instance v11, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    .line 145
    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 146
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->bullets()Ljava/util/List;

    move-result-object v6

    .line 145
    invoke-direct {v0, v6}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    .line 143
    const-string v6, "Connected account placeholder"

    invoke-direct {v11, v6, v0}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V

    .line 135
    new-instance v6, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 142
    const-string v12, "Learn more about data access"

    .line 149
    const-string v13, "OK"

    .line 135
    const-string v8, "Goldilocks uses Stripe to link your accounts"

    const-string v9, "Goldilocks will use your account and routing number, balances and transactions:"

    invoke-direct/range {v6 .. v13}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    new-instance v8, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v8, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 156
    new-instance v11, Lcom/stripe/android/financialconnections/model/LegalDetailsBody;

    .line 158
    new-array v0, v5, [Lcom/stripe/android/financialconnections/model/ServerLink;

    new-instance v2, Lcom/stripe/android/financialconnections/model/ServerLink;

    const-string v7, "Terms"

    const/4 v9, 0x0

    invoke-direct {v2, v7, v9, v5, v9}, Lcom/stripe/android/financialconnections/model/ServerLink;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v2, v0, v1

    .line 161
    new-instance v1, Lcom/stripe/android/financialconnections/model/ServerLink;

    .line 162
    const-string v2, "Privacy Policy"

    .line 161
    invoke-direct {v1, v2, v9, v5, v9}, Lcom/stripe/android/financialconnections/model/ServerLink;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v1, v0, v4

    .line 157
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 156
    invoke-direct {v11, v0}, Lcom/stripe/android/financialconnections/model/LegalDetailsBody;-><init>(Ljava/util/List;)V

    .line 151
    new-instance v7, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    .line 167
    const-string v12, "OK"

    .line 166
    const-string v13, "Learn more"

    .line 151
    const-string v9, "Terms and privacy policy"

    const-string v10, "Stripe only uses your data and credentials as described in the Terms, such as to improve its services, manage loss, and mitigate fraud."

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsBody;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    new-instance v0, Lcom/stripe/android/financialconnections/model/ConsentPane;

    .line 134
    const-string v4, "Agree"

    move-object v5, v6

    move-object v6, v7

    .line 113
    const-string v7, "Goldilocks uses Stripe to link your accounts"

    .line 112
    const-string v1, "Manually verify instead (takes 1-2 business days)"

    const-string v2, "Stripe will allow Goldilocks to access only the data requested. We never share your login details with them."

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/model/ConsentPane;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V

    return-object v0
.end method

.method private final withConnectedAccountLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;
    .locals 14

    .line 55
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    .line 56
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    .line 57
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 58
    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    .line 59
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    const/16 v12, 0x7d

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v13}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    const/4 v5, 0x3

    .line 61
    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "www.logo1.com"

    aput-object v7, v5, v6

    .line 62
    const-string v6, "www.logo2.com"

    const/4 v7, 0x1

    aput-object v6, v5, v7

    const/4 v6, 0x2

    .line 63
    const-string v8, "www.logo3.com"

    aput-object v8, v5, v6

    .line 60
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 58
    invoke-direct {v3, v4, v5, v7, v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V

    .line 57
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 56
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/Theme;->DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 55
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/ui/theme/Theme;)V

    return-object v0
.end method

.method private final withPlatformLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;
    .locals 14

    .line 36
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;

    .line 37
    new-instance v1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    .line 38
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 39
    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->sampleConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    const/16 v12, 0x7d

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v13}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v4

    const/4 v5, 0x2

    .line 42
    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "www.logo1.com"

    aput-object v7, v5, v6

    .line 43
    const-string v6, "www.logo2.com"

    const/4 v7, 0x1

    aput-object v6, v5, v7

    .line 41
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 39
    invoke-direct {v3, v4, v5, v7, v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V

    .line 38
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    sget-object v2, Lcom/stripe/android/financialconnections/ui/theme/Theme;->DefaultLight:Lcom/stripe/android/financialconnections/ui/theme/Theme;

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Lcom/stripe/android/financialconnections/ui/theme/Theme;)V

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 33
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
            "Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider$ConsentPreviewState;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
