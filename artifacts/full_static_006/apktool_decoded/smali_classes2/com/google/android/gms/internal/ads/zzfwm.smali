.class final Lcom/google/android/gms/internal/ads/zzfwm;
.super Lcom/google/android/gms/internal/ads/zzfvp;
.source "com.google.android.gms:play-services-ads@@23.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfwn;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfws;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfwn;Lcom/google/android/gms/internal/ads/zzfws;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfwm;->zza:Lcom/google/android/gms/internal/ads/zzfwn;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfvp;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfwm;->zzb:Lcom/google/android/gms/internal/ads/zzfws;

    return-void
.end method


# virtual methods
.method public final zzb(Landroid/os/Bundle;)V
    .locals 2

    const/16 v0, 0x1fd6

    .line 1
    const-string v1, "statusCode"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 2
    const-string v1, "sessionToken"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfwr;->zzc()Lcom/google/android/gms/internal/ads/zzfwq;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfwq;->zzb(I)Lcom/google/android/gms/internal/ads/zzfwq;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfwq;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfwq;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfwm;->zzb:Lcom/google/android/gms/internal/ads/zzfws;

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfwq;->zzc()Lcom/google/android/gms/internal/ads/zzfwr;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzfws;->zza(Lcom/google/android/gms/internal/ads/zzfwr;)V

    const/16 p1, 0x1fdd

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfwm;->zza:Lcom/google/android/gms/internal/ads/zzfwn;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfwn;->zzc()V

    :cond_1
    return-void
.end method
