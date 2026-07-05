.class public final Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;
.super Ljava/lang/Object;
.source "QStoreProductType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;",
        "",
        "()V",
        "fromProductType",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "type",
        "",
        "fromSkuType",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromProductType(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    const-string v0, "inapp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 29
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    goto :goto_0

    .line 31
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    :goto_0
    return-object p1
.end method

.method public final fromSkuType(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    const-string v0, "inapp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 38
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    goto :goto_0

    .line 40
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    :goto_0
    return-object p1
.end method
