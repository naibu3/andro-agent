.class final synthetic Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "TypedArrayTypeConverter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;",
        "Lexpo/modules/kotlin/typedarray/BigInt64Array;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;

    invoke-direct {v0}, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;-><init>()V

    sput-object v0, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;->INSTANCE:Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-class v2, Lexpo/modules/kotlin/typedarray/BigInt64Array;

    const-string v4, "<init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Lexpo/modules/kotlin/typedarray/BigInt64Array;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    new-instance v0, Lexpo/modules/kotlin/typedarray/BigInt64Array;

    invoke-direct {v0, p1}, Lexpo/modules/kotlin/typedarray/BigInt64Array;-><init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 48
    check-cast p1, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/types/BigInt64ArrayTypeConverter$1;->invoke(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)Lexpo/modules/kotlin/typedarray/BigInt64Array;

    move-result-object p1

    return-object p1
.end method
