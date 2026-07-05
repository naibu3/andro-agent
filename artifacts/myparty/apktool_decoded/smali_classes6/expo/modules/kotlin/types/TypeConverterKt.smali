.class public final Lexpo/modules/kotlin/types/TypeConverterKt;
.super Ljava/lang/Object;
.source "TypeConverter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\u0008\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0008\u0006\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\u0008\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\t"
    }
    d2 = {
        "createTrivialTypeConverter",
        "Lexpo/modules/kotlin/types/TypeConverter;",
        "T",
        "",
        "cppRequireType",
        "Lexpo/modules/kotlin/jni/ExpectedType;",
        "dynamicFallback",
        "Lkotlin/Function1;",
        "Lcom/facebook/react/bridge/Dynamic;",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic createTrivialTypeConverter(Lexpo/modules/kotlin/jni/ExpectedType;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/jni/ExpectedType;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/facebook/react/bridge/Dynamic;",
            "+TT;>;)",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "cppRequireType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dynamicFallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance v0, Lexpo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$2;

    invoke-direct {v0, p1, p0}, Lexpo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$2;-><init>(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast v0, Lexpo/modules/kotlin/types/TypeConverter;

    return-object v0
.end method

.method public static synthetic createTrivialTypeConverter$default(Lexpo/modules/kotlin/jni/ExpectedType;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lexpo/modules/kotlin/types/TypeConverter;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    .line 63
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    sget-object p1, Lexpo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$1;->INSTANCE:Lexpo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$1;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 61
    :cond_0
    const-string p2, "cppRequireType"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "dynamicFallback"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->needClassReification()V

    new-instance p2, Lexpo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$2;

    invoke-direct {p2, p1, p0}, Lexpo/modules/kotlin/types/TypeConverterKt$createTrivialTypeConverter$2;-><init>(Lkotlin/jvm/functions/Function1;Lexpo/modules/kotlin/jni/ExpectedType;)V

    check-cast p2, Lexpo/modules/kotlin/types/TypeConverter;

    return-object p2
.end method
