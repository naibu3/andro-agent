.class public final Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModelKt;
.super Ljava/lang/Object;
.source "LinkAccountPickerViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "withIcon",
        "LFinancialConnectionsGenericInfoScreen;",
        "iconUrl",
        "",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$withIcon(LFinancialConnectionsGenericInfoScreen;Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModelKt;->withIcon(LFinancialConnectionsGenericInfoScreen;Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen;

    move-result-object p0

    return-object p0
.end method

.method private static final withIcon(LFinancialConnectionsGenericInfoScreen;Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen;
    .locals 8

    .line 536
    invoke-virtual {p0}, LFinancialConnectionsGenericInfoScreen;->getHeader()LFinancialConnectionsGenericInfoScreen$Header;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v3, Lcom/stripe/android/financialconnections/model/Image;

    invoke-direct {v3, p1}, Lcom/stripe/android/financialconnections/model/Image;-><init>(Ljava/lang/String;)V

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LFinancialConnectionsGenericInfoScreen$Header;->copy$default(LFinancialConnectionsGenericInfoScreen$Header;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/Image;LAlignment;ILjava/lang/Object;)LFinancialConnectionsGenericInfoScreen$Header;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/16 v6, 0x1d

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 535
    invoke-static/range {v0 .. v7}, LFinancialConnectionsGenericInfoScreen;->copy$default(LFinancialConnectionsGenericInfoScreen;Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;ILjava/lang/Object;)LFinancialConnectionsGenericInfoScreen;

    move-result-object p0

    return-object p0
.end method
