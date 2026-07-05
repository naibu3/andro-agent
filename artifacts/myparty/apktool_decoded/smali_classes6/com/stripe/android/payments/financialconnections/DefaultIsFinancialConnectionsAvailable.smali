.class public final Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;
.super Ljava/lang/Object;
.source "IsFinancialConnectionsSdkAvailable.kt"

# interfaces
.implements Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
        "<init>",
        "()V",
        "invoke",
        "",
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

.field public static final INSTANCE:Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    invoke-direct {v0}, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;->INSTANCE:Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Z
    .locals 1

    .line 14
    :try_start_0
    const-string v0, "com.stripe.android.financialconnections.FinancialConnectionsSheet"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method
