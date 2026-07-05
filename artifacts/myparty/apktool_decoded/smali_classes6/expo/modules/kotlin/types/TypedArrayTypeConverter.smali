.class public final Lexpo/modules/kotlin/types/TypedArrayTypeConverter;
.super Lexpo/modules/kotlin/types/BaseTypeArrayConverter;
.source "TypedArrayTypeConverter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lexpo/modules/kotlin/types/BaseTypeArrayConverter<",
        "Lexpo/modules/kotlin/typedarray/TypedArray;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/TypedArrayTypeConverter;",
        "Lexpo/modules/kotlin/types/BaseTypeArrayConverter;",
        "Lexpo/modules/kotlin/typedarray/TypedArray;",
        "<init>",
        "()V",
        "isTrivial",
        "",
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
.method public static synthetic $r8$lambda$RqX83AMDzyV8vvcVLW3ne8iCBd8(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Lexpo/modules/kotlin/typedarray/TypedArray;
    .locals 0

    invoke-static {p0}, Lexpo/modules/kotlin/types/TypedArrayTypeConverter;->_init_$lambda$0(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Lexpo/modules/kotlin/typedarray/TypedArray;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>()V
    .locals 1

    .line 52
    new-instance v0, Lexpo/modules/kotlin/types/TypedArrayTypeConverter$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lexpo/modules/kotlin/types/TypedArrayTypeConverter$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {p0, v0}, Lexpo/modules/kotlin/types/BaseTypeArrayConverter;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Lexpo/modules/kotlin/typedarray/TypedArray;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    check-cast p0, Lexpo/modules/kotlin/typedarray/TypedArray;

    return-object p0
.end method


# virtual methods
.method public isTrivial()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
