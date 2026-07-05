.class public final enum Lcom/stripe/android/uicore/image/ImageType;
.super Ljava/lang/Enum;
.source "UiUtils.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/image/ImageType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/image/ImageType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0080\u0081\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001f\u0008\u0002\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/ImageType;",
        "",
        "suffixes",
        "",
        "",
        "compressFormat",
        "Landroid/graphics/Bitmap$CompressFormat;",
        "<init>",
        "(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V",
        "getSuffixes",
        "()Ljava/util/List;",
        "getCompressFormat",
        "()Landroid/graphics/Bitmap$CompressFormat;",
        "PNG",
        "WEBP",
        "JPEG",
        "Companion",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/image/ImageType;

.field public static final Companion:Lcom/stripe/android/uicore/image/ImageType$Companion;

.field public static final enum JPEG:Lcom/stripe/android/uicore/image/ImageType;

.field public static final enum PNG:Lcom/stripe/android/uicore/image/ImageType;

.field public static final enum WEBP:Lcom/stripe/android/uicore/image/ImageType;


# instance fields
.field private final compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private final suffixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/image/ImageType;
    .locals 3

    sget-object v0, Lcom/stripe/android/uicore/image/ImageType;->PNG:Lcom/stripe/android/uicore/image/ImageType;

    sget-object v1, Lcom/stripe/android/uicore/image/ImageType;->WEBP:Lcom/stripe/android/uicore/image/ImageType;

    sget-object v2, Lcom/stripe/android/uicore/image/ImageType;->JPEG:Lcom/stripe/android/uicore/image/ImageType;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/uicore/image/ImageType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 96
    new-instance v0, Lcom/stripe/android/uicore/image/ImageType;

    .line 97
    const-string v1, "png"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 98
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 96
    const-string v3, "PNG"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/uicore/image/ImageType;-><init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->PNG:Lcom/stripe/android/uicore/image/ImageType;

    .line 100
    new-instance v0, Lcom/stripe/android/uicore/image/ImageType;

    .line 101
    const-string v1, "webp"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 102
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 100
    const-string v3, "WEBP"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/stripe/android/uicore/image/ImageType;-><init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->WEBP:Lcom/stripe/android/uicore/image/ImageType;

    .line 104
    new-instance v0, Lcom/stripe/android/uicore/image/ImageType;

    const/4 v1, 0x2

    .line 105
    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "jpeg"

    aput-object v3, v2, v4

    const-string v3, "jpg"

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 106
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 104
    const-string v4, "JPEG"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/stripe/android/uicore/image/ImageType;-><init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->JPEG:Lcom/stripe/android/uicore/image/ImageType;

    invoke-static {}, Lcom/stripe/android/uicore/image/ImageType;->$values()[Lcom/stripe/android/uicore/image/ImageType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->$VALUES:[Lcom/stripe/android/uicore/image/ImageType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/uicore/image/ImageType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/image/ImageType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/image/ImageType;->Companion:Lcom/stripe/android/uicore/image/ImageType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/List;Landroid/graphics/Bitmap$CompressFormat;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/graphics/Bitmap$CompressFormat;",
            ")V"
        }
    .end annotation

    .line 92
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 93
    iput-object p3, p0, Lcom/stripe/android/uicore/image/ImageType;->suffixes:Ljava/util/List;

    .line 94
    iput-object p4, p0, Lcom/stripe/android/uicore/image/ImageType;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/uicore/image/ImageType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/image/ImageType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/image/ImageType;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/image/ImageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 121
    check-cast p0, Lcom/stripe/android/uicore/image/ImageType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/image/ImageType;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/image/ImageType;->$VALUES:[Lcom/stripe/android/uicore/image/ImageType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 121
    check-cast v0, [Lcom/stripe/android/uicore/image/ImageType;

    return-object v0
.end method


# virtual methods
.method public final getCompressFormat()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageType;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method public final getSuffixes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/stripe/android/uicore/image/ImageType;->suffixes:Ljava/util/List;

    return-object v0
.end method
