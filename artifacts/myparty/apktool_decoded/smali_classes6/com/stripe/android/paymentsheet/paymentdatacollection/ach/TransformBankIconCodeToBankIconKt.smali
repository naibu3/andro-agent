.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformBankIconCodeToBankIconKt;
.super Ljava/lang/Object;
.source "TransformBankIconCodeToBankIcon.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "transformBankIconCodeToBankIcon",
        "",
        "iconCode",
        "",
        "fallbackIcon",
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


# direct methods
.method public static final transformBankIconCodeToBankIcon(Ljava/lang/String;I)I
    .locals 1

    if-eqz p0, :cond_e

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "compass"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    .line 13
    :cond_0
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_compass:I

    return p0

    .line 9
    :sswitch_1
    const-string v0, "usaa"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    .line 21
    :cond_1
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_usaa:I

    return p0

    .line 9
    :sswitch_2
    const-string v0, "nfcu"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    .line 15
    :cond_2
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_nfcu:I

    return p0

    .line 9
    :sswitch_3
    const-string v0, "svb"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    .line 18
    :cond_3
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_svb:I

    return p0

    .line 9
    :sswitch_4
    const-string v0, "pnc"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    .line 16
    :cond_4
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_pnc:I

    return p0

    .line 9
    :sswitch_5
    const-string v0, "boa"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    .line 10
    :cond_5
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_boa:I

    return p0

    .line 9
    :sswitch_6
    const-string v0, "td"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    .line 20
    :cond_6
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_td:I

    return p0

    .line 9
    :sswitch_7
    const-string v0, "wellsfargo"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    .line 23
    :cond_7
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_wellsfargo:I

    return p0

    .line 9
    :sswitch_8
    const-string v0, "morganchase"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    .line 14
    :cond_8
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_morganchase:I

    return p0

    .line 9
    :sswitch_9
    const-string v0, "usbank"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    .line 22
    :cond_9
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_usbank:I

    return p0

    .line 9
    :sswitch_a
    const-string v0, "stripe"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    .line 19
    :cond_a
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_stripe:I

    return p0

    .line 9
    :sswitch_b
    const-string v0, "citibank"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto :goto_0

    .line 12
    :cond_b
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_citi:I

    return p0

    .line 9
    :sswitch_c
    const-string v0, "suntrust"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_0

    .line 17
    :cond_c
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_suntrust:I

    return p0

    .line 9
    :sswitch_d
    const-string v0, "capitalone"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto :goto_0

    .line 11
    :cond_d
    sget p0, Lcom/stripe/android/R$drawable;->stripe_ic_bank_capitalone:I

    return p0

    :cond_e
    :goto_0
    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x693d6c02 -> :sswitch_d
        -0x66527074 -> :sswitch_c
        -0x559585e9 -> :sswitch_b
        -0x352a9fb3 -> :sswitch_a
        -0x31d66a26 -> :sswitch_9
        -0x101ffb56 -> :sswitch_8
        -0x4b43406 -> :sswitch_7
        0xe70 -> :sswitch_6
        0x17db4 -> :sswitch_5
        0x1b225 -> :sswitch_4
        0x1be5f -> :sswitch_3
        0x338c2a -> :sswitch_2
        0x36eb3e -> :sswitch_1
        0x38a73d12 -> :sswitch_0
    .end sparse-switch
.end method
