.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;
.super Ljava/lang/Object;
.source "InstitutionPickerPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$Companion;,
        Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000  2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u0008\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0002H\u0002J\u0008\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u0002H\u0002J\u0008\u0010\u0011\u001a\u00020\u0002H\u0002J\u0008\u0010\u0012\u001a\u00020\u0002H\u0002J\u0008\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "initialLoading",
        "featured",
        "searchInProgress",
        "searchSuccess",
        "searchSuccessNoManualEntry",
        "searchNoResults",
        "searchNoResultsNoManualEntry",
        "searchFailed",
        "searchFailedNoManualEntry",
        "selectedInstitution",
        "partiallyScrolled",
        "payload",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
        "manualEntry",
        "",
        "institutionResponse",
        "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "institutions",
        "",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "i",
        "InstitutionPreviewState",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$Companion;

.field public static final FEW_INSTITUTIONS:I = 0x3

.field public static final MANY_INSTITUTIONS:I = 0xa


# instance fields
.field private final values:Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xb

    .line 15
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->initialLoading()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 16
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->featured()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 17
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchInProgress()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 18
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchSuccess()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 19
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchSuccessNoManualEntry()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    .line 20
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchNoResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    .line 21
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchNoResultsNoManualEntry()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    .line 22
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchFailed()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    .line 23
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->searchFailedNoManualEntry()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    .line 24
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->selectedInstitution()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    .line 25
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->partiallyScrolled()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 14
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final featured()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 37
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 38
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 40
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v10, 0x0

    invoke-static {p0, v10, v3, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 41
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 38
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final initialLoading()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 10

    .line 28
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 29
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 31
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 32
    sget-object v2, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 29
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 9

    .line 171
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Institution "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 170
    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v7, 0x0

    .line 173
    const-string v8, "otherUrl.com"

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 170
    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v0
.end method

.method private final institutionResponse(I)Lcom/stripe/android/financialconnections/model/InstitutionResponse;
    .locals 18

    move-object/from16 v0, p0

    .line 148
    new-instance v1, Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    const/4 v2, 0x1

    .line 149
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v4, 0xa

    .line 151
    new-array v5, v4, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v6

    const/16 v15, 0x77

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "Very very long institution content does not fit - 1"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v14, "https://www.institutionUrl.com/1"

    invoke-static/range {v6 .. v16}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v6

    aput-object v6, v5, v7

    const/4 v6, 0x2

    .line 155
    invoke-direct {v0, v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v2

    const/4 v2, 0x3

    .line 156
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    const/16 v16, 0x7f

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const-string v15, "Unparseable URL"

    invoke-static/range {v7 .. v17}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x4

    .line 159
    invoke-direct {v0, v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v2

    const/4 v2, 0x5

    .line 160
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x6

    .line 161
    invoke-direct {v0, v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v2

    const/4 v2, 0x7

    .line 162
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v6

    const/16 v6, 0x8

    .line 163
    invoke-direct {v0, v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v2

    const/16 v2, 0x9

    .line 164
    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    aput-object v7, v5, v6

    .line 165
    invoke-direct {v0, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institution(I)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v4

    aput-object v4, v5, v2

    .line 150
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    move/from16 v4, p1

    .line 166
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    .line 148
    invoke-direct {v1, v3, v2}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;-><init>(Ljava/lang/Boolean;Ljava/util/List;)V

    return-object v1
.end method

.method private final partiallyScrolled()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 10

    .line 131
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 132
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 134
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {p0, v5, v3, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 135
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/16 v3, 0xa

    invoke-direct {p0, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institutionResponse(I)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    .line 132
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v2, 0x3e8

    .line 131
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final payload(Z)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;
    .locals 4

    .line 141
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    const/4 v1, 0x3

    .line 142
    invoke-direct {p0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institutionResponse(I)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3, v2}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->copy$default(Lcom/stripe/android/financialconnections/model/InstitutionResponse;Ljava/lang/Boolean;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object p1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 141
    invoke-direct {v0, p1, v1, v2, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)V

    return-object v0
.end method

.method static synthetic payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 141
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload(Z)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object p0

    return-object p0
.end method

.method private final searchFailed()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 10

    .line 101
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 102
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 104
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v3, 0x1

    invoke-direct {p0, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload(Z)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 105
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    new-instance v3, Ljava/lang/Exception;

    const-string v5, "Something went wrong"

    invoke-direct {v3, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Throwable;

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    .line 102
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    .line 101
    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final searchFailedNoManualEntry()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 110
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 111
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 113
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v10, 0x0

    invoke-direct {p0, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload(Z)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 114
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Fail;

    new-instance v3, Ljava/lang/Exception;

    const-string v5, "Something went wrong"

    invoke-direct {v3, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Throwable;

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Fail;-><init>(Ljava/lang/Throwable;)V

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    .line 111
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 110
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final searchInProgress()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 46
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 47
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 49
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v10, v3, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 50
    new-instance v5, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    invoke-direct {v5, v4, v3, v4}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    move-object v4, v2

    .line 47
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final searchNoResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 73
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 74
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 76
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x1

    invoke-static {p0, v10, v4, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 77
    new-instance v3, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 79
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 78
    new-instance v6, Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    .line 80
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 78
    invoke-direct {v6, v4, v5}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;-><init>(Ljava/lang/Boolean;Ljava/util/List;)V

    .line 77
    invoke-direct {v3, v6}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    move-object v4, v2

    .line 74
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final searchNoResultsNoManualEntry()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 87
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 88
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 90
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v10, 0x0

    invoke-static {p0, v10, v3, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 91
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    .line 93
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 92
    new-instance v5, Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    .line 94
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 92
    invoke-direct {v5, v6, v3}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;-><init>(Ljava/lang/Boolean;Ljava/util/List;)V

    .line 91
    invoke-direct {v2, v5}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    .line 88
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final searchSuccess()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 55
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 56
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 58
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v10, v3, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 59
    new-instance v5, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v6, 0x3

    invoke-direct {p0, v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institutionResponse(I)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v7, 0x2

    invoke-static {v6, v3, v4, v7, v4}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->copy$default(Lcom/stripe/android/financialconnections/model/InstitutionResponse;Ljava/lang/Boolean;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v3

    invoke-direct {v5, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    move-object v4, v2

    .line 56
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final searchSuccessNoManualEntry()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 11

    .line 64
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 65
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 67
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p0, v10, v3, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 68
    new-instance v3, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v5, 0x3

    invoke-direct {p0, v5}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institutionResponse(I)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v5, v6, v4, v7, v4}, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->copy$default(Lcom/stripe/android/financialconnections/model/InstitutionResponse;Ljava/lang/Boolean;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v8, 0x32

    const/4 v9, 0x0

    move-object v4, v2

    .line 65
    const-string v2, "Some query"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    invoke-direct {v0, v1, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v0
.end method

.method private final selectedInstitution()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;
    .locals 17

    move-object/from16 v0, p0

    .line 119
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;

    .line 122
    new-instance v2, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v0, v3, v4, v5}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->payload$default(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    move-result-object v6

    invoke-direct {v2, v6}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 123
    new-instance v6, Lcom/stripe/android/financialconnections/presentation/Async$Success;

    const/4 v7, 0x3

    invoke-direct {v0, v7}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->institutionResponse(I)Lcom/stripe/android/financialconnections/model/InstitutionResponse;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/stripe/android/financialconnections/presentation/Async$Success;-><init>(Ljava/lang/Object;)V

    .line 125
    new-instance v7, Lcom/stripe/android/financialconnections/presentation/Async$Loading;

    invoke-direct {v7, v5, v4, v5}, Lcom/stripe/android/financialconnections/presentation/Async$Loading;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 120
    new-instance v8, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    .line 122
    move-object v11, v2

    check-cast v11, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 123
    move-object v12, v6

    check-cast v12, Lcom/stripe/android/financialconnections/presentation/Async;

    .line 125
    move-object v13, v7

    check-cast v13, Lcom/stripe/android/financialconnections/presentation/Async;

    const/16 v15, 0x20

    const/16 v16, 0x0

    .line 120
    const-string v9, "Some query"

    const-string v10, "2"

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    invoke-direct {v1, v8, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V

    return-object v1
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
