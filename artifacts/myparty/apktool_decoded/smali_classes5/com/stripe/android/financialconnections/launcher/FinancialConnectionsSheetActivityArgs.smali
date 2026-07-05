.class public abstract Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetActivityArgs.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$Companion;,
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;,
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForInstantDebits;,
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSheetActivityArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetActivityArgs.kt\ncom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00132\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u001b\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u000c\u001a\u00020\rH\u0007J\u0008\u0010\u000e\u001a\u00020\u000fH\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0003\u0014\u0015\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "Landroid/os/Parcelable;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "getElementsSessionContext",
        "()Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "validate",
        "",
        "isValid",
        "",
        "ForData",
        "ForToken",
        "ForInstantDebits",
        "Companion",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForInstantDebits;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;",
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


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$Companion;

.field public static final EXTRA_ARGS:Ljava/lang/String; = "FinancialConnectionsSheetActivityArgs"


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

.field private final elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->Companion:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$Companion;

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;-><init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

    return-void
.end method


# virtual methods
.method public getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object v0
.end method

.method public getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-object v0
.end method

.method public final isValid()Z
    .locals 2

    .line 57
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->validate()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final validate()V
    .locals 2

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 49
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;->getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 50
    :cond_0
    new-instance v0, Ljava/security/InvalidParameterException;

    .line 51
    const-string v1, "The publishable key cannot be an empty string."

    .line 50
    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_1
    new-instance v0, Ljava/security/InvalidParameterException;

    .line 46
    const-string v1, "The session client secret cannot be an empty string."

    .line 45
    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
