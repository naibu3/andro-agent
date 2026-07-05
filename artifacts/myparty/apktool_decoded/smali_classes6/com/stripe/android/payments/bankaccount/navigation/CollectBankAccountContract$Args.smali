.class public abstract Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;
.super Ljava/lang/Object;
.source "CollectBankAccountContract.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;,
        Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \"2\u00020\u0001:\u0005\u001e\u001f !\"BI\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0010R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0010\u0082\u0001\u0004#$%&\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
        "Landroid/os/Parcelable;",
        "publishableKey",
        "",
        "stripeAccountId",
        "clientSecret",
        "configuration",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "attachToIntent",
        "",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "hostedSurface",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V",
        "getPublishableKey",
        "()Ljava/lang/String;",
        "getStripeAccountId",
        "getClientSecret",
        "getConfiguration",
        "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "getAttachToIntent",
        "()Z",
        "getFinancialConnectionsAvailability",
        "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "getHostedSurface",
        "toBundle",
        "Landroid/os/Bundle;",
        "product",
        "getProduct",
        "ForPaymentIntent",
        "ForSetupIntent",
        "ForDeferredPaymentIntent",
        "ForDeferredSetupIntent",
        "Companion",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;


# instance fields
.field private final attachToIntent:Z

.field private final clientSecret:Ljava/lang/String;

.field private final configuration:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

.field private final financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

.field private final hostedSurface:Ljava/lang/String;

.field private final publishableKey:Ljava/lang/String;

.field private final stripeAccountId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->Companion:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->$stable:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->publishableKey:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->stripeAccountId:Ljava/lang/String;

    .line 47
    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->clientSecret:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->configuration:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    .line 49
    iput-boolean p5, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->attachToIntent:Z

    .line 50
    iput-object p6, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 51
    iput-object p7, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->hostedSurface:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getAttachToIntent()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->attachToIntent:Z

    return v0
.end method

.method public getClientSecret()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->configuration:Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    return-object v0
.end method

.method public getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public getHostedSurface()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final getProduct()Ljava/lang/String;
    .locals 2

    .line 56
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->getConfiguration()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;

    move-result-object v0

    .line 57
    instance-of v1, v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    if-eqz v1, :cond_0

    const-string v0, "instant_debits"

    return-object v0

    .line 58
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    if-nez v1, :cond_2

    .line 59
    instance-of v0, v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPublishableKey()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public getStripeAccountId()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    .line 53
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
