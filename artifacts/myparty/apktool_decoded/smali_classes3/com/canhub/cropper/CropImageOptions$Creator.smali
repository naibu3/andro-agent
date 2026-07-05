.class public final Lcom/canhub/cropper/CropImageOptions$Creator;
.super Ljava/lang/Object;
.source "CropImageOptions.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropImageOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/canhub/cropper/CropImageOptions;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/canhub/cropper/CropImageOptions;
    .locals 73

    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/canhub/cropper/CropImageOptions;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v3

    move v3, v4

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_1

    move v5, v4

    move v4, v1

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/canhub/cropper/CropImageView$CropShape;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$CropShape;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/canhub/cropper/CropImageView$CropCornerShape;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$CropCornerShape;

    move-result-object v7

    move v8, v5

    move-object v5, v6

    move-object v6, v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    move v9, v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v8

    move v10, v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/canhub/cropper/CropImageView$Guidelines;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$Guidelines;

    move-result-object v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/canhub/cropper/CropImageView$ScaleType;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$ScaleType;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_2

    move v13, v10

    move-object v10, v11

    move-object v11, v12

    move v12, v1

    goto :goto_2

    :cond_2
    move v13, v10

    move-object v10, v11

    move-object v11, v12

    move v12, v13

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-eqz v14, :cond_3

    move v14, v13

    move v13, v1

    goto :goto_3

    :cond_3
    move v14, v13

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-eqz v15, :cond_4

    move v15, v14

    move v14, v1

    goto :goto_4

    :cond_4
    move v15, v14

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-eqz v17, :cond_5

    move/from16 v17, v15

    move/from16 v15, v16

    move/from16 v16, v1

    goto :goto_5

    :cond_5
    move/from16 v17, v15

    move/from16 v15, v16

    move/from16 v16, v17

    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-eqz v18, :cond_6

    move/from16 v18, v17

    move/from16 v17, v1

    goto :goto_6

    :cond_6
    move/from16 v18, v17

    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-eqz v19, :cond_7

    move/from16 v19, v18

    move/from16 v18, v1

    goto :goto_7

    :cond_7
    move/from16 v19, v18

    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-eqz v20, :cond_8

    move/from16 v20, v19

    move/from16 v19, v1

    goto :goto_8

    :cond_8
    move/from16 v20, v19

    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v21

    move/from16 v22, v20

    move/from16 v20, v21

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v21

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v23

    if-eqz v23, :cond_9

    move/from16 v23, v22

    move/from16 v22, v1

    goto :goto_9

    :cond_9
    move/from16 v23, v22

    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v24

    move/from16 v25, v23

    move/from16 v23, v24

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v24

    move/from16 v26, v25

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v25

    move/from16 v27, v26

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v26

    move/from16 v28, v27

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v27

    move/from16 v29, v28

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v28

    move/from16 v30, v29

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v29

    move/from16 v31, v30

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v30

    move/from16 v32, v31

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v31

    move/from16 v33, v32

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v32

    move/from16 v34, v33

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v33

    move/from16 v35, v34

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v34

    move/from16 v36, v35

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v35

    move/from16 v37, v36

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v36

    move/from16 v38, v37

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v37

    move/from16 v39, v38

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v38

    move/from16 v40, v39

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v39

    move/from16 v41, v40

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v40

    sget-object v1, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v43, 0x1

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v42

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v44

    const/16 v45, 0x0

    if-nez v44, :cond_a

    move-object/from16 v44, v45

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v44

    invoke-static/range {v44 .. v44}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v44

    :goto_a
    const-class v46, Lcom/canhub/cropper/CropImageOptions;

    move-object/from16 v47, v1

    invoke-virtual/range {v46 .. v46}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v46

    invoke-static/range {v46 .. v46}, Landroid/graphics/Bitmap$CompressFormat;->valueOf(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;

    move-result-object v46

    move-object/from16 v48, v45

    move-object/from16 v45, v46

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v46

    move/from16 v49, v41

    move-object/from16 v41, v47

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v47

    move-object/from16 v50, v48

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v48

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v51

    invoke-static/range {v51 .. v51}, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->valueOf(Ljava/lang/String;)Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    move-result-object v51

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v52

    if-eqz v52, :cond_b

    move-object/from16 v52, v50

    move/from16 v50, v43

    goto :goto_b

    :cond_b
    move-object/from16 v52, v50

    move/from16 v50, v49

    :goto_b
    const-class v53, Lcom/canhub/cropper/CropImageOptions;

    move-object/from16 v54, v1

    invoke-virtual/range {v53 .. v53}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    move-object/from16 v53, v52

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v52

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v55

    if-eqz v55, :cond_c

    move-object/from16 v55, v53

    move/from16 v53, v43

    goto :goto_c

    :cond_c
    move-object/from16 v55, v53

    move/from16 v53, v49

    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v56

    if-eqz v56, :cond_d

    move/from16 v56, v43

    move-object/from16 v43, v44

    move-object/from16 v44, v54

    move/from16 v54, v56

    goto :goto_d

    :cond_d
    move/from16 v56, v43

    move-object/from16 v43, v44

    move-object/from16 v44, v54

    move/from16 v54, v49

    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v57

    if-eqz v57, :cond_e

    move-object/from16 v57, v55

    move/from16 v55, v56

    move/from16 v58, v55

    goto :goto_e

    :cond_e
    move-object/from16 v57, v55

    move/from16 v58, v56

    move/from16 v55, v49

    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v56

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v59

    if-eqz v59, :cond_f

    move-object/from16 v59, v57

    move/from16 v57, v58

    goto :goto_f

    :cond_f
    move-object/from16 v59, v57

    move/from16 v57, v49

    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v60

    if-eqz v60, :cond_10

    move/from16 v60, v58

    goto :goto_10

    :cond_10
    move/from16 v60, v58

    move/from16 v58, v49

    :goto_10
    move-object/from16 v61, v1

    sget-object v1, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    move/from16 v62, v60

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v60

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v63

    if-eqz v63, :cond_11

    move/from16 v63, v49

    move-object/from16 v49, v51

    move-object/from16 v51, v61

    move/from16 v61, v62

    goto :goto_11

    :cond_11
    move/from16 v63, v49

    move-object/from16 v49, v51

    move-object/from16 v51, v61

    move/from16 v61, v63

    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v64

    if-eqz v64, :cond_12

    goto :goto_12

    :cond_12
    move/from16 v62, v63

    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v63

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v64

    check-cast v64, Ljava/util/List;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v65

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v66

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v67

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v68

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v69

    if-nez v69, :cond_13

    move-object/from16 v69, v59

    goto :goto_13

    :cond_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v69

    invoke-static/range {v69 .. v69}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v69

    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v70

    if-nez v70, :cond_14

    move-object/from16 v70, v59

    goto :goto_14

    :cond_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v70

    invoke-static/range {v70 .. v70}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v70

    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v71

    if-nez v71, :cond_15

    move-object/from16 v71, v59

    goto :goto_15

    :cond_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v71

    invoke-static/range {v71 .. v71}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v71

    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v72

    if-nez v72, :cond_16

    move-object/from16 v72, v59

    goto :goto_16

    :cond_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v72, v0

    :goto_16
    move-object/from16 v59, v1

    invoke-direct/range {v2 .. v72}, Lcom/canhub/cropper/CropImageOptions;-><init>(ZZLcom/canhub/cropper/CropImageView$CropShape;Lcom/canhub/cropper/CropImageView$CropCornerShape;FFFLcom/canhub/cropper/CropImageView$Guidelines;Lcom/canhub/cropper/CropImageView$ScaleType;ZZZIZZZZIFZIIFIFFFIIFIIIIIIIILjava/lang/CharSequence;ILjava/lang/Integer;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;IIILcom/canhub/cropper/CropImageView$RequestSizeOptions;ZLandroid/graphics/Rect;IZZZIZZLjava/lang/CharSequence;IZZLjava/lang/String;Ljava/util/List;FILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageOptions$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/canhub/cropper/CropImageOptions;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/canhub/cropper/CropImageOptions;
    .locals 0

    new-array p1, p1, [Lcom/canhub/cropper/CropImageOptions;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropImageOptions$Creator;->newArray(I)[Lcom/canhub/cropper/CropImageOptions;

    move-result-object p1

    return-object p1
.end method
