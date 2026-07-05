.class public final Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;
.super Ljava/lang/Object;
.source "CardBrandChoiceEligibility.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "isEligible",
        "",
        "preferredNetworks",
        "",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;->$$INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(ZLjava/util/List;)Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/CardBrand;",
            ">;)",
            "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;"
        }
    .end annotation

    const-string v0, "preferredNetworks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 22
    new-instance p1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    invoke-direct {p1, p2}, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;-><init>(Ljava/util/List;)V

    check-cast p1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 25
    sget-object p1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    check-cast p1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    return-object p1

    .line 21
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
