.class public final Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;
.super Ljava/lang/Object;
.source "QTransaction.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Be\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u000bH\u00c6\u0003J\t\u0010&\u001a\u00020\rH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000fH\u00c6\u0003Ji\u0010(\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0014R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006/"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
        "",
        "originalTransactionId",
        "",
        "transactionId",
        "offerCode",
        "transactionDate",
        "Ljava/util/Date;",
        "expirationDate",
        "transactionRevocationDate",
        "ownershipType",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;",
        "type",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        "environment",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V",
        "getEnvironment",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;",
        "getExpirationDate",
        "()Ljava/util/Date;",
        "getOfferCode",
        "()Ljava/lang/String;",
        "getOriginalTransactionId",
        "getOwnershipType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;",
        "getTransactionDate",
        "getTransactionId",
        "getTransactionRevocationDate",
        "getType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

.field private final expirationDate:Ljava/util/Date;

.field private final offerCode:Ljava/lang/String;

.field private final originalTransactionId:Ljava/lang/String;

.field private final ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

.field private final transactionDate:Ljava/util/Date;

.field private final transactionId:Ljava/lang/String;

.field private final transactionRevocationDate:Ljava/util/Date;

.field private final type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "original_transaction_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "transaction_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "offer_code"
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "transaction_timestamp"
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "expiration_timestamp"
        .end annotation
    .end param
    .param p6    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "transaction_revoke_timestamp"
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "ownership_type"
        .end annotation
    .end param
    .param p8    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "type"
        .end annotation
    .end param
    .param p9    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "environment"
        .end annotation
    .end param

    const-string v0, "originalTransactionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownershipType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    .line 12
    iput-object p4, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    .line 13
    iput-object p5, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    .line 14
    iput-object p6, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    .line 15
    iput-object p7, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    .line 16
    iput-object p8, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 17
    iput-object p9, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;
    .locals 10

    move-object v0, p0

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p9

    :goto_8
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v1

    invoke-virtual/range {p0 .. p9}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    return-object v0
.end method

.method public final component8()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    return-object v0
.end method

.method public final component9()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "original_transaction_id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "transaction_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "offer_code"
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "transaction_timestamp"
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "expiration_timestamp"
        .end annotation
    .end param
    .param p6    # Ljava/util/Date;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "transaction_revoke_timestamp"
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "ownership_type"
        .end annotation
    .end param
    .param p8    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "type"
        .end annotation
    .end param
    .param p9    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "environment"
        .end annotation
    .end param

    const-string v0, "originalTransactionId"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionId"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionDate"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownershipType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    move-object v1, v0

    move-object v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getEnvironment()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    return-object v0
.end method

.method public final getExpirationDate()Ljava/util/Date;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getOfferCode()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginalTransactionId()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnershipType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    return-object v0
.end method

.method public final getTransactionDate()Ljava/util/Date;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getTransactionId()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTransactionRevocationDate()Ljava/util/Date;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    iget-object v4, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    iget-object v5, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    iget-object v6, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    iget-object v7, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    iget-object v8, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "QTransaction(originalTransactionId="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ", transactionId="

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", offerCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transactionDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expirationDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", transactionRevocationDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ownershipType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", environment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
