.class final Lcom/google/android/gms/internal/ads/zzym;
.super Lcom/google/android/gms/internal/ads/zzza;
.source "com.google.android.gms:play-services-ads@@23.2.0"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final zze:I

.field private final zzf:I


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/zzde;ILcom/google/android/gms/internal/ads/zzys;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzza;-><init>(ILcom/google/android/gms/internal/ads/zzde;I)V

    .line 2
    iget-boolean p1, p4, Lcom/google/android/gms/internal/ads/zzys;->zzT:Z

    invoke-static {p5, p1}, Lcom/google/android/gms/internal/ads/zzze;->zzo(IZ)Z

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzym;->zze:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzym;->zzd:Lcom/google/android/gms/internal/ads/zzan;

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzan;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzym;->zzf:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzym;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzym;->zza(Lcom/google/android/gms/internal/ads/zzym;)I

    move-result p1

    return p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzym;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzym;->zzf:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/zzym;->zzf:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzym;->zze:I

    return v0
.end method

.method public final bridge synthetic zzc(Lcom/google/android/gms/internal/ads/zzza;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzym;

    const/4 p1, 0x0

    return p1
.end method
