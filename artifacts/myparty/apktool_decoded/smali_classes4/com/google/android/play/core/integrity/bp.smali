.class public final Lcom/google/android/play/core/integrity/bp;
.super Ljava/lang/Object;
.source "com.google.android.play:integrity@@1.4.0"

# interfaces
.implements Lcom/google/android/play/integrity/internal/ay;


# instance fields
.field private final a:Lcom/google/android/play/integrity/internal/bd;

.field private final b:Lcom/google/android/play/integrity/internal/bd;

.field private final c:Lcom/google/android/play/integrity/internal/bd;


# direct methods
.method public constructor <init>(Lcom/google/android/play/integrity/internal/bd;Lcom/google/android/play/integrity/internal/bd;Lcom/google/android/play/integrity/internal/bd;Lcom/google/android/play/integrity/internal/bd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/bp;->a:Lcom/google/android/play/integrity/internal/bd;

    iput-object p2, p0, Lcom/google/android/play/core/integrity/bp;->b:Lcom/google/android/play/integrity/internal/bd;

    iput-object p3, p0, Lcom/google/android/play/core/integrity/bp;->c:Lcom/google/android/play/integrity/internal/bd;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/bp;->a:Lcom/google/android/play/integrity/internal/bd;

    invoke-interface {v0}, Lcom/google/android/play/integrity/internal/bd;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/play/core/integrity/bp;->b:Lcom/google/android/play/integrity/internal/bd;

    invoke-interface {v1}, Lcom/google/android/play/integrity/internal/bd;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/integrity/internal/s;

    iget-object v2, p0, Lcom/google/android/play/core/integrity/bp;->c:Lcom/google/android/play/integrity/internal/bd;

    check-cast v2, Lcom/google/android/play/core/integrity/au;

    .line 2
    invoke-virtual {v2}, Lcom/google/android/play/core/integrity/au;->b()Lcom/google/android/play/core/integrity/at;

    move-result-object v2

    new-instance v3, Lcom/google/android/play/core/integrity/j;

    invoke-direct {v3}, Lcom/google/android/play/core/integrity/j;-><init>()V

    new-instance v4, Lcom/google/android/play/core/integrity/bn;

    .line 3
    move-object v5, v2

    check-cast v5, Lcom/google/android/play/core/integrity/at;

    check-cast v3, Lcom/google/android/play/core/integrity/k;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/play/core/integrity/bn;-><init>(Landroid/content/Context;Lcom/google/android/play/integrity/internal/s;Lcom/google/android/play/core/integrity/at;Lcom/google/android/play/core/integrity/k;)V

    return-object v4
.end method
