.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;
.super Ljava/lang/Object;
.source "AccountPickerPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002J\u0008\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u0002H\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u000e\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0014H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
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
        "loading",
        "error",
        "multiSelect",
        "singleSelect",
        "dataAccessNotice",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "bullets",
        "",
        "Lcom/stripe/android/financialconnections/model/Bullet;",
        "partnerAccountList",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
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
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
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

    const/4 v0, 0x4

    .line 22
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->loading()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 23
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->error()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 24
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->multiSelect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 25
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->singleSelect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 21
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

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

    const/4 v0, 0x2

    .line 134
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/Bullet;

    .line 135
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 134
    new-instance v3, Lcom/stripe/android/financialconnections/model/Bullet;

    const-string v4, "Account number, routing number, account type, account nickname."

    const-string v5, "Account details"

    invoke-direct {v3, v4, v1, v5}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x0

    aput-object v3, v0, v1

    .line 140
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 139
    new-instance v2, Lcom/stripe/android/financialconnections/model/Bullet;

    invoke-direct {v2, v4, v1, v5}, Lcom/stripe/android/financialconnections/model/Bullet;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;)V

    const/4 v1, 0x1

    aput-object v2, v0, v1

    .line 133
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final dataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 8

    .line 117
    new-instance v1, Lcom/stripe/android/financialconnections/model/Image;

    const-string v0, "https://www.cdn.stripe.com/12321312321.png"

    invoke-direct {v1, v0}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 120
    new-instance v4, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 121
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->bullets()Ljava/util/List;

    move-result-object v0

    .line 120
    invoke-direct {v4, v0}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    .line 124
    new-instance v5, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    .line 126
    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 127
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->bullets()Ljava/util/List;

    move-result-object v2

    .line 126
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;-><init>(Ljava/util/List;)V

    .line 124
    const-string v2, "Connected account placeholder"

    invoke-direct {v5, v2, v0}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V

    .line 116
    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 123
    const-string v6, "Learn more about data access"

    .line 130
    const-string v7, "OK"

    .line 116
    const-string v2, "Goldilocks uses Stripe to link your accounts"

    const-string v3, "Goldilocks will use your account and routing number, balances and transactions:"

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final error()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 12

    .line 36
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    .line 37
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    .line 38
    new-instance v2, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;

    .line 40
    new-instance v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v10, 0x0

    .line 43
    const-string v11, "Institution 2 url"

    const/4 v4, 0x0

    .line 40
    const-string v5, "2"

    const/4 v6, 0x0

    const-string v7, "Institution 2"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 51
    new-instance v4, Lcom/stripe/android/core/exception/APIException;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/core/exception/APIException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/core/exception/StripeException;

    const/4 v5, 0x1

    .line 38
    const-string v6, "Merchant name"

    invoke-direct {v2, v5, v3, v6, v4}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;-><init>(ILcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 37
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 54
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    const/16 v7, 0x2d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 36
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final loading()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 9

    .line 31
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    .line 32
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 33
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    const/16 v7, 0x2d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 31
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final multiSelect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 13

    .line 57
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    .line 58
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 65
    new-instance v7, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, ""

    invoke-direct {v7, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 59
    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v9, 0x0

    .line 62
    const-string v10, "Institution 1 url"

    const/4 v3, 0x0

    .line 59
    const-string v4, "1"

    const/4 v5, 0x0

    const-string v6, "Institution 1"

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 58
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 70
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 73
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->partnerAccountList()Ljava/util/List;

    move-result-object v5

    .line 74
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->dataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v7

    .line 75
    sget-object v8, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->Multiple:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    .line 71
    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    .line 80
    const-string v11, "Random business"

    const/4 v12, 0x0

    const/4 v4, 0x0

    .line 71
    const-string v6, "My business can access account details, balances, account ownership details and transactions. <a href=\"https://stripe.com\">Learn more</a>"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V

    .line 70
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v3, 0x2

    .line 84
    new-array v3, v3, [Ljava/lang/String;

    const-string v5, "id1"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-string v5, "id3"

    aput-object v5, v3, v4

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const/16 v7, 0x2c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 57
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final partnerAccountList()Ljava/util/List;
    .locals 67
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x5

    .line 147
    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/PartnerAccount;

    .line 149
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 157
    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 158
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 147
    new-instance v1, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const/16 v2, 0x3e8

    .line 152
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v30, 0x1

    .line 155
    invoke-static/range {v30 .. v30}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v44

    const v21, 0x7cd00

    const/16 v22, 0x0

    .line 147
    const-string v2, "Authorization"

    const-string v4, "id1"

    const-string v5, "With balance"

    const-string v9, "$"

    const/4 v10, 0x0

    const-string v11, "1234"

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v15

    const-string v15, ""

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v14, v44

    invoke-direct/range {v1 .. v22}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    .line 166
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v21

    .line 147
    aput-object v1, v0, v2

    .line 162
    sget-object v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 168
    sget-object v13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 169
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v14

    move-object v15, v8

    .line 160
    new-instance v8, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v28, 0x7cf80

    const/16 v29, 0x0

    const-string v9, "Authorization"

    const-string v11, "id2"

    const-string v12, "With balance disabled"

    const-string v22, "Cannot be selected"

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v8 .. v29}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v8, v0, v30

    .line 173
    sget-object v33, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 177
    sget-object v36, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 180
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v37

    .line 171
    new-instance v31, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v51, 0x7cdc0

    const/16 v52, 0x0

    const-string v32, "Authorization"

    const-string v34, "id3"

    const-string v35, "No balance"

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-string v41, "1234"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-string v45, "Cannot be selected"

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v31 .. v52}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    aput-object v31, v0, v1

    .line 184
    sget-object v47, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 188
    sget-object v50, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 191
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v51

    .line 182
    new-instance v45, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v65, 0x7cdc0

    const/16 v66, 0x0

    const-string v46, "Authorization"

    const-string v48, "id4"

    const-string v49, "No balance disabled"

    const/16 v53, 0x0

    const/16 v54, 0x0

    const-string v55, "1234"

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-string v59, "Cannot be selected"

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    move-object/from16 v58, v21

    invoke-direct/range {v45 .. v66}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x3

    aput-object v45, v0, v1

    .line 195
    sget-object v33, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 201
    sget-object v36, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 202
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v37

    .line 193
    new-instance v31, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v51, 0x6edc0

    const-string v32, "Authorization"

    const-string v34, "id5"

    const-string v35, "Very long institution that is already linked"

    const-string v41, "1234"

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const-string v48, "linkedAccountId"

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v31 .. v52}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x4

    aput-object v31, v0, v1

    .line 146
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final singleSelect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 13

    .line 87
    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    .line 88
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 95
    new-instance v7, Lcom/stripe/android/financialconnections/model/Image;

    const-string v2, ""

    invoke-direct {v7, v2}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 89
    new-instance v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v9, 0x0

    .line 92
    const-string v10, "Institution 1 url"

    const/4 v3, 0x0

    .line 89
    const-string v4, "1"

    const/4 v5, 0x0

    const-string v6, "Institution 1"

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 88
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 100
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 103
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->partnerAccountList()Ljava/util/List;

    move-result-object v5

    .line 104
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->dataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v7

    .line 105
    sget-object v8, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->Single:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    .line 101
    new-instance v3, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    .line 109
    const-string v11, "Random business"

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    .line 101
    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V

    .line 100
    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 113
    const-string v3, "id1"

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const/16 v7, 0x2c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 87
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;ZLcom/stripe/android/financialconnections/presentation/Async;Ljava/util/Set;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 29
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
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
