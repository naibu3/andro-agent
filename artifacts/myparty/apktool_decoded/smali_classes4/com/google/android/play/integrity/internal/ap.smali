.class final Lcom/google/android/play/integrity/internal/ap;
.super Lcom/google/android/play/integrity/internal/an;
.source "com.google.android.play:integrity@@1.4.0"


# instance fields
.field private final a:Lcom/google/android/play/integrity/internal/ar;


# direct methods
.method constructor <init>(Lcom/google/android/play/integrity/internal/ar;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/play/integrity/internal/ar;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/play/integrity/internal/an;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/ap;->a:Lcom/google/android/play/integrity/internal/ar;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/ap;->a:Lcom/google/android/play/integrity/internal/ar;

    invoke-virtual {v0, p1}, Lcom/google/android/play/integrity/internal/ar;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
