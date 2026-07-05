.class public final Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;
.super Ljava/lang/Object;
.source "DestinationMappers.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDestinationMappers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationMappers.kt\ncom/stripe/android/financialconnections/navigation/DestinationMappersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n295#2,2:42\n*S KotlinDebug\n*F\n+ 1 DestinationMappers.kt\ncom/stripe/android/financialconnections/navigation/DestinationMappersKt\n*L\n38#1:42,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0002*\u00020\u00088@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "paneToDestination",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "Lcom/stripe/android/financialconnections/navigation/Destination;",
        "destination",
        "getDestination",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;",
        "pane",
        "Landroidx/navigation/NavDestination;",
        "getPane",
        "(Landroidx/navigation/NavDestination;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
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


# static fields
.field private static final paneToDestination:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/navigation/Destination;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x17

    .line 7
    new-array v0, v0, [Lkotlin/Pair;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 8
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$Consent;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Consent;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 9
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 10
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH_DRAWER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 11
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 12
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$Success;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Success;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 13
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 14
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ATTACH_LINKED_PAYMENT_ACCOUNT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 15
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 16
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 17
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_LOGIN_WARMUP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 18
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 19
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_SAVE_TO_LINK_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 20
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 21
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_STEP_UP_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 22
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->RESET:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$Reset;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Reset;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 23
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$Error;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Error;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 24
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->EXIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$Exit;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Exit;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    .line 25
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->BANK_AUTH_REPAIR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    .line 26
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY_SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    .line 27
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NOTICE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$Notice;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$Notice;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    .line 28
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_UPDATE_REQUIRED:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    .line 29
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ID_CONSENT_CONTENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    sget-object v2, Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x16

    aput-object v1, v0, v2

    .line 6
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->paneToDestination:Ljava/util/Map;

    return-void
.end method

.method public static final getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->paneToDestination:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    if-eqz v0, :cond_0

    return-object v0

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No corresponding destination for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final getPane(Landroidx/navigation/NavDestination;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->paneToDestination:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Map$Entry;

    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/navigation/Destination;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/navigation/Destination;->getFullRoute()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/navigation/NavDestination;->getRoute()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eqz v0, :cond_2

    return-object v0

    .line 40
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No corresponding destination for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
