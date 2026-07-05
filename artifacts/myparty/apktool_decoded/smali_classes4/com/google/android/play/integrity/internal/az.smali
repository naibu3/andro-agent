.class public final Lcom/google/android/play/integrity/internal/az;
.super Ljava/lang/Object;
.source "com.google.android.play:integrity@@1.4.0"

# interfaces
.implements Lcom/google/android/play/integrity/internal/ay;


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/az;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/Object;)Lcom/google/android/play/integrity/internal/ay;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/play/integrity/internal/az;

    if-eqz p0, :cond_0

    invoke-direct {v0, p0}, Lcom/google/android/play/integrity/internal/az;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "instance cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/az;->a:Ljava/lang/Object;

    return-object v0
.end method
