.class public final Lcom/stripe/android/uicore/elements/EmailConfig$Companion;
.super Ljava/lang/Object;
.source "EmailConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/EmailConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/EmailConfig$Companion;",
        "",
        "<init>",
        "()V",
        "createController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "initialValue",
        "",
        "showOptionalLabel",
        "",
        "PATTERN",
        "Ljava/util/regex/Pattern;",
        "getPATTERN",
        "()Ljava/util/regex/Pattern;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;-><init>()V

    return-void
.end method

.method public static synthetic createController$default(Lcom/stripe/android/uicore/elements/EmailConfig$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 56
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController(Ljava/lang/String;Z)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createController(Ljava/lang/String;Z)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 10

    .line 60
    new-instance v0, Lcom/stripe/android/uicore/elements/EmailConfig;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/stripe/android/uicore/elements/EmailConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    new-instance v3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 60
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v6, p1

    move v5, p2

    .line 59
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public final getPATTERN()Ljava/util/regex/Pattern;
    .locals 1

    .line 67
    invoke-static {}, Lcom/stripe/android/uicore/elements/EmailConfig;->access$getPATTERN$cp()Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
