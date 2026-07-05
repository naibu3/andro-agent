.class public final Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;
.super Ljava/lang/Object;
.source "GenericScreenPreviewParameterProvider.kt"

# interfaces
.implements Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider<",
        "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\t\u001a\u00020\u0002H\u0002J\u0008\u0010\n\u001a\u00020\u0002H\u0002J\u0008\u0010\u000b\u001a\u00020\u0002H\u0002J\u0008\u0010\u000c\u001a\u00020\rH\u0002J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0002J\u0008\u0010\u0012\u001a\u00020\u0013H\u0002R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;",
        "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;",
        "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;",
        "<init>",
        "()V",
        "values",
        "Lkotlin/sequences/Sequence;",
        "getValues",
        "()Lkotlin/sequences/Sequence;",
        "canonical",
        "twoButtons",
        "modal",
        "options",
        "LFinancialConnectionsGenericInfoScreen$Options;",
        "footer",
        "LFinancialConnectionsGenericInfoScreen$Footer;",
        "body",
        "LFinancialConnectionsGenericInfoScreen$Body;",
        "header",
        "LFinancialConnectionsGenericInfoScreen$Header;",
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
            "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;",
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

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 15
    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 16
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->twoButtons()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 17
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->modal()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    move-result-object v2

    aput-object v2, v0, v1

    .line 14
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-void
.end method

.method private final body()LFinancialConnectionsGenericInfoScreen$Body;
    .locals 6

    .line 66
    new-instance v0, LFinancialConnectionsGenericInfoScreen$Body;

    .line 68
    new-instance v1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;

    .line 71
    sget-object v2, LAlignment;->Center:LAlignment;

    .line 72
    sget-object v3, LSize;->Medium:LSize;

    .line 68
    const-string v4, "1"

    const-string v5, "Sample Text"

    invoke-direct {v1, v4, v5, v2, v3}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;-><init>(Ljava/lang/String;Ljava/lang/String;LAlignment;LSize;)V

    .line 67
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, LFinancialConnectionsGenericInfoScreen$Body;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private final canonical()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;
    .locals 6

    .line 22
    new-instance v0, LFinancialConnectionsGenericInfoScreen;

    .line 24
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->header()LFinancialConnectionsGenericInfoScreen$Header;

    move-result-object v2

    .line 25
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->body()LFinancialConnectionsGenericInfoScreen$Body;

    move-result-object v3

    .line 26
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->footer()LFinancialConnectionsGenericInfoScreen$Footer;

    move-result-object v4

    .line 27
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->options()LFinancialConnectionsGenericInfoScreen$Options;

    move-result-object v5

    .line 22
    const-string v1, "sampleScreen1"

    invoke-direct/range {v0 .. v5}, LFinancialConnectionsGenericInfoScreen;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V

    .line 20
    new-instance v1, Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;-><init>(LFinancialConnectionsGenericInfoScreen;Z)V

    return-object v1
.end method

.method private final footer()LFinancialConnectionsGenericInfoScreen$Footer;
    .locals 5

    .line 55
    new-instance v0, LFinancialConnectionsGenericInfoScreen$Footer;

    .line 57
    new-instance v1, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    const-string v2, "primaryCta1"

    const-string v3, "Primary Action"

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;)V

    .line 55
    const-string v2, "Sample Disclaimer"

    invoke-direct {v0, v2, v1, v4, v4}, LFinancialConnectionsGenericInfoScreen$Footer;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)V

    return-object v0
.end method

.method private final header()LFinancialConnectionsGenericInfoScreen$Header;
    .locals 5

    .line 77
    new-instance v0, LFinancialConnectionsGenericInfoScreen$Header;

    const/4 v1, 0x0

    .line 81
    sget-object v2, LAlignment;->Center:LAlignment;

    .line 77
    const-string v3, "Sample Title"

    const-string v4, "Sample Subtitle"

    invoke-direct {v0, v3, v4, v1, v2}, LFinancialConnectionsGenericInfoScreen$Header;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;LAlignment;)V

    return-object v0
.end method

.method private final modal()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;
    .locals 3

    .line 48
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->canonical()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2, v1}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;->copy$default(Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;LFinancialConnectionsGenericInfoScreen;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    move-result-object v0

    return-object v0
.end method

.method private final options()LFinancialConnectionsGenericInfoScreen$Options;
    .locals 3

    .line 50
    new-instance v0, LFinancialConnectionsGenericInfoScreen$Options;

    const/4 v1, 0x1

    .line 51
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 52
    sget-object v2, LVerticalAlignment;->Default:LVerticalAlignment;

    .line 50
    invoke-direct {v0, v1, v2}, LFinancialConnectionsGenericInfoScreen$Options;-><init>(Ljava/lang/Boolean;LVerticalAlignment;)V

    return-object v0
.end method

.method private final twoButtons()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;
    .locals 11

    .line 33
    new-instance v0, LFinancialConnectionsGenericInfoScreen;

    .line 35
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->header()LFinancialConnectionsGenericInfoScreen$Header;

    move-result-object v2

    .line 36
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->body()LFinancialConnectionsGenericInfoScreen$Body;

    move-result-object v3

    .line 37
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->footer()LFinancialConnectionsGenericInfoScreen$Footer;

    move-result-object v4

    .line 38
    new-instance v7, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    .line 40
    const-string v1, "Secondary Action"

    const/4 v5, 0x0

    .line 38
    const-string v6, "secondaryCta1"

    invoke-direct {v7, v6, v1, v5}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;)V

    const/16 v9, 0xb

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 37
    invoke-static/range {v4 .. v10}, LFinancialConnectionsGenericInfoScreen$Footer;->copy$default(LFinancialConnectionsGenericInfoScreen$Footer;Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;ILjava/lang/Object;)LFinancialConnectionsGenericInfoScreen$Footer;

    move-result-object v4

    .line 44
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->options()LFinancialConnectionsGenericInfoScreen$Options;

    move-result-object v5

    .line 33
    const-string v1, "sampleScreen1"

    invoke-direct/range {v0 .. v5}, LFinancialConnectionsGenericInfoScreen;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V

    .line 31
    new-instance v1, Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;-><init>(LFinancialConnectionsGenericInfoScreen;Z)V

    return-object v1
.end method


# virtual methods
.method public getValues()Lkotlin/sequences/Sequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenPreviewParameterProvider;->values:Lkotlin/sequences/Sequence;

    return-object v0
.end method
