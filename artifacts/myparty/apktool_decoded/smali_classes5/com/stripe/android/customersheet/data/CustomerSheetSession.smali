.class public final Lcom/stripe/android/customersheet/data/CustomerSheetSession;
.super Ljava/lang/Object;
.source "CustomerSheetSession.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003JO\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006*"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "savedSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "paymentMethodSaveConsentBehavior",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
        "permissions",
        "Lcom/stripe/android/customersheet/CustomerPermissions;",
        "defaultPaymentMethodId",
        "",
        "<init>",
        "(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)V",
        "getElementsSession",
        "()Lcom/stripe/android/model/ElementsSession;",
        "getPaymentMethods",
        "()Ljava/util/List;",
        "getSavedSelection",
        "()Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "getPaymentMethodSaveConsentBehavior",
        "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
        "getPermissions",
        "()Lcom/stripe/android/customersheet/CustomerPermissions;",
        "getDefaultPaymentMethodId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final defaultPaymentMethodId:Ljava/lang/String;

.field private final elementsSession:Lcom/stripe/android/model/ElementsSession;

.field private final paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

.field private final paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

.field private final savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
            "Lcom/stripe/android/customersheet/CustomerPermissions;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "elementsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodSaveConsentBehavior"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    .line 11
    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    .line 12
    iput-object p3, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    .line 13
    iput-object p4, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    .line 14
    iput-object p5, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    .line 15
    iput-object p6, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/data/CustomerSheetSession;Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetSession;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->copy(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/ElementsSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/model/SavedSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/customersheet/CustomerPermissions;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetSession;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
            "Lcom/stripe/android/customersheet/CustomerPermissions;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;"
        }
    .end annotation

    const-string v0, "elementsSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodSaveConsentBehavior"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;-><init>(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    iget-object v3, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iget-object v3, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    iget-object v3, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    iget-object v3, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDefaultPaymentMethodId()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final getElementsSession()Lcom/stripe/android/model/ElementsSession;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    return-object v0
.end method

.method public final getPaymentMethodSaveConsentBehavior()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    return-object v0
.end method

.method public final getPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getPermissions()Lcom/stripe/android/customersheet/CustomerPermissions;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    return-object v0
.end method

.method public final getSavedSelection()Lcom/stripe/android/paymentsheet/model/SavedSelection;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/SavedSelection;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerPermissions;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->elementsSession:Lcom/stripe/android/model/ElementsSession;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethods:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->savedSelection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    iget-object v3, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->paymentMethodSaveConsentBehavior:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    iget-object v5, p0, Lcom/stripe/android/customersheet/data/CustomerSheetSession;->defaultPaymentMethodId:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "CustomerSheetSession(elementsSession="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", paymentMethods="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", savedSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentMethodSaveConsentBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultPaymentMethodId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
