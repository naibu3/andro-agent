.class public final Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;
.super Ljava/lang/Object;
.source "TextUpdate.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$$serializer;,
        Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 @2\u00020\u0001:\u0002?@BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\r\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003JO\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\u0006\u0010,\u001a\u00020\u0010J\u0013\u0010-\u001a\u00020.2\u0008\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0010H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010J%\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001\u00a2\u0006\u0002\u0008>R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001cR\"\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001d\u0010\u0015\u001a\u0004\u0008\u001e\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u0015\u001a\u0004\u0008!\u0010\u0017R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\"\u0010\u0015\u001a\u0004\u0008#\u0010$\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;",
        "Landroid/os/Parcelable;",
        "title",
        "",
        "defaultCta",
        "addNewAccount",
        "Lcom/stripe/android/financialconnections/model/AddNewAccount;",
        "accounts",
        "",
        "Lcom/stripe/android/financialconnections/model/NetworkedAccount;",
        "aboveCta",
        "multipleAccountTypesSelectedDataAccessNotice",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getTitle$annotations",
        "()V",
        "getTitle",
        "()Ljava/lang/String;",
        "getDefaultCta$annotations",
        "getDefaultCta",
        "getAddNewAccount$annotations",
        "getAddNewAccount",
        "()Lcom/stripe/android/financialconnections/model/AddNewAccount;",
        "getAccounts$annotations",
        "getAccounts",
        "()Ljava/util/List;",
        "getAboveCta$annotations",
        "getAboveCta",
        "getMultipleAccountTypesSelectedDataAccessNotice$annotations",
        "getMultipleAccountTypesSelectedDataAccessNotice",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "describeContents",
        "equals",
        "",
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
        "write$Self$financial_connections_release",
        "$serializer",
        "Companion",
        "financial-connections_release"
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

.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion;


# instance fields
.field private final aboveCta:Ljava/lang/String;

.field private final accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/NetworkedAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

.field private final defaultCta:Ljava/lang/String;

.field private final multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->Companion:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->$stable:I

    const/4 v0, 0x6

    .line 296
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v2, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v3, Lcom/stripe/android/financialconnections/model/NetworkedAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/NetworkedAccount$$serializer;

    check-cast v3, Lkotlinx/serialization/KSerializer;

    invoke-direct {v2, v3}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p8, :cond_0

    .line 296
    sget-object p8, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$$serializer;

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-void

    :cond_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/AddNewAccount;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/NetworkedAccount;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewAccount"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accounts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 299
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    .line 300
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    .line 301
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    .line 302
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    .line 303
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    .line 306
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1

    move-object p7, v0

    goto :goto_0

    :cond_1
    move-object p7, p6

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 298
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 296
    sget-object v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAboveCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "above_cta"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getAccounts$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getAddNewAccount$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "add_new_account"
    .end annotation

    return-void
.end method

.method public static synthetic getDefaultCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "default_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getMultipleAccountTypesSelectedDataAccessNotice$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "multiple_account_types_selected_data_access_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 296
    sget-object v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/AddNewAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/AddNewAccount$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/AddNewAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/NetworkedAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/AddNewAccount;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/NetworkedAccount;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            ")",
            "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewAccount"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accounts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAboveCta()Ljava/lang/String;
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/NetworkedAccount;",
            ">;"
        }
    .end annotation

    .line 302
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;
    .locals 1

    .line 301
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    return-object v0
.end method

.method public final getDefaultCta()Ljava/lang/String;
    .locals 1

    .line 300
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getMultipleAccountTypesSelectedDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 299
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AddNewAccount;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ReturningNetworkingUserAccountPicker(title="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", defaultCta="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", addNewAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aboveCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", multipleAccountTypesSelectedDataAccessNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->defaultCta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/AddNewAccount;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->accounts:Ljava/util/List;

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

    check-cast v1, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->aboveCta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
