.class public final Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter;
.super Lexpo/modules/kotlin/types/BaseTypeArrayConverter;
.source "TypedArrayTypeConverter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lexpo/modules/kotlin/types/BaseTypeArrayConverter<",
        "Lexpo/modules/kotlin/typedarray/BigInt64Array;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter;",
        "Lexpo/modules/kotlin/types/BaseTypeArrayConverter;",
        "Lexpo/modules/kotlin/typedarray/BigInt64Array;",
        "<init>",
        "()V",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    sget-object v0, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;->INSTANCE:Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0}, Lexpo/modules/kotlin/types/BaseTypeArrayConverter;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
