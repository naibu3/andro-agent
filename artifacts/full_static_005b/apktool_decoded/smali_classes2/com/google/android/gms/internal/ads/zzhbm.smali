.class public final Lcom/google/android/gms/internal/ads/zzhbm;
.super Lcom/google/android/gms/internal/ads/zzhaw;
.source "com.google.android.gms:play-services-ads-lite@@23.2.0"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/android/gms/internal/ads/zzhde;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/zzhaw<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzhde;

.field final zzb:Ljava/lang/Object;

.field final zzc:Lcom/google/android/gms/internal/ads/zzhde;

.field final zzd:Lcom/google/android/gms/internal/ads/zzhbl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzhde;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzhde;Lcom/google/android/gms/internal/ads/zzhbl;Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhaw;-><init>()V

    if-eqz p1, :cond_2

    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzhbl;->zzc:Lcom/google/android/gms/internal/ads/zzhfg;

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhfg;->zzk:Lcom/google/android/gms/internal/ads/zzhfg;

    if-ne p5, v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null messageDefaultInstance"

    .line 3
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhbm;->zza:Lcom/google/android/gms/internal/ads/zzhde;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhbm;->zzb:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhbm;->zzc:Lcom/google/android/gms/internal/ads/zzhde;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzhbm;->zzd:Lcom/google/android/gms/internal/ads/zzhbl;

    return-void

    .line 1
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
