.class public final Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;
.super Ljava/lang/Object;
.source "CreateFinancialConnectionsSessionForDeferredPaymentParams.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010$\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0001<B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010)J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u009c\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0011H\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0016R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\u0008$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0016\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;",
        "",
        "uniqueId",
        "",
        "initialInstitution",
        "manualEntryOnly",
        "",
        "searchSession",
        "verificationMethod",
        "Lcom/stripe/android/model/VerificationMethodParam;",
        "hostedSurface",
        "customer",
        "onBehalfOf",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "product",
        "amount",
        "",
        "currency",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V",
        "getUniqueId",
        "()Ljava/lang/String;",
        "getInitialInstitution",
        "getManualEntryOnly",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getSearchSession",
        "getVerificationMethod",
        "()Lcom/stripe/android/model/VerificationMethodParam;",
        "getHostedSurface",
        "getCustomer",
        "getOnBehalfOf",
        "getLinkMode",
        "()Lcom/stripe/android/model/LinkMode;",
        "getProduct",
        "getAmount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getCurrency",
        "toMap",
        "",
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
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field public static final $stable:I = 0x0

.field private static final Companion:Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;

.field public static final PARAM_AMOUNT:Ljava/lang/String; = "amount"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_CURRENCY:Ljava/lang/String; = "currency"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_CUSTOMER:Ljava/lang/String; = "customer"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_HOSTED_SURFACE:Ljava/lang/String; = "hosted_surface"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_INITIAL_INSTITUTION:Ljava/lang/String; = "initial_institution"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_LINK_MODE:Ljava/lang/String; = "link_mode"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_MANUAL_ENTRY_ONLY:Ljava/lang/String; = "manual_entry_only"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_ON_BEHALF_OF:Ljava/lang/String; = "on_behalf_of"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_PRODUCT:Ljava/lang/String; = "product"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_SEARCH_SESSION:Ljava/lang/String; = "search_session"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_UNIQUE_ID:Ljava/lang/String; = "unique_id"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_VERIFICATION_METHOD:Ljava/lang/String; = "verification_method"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final amount:Ljava/lang/Integer;

.field private final currency:Ljava/lang/String;

.field private final customer:Ljava/lang/String;

.field private final hostedSurface:Ljava/lang/String;

.field private final initialInstitution:Ljava/lang/String;

.field private final linkMode:Lcom/stripe/android/model/LinkMode;

.field private final manualEntryOnly:Ljava/lang/Boolean;

.field private final onBehalfOf:Ljava/lang/String;

.field private final product:Ljava/lang/String;

.field private final searchSession:Ljava/lang/String;

.field private final uniqueId:Ljava/lang/String;

.field private final verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->Companion:Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "uniqueId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    .line 10
    iput-object p4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    .line 12
    iput-object p6, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    .line 13
    iput-object p7, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    .line 14
    iput-object p8, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    .line 15
    iput-object p9, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    .line 16
    iput-object p10, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    .line 18
    iput-object p11, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    .line 19
    iput-object p12, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/model/VerificationMethodParam;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/model/LinkMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;
    .locals 14

    const-string v0, "uniqueId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAmount()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomer()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    return-object v0
.end method

.method public final getHostedSurface()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialInstitution()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkMode()Lcom/stripe/android/model/LinkMode;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final getManualEntryOnly()Ljava/lang/Boolean;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getOnBehalfOf()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    return-object v0
.end method

.method public final getProduct()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    return-object v0
.end method

.method public final getSearchSession()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    return-object v0
.end method

.method public final getUniqueId()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    return-object v0
.end method

.method public final getVerificationMethod()Lcom/stripe/android/model/VerificationMethodParam;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/model/VerificationMethodParam;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/model/LinkMode;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    return v0
.end method

.method public final toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0xc

    .line 23
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "unique_id"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 24
    const-string v1, "initial_institution"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 25
    const-string v1, "manual_entry_only"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 26
    const-string v1, "search_session"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 27
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/model/VerificationMethodParam;->getValue()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "verification_method"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 28
    const-string v1, "customer"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 29
    const-string v1, "on_behalf_of"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 30
    const-string v1, "hosted_surface"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 31
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/model/LinkMode;->getValue()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    const-string v1, "LINK_DISABLED"

    :cond_2
    const-string v2, "link_mode"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 32
    const-string v1, "amount"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 33
    const-string v1, "currency"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 34
    const-string v1, "product"

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 22
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->uniqueId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->initialInstitution:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->manualEntryOnly:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->searchSession:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->verificationMethod:Lcom/stripe/android/model/VerificationMethodParam;

    iget-object v5, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->hostedSurface:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->customer:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->onBehalfOf:Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object v9, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->product:Ljava/lang/String;

    iget-object v10, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->amount:Ljava/lang/Integer;

    iget-object v11, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;->currency:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", initialInstitution="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", manualEntryOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", searchSession="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", verificationMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hostedSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", onBehalfOf="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
