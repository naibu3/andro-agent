.class final Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
.super Ljava/lang/Object;
.source "CustomerSheetViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CustomerState"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1343:1\n1755#2,3:1344\n*S KotlinDebug\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState\n*L\n1304#1:1344,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B9\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010*\u001a\u00020\nH\u00c6\u0003J\t\u0010+\u001a\u00020\u000cH\u00c6\u0003JE\u0010,\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u00c6\u0001J\u0013\u0010-\u001a\u00020\u001a2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010#\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001cR\u0011\u0010%\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001c\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;",
        "",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "currentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "metadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "permissions",
        "Lcom/stripe/android/customersheet/CustomerPermissions;",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "<init>",
        "(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V",
        "getPaymentMethods",
        "()Ljava/util/List;",
        "getCurrentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getMetadata",
        "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "getPermissions",
        "()Lcom/stripe/android/customersheet/CustomerPermissions;",
        "getConfiguration",
        "()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "canRemove",
        "",
        "getCanRemove",
        "()Z",
        "canUpdateFullPaymentMethodDetails",
        "getCanUpdateFullPaymentMethodDetails",
        "cbcEligibility",
        "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "getCbcEligibility",
        "()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;",
        "canEdit",
        "getCanEdit",
        "canShowSavedPaymentMethods",
        "getCanShowSavedPaymentMethods",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final canEdit:Z

.field private final canRemove:Z

.field private final canShowSavedPaymentMethods:Z

.field private final canUpdateFullPaymentMethodDetails:Z

.field private final cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

.field private final configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field private final currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field private final metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

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


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lcom/stripe/android/customersheet/CustomerPermissions;",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            ")V"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1288
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    .line 1289
    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 1290
    iput-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 1291
    iput-object p4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    .line 1292
    iput-object p5, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    .line 1294
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 p5, 0x0

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    if-eq p2, v0, :cond_0

    .line 1297
    invoke-virtual {p4}, Lcom/stripe/android/customersheet/CustomerPermissions;->getCanRemovePaymentMethods()Z

    move-result p2

    goto :goto_0

    .line 1296
    :cond_0
    invoke-virtual {p4}, Lcom/stripe/android/customersheet/CustomerPermissions;->getCanRemoveLastPaymentMethod()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p4}, Lcom/stripe/android/customersheet/CustomerPermissions;->getCanRemovePaymentMethods()Z

    move-result p2

    if-eqz p2, :cond_1

    move p2, v0

    goto :goto_0

    :cond_1
    move p2, p5

    .line 1294
    :goto_0
    iput-boolean p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canRemove:Z

    .line 1300
    invoke-virtual {p4}, Lcom/stripe/android/customersheet/CustomerPermissions;->getCanUpdateFullPaymentMethodDetails()Z

    move-result p4

    iput-boolean p4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canUpdateFullPaymentMethodDetails:Z

    if-eqz p3, :cond_2

    .line 1302
    invoke-virtual {p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object p3

    if-nez p3, :cond_3

    :cond_2
    sget-object p3, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;->INSTANCE:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Ineligible;

    check-cast p3, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    :cond_3
    iput-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    if-nez p2, :cond_7

    .line 1304
    check-cast p1, Ljava/lang/Iterable;

    .line 1344
    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    .line 1345
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/model/PaymentMethod;

    .line 1305
    iget-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    iget-boolean p4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canUpdateFullPaymentMethodDetails:Z

    invoke-static {p2, p3, p4}, Lcom/stripe/android/customersheet/CustomerSheetViewStateKt;->isModifiable(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Z)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_6
    :goto_1
    move p1, p5

    goto :goto_3

    :cond_7
    :goto_2
    move p1, v0

    .line 1304
    :goto_3
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canEdit:Z

    .line 1308
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->Companion:Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;->shouldShowGooglePay(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_8
    move p5, v0

    :cond_9
    iput-boolean p5, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canShowSavedPaymentMethods:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->copy(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/customersheet/CustomerPermissions;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            "Lcom/stripe/android/customersheet/CustomerPermissions;",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            ")",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;-><init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    iget-object p1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCanEdit()Z
    .locals 1

    .line 1304
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canEdit:Z

    return v0
.end method

.method public final getCanRemove()Z
    .locals 1

    .line 1294
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canRemove:Z

    return v0
.end method

.method public final getCanShowSavedPaymentMethods()Z
    .locals 1

    .line 1308
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canShowSavedPaymentMethods:Z

    return v0
.end method

.method public final getCanUpdateFullPaymentMethodDetails()Z
    .locals 1

    .line 1300
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->canUpdateFullPaymentMethodDetails:Z

    return v0
.end method

.method public final getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;
    .locals 1

    .line 1302
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->cbcEligibility:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    return-object v0
.end method

.method public final getConfiguration()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;
    .locals 1

    .line 1292
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    return-object v0
.end method

.method public final getCurrentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 1289
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final getMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 1

    .line 1290
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

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

    .line 1288
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getPermissions()Lcom/stripe/android/customersheet/CustomerPermissions;
    .locals 1

    .line 1291
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerPermissions;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->paymentMethods:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->currentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->metadata:Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    iget-object v3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->permissions:Lcom/stripe/android/customersheet/CustomerPermissions;

    iget-object v4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CustomerState(paymentMethods="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", currentSelection="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", configuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
