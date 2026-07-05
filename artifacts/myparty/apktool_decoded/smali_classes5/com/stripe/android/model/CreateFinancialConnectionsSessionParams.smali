.class public interface abstract Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;
.super Ljava/lang/Object;
.source "CreateFinancialConnectionsSessionParams.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;,
        Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;,
        Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000 \u00072\u00020\u0001:\u0003\u0005\u0006\u0007J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H&\u0082\u0001\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
        "",
        "toMap",
        "",
        "",
        "InstantDebits",
        "USBankAccount",
        "Companion",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;",
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
.field public static final synthetic Companion:Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;

.field public static final PARAM_ATTACH_REQUIRED:Ljava/lang/String; = "attach_required"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_CLIENT_SECRET:Ljava/lang/String; = "client_secret"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_HOSTED_SURFACE:Ljava/lang/String; = "hosted_surface"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_LINK_MODE:Ljava/lang/String; = "link_mode"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_PAYMENT_METHOD_DATA:Ljava/lang/String; = "payment_method_data"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final PARAM_PRODUCT:Ljava/lang/String; = "product"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;->$$INSTANCE:Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;

    sput-object v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;->Companion:Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;

    return-void
.end method


# virtual methods
.method public abstract toMap()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
