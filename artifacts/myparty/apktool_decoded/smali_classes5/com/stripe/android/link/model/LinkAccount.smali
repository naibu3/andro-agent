.class public final Lcom/stripe/android/link/model/LinkAccount;
.super Ljava/lang/Object;
.source "LinkAccount.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000c\u0010&\u001a\u00020\u001b*\u00020\u0003H\u0002J\u000c\u0010\'\u001a\u00020\u001b*\u00020\u0003H\u0002J\u000c\u0010(\u001a\u00020\u001b*\u00020\u0003H\u0002J\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0010\u001a\u0004\u0008\u0019\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u0010\u001a\u0004\u0008\u001a\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u0010\u001a\u0004\u0008 \u0010\u001dR\u0017\u0010!\u001a\u00020\"\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010\u0010\u001a\u0004\u0008$\u0010%\u00a8\u00060"
    }
    d2 = {
        "Lcom/stripe/android/link/model/LinkAccount;",
        "Landroid/os/Parcelable;",
        "consumerSession",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerPublishableKey",
        "",
        "displayablePaymentDetails",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "<init>",
        "(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V",
        "getConsumerPublishableKey",
        "()Ljava/lang/String;",
        "getDisplayablePaymentDetails",
        "()Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "redactedPhoneNumber",
        "getRedactedPhoneNumber$annotations",
        "()V",
        "getRedactedPhoneNumber",
        "unredactedPhoneNumber",
        "getUnredactedPhoneNumber",
        "clientSecret",
        "getClientSecret$annotations",
        "getClientSecret",
        "email",
        "getEmail$annotations",
        "getEmail",
        "isVerified",
        "",
        "isVerified$annotations",
        "()Z",
        "completedSignup",
        "getCompletedSignup$annotations",
        "getCompletedSignup",
        "accountStatus",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "getAccountStatus$annotations",
        "getAccountStatus",
        "()Lcom/stripe/android/link/model/AccountStatus;",
        "containsSMSSessionStarted",
        "containsVerifiedSMSSession",
        "isVerifiedForSignup",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final accountStatus:Lcom/stripe/android/link/model/AccountStatus;

.field private final clientSecret:Ljava/lang/String;

.field private final completedSignup:Z

.field private final consumerPublishableKey:Ljava/lang/String;

.field private final consumerSession:Lcom/stripe/android/model/ConsumerSession;

.field private final displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

.field private final email:Ljava/lang/String;

.field private final isVerified:Z

.field private final redactedPhoneNumber:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/model/LinkAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/model/LinkAccount$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/model/LinkAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/model/LinkAccount;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V
    .locals 7

    const-string v0, "consumerSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    .line 23
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getRedactedFormattedPhoneNumber()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "*"

    const-string v3, "\u2022"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/model/LinkAccount;->redactedPhoneNumber:Ljava/lang/String;

    .line 38
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/model/LinkAccount;->clientSecret:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/model/LinkAccount;->email:Ljava/lang/String;

    .line 44
    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->containsVerifiedSMSSession(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 45
    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->isVerifiedForSignup(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 44
    :goto_1
    iput-boolean p2, p0, Lcom/stripe/android/link/model/LinkAccount;->isVerified:Z

    .line 48
    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->isVerifiedForSignup(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p3

    iput-boolean p3, p0, Lcom/stripe/android/link/model/LinkAccount;->completedSignup:Z

    if-eqz p2, :cond_2

    .line 53
    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->Verified:Lcom/stripe/android/link/model/AccountStatus;

    goto :goto_2

    .line 55
    :cond_2
    invoke-direct {p0, p1}, Lcom/stripe/android/link/model/LinkAccount;->containsSMSSessionStarted(Lcom/stripe/android/model/ConsumerSession;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 56
    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

    goto :goto_2

    .line 59
    :cond_3
    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->NeedsVerification:Lcom/stripe/android/link/model/AccountStatus;

    .line 51
    :goto_2
    iput-object p1, p0, Lcom/stripe/android/link/model/LinkAccount;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 16
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/model/LinkAccount;-><init>(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;)V

    return-void
.end method

.method private final containsSMSSessionStarted(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 4

    .line 63
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    .line 64
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->Sms:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v2, v3, :cond_0

    .line 65
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Started:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private final containsVerifiedSMSSession(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 4

    .line 68
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    .line 69
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->Sms:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v2, v3, :cond_0

    .line 70
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Verified:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic getAccountStatus$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getClientSecret$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCompletedSignup$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getEmail$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRedactedPhoneNumber$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isVerified$annotations()V
    .locals 0

    return-void
.end method

.method private final isVerifiedForSignup(Lcom/stripe/android/model/ConsumerSession;)Z
    .locals 4

    .line 73
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    .line 74
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->SignUp:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v2, v3, :cond_0

    .line 75
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Started:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/model/LinkAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    iget-object v3, p1, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    iget-object p1, p1, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->accountStatus:Lcom/stripe/android/link/model/AccountStatus;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getCompletedSignup()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/stripe/android/link/model/LinkAccount;->completedSignup:Z

    return v0
.end method

.method public final getConsumerPublishableKey()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getRedactedPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->redactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnredactedPhoneNumber()Ljava/lang/String;
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession;->getPhoneNumberCountry()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 31
    invoke-static {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatterKt;->convertPhoneNumberToE164(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/model/DisplayablePaymentDetails;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isVerified()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/stripe/android/link/model/LinkAccount;->isVerified:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    iget-object v1, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LinkAccount(consumerSession="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", consumerPublishableKey="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayablePaymentDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->consumerPublishableKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/model/LinkAccount;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
