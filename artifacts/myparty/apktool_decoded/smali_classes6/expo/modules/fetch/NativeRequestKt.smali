.class public final Lexpo/modules/fetch/NativeRequestKt;
.super Ljava/lang/Object;
.source "NativeRequest.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\"\u001c\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "METHODS_REQUIRING_BODY",
        "",
        "",
        "getMETHODS_REQUIRING_BODY",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "expo_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final METHODS_REQUIRING_BODY:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    .line 17
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "POST"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "PUT"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "PATCH"

    aput-object v2, v0, v1

    sput-object v0, Lexpo/modules/fetch/NativeRequestKt;->METHODS_REQUIRING_BODY:[Ljava/lang/String;

    return-void
.end method

.method public static final getMETHODS_REQUIRING_BODY()[Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lexpo/modules/fetch/NativeRequestKt;->METHODS_REQUIRING_BODY:[Ljava/lang/String;

    return-object v0
.end method
