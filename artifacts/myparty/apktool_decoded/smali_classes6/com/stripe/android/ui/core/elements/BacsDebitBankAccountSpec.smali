.class public final Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "BacsDebitBankAccountSpec.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$$serializer;,
        Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B9\u0008\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u000cJ\u001c\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005J%\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001\u00a2\u0006\u0002\u0008#R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\r\u0010\u0003R\u0014\u0010\u0008\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u000e\u0010\u0003R\u001a\u0010\t\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0003\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "<init>",
        "()V",
        "seen0",
        "",
        "sortCodeIdentifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "accountNumberIdentifier",
        "apiPath",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getSortCodeIdentifier$annotations",
        "getAccountNumberIdentifier$annotations",
        "getApiPath$annotations",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "transform",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "initialValues",
        "",
        "",
        "describeContents",
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
        "write$Self$payments_ui_core_release",
        "Companion",
        "$serializer",
        "payments-ui-core_release"
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
.field public static final $stable:I

.field public static final ACCOUNT_NUMBER_API_PATH:Ljava/lang/String; = "bacs_debit[account_number]"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Companion;

.field public static final SORT_CODE_API_PATH:Ljava/lang/String; = "bacs_debit[sort_code]"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->Companion:Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Companion;

    new-instance v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Creator;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    sget v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v1, "bacs_debit[sort_code]"

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 21
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v1, "bacs_debit[account_number]"

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 24
    new-instance v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    const/4 p5, 0x0

    .line 13
    invoke-direct {p0, p5}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_0

    .line 18
    sget-object p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string p5, "bacs_debit[sort_code]"

    invoke-virtual {p2, p5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p2

    .line 13
    :cond_0
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 21
    sget-object p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string p3, "bacs_debit[account_number]"

    invoke-virtual {p2, p3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p2

    .line 13
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 24
    new-instance p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method private static synthetic getAccountNumberIdentifier$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getSortCodeIdentifier$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$payments_ui_core_release(Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 13
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 18
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v3, "bacs_debit[sort_code]"

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 21
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v3, "bacs_debit[account_number]"

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    .line 24
    new-instance v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-direct {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec;-><init>()V

    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/SectionElement;"
        }
    .end annotation

    const-string v0, "initialValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 30
    new-array v0, v0, [Lcom/stripe/android/uicore/elements/SimpleTextElement;

    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 31
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 32
    new-instance v3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 33
    new-instance v4, Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeConfig;

    invoke-direct {v4}, Lcom/stripe/android/ui/core/elements/BacsDebitSortCodeConfig;-><init>()V

    check-cast v4, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 34
    iget-object v5, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->sortCodeIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 32
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 30
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 37
    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 38
    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 39
    new-instance v4, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 40
    new-instance v5, Lcom/stripe/android/ui/core/elements/BacsDebitAccountNumberConfig;

    invoke-direct {v5}, Lcom/stripe/android/ui/core/elements/BacsDebitAccountNumberConfig;-><init>()V

    check-cast v5, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 41
    iget-object v6, p0, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->accountNumberIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 39
    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 37
    invoke-direct {v1, v3, v4}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    .line 29
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 45
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_bacs_bank_account_title:I

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 28
    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;->createSectionElement$payments_ui_core_release(Ljava/util/List;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p1

    return-object p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
