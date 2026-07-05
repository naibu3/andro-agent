.class public final Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;
.super Ljava/lang/Object;
.source "ExpiryDateState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u001a)\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\u0017\u0010\u0008\u001a\u00020\u00062\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0002\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00062\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0002\u0010\t\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "formattedExpiryDate",
        "",
        "expiryMonth",
        "",
        "expiryYear",
        "enabled",
        "",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/String;",
        "monthIsInvalid",
        "(Ljava/lang/Integer;)Z",
        "yearIsInvalid",
        "JANUARY",
        "OCTOBER",
        "DECEMBER",
        "YEAR_2000",
        "YEAR_2100",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DECEMBER:I = 0xc

.field private static final JANUARY:I = 0x1

.field private static final OCTOBER:I = 0xa

.field private static final YEAR_2000:I = 0x7d0

.field private static final YEAR_2100:I = 0x834


# direct methods
.method public static final synthetic access$formattedExpiryDate(Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;->formattedExpiryDate(Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final formattedExpiryDate(Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/String;
    .locals 2

    if-nez p2, :cond_1

    .line 113
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;->monthIsInvalid(Ljava/lang/Integer;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;->yearIsInvalid(Ljava/lang/Integer;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 115
    :cond_0
    const-string p0, "\u2022\u2022 / \u2022\u2022"

    return-object p0

    .line 119
    :cond_1
    const-string p2, "00"

    if-eqz p0, :cond_4

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;->monthIsInvalid(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 122
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_3

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    .line 126
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_4
    :goto_0
    move-object p0, p2

    :goto_1
    if-eqz p1, :cond_6

    .line 131
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;->yearIsInvalid(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    .line 136
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    const/4 v0, 0x4

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    const-string p1, "substring(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    :cond_6
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final monthIsInvalid(Ljava/lang/Integer;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    .line 144
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v1, v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v1, 0xc

    if-le p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method private static final yearIsInvalid(Ljava/lang/Integer;)Z
    .locals 2

    if-eqz p0, :cond_1

    .line 150
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x7d0

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/16 v0, 0x834

    if-le p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
