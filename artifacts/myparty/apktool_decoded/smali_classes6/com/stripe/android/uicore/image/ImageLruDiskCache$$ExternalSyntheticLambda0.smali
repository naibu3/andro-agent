.class public final synthetic Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

.field public final synthetic f$1:Landroid/content/Context;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:J


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/uicore/image/ImageLruDiskCache;Landroid/content/Context;Ljava/lang/String;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    iput-object p2, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iput-wide p4, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$3:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/uicore/image/ImageLruDiskCache;

    iget-object v1, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$1:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iget-wide v3, p0, Lcom/stripe/android/uicore/image/ImageLruDiskCache$$ExternalSyntheticLambda0;->f$3:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/uicore/image/ImageLruDiskCache;->$r8$lambda$B64L7PXMI4NjjxNnxTuKRb6GCGg(Lcom/stripe/android/uicore/image/ImageLruDiskCache;Landroid/content/Context;Ljava/lang/String;J)Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object v0

    return-object v0
.end method
