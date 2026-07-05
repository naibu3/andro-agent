.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;
.super Ljava/lang/Object;
.source "AccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAccountPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,458:1\n774#2:459\n865#2,2:460\n*S KotlinDebug\n*F\n+ 1 AccountPickerViewModel.kt\ncom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload\n*L\n437#1:459\n437#1:460,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010)\u001a\u00020\u000cH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003Jo\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u00020\u00032\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0008H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0014R\u0017\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u0016R\u0011\u0010#\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u0014\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;",
        "",
        "skipAccountSelection",
        "",
        "accounts",
        "",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "dataAccessDisclaimer",
        "",
        "dataAccessNotice",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "selectionMode",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
        "singleAccount",
        "stripeDirect",
        "businessName",
        "userSelectedSingleAccountInInstitution",
        "<init>",
        "(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V",
        "getSkipAccountSelection",
        "()Z",
        "getAccounts",
        "()Ljava/util/List;",
        "getDataAccessDisclaimer",
        "()Ljava/lang/String;",
        "getDataAccessNotice",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getSelectionMode",
        "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
        "getSingleAccount",
        "getStripeDirect",
        "getBusinessName",
        "getUserSelectedSingleAccountInInstitution",
        "selectableAccounts",
        "getSelectableAccounts",
        "shouldSkipPane",
        "getShouldSkipPane",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
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
.field private final accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final businessName:Ljava/lang/String;

.field private final dataAccessDisclaimer:Ljava/lang/String;

.field private final dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

.field private final singleAccount:Z

.field private final skipAccountSelection:Z

.field private final stripeDirect:Z

.field private final userSelectedSingleAccountInInstitution:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
            "ZZ",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "accounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionMode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 425
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    .line 426
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    .line 427
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    .line 428
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 429
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    .line 430
    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    .line 431
    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    .line 432
    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    .line 433
    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    :cond_8
    move-object p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->copy(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    return v0
.end method

.method public final copy(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;",
            "ZZ",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;"
        }
    .end annotation

    const-string v0, "accounts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionMode"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;ZZLjava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAccounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation

    .line 426
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public final getBusinessName()Ljava/lang/String;
    .locals 1

    .line 432
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataAccessDisclaimer()Ljava/lang/String;
    .locals 1

    .line 427
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    .line 428
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getSelectableAccounts()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation

    .line 437
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 459
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 460
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

    check-cast v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    .line 437
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/PartnerAccount;->getAllowSelection$financial_connections_release()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 460
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 461
    :cond_1
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public final getSelectionMode()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;
    .locals 1

    .line 429
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    return-object v0
.end method

.method public final getShouldSkipPane()Z
    .locals 1

    .line 440
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getSingleAccount()Z
    .locals 1

    .line 430
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    return v0
.end method

.method public final getSkipAccountSelection()Z
    .locals 1

    .line 425
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    return v0
.end method

.method public final getStripeDirect()Z
    .locals 1

    .line 431
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    return v0
.end method

.method public final getUserSelectedSingleAccountInInstitution()Z
    .locals 1

    .line 433
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->skipAccountSelection:Z

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->accounts:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessDisclaimer:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->selectionMode:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    iget-boolean v5, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->singleAccount:Z

    iget-boolean v6, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->stripeDirect:Z

    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->businessName:Ljava/lang/String;

    iget-boolean v8, p0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;->userSelectedSingleAccountInInstitution:Z

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Payload(skipAccountSelection="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ", accounts="

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataAccessDisclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataAccessNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectionMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", singleAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stripeDirect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", businessName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userSelectedSingleAccountInInstitution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
