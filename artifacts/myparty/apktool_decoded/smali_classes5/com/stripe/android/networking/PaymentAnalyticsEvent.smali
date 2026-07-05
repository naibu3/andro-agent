.class public final enum Lcom/stripe/android/networking/PaymentAnalyticsEvent;
.super Ljava/lang/Enum;
.source "PaymentAnalyticsEvent.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        ">;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008K\u0008\u0087\u0081\u0002\u0018\u0000 N2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001NB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010K\u001a\u00020\u0004H\u0017R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010L\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084j\u0002\u00085j\u0002\u00086j\u0002\u00087j\u0002\u00088j\u0002\u00089j\u0002\u0008:j\u0002\u0008;j\u0002\u0008<j\u0002\u0008=j\u0002\u0008>j\u0002\u0008?j\u0002\u0008@j\u0002\u0008Aj\u0002\u0008Bj\u0002\u0008Cj\u0002\u0008Dj\u0002\u0008Ej\u0002\u0008Fj\u0002\u0008Gj\u0002\u0008Hj\u0002\u0008Ij\u0002\u0008J\u00a8\u0006O"
    }
    d2 = {
        "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "TokenCreate",
        "PaymentMethodCreate",
        "PaymentMethodUpdate",
        "CustomerRetrieve",
        "CustomerRetrievePaymentMethods",
        "CustomerAttachPaymentMethod",
        "CustomerDetachPaymentMethod",
        "CustomerDeleteSource",
        "CustomerSetShippingInfo",
        "CustomerAddSource",
        "CustomerSetDefaultSource",
        "IssuingRetrievePin",
        "IssuingUpdatePin",
        "SourceCreate",
        "SourceRetrieve",
        "PaymentIntentConfirm",
        "PaymentIntentRetrieve",
        "PaymentIntentRetrieveOrdered",
        "PaymentIntentCancelSource",
        "PaymentIntentRefresh",
        "SetupIntentConfirm",
        "SetupIntentRetrieve",
        "SetupIntentRetrieveOrdered",
        "SetupIntentCancelSource",
        "SetupIntentRefresh",
        "PaymentLauncherConfirmStarted",
        "PaymentLauncherConfirmFinished",
        "PaymentLauncherNextActionStarted",
        "PaymentLauncherNextActionFinished",
        "FileCreate",
        "Auth3ds1Sdk",
        "Auth3ds1ChallengeStart",
        "Auth3ds1ChallengeError",
        "Auth3ds1ChallengeComplete",
        "AuthWithWebView",
        "AuthWithCustomTabs",
        "AuthWithDefaultBrowser",
        "ConfirmReturnUrlNull",
        "ConfirmReturnUrlDefault",
        "ConfirmReturnUrlCustom",
        "FpxBankStatusesRetrieve",
        "StripeUrlRetrieve",
        "Auth3ds2RequestParamsFailed",
        "Auth3ds2Fingerprint",
        "Auth3ds2Start",
        "Auth3ds2Frictionless",
        "Auth3ds2ChallengePresented",
        "Auth3ds2ChallengeCanceled",
        "Auth3ds2ChallengeCompleted",
        "Auth3ds2ChallengeErrored",
        "Auth3ds2ChallengeTimedOut",
        "Auth3ds2Fallback",
        "AuthRedirect",
        "AuthError",
        "AuthSourceStart",
        "AuthSourceRedirect",
        "AuthSourceResult",
        "RadarSessionCreate",
        "GooglePayLauncherInit",
        "GooglePayPaymentMethodLauncherInit",
        "CardMetadataPublishableKeyAvailable",
        "CardMetadataPublishableKeyUnavailable",
        "CardMetadataLoadedTooSlow",
        "CardMetadataLoadFailure",
        "CardMetadataMissingRange",
        "CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields",
        "toString",
        "eventName",
        "getEventName",
        "Companion",
        "payments-core_release"
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds1Sdk:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Fallback:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Fingerprint:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Frictionless:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2RequestParamsFailed:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataPublishableKeyAvailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CardMetadataPublishableKeyUnavailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field private static final Companion:Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;

.field public static final enum ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerAddSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerAttachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerDeleteSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerDetachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum GooglePayLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum GooglePayPaymentMethodLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field private static final PREFIX:Ljava/lang/String; = "stripe_android"

.field public static final enum PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentLauncherConfirmFinished:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentLauncherConfirmStarted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentLauncherNextActionFinished:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentLauncherNextActionStarted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentMethodCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum PaymentMethodUpdate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SetupIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SourceCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

.field public static final enum TokenCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 67

    sget-object v1, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->TokenCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentMethodCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v3, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentMethodUpdate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v5, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v6, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAttachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDetachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v8, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDeleteSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v9, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v10, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAddSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v11, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v12, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v13, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v14, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v15, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v16, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v17, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v18, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v19, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v20, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v21, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v22, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v23, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v24, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v25, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v26, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherConfirmStarted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v27, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherConfirmFinished:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v28, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherNextActionStarted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v29, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherNextActionFinished:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v30, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v31, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1Sdk:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v32, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v33, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v34, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v35, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v36, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v37, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v38, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v39, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v40, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v41, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v42, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v43, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2RequestParamsFailed:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v44, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fingerprint:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v45, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v46, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Frictionless:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v47, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v48, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v49, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v50, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v51, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v52, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fallback:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v53, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v54, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v55, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v56, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v57, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v58, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v59, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v60, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayPaymentMethodLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v61, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyAvailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v62, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyUnavailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v63, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v64, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v65, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    sget-object v66, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    filled-new-array/range {v1 .. v66}, [Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 10
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x0

    const-string v2, "token_creation"

    const-string v3, "TokenCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->TokenCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 13
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x1

    const-string v2, "payment_method_creation"

    const-string v3, "PaymentMethodCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentMethodCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 14
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x2

    const-string v2, "payment_method_update"

    const-string v3, "PaymentMethodUpdate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentMethodUpdate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 17
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x3

    const-string v2, "retrieve_customer"

    const-string v3, "CustomerRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 18
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x4

    const-string v2, "retrieve_payment_methods"

    const-string v3, "CustomerRetrievePaymentMethods"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerRetrievePaymentMethods:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 19
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x5

    const-string v2, "attach_payment_method"

    const-string v3, "CustomerAttachPaymentMethod"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAttachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 20
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x6

    const-string v2, "detach_payment_method"

    const-string v3, "CustomerDetachPaymentMethod"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDetachPaymentMethod:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 21
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v1, 0x7

    const-string v2, "delete_source"

    const-string v3, "CustomerDeleteSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerDeleteSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 22
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x8

    const-string v2, "set_shipping_info"

    const-string v3, "CustomerSetShippingInfo"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetShippingInfo:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 23
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x9

    const-string v2, "add_source"

    const-string v3, "CustomerAddSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerAddSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 24
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xa

    const-string v2, "default_source"

    const-string v3, "CustomerSetDefaultSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CustomerSetDefaultSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 27
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xb

    const-string v2, "issuing_retrieve_pin"

    const-string v3, "IssuingRetrievePin"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingRetrievePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 28
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xc

    const-string v2, "issuing_update_pin"

    const-string v3, "IssuingUpdatePin"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->IssuingUpdatePin:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 31
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xd

    const-string v2, "source_creation"

    const-string v3, "SourceCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 32
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xe

    const-string v2, "retrieve_source"

    const-string v3, "SourceRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SourceRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 35
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0xf

    const-string v2, "payment_intent_confirmation"

    const-string v3, "PaymentIntentConfirm"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 36
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x10

    const-string v2, "payment_intent_retrieval"

    const-string v3, "PaymentIntentRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 37
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x11

    const-string v2, "payment_intent_retrieval_ordered"

    const-string v3, "PaymentIntentRetrieveOrdered"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 38
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x12

    const-string v2, "payment_intent_cancel_source"

    const-string v3, "PaymentIntentCancelSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 39
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x13

    const-string v2, "payment_intent_refresh"

    const-string v3, "PaymentIntentRefresh"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 42
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x14

    const-string v2, "setup_intent_confirmation"

    const-string v3, "SetupIntentConfirm"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentConfirm:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 43
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x15

    const-string v2, "setup_intent_retrieval"

    const-string v3, "SetupIntentRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 44
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x16

    const-string v2, "setup_intent_retrieval_ordered"

    const-string v3, "SetupIntentRetrieveOrdered"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRetrieveOrdered:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 45
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x17

    const-string v2, "setup_intent_cancel_source"

    const-string v3, "SetupIntentCancelSource"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentCancelSource:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 46
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x18

    const-string v2, "setup_intent_refresh"

    const-string v3, "SetupIntentRefresh"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->SetupIntentRefresh:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 49
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x19

    const-string v2, "paymenthandler.confirm.started"

    const-string v3, "PaymentLauncherConfirmStarted"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherConfirmStarted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 50
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1a

    const-string v2, "paymenthandler.confirm.finished"

    const-string v3, "PaymentLauncherConfirmFinished"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherConfirmFinished:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 51
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1b

    const-string v2, "paymenthandler.handle_next_action.started"

    const-string v3, "PaymentLauncherNextActionStarted"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherNextActionStarted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 52
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1c

    const-string v2, "paymenthandler.handle_next_action.finished"

    const-string v3, "PaymentLauncherNextActionFinished"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->PaymentLauncherNextActionFinished:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 55
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1d

    const-string v2, "create_file"

    const-string v3, "FileCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FileCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 58
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1e

    const-string v2, "3ds1_sdk"

    const-string v3, "Auth3ds1Sdk"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1Sdk:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 59
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x1f

    const-string v2, "3ds1_challenge_start"

    const-string v3, "Auth3ds1ChallengeStart"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 60
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x20

    const-string v2, "3ds1_challenge_error"

    const-string v3, "Auth3ds1ChallengeError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 61
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x21

    const-string v2, "3ds1_challenge_complete"

    const-string v3, "Auth3ds1ChallengeComplete"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds1ChallengeComplete:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 64
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x22

    const-string v2, "auth_with_webview"

    const-string v3, "AuthWithWebView"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithWebView:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 65
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x23

    const-string v2, "auth_with_customtabs"

    const-string v3, "AuthWithCustomTabs"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithCustomTabs:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 66
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x24

    const-string v2, "auth_with_defaultbrowser"

    const-string v3, "AuthWithDefaultBrowser"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthWithDefaultBrowser:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 69
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x25

    const-string v2, "confirm_returnurl_null"

    const-string v3, "ConfirmReturnUrlNull"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlNull:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 70
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x26

    const-string v2, "confirm_returnurl_default"

    const-string v3, "ConfirmReturnUrlDefault"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlDefault:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 71
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x27

    const-string v2, "confirm_returnurl_custom"

    const-string v3, "ConfirmReturnUrlCustom"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->ConfirmReturnUrlCustom:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 74
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x28

    const-string v2, "retrieve_fpx_bank_statuses"

    const-string v3, "FpxBankStatusesRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->FpxBankStatusesRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 77
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x29

    const-string v2, "retrieve_stripe_url"

    const-string v3, "StripeUrlRetrieve"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->StripeUrlRetrieve:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 80
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2a

    const-string v2, "3ds2_authentication_request_params_failed"

    const-string v3, "Auth3ds2RequestParamsFailed"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2RequestParamsFailed:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 81
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2b

    const-string v2, "3ds2_fingerprint"

    const-string v3, "Auth3ds2Fingerprint"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fingerprint:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 82
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2c

    const-string v2, "3ds2_authenticate"

    const-string v3, "Auth3ds2Start"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Start:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 83
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2d

    const-string v2, "3ds2_frictionless_flow"

    const-string v3, "Auth3ds2Frictionless"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Frictionless:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 84
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2e

    const-string v2, "3ds2_challenge_flow_presented"

    const-string v3, "Auth3ds2ChallengePresented"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengePresented:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 85
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x2f

    const-string v2, "3ds2_challenge_flow_canceled"

    const-string v3, "Auth3ds2ChallengeCanceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCanceled:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 86
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x30

    const-string v2, "3ds2_challenge_flow_completed"

    const-string v3, "Auth3ds2ChallengeCompleted"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeCompleted:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 87
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x31

    const-string v2, "3ds2_challenge_flow_errored"

    const-string v3, "Auth3ds2ChallengeErrored"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeErrored:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 88
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x32

    const-string v2, "3ds2_challenge_flow_timed_out"

    const-string v3, "Auth3ds2ChallengeTimedOut"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2ChallengeTimedOut:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 89
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x33

    const-string v2, "3ds2_fallback"

    const-string v3, "Auth3ds2Fallback"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Auth3ds2Fallback:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 91
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x34

    const-string v2, "url_redirect_next_action"

    const-string v3, "AuthRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 92
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x35

    const-string v2, "auth_error"

    const-string v3, "AuthError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthError:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 95
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x36

    const-string v2, "auth_source_start"

    const-string v3, "AuthSourceStart"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceStart:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 96
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x37

    const-string v2, "auth_source_redirect"

    const-string v3, "AuthSourceRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 97
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x38

    const-string v2, "auth_source_result"

    const-string v3, "AuthSourceResult"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceResult:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 99
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x39

    const-string v2, "radar_session_create"

    const-string v3, "RadarSessionCreate"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->RadarSessionCreate:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 101
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3a

    const-string v2, "googlepaylauncher_init"

    const-string v3, "GooglePayLauncherInit"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 102
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3b

    const-string v2, "googlepaypaymentmethodlauncher_init"

    const-string v3, "GooglePayPaymentMethodLauncherInit"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->GooglePayPaymentMethodLauncherInit:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 104
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3c

    const-string v2, "card_metadata_pk_available"

    const-string v3, "CardMetadataPublishableKeyAvailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyAvailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 105
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3d

    const-string v2, "card_metadata_pk_unavailable"

    const-string v3, "CardMetadataPublishableKeyUnavailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataPublishableKeyUnavailable:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 107
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3e

    const-string v2, "card_metadata_loaded_too_slow"

    const-string v3, "CardMetadataLoadedTooSlow"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadedTooSlow:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 108
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x3f

    const-string v2, "card_metadata_load_failure"

    const-string v3, "CardMetadataLoadFailure"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataLoadFailure:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 109
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x40

    const-string v2, "card_metadata_missing_range"

    const-string v3, "CardMetadataMissingRange"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataMissingRange:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    .line 110
    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v1, 0x41

    .line 111
    const-string v2, "card_metadata.expected_extra_digits_but_user_entered_16_then_switched_fields"

    .line 110
    const-string v3, "CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static {}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->Companion:Lcom/stripe/android/networking/PaymentAnalyticsEvent$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/networking/PaymentAnalyticsEvent;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 1

    const-class v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 125
    check-cast p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/networking/PaymentAnalyticsEvent;
    .locals 1

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->$VALUES:[Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 125
    check-cast v0, [Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 120
    invoke-virtual {p0}, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 116
    iget-object v0, p0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->code:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stripe_android."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
