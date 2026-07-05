.class public final Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;
.super Ljava/lang/Object;
.source "HandleClickableUrl.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ClickableLinkParameters"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;",
        "",
        "<init>",
        "()V",
        "EVENT_NAME",
        "",
        "NEXT_PANE_OR_DRAWER_ON_SECONDARY_CTA",
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

.field public static final EVENT_NAME:Ljava/lang/String; = "eventName"

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;

.field public static final NEXT_PANE_OR_DRAWER_ON_SECONDARY_CTA:Ljava/lang/String; = "nextPaneOrDrawerOnSecondaryCta"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;->INSTANCE:Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
