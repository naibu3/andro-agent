.class public final Lexpo/modules/haptics/arguments/HapticsImpactType;
.super Ljava/lang/Object;
.source "HapticsImpactType.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/haptics/arguments/HapticsImpactType;",
        "",
        "<init>",
        "()V",
        "types",
        "",
        "",
        "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
        "fromString",
        "style",
        "expo-haptics_release"
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
.field public static final INSTANCE:Lexpo/modules/haptics/arguments/HapticsImpactType;

.field private static final types:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lexpo/modules/haptics/arguments/HapticsImpactType;

    invoke-direct {v0}, Lexpo/modules/haptics/arguments/HapticsImpactType;-><init>()V

    sput-object v0, Lexpo/modules/haptics/arguments/HapticsImpactType;->INSTANCE:Lexpo/modules/haptics/arguments/HapticsImpactType;

    const/4 v0, 0x5

    .line 5
    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    const/4 v2, 0x2

    .line 6
    new-array v3, v2, [J

    fill-array-data v3, :array_0

    const/4 v4, 0x0

    const/16 v5, 0x1e

    .line 7
    filled-new-array {v4, v5}, [I

    move-result-object v6

    .line 8
    new-array v7, v2, [J

    fill-array-data v7, :array_1

    .line 5
    invoke-direct {v1, v3, v6, v7}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    const-string v3, "light"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    .line 10
    new-instance v1, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 11
    new-array v3, v2, [J

    fill-array-data v3, :array_2

    .line 12
    filled-new-array {v4, v5}, [I

    move-result-object v5

    .line 13
    new-array v6, v2, [J

    fill-array-data v6, :array_3

    .line 10
    invoke-direct {v1, v3, v5, v6}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    const-string v3, "soft"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 15
    new-instance v1, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 16
    new-array v3, v2, [J

    fill-array-data v3, :array_4

    const/16 v5, 0x32

    .line 17
    filled-new-array {v4, v5}, [I

    move-result-object v6

    .line 18
    new-array v7, v2, [J

    fill-array-data v7, :array_5

    .line 15
    invoke-direct {v1, v3, v6, v7}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    const-string v3, "medium"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v2

    .line 20
    new-instance v1, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 21
    new-array v3, v2, [J

    fill-array-data v3, :array_6

    .line 22
    filled-new-array {v4, v5}, [I

    move-result-object v5

    .line 23
    new-array v6, v2, [J

    fill-array-data v6, :array_7

    .line 20
    invoke-direct {v1, v3, v5, v6}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    const-string v3, "rigid"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 25
    new-instance v1, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 26
    new-array v3, v2, [J

    fill-array-data v3, :array_8

    const/16 v5, 0x46

    .line 27
    filled-new-array {v4, v5}, [I

    move-result-object v4

    .line 28
    new-array v2, v2, [J

    fill-array-data v2, :array_9

    .line 25
    invoke-direct {v1, v3, v4, v2}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    const-string v2, "heavy"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 4
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lexpo/modules/haptics/arguments/HapticsImpactType;->types:Ljava/util/Map;

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x32
    .end array-data

    :array_1
    .array-data 8
        0x0
        0x14
    .end array-data

    :array_2
    .array-data 8
        0x0
        0x32
    .end array-data

    :array_3
    .array-data 8
        0x0
        0x14
    .end array-data

    :array_4
    .array-data 8
        0x0
        0x2b
    .end array-data

    :array_5
    .array-data 8
        0x0
        0x2b
    .end array-data

    :array_6
    .array-data 8
        0x0
        0x2b
    .end array-data

    :array_7
    .array-data 8
        0x0
        0x2b
    .end array-data

    :array_8
    .array-data 8
        0x0
        0x3c
    .end array-data

    :array_9
    .array-data 8
        0x0
        0x3d
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromString(Ljava/lang/String;)Lexpo/modules/haptics/arguments/HapticsVibrationType;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;
        }
    .end annotation

    .line 33
    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lexpo/modules/haptics/arguments/HapticsImpactType;->types:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    check-cast v0, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    return-object v0

    :cond_0
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'style\' must be one of [\'light\', \'medium\', \'heavy\', \'rigid\', \'soft\']. Obtained "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "\'."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
