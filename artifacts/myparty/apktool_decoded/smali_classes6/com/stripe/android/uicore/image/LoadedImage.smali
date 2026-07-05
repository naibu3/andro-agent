.class public final Lcom/stripe/android/uicore/image/LoadedImage;
.super Ljava/lang/Object;
.source "LoadedImage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/image/LoadedImage$Companion;,
        Lcom/stripe/android/uicore/image/LoadedImage$ContentType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0019\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0008\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/LoadedImage;",
        "",
        "contentType",
        "Lcom/stripe/android/uicore/image/LoadedImage$ContentType;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "<init>",
        "(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;)V",
        "",
        "(Ljava/lang/String;Landroid/graphics/Bitmap;)V",
        "getContentType",
        "()Lcom/stripe/android/uicore/image/LoadedImage$ContentType;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "ContentType",
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
.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/uicore/image/LoadedImage$Companion;


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/image/LoadedImage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/image/LoadedImage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/image/LoadedImage;->Companion:Lcom/stripe/android/uicore/image/LoadedImage$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/image/LoadedImage;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;)V
    .locals 1

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    .line 9
    iput-object p2, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage;->Companion:Lcom/stripe/android/uicore/image/LoadedImage$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/image/LoadedImage$Companion;->from(Ljava/lang/String;)Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    move-result-object p1

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/image/LoadedImage;-><init>(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/image/LoadedImage;Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;ILjava/lang/Object;)Lcom/stripe/android/uicore/image/LoadedImage;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/image/LoadedImage;->copy(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;)Lcom/stripe/android/uicore/image/LoadedImage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/image/LoadedImage$ContentType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    return-object v0
.end method

.method public final component2()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;)Lcom/stripe/android/uicore/image/LoadedImage;
    .locals 1

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/image/LoadedImage;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/image/LoadedImage;-><init>(Lcom/stripe/android/uicore/image/LoadedImage$ContentType;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/image/LoadedImage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/image/LoadedImage;

    iget-object v1, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    iget-object v3, p1, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getContentType()Lcom/stripe/android/uicore/image/LoadedImage$ContentType;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage;->contentType:Lcom/stripe/android/uicore/image/LoadedImage$ContentType;

    iget-object v1, p0, Lcom/stripe/android/uicore/image/LoadedImage;->bitmap:Landroid/graphics/Bitmap;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "LoadedImage(contentType="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", bitmap="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
