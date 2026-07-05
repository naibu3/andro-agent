.class public final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;
.super Ljava/lang/Object;
.source "LinkAccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,538:1\n774#2:539\n865#2,2:540\n*S KotlinDebug\n*F\n+ 1 LinkAccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload\n*L\n476#1:539\n476#1:540,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fH\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010;\u001a\u00020\u0011H\u00c6\u0003J\u00ad\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u00112\u0008\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020@H\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001cR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001aR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010)R\u0011\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\'R\u0017\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\u001c\u00a8\u0006B"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;",
        "",
        "title",
        "",
        "accounts",
        "",
        "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
        "selectedAccountIds",
        "addNewAccount",
        "Lcom/stripe/android/financialconnections/model/AddNewAccount;",
        "consumerSessionClientSecret",
        "defaultCta",
        "nextPaneOnNewAccount",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "partnerToCoreAuths",
        "",
        "singleAccount",
        "",
        "multipleAccountTypesSelectedDataAccessNotice",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "aboveCta",
        "defaultDataAccessNotice",
        "acquireConsentOnPrimaryCtaClick",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V",
        "getTitle",
        "()Ljava/lang/String;",
        "getAccounts",
        "()Ljava/util/List;",
        "getSelectedAccountIds",
        "getAddNewAccount",
        "()Lcom/stripe/android/financialconnections/model/AddNewAccount;",
        "getConsumerSessionClientSecret",
        "getDefaultCta",
        "getNextPaneOnNewAccount",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getPartnerToCoreAuths",
        "()Ljava/util/Map;",
        "getSingleAccount",
        "()Z",
        "getMultipleAccountTypesSelectedDataAccessNotice",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getAboveCta",
        "getDefaultDataAccessNotice",
        "getAcquireConsentOnPrimaryCtaClick",
        "selectedAccounts",
        "getSelectedAccounts",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final aboveCta:Ljava/lang/String;

.field private final accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final acquireConsentOnPrimaryCtaClick:Z

.field private final addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

.field private final consumerSessionClientSecret:Ljava/lang/String;

.field private final defaultCta:Ljava/lang/String;

.field private final defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final partnerToCoreAuths:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedAccountIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final singleAccount:Z

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/AddNewAccount;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Z)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedAccountIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewAccount"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionClientSecret"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCta"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 460
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    .line 461
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    .line 462
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    .line 463
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    .line 464
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    .line 465
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    .line 466
    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 467
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    .line 468
    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    .line 469
    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 470
    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    .line 471
    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 472
    iput-boolean p13, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-boolean v8, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    goto :goto_7

    :cond_8
    move/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    move/from16 p15, v0

    goto :goto_b

    :cond_c
    move/from16 p15, p13

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    invoke-virtual/range {p2 .. p15}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/AddNewAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/AddNewAccount;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Z)",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accounts"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedAccountIds"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewAccount"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionClientSecret"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCta"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/financialconnections/model/AddNewAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ZLcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAboveCta()Ljava/lang/String;
    .locals 1

    .line 470
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;"
        }
    .end annotation

    .line 461
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final getAcquireConsentOnPrimaryCtaClick()Z
    .locals 1

    .line 472
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    return v0
.end method

.method public final getAddNewAccount()Lcom/stripe/android/financialconnections/model/AddNewAccount;
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    return-object v0
.end method

.method public final getConsumerSessionClientSecret()Ljava/lang/String;
    .locals 1

    .line 464
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultCta()Ljava/lang/String;
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    .line 471
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getMultipleAccountTypesSelectedDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    .line 469
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getNextPaneOnNewAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getPartnerToCoreAuths()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 467
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    return-object v0
.end method

.method public final getSelectedAccountIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedAccounts()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;",
            ">;"
        }
    .end annotation

    .line 476
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 539
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 540
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;

    .line 476
    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkedAccount;->getAccount()Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 540
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 541
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public final getSingleAccount()Z
    .locals 1

    .line 468
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 460
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/AddNewAccount;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->accounts:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->selectedAccountIds:Ljava/util/List;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->addNewAccount:Lcom/stripe/android/financialconnections/model/AddNewAccount;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->consumerSessionClientSecret:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultCta:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->nextPaneOnNewAccount:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->partnerToCoreAuths:Ljava/util/Map;

    iget-boolean v8, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->singleAccount:Z

    iget-object v9, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->multipleAccountTypesSelectedDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v10, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->aboveCta:Ljava/lang/String;

    iget-object v11, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->defaultDataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-boolean v12, p0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState$Payload;->acquireConsentOnPrimaryCtaClick:Z

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "Payload(title="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v13, ", accounts="

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectedAccountIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", addNewAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consumerSessionClientSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextPaneOnNewAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", partnerToCoreAuths="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", singleAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", multipleAccountTypesSelectedDataAccessNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aboveCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultDataAccessNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", acquireConsentOnPrimaryCtaClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
