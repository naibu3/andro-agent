.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
.super Lcom/stripe/android/financialconnections/model/PaymentAccount;
.source "FinancialConnectionsAccount.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008@\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u0000 y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007tuvwxyzB\u00ad\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0010\u0008\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u001f\u0010 B\u00c3\u0001\u0008\u0010\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0012\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008\u001f\u0010%J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0007H\u00c6\u0003J\t\u0010T\u001a\u00020\tH\u00c6\u0003J\t\u0010U\u001a\u00020\tH\u00c6\u0003J\t\u0010V\u001a\u00020\u000cH\u00c6\u0003J\t\u0010W\u001a\u00020\u000eH\u00c6\u0003J\t\u0010X\u001a\u00020\u0010H\u00c6\u0003J\u000f\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0012H\u00c6\u0003J\u00b9\u0001\u0010a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0010\u0008\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0012H\u00c6\u0001J\u0006\u0010b\u001a\u00020\u0007J\u0013\u0010c\u001a\u00020\u000c2\u0008\u0010d\u001a\u0004\u0018\u00010eH\u00d6\u0003J\t\u0010f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010g\u001a\u00020\tH\u00d6\u0001J\u0016\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u0007J%\u0010m\u001a\u00020i2\u0006\u0010n\u001a\u00020\u00002\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020rH\u0001\u00a2\u0006\u0002\u0008sR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008*\u0010\'\u001a\u0004\u0008+\u0010,R\u001c\u0010\u0008\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008-\u0010\'\u001a\u0004\u0008.\u0010/R\u001c\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00080\u0010\'\u001a\u0004\u00081\u0010/R\u001c\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00082\u0010\'\u001a\u0004\u00083\u00104R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00085\u0010\'\u001a\u0004\u00086\u00107R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00088\u0010\'\u001a\u0004\u00089\u0010:R\"\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008;\u0010\'\u001a\u0004\u0008<\u0010=R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008>\u0010\'\u001a\u0004\u0008?\u0010@R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008A\u0010\'\u001a\u0004\u0008B\u0010CR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008D\u0010\'\u001a\u0004\u0008E\u0010/R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008F\u0010\'\u001a\u0004\u0008G\u0010/R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008H\u0010\'\u001a\u0004\u0008I\u0010/R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008J\u0010\'\u001a\u0004\u0008K\u0010LR$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008M\u0010\'\u001a\u0004\u0008N\u0010=R&\u0010\"\u001a\u00020\t2\u0006\u0010O\u001a\u00020\t8\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008P\u0010\'\u001a\u0004\u0008Q\u0010/\u00a8\u0006{"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Landroid/os/Parcelable;",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "category",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "created",
        "",
        "id",
        "",
        "institutionName",
        "livemode",
        "",
        "status",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "subcategory",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "supportedPaymentMethodTypes",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "balance",
        "Lcom/stripe/android/financialconnections/model/Balance;",
        "balanceRefresh",
        "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
        "displayName",
        "last4",
        "ownership",
        "ownershipRefresh",
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
        "permissions",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V",
        "seen0",
        "object",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getCategory$annotations",
        "()V",
        "getCategory",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
        "getCreated$annotations",
        "getCreated",
        "()I",
        "getId$annotations",
        "getId",
        "()Ljava/lang/String;",
        "getInstitutionName$annotations",
        "getInstitutionName",
        "getLivemode$annotations",
        "getLivemode",
        "()Z",
        "getStatus$annotations",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
        "getSubcategory$annotations",
        "getSubcategory",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "getSupportedPaymentMethodTypes$annotations",
        "getSupportedPaymentMethodTypes",
        "()Ljava/util/List;",
        "getBalance$annotations",
        "getBalance",
        "()Lcom/stripe/android/financialconnections/model/Balance;",
        "getBalanceRefresh$annotations",
        "getBalanceRefresh",
        "()Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
        "getDisplayName$annotations",
        "getDisplayName",
        "getLast4$annotations",
        "getLast4",
        "getOwnership$annotations",
        "getOwnership",
        "getOwnershipRefresh$annotations",
        "getOwnershipRefresh",
        "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
        "getPermissions$annotations",
        "getPermissions",
        "value",
        "getObject$annotations",
        "getObject",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
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
        "Category",
        "Status",
        "Subcategory",
        "SupportedPaymentMethodTypes",
        "Permissions",
        "Companion",
        "$serializer",
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
.field private static final $childSerializers:[Lkotlinx/serialization/KSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

.field public static final OBJECT_NEW:Ljava/lang/String; = "financial_connections.account"

.field public static final OBJECT_OLD:Ljava/lang/String; = "linked_account"


# instance fields
.field private final balance:Lcom/stripe/android/financialconnections/model/Balance;

.field private final balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

.field private final category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

.field private final created:I

.field private final displayName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final institutionName:Ljava/lang/String;

.field private final last4:Ljava/lang/String;

.field private final livemode:Z

.field private object:Ljava/lang/String;

.field private final ownership:Ljava/lang/String;

.field private final ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

.field private final permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation
.end field

.field private final status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

.field private final subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

.field private final supportedPaymentMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x10

    .line 208
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v2, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    invoke-direct {v2, v3}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/4 v3, 0x7

    aput-object v2, v0, v3

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const/16 v2, 0xd

    aput-object v1, v0, v2

    new-instance v2, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    invoke-direct {v2, v3}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0xe

    aput-object v2, v0, v3

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x809e

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 39
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/model/PaymentAccount;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_1

    .line 43
    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 39
    :cond_1
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iput p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    .line 53
    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    .line 39
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    goto :goto_0

    :cond_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    .line 55
    sget-object p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 39
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    goto :goto_1

    :cond_3
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    :goto_1
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    goto :goto_2

    :cond_4
    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    :goto_2
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    goto :goto_3

    :cond_5
    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    :goto_3
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    goto :goto_4

    :cond_6
    iput-object p12, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    goto :goto_5

    :cond_7
    iput-object p13, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    goto :goto_6

    :cond_8
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    goto :goto_7

    :cond_9
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    :goto_7
    and-int/lit16 p1, p1, 0x4000

    if-nez p1, :cond_a

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    goto :goto_8

    :cond_a
    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    :goto_8
    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->object:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance;",
            "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;)V"
        }
    .end annotation

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "institutionName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subcategory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethodTypes"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, v0}, Lcom/stripe/android/financialconnections/model/PaymentAccount;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 44
    iput p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    .line 46
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    .line 50
    iput-boolean p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    .line 52
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    .line 54
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 56
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    .line 58
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    .line 60
    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    .line 62
    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    .line 64
    iput-object p12, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    .line 66
    iput-object p13, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    .line 68
    iput-object p14, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    move-object/from16 p1, p15

    .line 70
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    .line 79
    const-string p1, "financial_connections.account"

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->object:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 43
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    .line 53
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 55
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p11

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p12

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object v15, v2

    goto :goto_7

    :cond_7
    move-object/from16 v15, p13

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_8

    :cond_8
    move-object/from16 v16, p14

    :goto_8
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_9

    move-object/from16 v17, v2

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v10, p8

    move-object/from16 v2, p0

    goto :goto_9

    :cond_9
    move-object/from16 v17, p15

    move-object/from16 v2, p0

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v10, p8

    .line 41
    :goto_9
    invoke-direct/range {v2 .. v17}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 39
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    move-object/from16 p16, v1

    goto :goto_e

    :cond_e
    move-object/from16 p16, p15

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    invoke-virtual/range {p1 .. p16}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getBalance$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "balance"
    .end annotation

    return-void
.end method

.method public static synthetic getBalanceRefresh$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "balance_refresh"
    .end annotation

    return-void
.end method

.method public static synthetic getCategory$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "category"
    .end annotation

    return-void
.end method

.method public static synthetic getCreated$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "created"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayName$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "display_name"
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

.method public static synthetic getInstitutionName$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "institution_name"
    .end annotation

    return-void
.end method

.method public static synthetic getLast4$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "last4"
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

.method public static synthetic getObject$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/Required;
    .end annotation

    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "object"
    .end annotation

    return-void
.end method

.method public static synthetic getOwnership$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "ownership"
    .end annotation

    return-void
.end method

.method public static synthetic getOwnershipRefresh$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "ownership_refresh"
    .end annotation

    return-void
.end method

.method public static synthetic getPermissions$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "permissions"
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

.method public static synthetic getSubcategory$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "subcategory"
    .end annotation

    return-void
.end method

.method public static synthetic getSupportedPaymentMethodTypes$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "supported_payment_method_types"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 39
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 43
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    if-eq v2, v3, :cond_1

    .line 39
    :goto_0
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category$Serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    iget v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeIntElement(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    .line 53
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-eq v2, v3, :cond_3

    .line 39
    :goto_1
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status$Serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 55
    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    if-eq v2, v3, :cond_5

    .line 39
    :goto_2
    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory$Serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    if-eqz v2, :cond_13

    :goto_9
    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xf

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->object:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/model/BalanceRefresh;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    return v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/financialconnections/model/Balance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/Balance;",
            "Lcom/stripe/android/financialconnections/model/BalanceRefresh;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;)",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;"
        }
    .end annotation

    const-string v0, "category"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "institutionName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subcategory"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethodTypes"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move/from16 v3, p2

    move/from16 v6, p5

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    iget v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getBalance()Lcom/stripe/android/financialconnections/model/Balance;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    return-object v0
.end method

.method public final getBalanceRefresh()Lcom/stripe/android/financialconnections/model/BalanceRefresh;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    return-object v0
.end method

.method public final getCategory()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    return-object v0
.end method

.method public final getCreated()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    return v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstitutionName()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getLivemode()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    return v0
.end method

.method public final getObject()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->object:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnership()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnershipRefresh()Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    return-object v0
.end method

.method public final getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    return-object v0
.end method

.method public final getSubcategory()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object v0
.end method

.method public final getSupportedPaymentMethodTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Balance;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    iget v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    iget-boolean v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v16, v15

    const-string v15, "FinancialConnectionsAccount(category="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", institutionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", livemode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subcategory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", supportedPaymentMethodTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", balance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", balanceRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", last4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ownership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ownershipRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->category:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->created:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->institutionName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->livemode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->status:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->subcategory:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->supportedPaymentMethodTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balance:Lcom/stripe/android/financialconnections/model/Balance;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Balance;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->balanceRefresh:Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/BalanceRefresh;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->last4:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownership:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->ownershipRefresh:Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->permissions:Ljava/util/List;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    return-void
.end method
