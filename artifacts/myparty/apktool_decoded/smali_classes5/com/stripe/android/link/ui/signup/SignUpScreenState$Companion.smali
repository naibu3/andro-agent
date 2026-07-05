.class public final Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;
.super Ljava/lang/Object;
.source "SignUpScreenState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/link/ui/signup/SignUpScreenState;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "customerInfo",
        "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;
    .locals 11

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 29
    invoke-virtual {p2}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 30
    :cond_0
    sget-object v0, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    :goto_0
    move-object v6, v0

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v0, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    goto :goto_0

    :goto_2
    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 31
    invoke-static {p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenStateKt;->getRequiresNameCollection(Lcom/stripe/android/link/LinkConfiguration;)Z

    move-result v1

    invoke-static {p2, v1}, Lcom/stripe/android/link/ui/signup/SignUpScreenStateKt;->access$isComplete(Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Z)Z

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    move v3, v1

    goto :goto_3

    :cond_2
    move v3, v0

    .line 35
    :goto_3
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getMerchantName()Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-static {p1}, Lcom/stripe/android/link/ui/signup/SignUpScreenStateKt;->getRequiresNameCollection(Lcom/stripe/android/link/LinkConfiguration;)Z

    move-result v4

    .line 37
    invoke-virtual {p1}, Lcom/stripe/android/link/LinkConfiguration;->getAllowUserEmailEdits()Z

    move-result v5

    .line 33
    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/link/ui/signup/SignUpScreenState;-><init>(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
