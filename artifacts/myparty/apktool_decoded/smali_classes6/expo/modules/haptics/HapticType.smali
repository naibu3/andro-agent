.class public final enum Lexpo/modules/haptics/HapticType;
.super Ljava/lang/Enum;
.source "HapticsRecord.kt"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/haptics/HapticType$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/haptics/HapticType;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/haptics/HapticType;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "CONFIRM",
        "REJECT",
        "GESTURE_START",
        "GESTURE_END",
        "TOGGLE_ON",
        "TOGGLE_OFF",
        "CLOCK_TICK",
        "CONTEXT_CLICK",
        "DRAG_START",
        "KEYBOARD_TAP",
        "KEYBOARD_PRESS",
        "KEYBOARD_RELEASE",
        "LONG_PRESS",
        "VIRTUAL_KEY",
        "NO_HAPTICS",
        "SEGMENT_TICK",
        "SEGMENT_FREQUENT_TICK",
        "TEXT_HANDLE_MOVE",
        "VIRTUAL_KEY_RELEASE",
        "toHapticFeedbackType",
        "",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/haptics/HapticType;

.field public static final enum CLOCK_TICK:Lexpo/modules/haptics/HapticType;

.field public static final enum CONFIRM:Lexpo/modules/haptics/HapticType;

.field public static final enum CONTEXT_CLICK:Lexpo/modules/haptics/HapticType;

.field public static final enum DRAG_START:Lexpo/modules/haptics/HapticType;

.field public static final enum GESTURE_END:Lexpo/modules/haptics/HapticType;

.field public static final enum GESTURE_START:Lexpo/modules/haptics/HapticType;

.field public static final enum KEYBOARD_PRESS:Lexpo/modules/haptics/HapticType;

.field public static final enum KEYBOARD_RELEASE:Lexpo/modules/haptics/HapticType;

.field public static final enum KEYBOARD_TAP:Lexpo/modules/haptics/HapticType;

.field public static final enum LONG_PRESS:Lexpo/modules/haptics/HapticType;

.field public static final enum NO_HAPTICS:Lexpo/modules/haptics/HapticType;

.field public static final enum REJECT:Lexpo/modules/haptics/HapticType;

.field public static final enum SEGMENT_FREQUENT_TICK:Lexpo/modules/haptics/HapticType;

.field public static final enum SEGMENT_TICK:Lexpo/modules/haptics/HapticType;

.field public static final enum TEXT_HANDLE_MOVE:Lexpo/modules/haptics/HapticType;

.field public static final enum TOGGLE_OFF:Lexpo/modules/haptics/HapticType;

.field public static final enum TOGGLE_ON:Lexpo/modules/haptics/HapticType;

.field public static final enum VIRTUAL_KEY:Lexpo/modules/haptics/HapticType;

.field public static final enum VIRTUAL_KEY_RELEASE:Lexpo/modules/haptics/HapticType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/haptics/HapticType;
    .locals 20

    sget-object v1, Lexpo/modules/haptics/HapticType;->CONFIRM:Lexpo/modules/haptics/HapticType;

    sget-object v2, Lexpo/modules/haptics/HapticType;->REJECT:Lexpo/modules/haptics/HapticType;

    sget-object v3, Lexpo/modules/haptics/HapticType;->GESTURE_START:Lexpo/modules/haptics/HapticType;

    sget-object v4, Lexpo/modules/haptics/HapticType;->GESTURE_END:Lexpo/modules/haptics/HapticType;

    sget-object v5, Lexpo/modules/haptics/HapticType;->TOGGLE_ON:Lexpo/modules/haptics/HapticType;

    sget-object v6, Lexpo/modules/haptics/HapticType;->TOGGLE_OFF:Lexpo/modules/haptics/HapticType;

    sget-object v7, Lexpo/modules/haptics/HapticType;->CLOCK_TICK:Lexpo/modules/haptics/HapticType;

    sget-object v8, Lexpo/modules/haptics/HapticType;->CONTEXT_CLICK:Lexpo/modules/haptics/HapticType;

    sget-object v9, Lexpo/modules/haptics/HapticType;->DRAG_START:Lexpo/modules/haptics/HapticType;

    sget-object v10, Lexpo/modules/haptics/HapticType;->KEYBOARD_TAP:Lexpo/modules/haptics/HapticType;

    sget-object v11, Lexpo/modules/haptics/HapticType;->KEYBOARD_PRESS:Lexpo/modules/haptics/HapticType;

    sget-object v12, Lexpo/modules/haptics/HapticType;->KEYBOARD_RELEASE:Lexpo/modules/haptics/HapticType;

    sget-object v13, Lexpo/modules/haptics/HapticType;->LONG_PRESS:Lexpo/modules/haptics/HapticType;

    sget-object v14, Lexpo/modules/haptics/HapticType;->VIRTUAL_KEY:Lexpo/modules/haptics/HapticType;

    sget-object v15, Lexpo/modules/haptics/HapticType;->NO_HAPTICS:Lexpo/modules/haptics/HapticType;

    sget-object v16, Lexpo/modules/haptics/HapticType;->SEGMENT_TICK:Lexpo/modules/haptics/HapticType;

    sget-object v17, Lexpo/modules/haptics/HapticType;->SEGMENT_FREQUENT_TICK:Lexpo/modules/haptics/HapticType;

    sget-object v18, Lexpo/modules/haptics/HapticType;->TEXT_HANDLE_MOVE:Lexpo/modules/haptics/HapticType;

    sget-object v19, Lexpo/modules/haptics/HapticType;->VIRTUAL_KEY_RELEASE:Lexpo/modules/haptics/HapticType;

    filled-new-array/range {v1 .. v19}, [Lexpo/modules/haptics/HapticType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 9
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x0

    const-string v2, "confirm"

    const-string v3, "CONFIRM"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->CONFIRM:Lexpo/modules/haptics/HapticType;

    .line 10
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x1

    const-string v2, "reject"

    const-string v3, "REJECT"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->REJECT:Lexpo/modules/haptics/HapticType;

    .line 11
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x2

    const-string v2, "gesture-start"

    const-string v3, "GESTURE_START"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->GESTURE_START:Lexpo/modules/haptics/HapticType;

    .line 12
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x3

    const-string v2, "gesture-end"

    const-string v3, "GESTURE_END"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->GESTURE_END:Lexpo/modules/haptics/HapticType;

    .line 13
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x4

    const-string v2, "toggle-on"

    const-string v3, "TOGGLE_ON"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->TOGGLE_ON:Lexpo/modules/haptics/HapticType;

    .line 14
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x5

    const-string v2, "toggle-off"

    const-string v3, "TOGGLE_OFF"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->TOGGLE_OFF:Lexpo/modules/haptics/HapticType;

    .line 15
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x6

    const-string v2, "clock-tick"

    const-string v3, "CLOCK_TICK"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->CLOCK_TICK:Lexpo/modules/haptics/HapticType;

    .line 16
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/4 v1, 0x7

    const-string v2, "context-click"

    const-string v3, "CONTEXT_CLICK"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->CONTEXT_CLICK:Lexpo/modules/haptics/HapticType;

    .line 17
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0x8

    const-string v2, "drag-start"

    const-string v3, "DRAG_START"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->DRAG_START:Lexpo/modules/haptics/HapticType;

    .line 18
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0x9

    const-string v2, "keyboard-tap"

    const-string v3, "KEYBOARD_TAP"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->KEYBOARD_TAP:Lexpo/modules/haptics/HapticType;

    .line 19
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0xa

    const-string v2, "keyboard-press"

    const-string v3, "KEYBOARD_PRESS"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->KEYBOARD_PRESS:Lexpo/modules/haptics/HapticType;

    .line 20
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0xb

    const-string v2, "keyboard-release"

    const-string v3, "KEYBOARD_RELEASE"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->KEYBOARD_RELEASE:Lexpo/modules/haptics/HapticType;

    .line 21
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0xc

    const-string v2, "long-press"

    const-string v3, "LONG_PRESS"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->LONG_PRESS:Lexpo/modules/haptics/HapticType;

    .line 22
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0xd

    const-string v2, "virtual-key"

    const-string v3, "VIRTUAL_KEY"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->VIRTUAL_KEY:Lexpo/modules/haptics/HapticType;

    .line 23
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0xe

    const-string v2, "no-haptics"

    const-string v3, "NO_HAPTICS"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->NO_HAPTICS:Lexpo/modules/haptics/HapticType;

    .line 24
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0xf

    const-string v2, "segment-tick"

    const-string v3, "SEGMENT_TICK"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->SEGMENT_TICK:Lexpo/modules/haptics/HapticType;

    .line 25
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0x10

    const-string v2, "segment-frequent-tick"

    const-string v3, "SEGMENT_FREQUENT_TICK"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->SEGMENT_FREQUENT_TICK:Lexpo/modules/haptics/HapticType;

    .line 26
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0x11

    const-string v2, "text-handle-move"

    const-string v3, "TEXT_HANDLE_MOVE"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->TEXT_HANDLE_MOVE:Lexpo/modules/haptics/HapticType;

    .line 27
    new-instance v0, Lexpo/modules/haptics/HapticType;

    const/16 v1, 0x12

    const-string v2, "virtual-key-release"

    const-string v3, "VIRTUAL_KEY_RELEASE"

    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/haptics/HapticType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lexpo/modules/haptics/HapticType;->VIRTUAL_KEY_RELEASE:Lexpo/modules/haptics/HapticType;

    invoke-static {}, Lexpo/modules/haptics/HapticType;->$values()[Lexpo/modules/haptics/HapticType;

    move-result-object v0

    sput-object v0, Lexpo/modules/haptics/HapticType;->$VALUES:[Lexpo/modules/haptics/HapticType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lexpo/modules/haptics/HapticType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lexpo/modules/haptics/HapticType;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lexpo/modules/haptics/HapticType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lexpo/modules/haptics/HapticType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/haptics/HapticType;
    .locals 1

    const-class v0, Lexpo/modules/haptics/HapticType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 51
    check-cast p0, Lexpo/modules/haptics/HapticType;

    return-object p0
.end method

.method public static values()[Lexpo/modules/haptics/HapticType;
    .locals 1

    sget-object v0, Lexpo/modules/haptics/HapticType;->$VALUES:[Lexpo/modules/haptics/HapticType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 51
    check-cast v0, [Lexpo/modules/haptics/HapticType;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lexpo/modules/haptics/HapticType;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final toHapticFeedbackType()I
    .locals 4

    .line 30
    invoke-virtual {p0}, Lexpo/modules/haptics/HapticType;->name()Ljava/lang/String;

    move-result-object v0

    .line 35
    :try_start_0
    const-class v1, Landroid/view/HapticFeedbackConstants;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 48
    :catch_0
    new-instance v0, Lexpo/modules/haptics/arguments/HapticTypeNotSupportedException;

    iget-object v1, p0, Lexpo/modules/haptics/HapticType;->value:Ljava/lang/String;

    invoke-direct {v0, v1}, Lexpo/modules/haptics/arguments/HapticTypeNotSupportedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :catch_1
    sget-object v0, Lexpo/modules/haptics/HapticType$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lexpo/modules/haptics/HapticType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    .line 45
    :cond_0
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsNotSupportedException;

    invoke-direct {v0}, Lexpo/modules/haptics/arguments/HapticsNotSupportedException;-><init>()V

    throw v0

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    move v1, v3

    goto :goto_0

    :cond_3
    const/4 v1, 0x6

    :cond_4
    :goto_0
    return v1
.end method
