.class public final Lcom/qonversion/android/sdk/internal/dto/QPermission;
.super Ljava/lang/Object;
.source "QPermission.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008)\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0003\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0003\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0014H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000f\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\u000e\u0010<\u001a\u00020\rH\u00c0\u0003\u00a2\u0006\u0002\u0008=J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u00b1\u0001\u0010@\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\r2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u00142\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0003\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\u0008\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\rH\u00d6\u0001J\u0006\u0010E\u001a\u00020BJ\t\u0010F\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u000c\u001a\u00020\rX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001dR\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001d\u00a8\u0006G"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "",
        "permissionID",
        "",
        "productID",
        "renewState",
        "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "startedDate",
        "Ljava/util/Date;",
        "expirationDate",
        "source",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
        "active",
        "",
        "renewsCount",
        "trialStartDate",
        "firstPurchaseDate",
        "lastPurchaseDate",
        "lastActivatedOfferCode",
        "grantType",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
        "autoRenewDisableDate",
        "transactions",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V",
        "getActive$sdk_release",
        "()I",
        "getAutoRenewDisableDate",
        "()Ljava/util/Date;",
        "getExpirationDate",
        "getFirstPurchaseDate",
        "getGrantType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
        "getLastActivatedOfferCode",
        "()Ljava/lang/String;",
        "getLastPurchaseDate",
        "getPermissionID",
        "getProductID",
        "getRenewState",
        "()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "getRenewsCount",
        "getSource",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
        "getStartedDate",
        "getTransactions",
        "()Ljava/util/List;",
        "getTrialStartDate",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component7$sdk_release",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "isActive",
        "toString",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final active:I

.field private final autoRenewDisableDate:Ljava/util/Date;

.field private final expirationDate:Ljava/util/Date;

.field private final firstPurchaseDate:Ljava/util/Date;

.field private final grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

.field private final lastActivatedOfferCode:Ljava/lang/String;

.field private final lastPurchaseDate:Ljava/util/Date;

.field private final permissionID:Ljava/lang/String;

.field private final productID:Ljava/lang/String;

.field private final renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

.field private final renewsCount:I

.field private final source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

.field private final startedDate:Ljava/util/Date;

.field private final transactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;"
        }
    .end annotation
.end field

.field private final trialStartDate:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "associated_product"
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "renew_state"
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "started_timestamp"
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "expiration_timestamp"
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "source"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "active"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "renews_count"
        .end annotation
    .end param
    .param p9    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "trial_start_timestamp"
        .end annotation
    .end param
    .param p10    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "first_purchase_timestamp"
        .end annotation
    .end param
    .param p11    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "last_purchase_timestamp"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "last_activated_offer_code"
        .end annotation
    .end param
    .param p13    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "grant_type"
        .end annotation
    .end param
    .param p14    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "auto_renew_disable_timestamp"
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "store_transactions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
            "II",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    move-object/from16 v6, p13

    move-object/from16 v7, p15

    const-string v8, "permissionID"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "productID"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "renewState"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "startedDate"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "source"

    invoke-static {p6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "grantType"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "transactions"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    .line 14
    iput-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    .line 15
    iput-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 16
    iput-object v4, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    move-object v1, p5

    .line 17
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    .line 18
    iput-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    move/from16 v1, p7

    .line 19
    iput v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    move/from16 v1, p8

    .line 20
    iput v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    move-object/from16 v1, p9

    .line 21
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    move-object/from16 v1, p10

    .line 22
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    move-object/from16 v1, p11

    .line 23
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    move-object/from16 v1, p12

    .line 24
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    .line 25
    iput-object v6, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-object/from16 v1, p14

    .line 26
    iput-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    .line 27
    iput-object v7, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 18
    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v10, v1

    goto :goto_1

    :cond_1
    move/from16 v10, p8

    :goto_1
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_2

    .line 25
    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;->Purchase:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-object v15, v1

    goto :goto_2

    :cond_2
    move-object/from16 v15, p13

    :goto_2
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_3

    .line 27
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_3

    :cond_3
    move-object/from16 v17, p15

    :goto_3
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v9, p7

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v16, p14

    .line 12
    invoke-direct/range {v2 .. v17}, Lcom/qonversion/android/sdk/internal/dto/QPermission;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/QPermission;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, v1

    invoke-virtual/range {p0 .. p15}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    return-object v0
.end method

.method public final component7$sdk_release()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    return v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "associated_product"
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "renew_state"
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "started_timestamp"
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "expiration_timestamp"
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "source"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "active"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "renews_count"
        .end annotation
    .end param
    .param p9    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "trial_start_timestamp"
        .end annotation
    .end param
    .param p10    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "first_purchase_timestamp"
        .end annotation
    .end param
    .param p11    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "last_purchase_timestamp"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "last_activated_offer_code"
        .end annotation
    .end param
    .param p13    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "grant_type"
        .end annotation
    .end param
    .param p14    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "auto_renew_disable_timestamp"
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "store_transactions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
            "II",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;"
        }
    .end annotation

    const-string v0, "permissionID"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productID"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renewState"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startedDate"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantType"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactions"

    move-object/from16 v15, p15

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-object v1, v0

    move-object/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/qonversion/android/sdk/internal/dto/QPermission;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    iget v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    iget v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getActive$sdk_release()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    return v0
.end method

.method public final getAutoRenewDisableDate()Ljava/util/Date;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getExpirationDate()Ljava/util/Date;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getFirstPurchaseDate()Ljava/util/Date;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getGrantType()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    return-object v0
.end method

.method public final getLastActivatedOfferCode()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastPurchaseDate()Ljava/util/Date;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getPermissionID()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    return-object v0
.end method

.method public final getProductID()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    return-object v0
.end method

.method public final getRenewState()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    return-object v0
.end method

.method public final getRenewsCount()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    return v0
.end method

.method public final getSource()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    return-object v0
.end method

.method public final getStartedDate()Ljava/util/Date;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getTransactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    return-object v0
.end method

.method public final getTrialStartDate()Ljava/util/Date;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isActive()Z
    .locals 1

    .line 30
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toBoolean(I)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    iget-object v6, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    iget v7, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    iget v8, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    iget-object v9, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    iget-object v10, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    iget-object v11, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    iget-object v12, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    iget-object v13, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    iget-object v14, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    iget-object v15, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v16, v15

    const-string v15, "QPermission(permissionID="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", productID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", renewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startedDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expirationDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", active="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", renewsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trialStartDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstPurchaseDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastPurchaseDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastActivatedOfferCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", grantType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", autoRenewDisableDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
