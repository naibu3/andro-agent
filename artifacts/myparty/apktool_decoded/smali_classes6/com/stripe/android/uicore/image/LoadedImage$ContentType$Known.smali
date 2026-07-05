.class public final enum Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;
.super Ljava/lang/Enum;
.source "LoadedImage.kt"

# interfaces
.implements Lcom/stripe/android/uicore/image/LoadedImage$ContentType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/image/LoadedImage$ContentType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Known"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;",
        ">;",
        "Lcom/stripe/android/uicore/image/LoadedImage$ContentType;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;",
        "Lcom/stripe/android/uicore/image/LoadedImage$ContentType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "Jpeg",
        "Png",
        "Webp",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

.field public static final enum Jpeg:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

.field public static final enum Png:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

.field public static final enum Webp:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;
    .locals 3

    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Jpeg:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    sget-object v1, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Png:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    sget-object v2, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Webp:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 25
    new-instance v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    const/4 v1, 0x0

    const-string v2, "image/jpeg"

    const-string v3, "Jpeg"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Jpeg:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    .line 26
    new-instance v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    const/4 v1, 0x1

    const-string v2, "image/png"

    const-string v3, "Png"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Png:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    .line 27
    new-instance v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    const/4 v1, 0x2

    const-string v2, "image/webp"

    const-string v3, "Webp"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->Webp:Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    invoke-static {}, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->$values()[Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->$VALUES:[Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 28
    check-cast p0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->$VALUES:[Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 28
    check-cast v0, [Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;

    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/uicore/image/LoadedImage$ContentType$Known;->value:Ljava/lang/String;

    return-object v0
.end method
