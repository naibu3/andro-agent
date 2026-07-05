.class public final Lcom/stripe/android/ui/core/elements/BsbSpecKt;
.super Ljava/lang/Object;
.source "BsbSpec.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\"\u0014\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "banks",
        "",
        "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
        "payments-ui-core_release"
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
.field private static final banks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/view/BecsDebitBanks$Bank;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const/16 v0, 0x7a

    .line 28
    new-array v0, v0, [Lcom/stripe/android/view/BecsDebitBanks$Bank;

    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "00"

    const-string v3, "Stripe Test Bank"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 29
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "10"

    const-string v3, "BankSA (division of Westpac Bank)"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 30
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "11"

    const-string v3, "St George Bank (division of Westpac Bank)"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 31
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "12"

    const-string v4, "Bank of Queensland"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 32
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "14"

    const-string v4, "Rabobank"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 33
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "15"

    const-string v4, "Town & Country Bank"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 34
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "18"

    const-string v4, "Macquarie Bank"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 35
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "19"

    const-string v4, "Bank of Melbourne (division of Westpac Bank)"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 36
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "21"

    const-string v5, "JP Morgan Chase Bank"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 37
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "22"

    const-string v5, "BNP Paribas"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 38
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "23"

    const-string v5, "Bank of America"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 39
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "24"

    const-string v5, "Citibank"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 40
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "25"

    const-string v5, "BNP Paribas Securities"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 41
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "26"

    const-string v5, "Bankers Trust Australia (division of Westpac Bank)"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 42
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "29"

    const-string v5, "Bank of Tokyo-Mitsubishi"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 43
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "30"

    const-string v5, "Bankwest (division of Commonwealth Bank)"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 44
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "33"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 45
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "34"

    const-string v3, "HSBC Bank Australia"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x11

    aput-object v1, v0, v2

    .line 46
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "35"

    const-string v5, "Bank of China"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x12

    aput-object v1, v0, v2

    .line 47
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "40"

    const-string v6, "Commonwealth Bank of Australia"

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x13

    aput-object v1, v0, v2

    .line 48
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "41"

    const-string v7, "Deutsche Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x14

    aput-object v1, v0, v2

    .line 49
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "42"

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x15

    aput-object v1, v0, v2

    .line 50
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "45"

    const-string v7, "OCBC Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x16

    aput-object v1, v0, v2

    .line 51
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "46"

    const-string v7, "Advance Bank (division of Westpac Bank)"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x17

    aput-object v1, v0, v2

    .line 52
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "47"

    const-string v7, "Challenge Bank (division of Westpac Bank)"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x18

    aput-object v1, v0, v2

    .line 53
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "48"

    const-string v7, "Suncorp-Metway"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x19

    aput-object v1, v0, v2

    .line 54
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "52"

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    .line 55
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "55"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    .line 56
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "57"

    const-string v4, "Australian Settlements"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    .line 57
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "61"

    const-string v4, "Adelaide Bank (division of Bendigo and Adelaide Bank)"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    .line 58
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "70"

    const-string v4, "Indue"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    .line 59
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "73"

    const-string v4, "Westpac Banking Corporation"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    .line 60
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "76"

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x20

    aput-object v1, v0, v2

    .line 61
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "80"

    const-string v8, "Cuscal"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x21

    aput-object v1, v0, v2

    .line 62
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "90"

    const-string v8, "Australia Post"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x22

    aput-object v1, v0, v2

    .line 63
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "311"

    const-string v8, "in1bank"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x23

    aput-object v1, v0, v2

    .line 64
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "313"

    const-string v8, "Bankmecu"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x24

    aput-object v1, v0, v2

    .line 65
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "323"

    const-string v8, "KEB Hana Bank"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x25

    aput-object v1, v0, v2

    .line 66
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "325"

    const-string v8, "Beyond Bank Australia"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x26

    aput-object v1, v0, v2

    .line 67
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "432"

    const-string v8, "Standard Chartered Bank"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x27

    aput-object v1, v0, v2

    .line 68
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "510"

    const-string v8, "Citibank N.A."

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x28

    aput-object v1, v0, v2

    .line 69
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "512"

    const-string v8, "Community First Credit Union"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x29

    aput-object v1, v0, v2

    .line 70
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "514"

    const-string v8, "QT Mutual Bank"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    .line 71
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "517"

    const-string v8, "Australian Settlements Limited"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    .line 72
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "533"

    const-string v9, "Bananacoast Community Credit Union"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    .line 73
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "611"

    const-string v9, "Select Credit Union"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    .line 74
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "630"

    const-string v9, "ABS Building Society"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    .line 75
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "632"

    const-string v9, "B&E"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    .line 76
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "633"

    const-string v9, "Bendigo Bank"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x30

    aput-object v1, v0, v2

    .line 77
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "634"

    const-string v9, "Uniting Financial Services"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x31

    aput-object v1, v0, v2

    .line 78
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "636"

    const-string v9, "Cuscal Limited"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x32

    aput-object v1, v0, v2

    .line 79
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "637"

    const-string v10, "Greater Building Society"

    invoke-direct {v1, v2, v10}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x33

    aput-object v1, v0, v2

    .line 80
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "638"

    const-string v11, "Heritage Bank"

    invoke-direct {v1, v2, v11}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x34

    aput-object v1, v0, v2

    .line 81
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "639"

    const-string v12, "Home Building Society (division of Bank of Queensland)"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x35

    aput-object v1, v0, v2

    .line 82
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "640"

    const-string v12, "Hume Bank"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x36

    aput-object v1, v0, v2

    .line 83
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "641"

    const-string v12, "IMB"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x37

    aput-object v1, v0, v2

    .line 84
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "642"

    const-string v13, "Australian Defence Credit Union"

    invoke-direct {v1, v2, v13}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x38

    aput-object v1, v0, v2

    .line 85
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "645"

    const-string v13, "Wide Bay Australia"

    invoke-direct {v1, v2, v13}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x39

    aput-object v1, v0, v2

    .line 86
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "646"

    const-string v14, "Maitland Mutual Building Society"

    invoke-direct {v1, v2, v14}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    .line 87
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "647"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    .line 88
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "650"

    const-string v12, "Newcastle Permanent Building Society"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    .line 89
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    .line 90
    const-string v2, "653"

    .line 91
    const-string v12, "Pioneer Permanent Building Society (division of Bank of Queensland)"

    .line 89
    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    .line 93
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "654"

    const-string v12, "ECU Australia"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    .line 94
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "655"

    const-string v12, "The Rock Building Society"

    invoke-direct {v1, v2, v12}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    .line 95
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "656"

    invoke-direct {v1, v2, v13}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x40

    aput-object v1, v0, v2

    .line 96
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "657"

    invoke-direct {v1, v2, v10}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x41

    aput-object v1, v0, v2

    .line 97
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "659"

    const-string v10, "SGE Credit Union"

    invoke-direct {v1, v2, v10}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x42

    aput-object v1, v0, v2

    .line 98
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "664"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x43

    aput-object v1, v0, v2

    .line 99
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "670"

    invoke-direct {v1, v2, v9}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x44

    aput-object v1, v0, v2

    .line 100
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "676"

    const-string v7, "Gateway Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x45

    aput-object v1, v0, v2

    .line 101
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "680"

    const-string v7, "Greater Bank Limited"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x46

    aput-object v1, v0, v2

    .line 102
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "721"

    const-string v7, "Holiday Coast Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x47

    aput-object v1, v0, v2

    .line 103
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "722"

    const-string v7, "Southern Cross Credit"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x48

    aput-object v1, v0, v2

    .line 104
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "723"

    const-string v7, "Heritage Isle Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x49

    aput-object v1, v0, v2

    .line 105
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "724"

    const-string v7, "Railways Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    .line 106
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "725"

    const-string v7, "Judo Bank Pty Ltd"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    .line 107
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "728"

    const-string v7, "Summerland Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    .line 108
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "775"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    .line 109
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "777"

    const-string v7, "Police & Nurse"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    .line 110
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "812"

    const-string v7, "Teachers Mutual Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    .line 111
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "813"

    const-string v7, "Capricornian"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x50

    aput-object v1, v0, v2

    .line 112
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "814"

    const-string v7, "Credit Union Australia"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x51

    aput-object v1, v0, v2

    .line 113
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "815"

    const-string v7, "Police Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x52

    aput-object v1, v0, v2

    .line 114
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "817"

    const-string v7, "Warwick Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x53

    aput-object v1, v0, v2

    .line 115
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "818"

    const-string v7, "Bank of Communications"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x54

    aput-object v1, v0, v2

    .line 116
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "819"

    const-string v7, "Industrial & Commercial Bank of China"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x55

    aput-object v1, v0, v2

    .line 117
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "820"

    const-string v7, "Global Payments Australia 1 Pty Ltd"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x56

    aput-object v1, v0, v2

    .line 118
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "823"

    const-string v7, "Encompass Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x57

    aput-object v1, v0, v2

    .line 119
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "824"

    const-string v7, "Sutherland Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x58

    aput-object v1, v0, v2

    .line 120
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "825"

    const-string v7, "Big Sky Building Society"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x59

    aput-object v1, v0, v2

    .line 121
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "833"

    const-string v7, "Defence Bank Limited"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x5a

    aput-object v1, v0, v2

    .line 122
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "840"

    const-string v7, "Split Payments Pty Ltd"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x5b

    aput-object v1, v0, v2

    .line 123
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "880"

    invoke-direct {v1, v2, v11}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x5c

    aput-object v1, v0, v2

    .line 124
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "882"

    const-string v7, "Maritime Mining & Power Credit Union"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x5d

    aput-object v1, v0, v2

    .line 125
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "888"

    const-string v7, "China Construction Bank Corporation"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x5e

    aput-object v1, v0, v2

    .line 126
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "889"

    const-string v7, "DBS Bank Ltd."

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x5f

    aput-object v1, v0, v2

    .line 127
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "911"

    const-string v7, "Sumitomo Mitsui Banking Corporation"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x60

    aput-object v1, v0, v2

    .line 128
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "913"

    const-string v7, "State Street Bank & Trust Company"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x61

    aput-object v1, v0, v2

    .line 129
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "917"

    const-string v7, "Arab Bank Australia"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x62

    aput-object v1, v0, v2

    .line 130
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "918"

    const-string v7, "Mizuho Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x63

    aput-object v1, v0, v2

    .line 131
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "922"

    const-string v7, "United Overseas Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x64

    aput-object v1, v0, v2

    .line 132
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "923"

    const-string v7, "ING Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x65

    aput-object v1, v0, v2

    .line 133
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "931"

    const-string v8, "Mega International Commercial Bank"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x66

    aput-object v1, v0, v2

    .line 134
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "932"

    const-string v8, "Community Mutual"

    invoke-direct {v1, v2, v8}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x67

    aput-object v1, v0, v2

    .line 135
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "936"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x68

    aput-object v1, v0, v2

    .line 136
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "939"

    const-string v7, "AMP Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x69

    aput-object v1, v0, v2

    .line 137
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "941"

    const-string v7, "Delphi Bank (division of Bendigo and Adelaide Bank)"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x6a

    aput-object v1, v0, v2

    .line 138
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "942"

    const-string v7, "Bank of Sydney"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x6b

    aput-object v1, v0, v2

    .line 139
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "943"

    const-string v7, "Taiwan Business Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x6c

    aput-object v1, v0, v2

    .line 140
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "944"

    const-string v7, "Members Equity Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x6d

    aput-object v1, v0, v2

    .line 141
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "946"

    const-string v7, "UBS AG"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x6e

    aput-object v1, v0, v2

    .line 142
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "951"

    const-string v7, "BOQ Specialist Bank"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x6f

    aput-object v1, v0, v2

    .line 143
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "952"

    const-string v7, "Royal Bank of Scotland"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x70

    aput-object v1, v0, v2

    .line 144
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "969"

    const-string v7, "Tyro Payments"

    invoke-direct {v1, v2, v7}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x71

    aput-object v1, v0, v2

    .line 145
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "980"

    invoke-direct {v1, v2, v5}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x72

    aput-object v1, v0, v2

    .line 146
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "985"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x73

    aput-object v1, v0, v2

    .line 147
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "01"

    const-string v3, "Australia and New Zealand Banking Group"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x74

    aput-object v1, v0, v2

    .line 148
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "03"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x75

    aput-object v1, v0, v2

    .line 149
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "04"

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x76

    aput-object v1, v0, v2

    .line 150
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "06"

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x77

    aput-object v1, v0, v2

    .line 151
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "08"

    const-string v3, "National Australia Bank"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x78

    aput-object v1, v0, v2

    .line 152
    new-instance v1, Lcom/stripe/android/view/BecsDebitBanks$Bank;

    const-string v2, "09"

    const-string v3, "Reserve Bank of Australia"

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/view/BecsDebitBanks$Bank;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x79

    aput-object v1, v0, v2

    .line 27
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/BsbSpecKt;->banks:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getBanks$p()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/stripe/android/ui/core/elements/BsbSpecKt;->banks:Ljava/util/List;

    return-object v0
.end method
