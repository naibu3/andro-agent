.class public final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;
.super Ljava/lang/Object;
.source "LinkAccountPickerPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "canonical",
        "loading",
        "oneAccount",
        "accountSelected",
        "partnerAccountList",
        "",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
        "display",
        "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 19
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->loading()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 21
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->accountSelected()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 22
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->oneAccount()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 18
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final accountSelected()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 16

    .line 69
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    .line 70
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 71
    new-instance v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    .line 72
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 73
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->partnerAccountList()Ljava/util/List;

    move-result-object v4

    .line 74
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->partnerAccountList()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 75
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 77
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getDefaultCta()Ljava/lang/String;

    move-result-object v8

    .line 78
    sget-object v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 79
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v10

    .line 81
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getMultipleAccountTypesSelectedDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v12

    .line 82
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAboveCta()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 71
    const-string v7, "secret"

    const/4 v11, 0x1

    invoke-direct/range {v2 .. v15}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V

    .line 70
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 69
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final canonical()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 16

    .line 25
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    .line 26
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 27
    new-instance v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->partnerAccountList()Ljava/util/List;

    move-result-object v4

    .line 30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 31
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 33
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getDefaultCta()Ljava/lang/String;

    move-result-object v8

    .line 34
    sget-object v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 35
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v10

    .line 37
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getMultipleAccountTypesSelectedDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v12

    .line 38
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAboveCta()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 27
    const-string v7, "secret"

    const/4 v11, 0x1

    invoke-direct/range {v2 .. v15}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V

    .line 26
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final loading()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 6

    .line 45
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    .line 46
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 45
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final oneAccount()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
    .locals 16

    .line 49
    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    .line 50
    new-instance v1, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 51
    new-instance v2, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    .line 52
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 53
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->partnerAccountList()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-interface {v4, v5, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    .line 54
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 55
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 57
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getDefaultCta()Ljava/lang/String;

    move-result-object v8

    .line 58
    sget-object v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 59
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v10

    .line 61
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getMultipleAccountTypesSelectedDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object v12

    .line 62
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->getAboveCta()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 51
    const-string v7, "secret"

    const/4 v11, 0x1

    invoke-direct/range {v2 .. v15}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V

    .line 50
    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lcom/stripe/android/financialconnections/presentation/Async;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 49
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final partnerAccountList()Ljava/util/List;
    .locals 67
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x6

    .line 90
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 93
    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 97
    sget-object v21, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ACTIVE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    .line 99
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v11

    .line 103
    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 104
    sget-object v17, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->BANK_AUTH_REPAIR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 105
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    .line 91
    new-instance v2, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const/16 v3, 0x3e8

    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    const/16 v44, 0x1

    .line 101
    invoke-static/range {v44 .. v44}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v58

    const v22, 0x38c00

    const/16 v23, 0x0

    .line 91
    const-string v3, "Authorization"

    const-string v5, "id0"

    const-string v6, "Repairable Account"

    const-string v10, "USD"

    const-string v12, "1234"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v16, ""

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v9, v29

    move-object/from16 v15, v58

    invoke-direct/range {v2 .. v23}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 111
    new-instance v8, Lcom/stripe/android/financialconnections/model/Image;

    .line 112
    const-string v3, "https://b.stripecdn.com/connections-statics-srv/assets/SailIcon--warning-orange-3x.png"

    .line 111
    invoke-direct {v8, v3}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 107
    new-instance v3, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    const/16 v13, 0x1e0

    const-string v4, "id0"

    const/4 v5, 0x1

    const-string v6, "Select to repair and connect"

    const-string v7, "Repair and connect account"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    const/4 v2, 0x0

    .line 148
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    .line 90
    aput-object v1, v0, v2

    .line 118
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 121
    sget-object v24, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 125
    sget-object v41, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;->ACTIVE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    .line 127
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v31

    .line 131
    sget-object v27, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 132
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v28

    .line 119
    new-instance v22, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v42, 0x3cc00

    const/16 v43, 0x0

    const-string v23, "Authorization"

    const-string v25, "id1"

    const-string v26, "With balance"

    const-string v30, "USD"

    const-string v32, "1234"

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-string v36, ""

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move-object/from16 v35, v58

    invoke-direct/range {v22 .. v43}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v22

    .line 134
    new-instance v3, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    const/16 v13, 0x1f8

    const-string v4, "id1"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 118
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    aput-object v1, v0, v44

    .line 140
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 143
    sget-object v24, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 147
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v31

    .line 150
    sget-object v27, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 151
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v28

    .line 141
    new-instance v22, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v42, 0x7ce80

    const-string v23, "Authorization"

    const-string v25, "id2"

    const-string v26, "With balance disabled"

    const/16 v30, 0x0

    const/16 v32, 0x0

    const-string v36, "Disconnected"

    const/16 v41, 0x0

    move-object/from16 v35, v16

    invoke-direct/range {v22 .. v43}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v22

    .line 153
    new-instance v3, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    const/16 v13, 0x1fc

    const-string v4, "id2"

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 140
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 159
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 162
    sget-object v47, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 166
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v54

    .line 167
    sget-object v50, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 170
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v51

    .line 160
    new-instance v45, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v65, 0x7ccc0

    const/16 v66, 0x0

    const-string v46, "Authorization"

    const-string v48, "id3"

    const-string v49, "No balance"

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-string v55, "1234"

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-string v59, ""

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-direct/range {v45 .. v66}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v45

    .line 172
    new-instance v3, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    const-string v4, "id3"

    const/4 v5, 0x1

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 159
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 177
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 180
    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 184
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v12

    .line 185
    sget-object v8, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 188
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    .line 178
    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v23, 0x7ccc0

    const/16 v24, 0x0

    const-string v4, "Authorization"

    const-string v6, "id4"

    const-string v7, "No balance disabled"

    const-string v13, "1234"

    const/4 v15, 0x0

    const-string v17, "Disconnected"

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v3 .. v24}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 190
    new-instance v4, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    const/16 v14, 0x1fc

    const-string v5, "id4"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 177
    invoke-direct {v1, v3, v4}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 195
    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 198
    sget-object v47, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    .line 202
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v54

    .line 205
    sget-object v50, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    .line 206
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v51

    .line 196
    new-instance v45, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    const v65, 0x6ecc0

    const-string v46, "Authorization"

    const-string v48, "id5"

    const-string v49, "Very long institution that is already linked"

    const-string v55, "1234"

    const/16 v59, 0x0

    const-string v62, "linkedAccountId"

    invoke-direct/range {v45 .. v66}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v45

    .line 208
    new-instance v3, Lcom/stripe/android/financialconnections/model/NetworkedAccount;

    const/16 v13, 0x1fc

    const/4 v14, 0x0

    const-string v4, "id5"

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/financialconnections/model/NetworkedAccount;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/DataAccessNotice;LFinancialConnectionsGenericInfoScreen;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 195
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 89
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final display()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;
    .locals 9

    .line 218
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 220
    new-instance v3, Lcom/stripe/android/financialconnections/model/AddNewAccount;

    .line 222
    new-instance v0, Lcom/stripe/android/financialconnections/model/Image;

    .line 223
    const-string v1, "https://b.stripecdn.com/connections-statics-srv/assets/SailIcon--add-purple-3x.png"

    .line 222
    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 220
    const-string v1, "New bank account"

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/financialconnections/model/AddNewAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;)V

    .line 215
    new-instance v0, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const-string v1, "Select account"

    const-string v2, "Connect account"

    const-string v5, "Above CTA coming from backend."

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method

.method public final institution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 11

    .line 233
    new-instance v5, Lcom/stripe/android/financialconnections/model/Image;

    .line 234
    const-string v0, "https://b.stripecdn.com/connections-statics-srv/assets/InstitutionIcons/bankofamerica.png"

    .line 233
    invoke-direct {v5, v0}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    .line 228
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/16 v9, 0xe0

    const/4 v10, 0x0

    const/4 v1, 0x1

    const-string v2, "in_123"

    const/4 v3, 0x1

    const-string v4, "Bank of America"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
