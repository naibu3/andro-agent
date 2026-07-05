.class public final Lcom/stripe/android/uicore/elements/NameConfig$Companion;
.super Ljava/lang/Object;
.source "NameConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/NameConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/NameConfig$Companion;",
        "",
        "<init>",
        "()V",
        "createController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "initialValue",
        "",
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

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 7

    .line 38
    new-instance v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 39
    new-instance v1, Lcom/stripe/android/uicore/elements/NameConfig;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/NameConfig;-><init>()V

    check-cast v1, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    .line 38
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
