.class public final Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;
.super Ljava/lang/Object;
.source "CustomerSessionClientSecretValidator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;",
        "",
        "<init>",
        "()V",
        "EPHEMERAL_KEY_SECRET_PREFIX",
        "",
        "CUSTOMER_SESSION_CLIENT_SECRET_KEY_PREFIX",
        "validate",
        "Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;",
        "customerSessionClientSecret",
        "Result",
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
.field public static final $stable:I = 0x0

.field private static final CUSTOMER_SESSION_CLIENT_SECRET_KEY_PREFIX:Ljava/lang/String; = "cuss_"

.field private static final EPHEMERAL_KEY_SECRET_PREFIX:Ljava/lang/String; = "ek_"

.field public static final INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;

    invoke-direct {v0}, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;-><init>()V

    sput-object v0, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;->INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final validate(Ljava/lang/String;)Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;
    .locals 4

    const-string v0, "customerSessionClientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    sget-object p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$Empty;->INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$Empty;

    check-cast p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;

    return-object p1

    .line 23
    :cond_0
    const-string v0, "ek_"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    sget-object p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$LegacyEphemeralKey;->INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$LegacyEphemeralKey;

    check-cast p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;

    return-object p1

    .line 25
    :cond_1
    const-string v0, "cuss_"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 26
    sget-object p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$UnknownKey;->INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Error$UnknownKey;

    check-cast p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;

    return-object p1

    .line 27
    :cond_2
    sget-object p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Valid;->INSTANCE:Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result$Valid;

    check-cast p1, Lcom/stripe/android/common/validation/CustomerSessionClientSecretValidator$Result;

    return-object p1
.end method
