.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0008\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\tH\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;",
        "",
        "<init>",
        "()V",
        "rowStyle",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;",
        "paymentMethodIconMargins",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;",
        "titleFont",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;",
        "subtitleFont",
        "margins",
        "font",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;",
        "paymentsheet_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

.field private rowStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

.field private subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

.field private titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1975
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1977
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;->getDefault()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;->getStyle$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->rowStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;
    .locals 5

    .line 2002
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;

    .line 2003
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->rowStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    .line 2004
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    .line 2005
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    .line 2006
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    .line 2002
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V

    return-object v0
.end method

.method public final paymentMethodIconMargins(Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;
    .locals 1

    .line 1987
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;

    .line 1988
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->paymentMethodIconMargins:Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;

    return-object p0
.end method

.method public final rowStyle(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;
    .locals 1

    const-string v0, "rowStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1982
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;

    .line 1983
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->rowStyle:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;

    return-object p0
.end method

.method public final subtitleFont(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;
    .locals 1

    .line 1997
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;

    .line 1998
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->subtitleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-object p0
.end method

.method public final titleFont(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;
    .locals 1

    .line 1992
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;

    .line 1993
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;->titleFont:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-object p0
.end method
