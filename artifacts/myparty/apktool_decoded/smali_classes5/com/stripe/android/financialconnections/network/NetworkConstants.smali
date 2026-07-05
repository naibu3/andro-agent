.class public final Lcom/stripe/android/financialconnections/network/NetworkConstants;
.super Ljava/lang/Object;
.source "NetworkConstants.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/network/NetworkConstants;",
        "",
        "<init>",
        "()V",
        "PARAMS_CLIENT_SECRET",
        "",
        "PARAMS_CONSUMER_CLIENT_SECRET",
        "PARAMS_ID",
        "PARAMS_APPLICATION_ID",
        "PARAM_SELECTED_ACCOUNTS",
        "PARAM_LINKED_ACCOUNTS",
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


# static fields
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/network/NetworkConstants;

.field public static final PARAMS_APPLICATION_ID:Ljava/lang/String; = "application_id"

.field public static final PARAMS_CLIENT_SECRET:Ljava/lang/String; = "client_secret"

.field public static final PARAMS_CONSUMER_CLIENT_SECRET:Ljava/lang/String; = "consumer_session_client_secret"

.field public static final PARAMS_ID:Ljava/lang/String; = "id"

.field public static final PARAM_LINKED_ACCOUNTS:Ljava/lang/String; = "linked_accounts"

.field public static final PARAM_SELECTED_ACCOUNTS:Ljava/lang/String; = "selected_accounts"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/network/NetworkConstants;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/network/NetworkConstants;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/network/NetworkConstants;->INSTANCE:Lcom/stripe/android/financialconnections/network/NetworkConstants;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
