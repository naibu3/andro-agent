.class final Lcom/google/mlkit/vision/codescanner/internal/zza;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-code-scanner@@16.1.0"

# interfaces
.implements Lcom/google/mlkit/vision/barcode/common/internal/BarcodeSource;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;
    .locals 9

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    new-instance v0, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zzf()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zzd()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zza()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zzb()I

    move-result v4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zzc()I

    move-result v5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zze()I

    move-result v6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zzh()Z

    move-result v7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->zzg()Ljava/lang/String;

    move-result-object v8

    .line 2
    invoke-direct/range {v0 .. v8}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;-><init>(IIIIIIZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getBoundingBox()Landroid/graphics/Rect;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCalendarEvent()Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzc()Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zzc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zze()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zzf()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zzb()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;

    move-result-object v7

    .line 3
    invoke-static {v7}, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;)Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;Lcom/google/mlkit/vision/barcode/common/Barcode$CalendarDateTime;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContactInfo()Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzd()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 2
    new-instance v2, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zza()Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v3, v1

    goto :goto_0

    .line 3
    :cond_0
    new-instance v4, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zzb()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zzf()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zze()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zza()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zzd()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zzc()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->zzg()Ljava/lang/String;

    move-result-object v11

    .line 4
    invoke-direct/range {v4 .. v11}, Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v4

    .line 2
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zzb()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zzc()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zzf()[Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    .line 5
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    move v8, v7

    :goto_1
    array-length v9, v1

    if-ge v8, v9, :cond_2

    .line 6
    aget-object v9, v1, v8

    if-eqz v9, :cond_1

    .line 7
    new-instance v10, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->zzb()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->zza()I

    move-result v9

    invoke-direct {v10, v11, v9}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;-><init>(Ljava/lang/String;I)V

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zze()[Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    move-result-object v1

    move v8, v7

    new-instance v7, Ljava/util/ArrayList;

    .line 8
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    if-eqz v1, :cond_4

    move v9, v8

    :goto_2
    array-length v10, v1

    if-ge v9, v10, :cond_4

    .line 9
    aget-object v10, v1, v9

    if-eqz v10, :cond_3

    .line 10
    new-instance v11, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zza()I

    move-result v12

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zzb()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zzd()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zzc()Ljava/lang/String;

    move-result-object v10

    .line 11
    invoke-direct {v11, v12, v13, v14, v10}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zzg()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zzg()[Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_3

    .line 17
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->zzd()[Lcom/google/android/gms/internal/mlkit_code_scanner/zzon;

    move-result-object v0

    new-instance v9, Ljava/util/ArrayList;

    .line 14
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_7

    :goto_4
    array-length v10, v0

    if-ge v8, v10, :cond_7

    .line 15
    aget-object v10, v0, v8

    if-eqz v10, :cond_6

    .line 16
    new-instance v11, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzon;->zza()I

    move-result v12

    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzon;->zzb()[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v11, v12, v10}, Lcom/google/mlkit/vision/barcode/common/Barcode$Address;-><init>(I[Ljava/lang/String;)V

    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_7
    move-object v8, v1

    .line 17
    invoke-direct/range {v2 .. v9}, Lcom/google/mlkit/vision/barcode/common/Barcode$ContactInfo;-><init>(Lcom/google/mlkit/vision/barcode/common/Barcode$PersonName;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2

    :cond_8
    return-object v1
.end method

.method public final getCornerPoints()[Landroid/graphics/Point;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDisplayValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDriverLicense()Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;
    .locals 17

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zze()Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2
    new-instance v2, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzf()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzh()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzn()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzi()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzc()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zza()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzb()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzd()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzm()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzj()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzg()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zze()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->zzk()Ljava/lang/String;

    move-result-object v16

    .line 3
    invoke-direct/range {v2 .. v16}, Lcom/google/mlkit/vision/barcode/common/Barcode$DriverLicense;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public final getEmail()Lcom/google/mlkit/vision/barcode/common/Barcode$Email;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzf()Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zza()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zzd()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->zzc()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Email;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final getFormat()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zza()I

    move-result v0

    return v0
.end method

.method public final getGeoPoint()Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzg()Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;->zza()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;->zzb()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/mlkit/vision/barcode/common/Barcode$GeoPoint;-><init>(DD)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPhone()Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzh()Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->zzb()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->zza()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Phone;-><init>(Ljava/lang/String;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRawBytes()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzn()[B

    move-result-object v0

    return-object v0
.end method

.method public final getRawValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSms()Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzi()Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$Sms;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUrl()Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzj()Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;->zza()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$UrlBookmark;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValueType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzb()I

    move-result v0

    return v0
.end method

.method public final getWifi()Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/mlkit/vision/codescanner/internal/zza;->zza:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->zzk()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;->zzc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;->zzb()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;->zza()I

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/vision/barcode/common/Barcode$WiFi;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
