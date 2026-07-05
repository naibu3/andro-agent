.class public final Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
.super Ljava/lang/Object;
.source "QUserInfoService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0008J\u0008\u0010\t\u001a\u00020\nH\u0002J\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "",
        "preferences",
        "Lcom/qonversion/android/sdk/internal/storage/Cache;",
        "tokenStorage",
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
        "(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V",
        "deleteUser",
        "",
        "generateRandomUserID",
        "",
        "getPartnersIdentityId",
        "logoutIfNeeded",
        "",
        "obtainUserID",
        "storePartnersIdentityId",
        "userID",
        "storeQonversionUserId",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;

.field public static final TEST_UID:Ljava/lang/String; = "40egafre6_e_"


# instance fields
.field private final preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

.field private final tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->Companion:Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "preferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    return-void
.end method

.method private final generateRandomUserID()Ljava/lang/String;
    .locals 3

    .line 76
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "-"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QON_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final deleteUser()V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.originalUserID"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.storedUserID"

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.partnerIdentityUserID"

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->delete()V

    return-void
.end method

.method public final getPartnersIdentityId()Ljava/lang/String;
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.partnerIdentityUserID"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final logoutIfNeeded()Z
    .locals 6

    .line 52
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.originalUserID"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v3, "com.qonversion.keys.storedUserID"

    invoke-interface {v1, v3, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 55
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v5, "com.qonversion.keys.partnerIdentityUserID"

    invoke-interface {v4, v5, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    invoke-interface {v1, v3, v0}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final obtainUserID()Ljava/lang/String;
    .locals 6

    .line 19
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const/4 v1, 0x0

    const-string v2, "com.qonversion.keys.storedUserID"

    invoke-interface {v0, v2, v1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v0

    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->load()Ljava/lang/String;

    move-result-object v3

    .line 24
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-virtual {v4}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->delete()V

    .line 27
    :goto_1
    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    const-string v5, "40egafre6_e_"

    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 28
    :cond_3
    :goto_2
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->generateRandomUserID()Ljava/lang/String;

    move-result-object v3

    :cond_4
    if-eqz v1, :cond_6

    .line 31
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 32
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    invoke-interface {v0, v2, v3}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.originalUserID"

    invoke-interface {v0, v1, v3}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-object v3
.end method

.method public final storePartnersIdentityId(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.partnerIdentityUserID"

    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final storeQonversionUserId(Ljava/lang/String;)V
    .locals 2

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    const-string v1, "com.qonversion.keys.storedUserID"

    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
