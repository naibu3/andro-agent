.class public abstract Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;
.super Ljava/lang/Object;
.source "Button.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;,
        Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u000cH\'\u00a2\u0006\u0002\u0010\r\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;",
        "",
        "<init>",
        "()V",
        "buttonColors",
        "Landroidx/compose/material/ButtonColors;",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonColors;",
        "rippleColor",
        "Landroidx/compose/ui/graphics/Color;",
        "rippleColor-0d7_KjU",
        "()J",
        "elevation",
        "Landroidx/compose/material/ButtonElevation;",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonElevation;",
        "Primary",
        "Secondary",
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;",
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;",
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
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract buttonColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonColors;
.end method

.method public abstract elevation(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonElevation;
.end method

.method public abstract rippleColor-0d7_KjU()J
.end method
