.class public final Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:[B

.field private final zze:[Landroid/graphics/Point;

.field private final zzf:I

.field private final zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

.field private final zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

.field private final zzi:Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;

.field private final zzj:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;

.field private final zzk:Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;

.field private final zzl:Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;

.field private final zzm:Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;

.field private final zzn:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;

.field private final zzo:Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzpa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzpa;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;[B[Landroid/graphics/Point;ILcom/google/android/gms/internal/mlkit_code_scanner/zzos;Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzc:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzd:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zze:[Landroid/graphics/Point;

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzf:I

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    iput-object p9, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzi:Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;

    iput-object p10, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzj:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;

    iput-object p11, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzk:Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;

    iput-object p12, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzl:Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;

    iput-object p13, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzm:Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;

    iput-object p14, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzn:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;

    iput-object p15, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzo:Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zza:I

    .line 2
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzb:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 3
    invoke-static {p1, v2, v1, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzc:Ljava/lang/String;

    .line 4
    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzd:[B

    .line 5
    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeByteArray(Landroid/os/Parcel;I[BZ)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zze:[Landroid/graphics/Point;

    .line 6
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeTypedArray(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzf:I

    .line 7
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    .line 8
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    .line 9
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzi:Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;

    .line 10
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzj:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;

    .line 11
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzk:Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;

    .line 12
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzl:Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;

    .line 13
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzm:Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;

    .line 14
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xe

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzn:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;

    .line 15
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzo:Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;

    .line 16
    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 17
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zza:I

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzf:I

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzm:Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzn:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzo:Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzg:Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzl:Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzh:Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    return-object v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzi:Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;

    return-object v0
.end method

.method public final zzj()Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzk:Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;

    return-object v0
.end method

.method public final zzk()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzj:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;

    return-object v0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final zzm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzn()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzd:[B

    return-object v0
.end method
