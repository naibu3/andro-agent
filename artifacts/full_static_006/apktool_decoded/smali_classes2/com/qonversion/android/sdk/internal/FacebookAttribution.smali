.class public final Lcom/qonversion/android/sdk/internal/FacebookAttribution;
.super Ljava/lang/Object;
.source "FacebookAttribution.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/FacebookAttribution$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000bH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/FacebookAttribution;",
        "",
        "()V",
        "getAttributionId",
        "",
        "contentResolver",
        "Landroid/content/ContentResolver;",
        "resultListener",
        "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;",
        "getAttributionIdAsync",
        "listenerRef",
        "Ljava/lang/ref/WeakReference;",
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
.field private static final ATTRIBUTION_ID_COLUMN_NAME:Ljava/lang/String; = "aid"

.field private static final ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

.field public static final Companion:Lcom/qonversion/android/sdk/internal/FacebookAttribution$Companion;


# direct methods
.method public static synthetic $r8$lambda$inNiURVXGtgbxXW0i5Go_XjB4oY(Lcom/qonversion/android/sdk/internal/FacebookAttribution;Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->getAttributionId$lambda$0(Lcom/qonversion/android/sdk/internal/FacebookAttribution;Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/FacebookAttribution$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/FacebookAttribution$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->Companion:Lcom/qonversion/android/sdk/internal/FacebookAttribution$Companion;

    .line 52
    const-string v0, "content://com.facebook.katana.provider.AttributionIdProvider"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final getAttributionId$lambda$0(Lcom/qonversion/android/sdk/internal/FacebookAttribution;Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$contentResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listenerRef"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->getAttributionIdAsync(Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private final getAttributionIdAsync(Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 24
    new-array v3, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v7, "aid"

    aput-object v7, v3, v1

    const/4 v8, 0x0

    .line 27
    :try_start_0
    sget-object v2, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 26
    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v8

    :goto_0
    if-eqz p1, :cond_0

    .line 39
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-ne v1, v0, :cond_0

    .line 40
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 42
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 43
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 47
    :cond_0
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;

    if-eqz p1, :cond_1

    invoke-interface {p1, v8}, Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;->onFbAttributionIdResult(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getAttributionId(Landroid/content/ContentResolver;Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;)V
    .locals 2

    const-string v0, "contentResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 15
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    new-instance v1, Lcom/qonversion/android/sdk/internal/FacebookAttribution$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1, v0}, Lcom/qonversion/android/sdk/internal/FacebookAttribution$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/FacebookAttribution;Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
