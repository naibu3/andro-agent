.class public final enum Lcom/stripe/android/view/FpxBank;
.super Ljava/lang/Enum;
.source "FpxBank.kt"

# interfaces
.implements Lcom/stripe/android/view/Bank;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/FpxBank$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/view/FpxBank;",
        ">;",
        "Lcom/stripe/android/view/Bank;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001c\u0008\u0080\u0081\u0002\u0018\u0000 \u001f2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001fB!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/view/FpxBank;",
        "Lcom/stripe/android/view/Bank;",
        "",
        "id",
        "",
        "code",
        "displayName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getCode",
        "getDisplayName",
        "Maybank2U",
        "Cimb",
        "PublicBank",
        "Rhb",
        "HongLeongBank",
        "AmBank",
        "AffinBank",
        "AllianceBankBusiness",
        "BankIslam",
        "BankMuamalat",
        "BankRakyat",
        "Bsn",
        "Hsbc",
        "Kfh",
        "Maybank2E",
        "Ocbc",
        "StandardChartered",
        "UobBank",
        "Companion",
        "payments-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/view/FpxBank;

.field public static final enum AffinBank:Lcom/stripe/android/view/FpxBank;

.field public static final enum AllianceBankBusiness:Lcom/stripe/android/view/FpxBank;

.field public static final enum AmBank:Lcom/stripe/android/view/FpxBank;

.field public static final enum BankIslam:Lcom/stripe/android/view/FpxBank;

.field public static final enum BankMuamalat:Lcom/stripe/android/view/FpxBank;

.field public static final enum BankRakyat:Lcom/stripe/android/view/FpxBank;

.field public static final enum Bsn:Lcom/stripe/android/view/FpxBank;

.field public static final enum Cimb:Lcom/stripe/android/view/FpxBank;

.field public static final Companion:Lcom/stripe/android/view/FpxBank$Companion;

.field public static final enum HongLeongBank:Lcom/stripe/android/view/FpxBank;

.field public static final enum Hsbc:Lcom/stripe/android/view/FpxBank;

.field public static final enum Kfh:Lcom/stripe/android/view/FpxBank;

.field public static final enum Maybank2E:Lcom/stripe/android/view/FpxBank;

.field public static final enum Maybank2U:Lcom/stripe/android/view/FpxBank;

.field public static final enum Ocbc:Lcom/stripe/android/view/FpxBank;

.field public static final enum PublicBank:Lcom/stripe/android/view/FpxBank;

.field public static final enum Rhb:Lcom/stripe/android/view/FpxBank;

.field public static final enum StandardChartered:Lcom/stripe/android/view/FpxBank;

.field public static final enum UobBank:Lcom/stripe/android/view/FpxBank;


# instance fields
.field private final code:Ljava/lang/String;

.field private final displayName:Ljava/lang/String;

.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/view/FpxBank;
    .locals 19

    sget-object v1, Lcom/stripe/android/view/FpxBank;->Maybank2U:Lcom/stripe/android/view/FpxBank;

    sget-object v2, Lcom/stripe/android/view/FpxBank;->Cimb:Lcom/stripe/android/view/FpxBank;

    sget-object v3, Lcom/stripe/android/view/FpxBank;->PublicBank:Lcom/stripe/android/view/FpxBank;

    sget-object v4, Lcom/stripe/android/view/FpxBank;->Rhb:Lcom/stripe/android/view/FpxBank;

    sget-object v5, Lcom/stripe/android/view/FpxBank;->HongLeongBank:Lcom/stripe/android/view/FpxBank;

    sget-object v6, Lcom/stripe/android/view/FpxBank;->AmBank:Lcom/stripe/android/view/FpxBank;

    sget-object v7, Lcom/stripe/android/view/FpxBank;->AffinBank:Lcom/stripe/android/view/FpxBank;

    sget-object v8, Lcom/stripe/android/view/FpxBank;->AllianceBankBusiness:Lcom/stripe/android/view/FpxBank;

    sget-object v9, Lcom/stripe/android/view/FpxBank;->BankIslam:Lcom/stripe/android/view/FpxBank;

    sget-object v10, Lcom/stripe/android/view/FpxBank;->BankMuamalat:Lcom/stripe/android/view/FpxBank;

    sget-object v11, Lcom/stripe/android/view/FpxBank;->BankRakyat:Lcom/stripe/android/view/FpxBank;

    sget-object v12, Lcom/stripe/android/view/FpxBank;->Bsn:Lcom/stripe/android/view/FpxBank;

    sget-object v13, Lcom/stripe/android/view/FpxBank;->Hsbc:Lcom/stripe/android/view/FpxBank;

    sget-object v14, Lcom/stripe/android/view/FpxBank;->Kfh:Lcom/stripe/android/view/FpxBank;

    sget-object v15, Lcom/stripe/android/view/FpxBank;->Maybank2E:Lcom/stripe/android/view/FpxBank;

    sget-object v16, Lcom/stripe/android/view/FpxBank;->Ocbc:Lcom/stripe/android/view/FpxBank;

    sget-object v17, Lcom/stripe/android/view/FpxBank;->StandardChartered:Lcom/stripe/android/view/FpxBank;

    sget-object v18, Lcom/stripe/android/view/FpxBank;->UobBank:Lcom/stripe/android/view/FpxBank;

    filled-new-array/range {v1 .. v18}, [Lcom/stripe/android/view/FpxBank;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    .line 8
    new-instance v0, Lcom/stripe/android/view/FpxBank;

    .line 10
    const-string v4, "maybank2u"

    .line 11
    const-string v5, "Maybank2U"

    .line 8
    const-string v1, "Maybank2U"

    const/4 v2, 0x0

    const-string v3, "MB2U0227"

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/view/FpxBank;->Maybank2U:Lcom/stripe/android/view/FpxBank;

    .line 13
    new-instance v1, Lcom/stripe/android/view/FpxBank;

    .line 15
    const-string v5, "cimb"

    .line 16
    const-string v6, "CIMB Clicks"

    .line 13
    const-string v2, "Cimb"

    const/4 v3, 0x1

    const-string v4, "BCBB0235"

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lcom/stripe/android/view/FpxBank;->Cimb:Lcom/stripe/android/view/FpxBank;

    .line 18
    new-instance v2, Lcom/stripe/android/view/FpxBank;

    .line 20
    const-string v6, "public_bank"

    .line 21
    const-string v7, "Public Bank"

    .line 18
    const-string v3, "PublicBank"

    const/4 v4, 0x2

    const-string v5, "PBB0233"

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/stripe/android/view/FpxBank;->PublicBank:Lcom/stripe/android/view/FpxBank;

    .line 23
    new-instance v3, Lcom/stripe/android/view/FpxBank;

    .line 25
    const-string v7, "rhb"

    .line 26
    const-string v8, "RHB Bank"

    .line 23
    const-string v4, "Rhb"

    const/4 v5, 0x3

    const-string v6, "RHB0218"

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/stripe/android/view/FpxBank;->Rhb:Lcom/stripe/android/view/FpxBank;

    .line 28
    new-instance v4, Lcom/stripe/android/view/FpxBank;

    .line 30
    const-string v8, "hong_leong_bank"

    .line 31
    const-string v9, "Hong Leong Bank"

    .line 28
    const-string v5, "HongLeongBank"

    const/4 v6, 0x4

    const-string v7, "HLB0224"

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lcom/stripe/android/view/FpxBank;->HongLeongBank:Lcom/stripe/android/view/FpxBank;

    .line 33
    new-instance v5, Lcom/stripe/android/view/FpxBank;

    .line 35
    const-string v9, "ambank"

    .line 36
    const-string v10, "AmBank"

    .line 33
    const-string v6, "AmBank"

    const/4 v7, 0x5

    const-string v8, "AMBB0209"

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lcom/stripe/android/view/FpxBank;->AmBank:Lcom/stripe/android/view/FpxBank;

    .line 38
    new-instance v6, Lcom/stripe/android/view/FpxBank;

    .line 40
    const-string v10, "affin_bank"

    .line 41
    const-string v11, "Affin Bank"

    .line 38
    const-string v7, "AffinBank"

    const/4 v8, 0x6

    const-string v9, "ABB0233"

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, Lcom/stripe/android/view/FpxBank;->AffinBank:Lcom/stripe/android/view/FpxBank;

    .line 43
    new-instance v0, Lcom/stripe/android/view/FpxBank;

    .line 45
    const-string v4, "alliance_bank"

    .line 46
    const-string v5, "Alliance Bank"

    .line 43
    const-string v1, "AllianceBankBusiness"

    const/4 v2, 0x7

    const-string v3, "ABMB0212"

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/view/FpxBank;->AllianceBankBusiness:Lcom/stripe/android/view/FpxBank;

    .line 48
    new-instance v1, Lcom/stripe/android/view/FpxBank;

    .line 50
    const-string v5, "bank_islam"

    .line 51
    const-string v6, "Bank Islam"

    .line 48
    const-string v2, "BankIslam"

    const/16 v3, 0x8

    const-string v4, "BIMB0340"

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lcom/stripe/android/view/FpxBank;->BankIslam:Lcom/stripe/android/view/FpxBank;

    .line 53
    new-instance v2, Lcom/stripe/android/view/FpxBank;

    .line 55
    const-string v6, "bank_muamalat"

    .line 56
    const-string v7, "Bank Muamalat"

    .line 53
    const-string v3, "BankMuamalat"

    const/16 v4, 0x9

    const-string v5, "BMMB0341"

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/stripe/android/view/FpxBank;->BankMuamalat:Lcom/stripe/android/view/FpxBank;

    .line 58
    new-instance v3, Lcom/stripe/android/view/FpxBank;

    .line 60
    const-string v7, "bank_rakyat"

    .line 61
    const-string v8, "Bank Rakyat"

    .line 58
    const-string v4, "BankRakyat"

    const/16 v5, 0xa

    const-string v6, "BKRM0602"

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/stripe/android/view/FpxBank;->BankRakyat:Lcom/stripe/android/view/FpxBank;

    .line 63
    new-instance v4, Lcom/stripe/android/view/FpxBank;

    .line 65
    const-string v8, "bsn"

    .line 66
    const-string v9, "BSN"

    .line 63
    const-string v5, "Bsn"

    const/16 v6, 0xb

    const-string v7, "BSN0601"

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lcom/stripe/android/view/FpxBank;->Bsn:Lcom/stripe/android/view/FpxBank;

    .line 68
    new-instance v5, Lcom/stripe/android/view/FpxBank;

    .line 70
    const-string v9, "hsbc"

    .line 71
    const-string v10, "HSBC Bank"

    .line 68
    const-string v6, "Hsbc"

    const/16 v7, 0xc

    const-string v8, "HSBC0223"

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lcom/stripe/android/view/FpxBank;->Hsbc:Lcom/stripe/android/view/FpxBank;

    .line 73
    new-instance v6, Lcom/stripe/android/view/FpxBank;

    .line 75
    const-string v10, "kfh"

    .line 76
    const-string v11, "KFH"

    .line 73
    const-string v7, "Kfh"

    const/16 v8, 0xd

    const-string v9, "KFH0346"

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, Lcom/stripe/android/view/FpxBank;->Kfh:Lcom/stripe/android/view/FpxBank;

    .line 78
    new-instance v0, Lcom/stripe/android/view/FpxBank;

    .line 80
    const-string v4, "maybank2e"

    .line 81
    const-string v5, "Maybank2E"

    .line 78
    const-string v1, "Maybank2E"

    const/16 v2, 0xe

    const-string v3, "MBB0228"

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/view/FpxBank;->Maybank2E:Lcom/stripe/android/view/FpxBank;

    .line 83
    new-instance v1, Lcom/stripe/android/view/FpxBank;

    .line 85
    const-string v5, "ocbc"

    .line 86
    const-string v6, "OCBC Bank"

    .line 83
    const-string v2, "Ocbc"

    const/16 v3, 0xf

    const-string v4, "OCBC0229"

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lcom/stripe/android/view/FpxBank;->Ocbc:Lcom/stripe/android/view/FpxBank;

    .line 88
    new-instance v2, Lcom/stripe/android/view/FpxBank;

    .line 90
    const-string v6, "standard_chartered"

    .line 91
    const-string v7, "Standard Chartered"

    .line 88
    const-string v3, "StandardChartered"

    const/16 v4, 0x10

    const-string v5, "SCB0216"

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lcom/stripe/android/view/FpxBank;->StandardChartered:Lcom/stripe/android/view/FpxBank;

    .line 93
    new-instance v3, Lcom/stripe/android/view/FpxBank;

    .line 95
    const-string v7, "uob"

    .line 96
    const-string v8, "UOB"

    .line 93
    const-string v4, "UobBank"

    const/16 v5, 0x11

    const-string v6, "UOB0226"

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/view/FpxBank;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lcom/stripe/android/view/FpxBank;->UobBank:Lcom/stripe/android/view/FpxBank;

    invoke-static {}, Lcom/stripe/android/view/FpxBank;->$values()[Lcom/stripe/android/view/FpxBank;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/FpxBank;->$VALUES:[Lcom/stripe/android/view/FpxBank;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/FpxBank;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/view/FpxBank$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/FpxBank$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/FpxBank;->Companion:Lcom/stripe/android/view/FpxBank$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    iput-object p3, p0, Lcom/stripe/android/view/FpxBank;->id:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/stripe/android/view/FpxBank;->code:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/stripe/android/view/FpxBank;->displayName:Ljava/lang/String;

    return-void
.end method

.method public static final get(Ljava/lang/String;)Lcom/stripe/android/view/FpxBank;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/view/FpxBank;->Companion:Lcom/stripe/android/view/FpxBank$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/view/FpxBank$Companion;->get(Ljava/lang/String;)Lcom/stripe/android/view/FpxBank;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/view/FpxBank;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/view/FpxBank;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/view/FpxBank;
    .locals 1

    const-class v0, Lcom/stripe/android/view/FpxBank;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 111
    check-cast p0, Lcom/stripe/android/view/FpxBank;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/view/FpxBank;
    .locals 1

    sget-object v0, Lcom/stripe/android/view/FpxBank;->$VALUES:[Lcom/stripe/android/view/FpxBank;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 111
    check-cast v0, [Lcom/stripe/android/view/FpxBank;

    return-object v0
.end method


# virtual methods
.method public getCode()Ljava/lang/String;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/stripe/android/view/FpxBank;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/view/FpxBank;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/stripe/android/view/FpxBank;->id:Ljava/lang/String;

    return-object v0
.end method
