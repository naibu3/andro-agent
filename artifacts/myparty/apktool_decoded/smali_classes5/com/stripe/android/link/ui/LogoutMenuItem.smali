.class public final Lcom/stripe/android/link/ui/LogoutMenuItem;
.super Ljava/lang/Object;
.source "LinkAppBarMenu.kt"

# interfaces
.implements Lcom/stripe/android/link/ui/menu/LinkMenuItem;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c1\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u000f\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\tH\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LogoutMenuItem;",
        "Lcom/stripe/android/link/ui/menu/LinkMenuItem;",
        "<init>",
        "()V",
        "text",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "testTag",
        "",
        "getTestTag",
        "()Ljava/lang/String;",
        "isDestructive",
        "",
        "()Z",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "paymentsheet_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/ui/LogoutMenuItem;

.field private static final isDestructive:Z

.field private static final testTag:Ljava/lang/String;

.field private static final text:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/LogoutMenuItem;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/LogoutMenuItem;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->INSTANCE:Lcom/stripe/android/link/ui/LogoutMenuItem;

    .line 26
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_log_out:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->text:Lcom/stripe/android/core/strings/ResolvableString;

    .line 27
    const-string v0, "logout_menu_row_tag"

    sput-object v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->testTag:Ljava/lang/String;

    const/4 v0, 0x1

    .line 28
    sput-boolean v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->isDestructive:Z

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/LogoutMenuItem;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/LogoutMenuItem;

    return v0
.end method

.method public getTestTag()Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->testTag:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 26
    sget-object v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->text:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x5f323c0b

    return v0
.end method

.method public isDestructive()Z
    .locals 1

    .line 28
    sget-boolean v0, Lcom/stripe/android/link/ui/LogoutMenuItem;->isDestructive:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "LogoutMenuItem"

    return-object v0
.end method
