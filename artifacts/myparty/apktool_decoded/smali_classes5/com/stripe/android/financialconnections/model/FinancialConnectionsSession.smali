.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
.super Ljava/lang/Object;
.source "FinancialConnectionsSession.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSession.kt\ncom/stripe/android/financialconnections/model/FinancialConnectionsSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0004`abcB\u0081\u0001\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0087\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\t\u0010@\u001a\u00020\u0004H\u00c6\u0003J\t\u0010A\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008CJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\u0008EJ\t\u0010F\u001a\u00020\nH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0087\u0001\u0010M\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001J\u0006\u0010N\u001a\u00020\u0018J\u0013\u0010O\u001a\u00020\n2\u0008\u0010P\u001a\u0004\u0018\u00010QH\u00d6\u0003J\t\u0010R\u001a\u00020\u0018H\u00d6\u0001J\t\u0010S\u001a\u00020\u0004H\u00d6\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0018J%\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0001\u00a2\u0006\u0002\u0008_R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\"\u0010\u001d\u001a\u0004\u0008#\u0010$R\u001e\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008%\u0010\u001d\u001a\u0004\u0008&\u0010$R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\'\u0010\u001d\u001a\u0004\u0008(\u0010)R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000c8GX\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008*\u0010\u001d\u001a\u0004\u0008+\u0010,R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008-\u0010\u001d\u001a\u0004\u0008.\u0010\u001fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008/\u0010\u001d\u001a\u0004\u00080\u0010\u001fR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00081\u0010\u001d\u001a\u0004\u00082\u00103R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00084\u0010\u001d\u001a\u0004\u00085\u00106R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00087\u0010\u001d\u001a\u0004\u00088\u00109R\u0011\u0010:\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010$R\u0013\u0010<\u001a\u0004\u0018\u00010=8G\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?\u00a8\u0006d"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "clientSecret",
        "",
        "id",
        "accountsOld",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "accountsNew",
        "livemode",
        "",
        "paymentAccount",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "returnUrl",
        "bankAccountToken",
        "manualEntry",
        "Lcom/stripe/android/financialconnections/model/ManualEntry;",
        "status",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;",
        "statusDetails",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getClientSecret$annotations",
        "()V",
        "getClientSecret",
        "()Ljava/lang/String;",
        "getId$annotations",
        "getId",
        "getAccountsOld$financial_connections_core_release$annotations",
        "getAccountsOld$financial_connections_core_release",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;",
        "getAccountsNew$financial_connections_core_release$annotations",
        "getAccountsNew$financial_connections_core_release",
        "getLivemode$annotations",
        "getLivemode",
        "()Z",
        "getPaymentAccount$annotations",
        "getPaymentAccount",
        "()Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "getReturnUrl$annotations",
        "getReturnUrl",
        "getBankAccountToken$annotations",
        "getBankAccountToken",
        "getManualEntry$annotations",
        "getManualEntry",
        "()Lcom/stripe/android/financialconnections/model/ManualEntry;",
        "getStatus$annotations",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;",
        "getStatusDetails$annotations",
        "getStatusDetails",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;",
        "accounts",
        "getAccounts",
        "parsedToken",
        "Lcom/stripe/android/model/Token;",
        "getParsedToken",
        "()Lcom/stripe/android/model/Token;",
        "component1",
        "component2",
        "component3",
        "component3$financial_connections_core_release",
        "component4",
        "component4$financial_connections_core_release",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "write$Self",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$financial_connections_core_release",
        "Status",
        "StatusDetails",
        "$serializer",
        "Companion",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;


# instance fields
.field private final accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

.field private final accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

.field private final bankAccountToken:Ljava/lang/String;

.field private final clientSecret:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final livemode:Z

.field private final manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

.field private final paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

.field private final returnUrl:Ljava/lang/String;

.field private final status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

.field private final statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p1, 0x13

    const/16 v0, 0x13

    if-eq v0, p13, :cond_0

    .line 33
    sget-object p13, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;

    invoke-virtual {p13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    :goto_1
    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    :goto_2
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    :goto_5
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    goto :goto_6

    :cond_7
    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    :goto_6
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-void

    :cond_8
    iput-object p12, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    .line 44
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    .line 47
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    .line 50
    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    .line 53
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    .line 57
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    .line 60
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    .line 65
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    .line 68
    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    .line 71
    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x4

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_3

    move-object p7, v0

    :cond_3
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_4

    move-object p8, v0

    :cond_4
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_5

    move-object p9, v0

    :cond_5
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_6

    move-object p10, v0

    :cond_6
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_7

    move-object p12, v0

    goto :goto_0

    :cond_7
    move-object p12, p11

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 36
    invoke-direct/range {p1 .. p12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAccountsNew$financial_connections_core_release$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountsOld$financial_connections_core_release$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "linked_accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getBankAccountToken$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "bank_account_token"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getClientSecret$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "client_secret"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getLivemode$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "livemode"
    .end annotation

    return-void
.end method

.method public static synthetic getManualEntry$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "manual_entry"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentAccount$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "payment_account"
    .end annotation

    return-void
.end method

.method public static synthetic getReturnUrl$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "return_url"
    .end annotation

    return-void
.end method

.method public static synthetic getStatus$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "status"
    .end annotation

    return-void
.end method

.method public static synthetic getStatusDetails$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "status_details"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 33
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$Serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    return-object v0
.end method

.method public final component11()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3$financial_connections_core_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final component4$financial_connections_core_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/PaymentAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/financialconnections/model/ManualEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 13

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final getAccountsNew$financial_connections_core_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final getAccountsOld$financial_connections_core_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    return-object v0
.end method

.method public final getBankAccountToken()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLivemode()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    return v0
.end method

.method public final getManualEntry()Lcom/stripe/android/financialconnections/model/ManualEntry;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    return-object v0
.end method

.method public final getParsedToken()Lcom/stripe/android/model/Token;
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/stripe/android/model/parsers/TokenJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/TokenJsonParser;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/parsers/TokenJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Token;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    return-object v0
.end method

.method public final getReturnUrl()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    return-object v0
.end method

.method public final getStatusDetails()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PaymentAccount;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/ManualEntry;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    iget-boolean v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    iget-object v9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    iget-object v10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "FinancialConnectionsSession(clientSecret="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v11, ", id="

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountsOld="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accountsNew="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", livemode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", returnUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bankAccountToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manualEntry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", statusDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsOld:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->accountsNew:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->livemode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->paymentAccount:Lcom/stripe/android/financialconnections/model/PaymentAccount;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->returnUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->bankAccountToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->manualEntry:Lcom/stripe/android/financialconnections/model/ManualEntry;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ManualEntry;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->statusDetails:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
