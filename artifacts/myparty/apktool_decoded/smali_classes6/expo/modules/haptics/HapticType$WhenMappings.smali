.class public final synthetic Lexpo/modules/haptics/HapticType$WhenMappings;
.super Ljava/lang/Object;
.source "HapticsRecord.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/haptics/HapticType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
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
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lexpo/modules/haptics/HapticType;->values()[Lexpo/modules/haptics/HapticType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lexpo/modules/haptics/HapticType;->CLOCK_TICK:Lexpo/modules/haptics/HapticType;

    invoke-virtual {v1}, Lexpo/modules/haptics/HapticType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lexpo/modules/haptics/HapticType;->CONTEXT_CLICK:Lexpo/modules/haptics/HapticType;

    invoke-virtual {v1}, Lexpo/modules/haptics/HapticType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Lexpo/modules/haptics/HapticType;->KEYBOARD_TAP:Lexpo/modules/haptics/HapticType;

    invoke-virtual {v1}, Lexpo/modules/haptics/HapticType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lexpo/modules/haptics/HapticType;->LONG_PRESS:Lexpo/modules/haptics/HapticType;

    invoke-virtual {v1}, Lexpo/modules/haptics/HapticType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Lexpo/modules/haptics/HapticType;->VIRTUAL_KEY:Lexpo/modules/haptics/HapticType;

    invoke-virtual {v1}, Lexpo/modules/haptics/HapticType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, Lexpo/modules/haptics/HapticType$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
