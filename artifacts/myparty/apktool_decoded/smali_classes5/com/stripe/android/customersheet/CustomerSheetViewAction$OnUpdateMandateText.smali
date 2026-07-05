.class public final Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;
.super Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.source "CustomerSheetViewAction.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OnUpdateMandateText"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
        "mandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "showAbovePrimaryButton",
        "",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Z)V",
        "getMandateText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getShowAbovePrimaryButton",
        "()Z",
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
.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;

.field private final showAbovePrimaryButton:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    .line 35
    iput-boolean p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;->showAbovePrimaryButton:Z

    return-void
.end method


# virtual methods
.method public final getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getShowAbovePrimaryButton()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnUpdateMandateText;->showAbovePrimaryButton:Z

    return v0
.end method
