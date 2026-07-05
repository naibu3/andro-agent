.class final Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;
.super Ljava/lang/Object;
.source "CardBrandDisallowedReporter.kt"

# interfaces
.implements Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;",
        "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
        "<init>",
        "()V",
        "onDisallowedCardBrandEntered",
        "",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "payments-ui-core_release"
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
.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;->INSTANCE:Lcom/stripe/android/ui/core/elements/events/EmptyCardBrandDisallowedReporter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
