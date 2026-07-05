.class public final Lcom/google/android/gms/internal/ads/zzaq;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzt;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzt;IIFJLcom/google/android/gms/internal/ads/zzap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "width must be positive, but is: "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 p5, 0x1

    const/4 p6, 0x0

    if-lez p2, :cond_0

    move p2, p5

    goto :goto_0

    :cond_0
    move p2, p6

    :goto_0
    invoke-static {p2, p4}, Lcom/google/android/gms/internal/ads/zzeq;->zze(ZLjava/lang/Object;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "height must be positive, but is: "

    .line 2
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    if-lez p3, :cond_1

    goto :goto_1

    :cond_1
    move p5, p6

    :goto_1
    invoke-static {p5, p2}, Lcom/google/android/gms/internal/ads/zzeq;->zze(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaq;->zza:Lcom/google/android/gms/internal/ads/zzt;

    return-void
.end method
