.class public final Lcom/stripe/android/financialconnections/model/TextUpdate;
.super Ljava/lang/Object;
.source "TextUpdate.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/TextUpdate$$serializer;,
        Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 P2\u00020\u0001:\u0002OPBg\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Bk\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Ji\u0010:\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001J\u0006\u0010;\u001a\u00020\u0015J\u0013\u0010<\u001a\u00020=2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u00d6\u0003J\t\u0010@\u001a\u00020\u0015H\u00d6\u0001J\t\u0010A\u001a\u00020BH\u00d6\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0015J%\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001\u00a2\u0006\u0002\u0008NR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u001a\u001a\u0004\u0008!\u0010\"R\u001e\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010\u001a\u001a\u0004\u0008$\u0010%R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008&\u0010\u001a\u001a\u0004\u0008\'\u0010(R\u001e\u0010\u000c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008)\u0010\u001a\u001a\u0004\u0008*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008,\u0010\u001a\u001a\u0004\u0008-\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008/\u0010\u001a\u001a\u0004\u00080\u00101\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/TextUpdate;",
        "Landroid/os/Parcelable;",
        "accountPicker",
        "Lcom/stripe/android/financialconnections/model/AccountPickerPane;",
        "consent",
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "linkLoginPane",
        "Lcom/stripe/android/financialconnections/model/LinkLoginPane;",
        "networkingLinkSignupPane",
        "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;",
        "oauthPrepane",
        "Lcom/stripe/android/financialconnections/model/OauthPrepane;",
        "returningNetworkingUserAccountPicker",
        "Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;",
        "successPane",
        "Lcom/stripe/android/financialconnections/model/SuccessPane;",
        "idConsentContentPane",
        "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getAccountPicker$annotations",
        "()V",
        "getAccountPicker",
        "()Lcom/stripe/android/financialconnections/model/AccountPickerPane;",
        "getConsent$annotations",
        "getConsent",
        "()Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "getLinkLoginPane$annotations",
        "getLinkLoginPane",
        "()Lcom/stripe/android/financialconnections/model/LinkLoginPane;",
        "getNetworkingLinkSignupPane$annotations",
        "getNetworkingLinkSignupPane",
        "()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;",
        "getOauthPrepane$annotations",
        "getOauthPrepane",
        "()Lcom/stripe/android/financialconnections/model/OauthPrepane;",
        "getReturningNetworkingUserAccountPicker$annotations",
        "getReturningNetworkingUserAccountPicker",
        "()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;",
        "getSuccessPane$annotations",
        "getSuccessPane",
        "()Lcom/stripe/android/financialconnections/model/SuccessPane;",
        "getIdConsentContentPane$annotations",
        "getIdConsentContentPane",
        "()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "write$Self",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$financial_connections_release",
        "$serializer",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/TextUpdate;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;


# instance fields
.field private final accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

.field private final consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

.field private final idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

.field private final linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

.field private final networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

.field private final oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

.field private final returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

.field private final successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/TextUpdate;->Companion:Lcom/stripe/android/financialconnections/model/TextUpdate$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/TextUpdate$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/TextUpdate$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/TextUpdate;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/TextUpdate;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const/4 v0, 0x0

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    .line 20
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    .line 22
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    .line 24
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    .line 26
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    .line 28
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p9, v0

    goto :goto_0

    :cond_7
    move-object p9, p8

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p9}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/TextUpdate;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/stripe/android/financialconnections/model/TextUpdate;->copy(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAccountPicker$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "account_picker_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getConsent$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "consent_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getIdConsentContentPane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "id_consent_content_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getLinkLoginPane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "link_login_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getNetworkingLinkSignupPane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "networking_link_signup_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getOauthPrepane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "oauth_prepane"
    .end annotation

    return-void
.end method

.method public static synthetic getReturningNetworkingUserAccountPicker$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "returning_networking_user_account_picker"
    .end annotation

    return-void
.end method

.method public static synthetic getSuccessPane$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "success_pane"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/TextUpdate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 11
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/AccountPickerPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/AccountPickerPane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/LinkLoginPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/LinkLoginPane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/stripe/android/financialconnections/model/OauthPrepane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OauthPrepane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/stripe/android/financialconnections/model/SuccessPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/SuccessPane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/stripe/android/financialconnections/model/IDConsentContentPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/IDConsentContentPane$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/AccountPickerPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/LinkLoginPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/OauthPrepane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/financialconnections/model/SuccessPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)Lcom/stripe/android/financialconnections/model/TextUpdate;
    .locals 9

    new-instance v0, Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/model/TextUpdate;-><init>(Lcom/stripe/android/financialconnections/model/AccountPickerPane;Lcom/stripe/android/financialconnections/model/ConsentPane;Lcom/stripe/android/financialconnections/model/LinkLoginPane;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;Lcom/stripe/android/financialconnections/model/SuccessPane;Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V

    return-object v0
.end method

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/TextUpdate;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAccountPicker()Lcom/stripe/android/financialconnections/model/AccountPickerPane;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    return-object v0
.end method

.method public final getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-object v0
.end method

.method public final getIdConsentContentPane()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    return-object v0
.end method

.method public final getLinkLoginPane()Lcom/stripe/android/financialconnections/model/LinkLoginPane;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    return-object v0
.end method

.method public final getNetworkingLinkSignupPane()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    return-object v0
.end method

.method public final getOauthPrepane()Lcom/stripe/android/financialconnections/model/OauthPrepane;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    return-object v0
.end method

.method public final getReturningNetworkingUserAccountPicker()Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    return-object v0
.end method

.method public final getSuccessPane()Lcom/stripe/android/financialconnections/model/SuccessPane;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/AccountPickerPane;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/ConsentPane;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/OauthPrepane;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SuccessPane;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/IDConsentContentPane;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "TextUpdate(accountPicker="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, ", consent="

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkLoginPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", networkingLinkSignupPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oauthPrepane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", returningNetworkingUserAccountPicker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", successPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", idConsentContentPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->accountPicker:Lcom/stripe/android/financialconnections/model/AccountPickerPane;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/AccountPickerPane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ConsentPane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->linkLoginPane:Lcom/stripe/android/financialconnections/model/LinkLoginPane;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/LinkLoginPane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->networkingLinkSignupPane:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->oauthPrepane:Lcom/stripe/android/financialconnections/model/OauthPrepane;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/OauthPrepane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->returningNetworkingUserAccountPicker:Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ReturningNetworkingUserAccountPicker;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->successPane:Lcom/stripe/android/financialconnections/model/SuccessPane;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/SuccessPane;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/TextUpdate;->idConsentContentPane:Lcom/stripe/android/financialconnections/model/IDConsentContentPane;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/IDConsentContentPane;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
