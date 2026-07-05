.class public final Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
.super Ljava/lang/Object;
.source "InlineSignupViewState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;,
        Lcom/stripe/android/link/ui/inline/InlineSignupViewState$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008.\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 E2\u00020\u0001:\u0001EB\u0083\u0001\u0008\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u00102\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u00103\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u000eH\u00c6\u0003J\t\u00106\u001a\u00020\u000eH\u00c6\u0003J\u000e\u00107\u001a\u00020\u000eH\u00c0\u0003\u00a2\u0006\u0002\u00088J\u000e\u00109\u001a\u00020\u000eH\u00c0\u0003\u00a2\u0006\u0002\u0008:J\u000e\u0010;\u001a\u00020\u0014H\u00c0\u0003\u00a2\u0006\u0002\u0008<J\u000e\u0010=\u001a\u00020\u000eH\u00c0\u0003\u00a2\u0006\u0002\u0008>J\u0091\u0001\u0010?\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010@\u001a\u00020\u000e2\u0008\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020CH\u00d6\u0001J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0014\u0010\u0011\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010#R\u0014\u0010\u0012\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0014\u0010\u0015\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010#R\u0011\u0010+\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010#R\u0011\u0010,\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010#R\u0011\u0010-\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010#\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "",
        "userInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "merchantName",
        "",
        "signupMode",
        "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "fields",
        "",
        "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
        "prefillEligibleFields",
        "",
        "allowsDefaultOptIn",
        "",
        "linkSignUpOptInFeatureEnabled",
        "didAskToChangeSignupDetails",
        "isExpanded",
        "apiFailed",
        "signUpState",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "userHasInteracted",
        "<init>",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;Z)V",
        "getUserInput",
        "()Lcom/stripe/android/link/ui/inline/UserInput;",
        "getMerchantName",
        "()Ljava/lang/String;",
        "getSignupMode",
        "()Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "getFields",
        "()Ljava/util/List;",
        "getPrefillEligibleFields",
        "()Ljava/util/Set;",
        "getAllowsDefaultOptIn",
        "()Z",
        "getLinkSignUpOptInFeatureEnabled",
        "getDidAskToChangeSignupDetails",
        "isExpanded$paymentsheet_release",
        "getApiFailed$paymentsheet_release",
        "getSignUpState$paymentsheet_release",
        "()Lcom/stripe/android/link/ui/signup/SignUpState;",
        "getUserHasInteracted$paymentsheet_release",
        "isShowingPhoneFirst",
        "isShowingEmailFirst",
        "useLink",
        "getUseLink",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component9$paymentsheet_release",
        "component10",
        "component10$paymentsheet_release",
        "component11",
        "component11$paymentsheet_release",
        "component12",
        "component12$paymentsheet_release",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;


# instance fields
.field private final allowsDefaultOptIn:Z

.field private final apiFailed:Z

.field private final didAskToChangeSignupDetails:Z

.field private final fields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation
.end field

.field private final isExpanded:Z

.field private final linkSignUpOptInFeatureEnabled:Z

.field private final merchantName:Ljava/lang/String;

.field private final prefillEligibleFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation
.end field

.field private final signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

.field private final signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

.field private final userHasInteracted:Z

.field private final userInput:Lcom/stripe/android/link/ui/inline/UserInput;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->Companion:Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;ZZZZZ",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Z)V"
        }
    .end annotation

    const-string v0, "merchantName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefillEligibleFields"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    .line 23
    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    .line 24
    iput-object p5, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    .line 25
    iput-boolean p6, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    .line 26
    iput-boolean p7, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    .line 27
    iput-boolean p8, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    .line 28
    iput-boolean p9, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    .line 29
    iput-boolean p10, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    .line 30
    iput-object p11, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    .line 31
    iput-boolean p12, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p13, 0x80

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move p8, v0

    :cond_0
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_1

    move p9, v0

    :cond_1
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_2

    move p10, v0

    :cond_2
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_3

    .line 30
    sget-object p11, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    :cond_3
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_4

    move p13, v0

    goto :goto_0

    :cond_4
    move p13, p12

    :goto_0
    move-object p12, p11

    move p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 18
    invoke-direct/range {p1 .. p13}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;-><init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-boolean p7, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-boolean p8, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p9, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-boolean p10, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-boolean p12, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    :cond_b
    move-object p13, p11

    move p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;Z)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    return-object v0
.end method

.method public final component10$paymentsheet_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    return v0
.end method

.method public final component11$paymentsheet_release()Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object v0
.end method

.method public final component12$paymentsheet_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/link/ui/inline/LinkSignupMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    return v0
.end method

.method public final component9$paymentsheet_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;Z)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;ZZZZZ",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "Z)",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;"
        }
    .end annotation

    const-string v0, "merchantName"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefillEligibleFields"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signUpState"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-object v2, p1

    move-object/from16 v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;-><init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-object v3, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    iget-boolean p1, p1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAllowsDefaultOptIn()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    return v0
.end method

.method public final getApiFailed$paymentsheet_release()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    return v0
.end method

.method public final getDidAskToChangeSignupDetails()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    return v0
.end method

.method public final getFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final getLinkSignUpOptInFeatureEnabled()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    return v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrefillEligibleFields()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    return-object v0
.end method

.method public final getSignUpState$paymentsheet_release()Lcom/stripe/android/link/ui/signup/SignUpState;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    return-object v0
.end method

.method public final getSignupMode()Lcom/stripe/android/link/ui/inline/LinkSignupMode;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    return-object v0
.end method

.method public final getUseLink()Z
    .locals 4

    .line 45
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    const/4 v2, -0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    sget-object v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewState$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->ordinal()I

    move-result v0

    aget v0, v3, v0

    :goto_0
    if-eq v0, v2, :cond_8

    const/4 v2, 0x1

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-ne v0, v3, :cond_6

    .line 52
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1

    .line 53
    :cond_3
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    if-eqz v0, :cond_4

    return v2

    :cond_4
    return v1

    .line 54
    :cond_5
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    return v0

    .line 49
    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 50
    :cond_7
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    if-eqz v0, :cond_8

    return v2

    :cond_8
    return v1
.end method

.method public final getUserHasInteracted$paymentsheet_release()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    return v0
.end method

.method public final getUserInput()Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/UserInput;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/signup/SignUpState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isExpanded$paymentsheet_release()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    return v0
.end method

.method public final isShowingEmailFirst()Z
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/link/ui/inline/LinkSignupField;->Email:Lcom/stripe/android/link/ui/inline/LinkSignupField;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isShowingPhoneFirst()Z
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/link/ui/inline/LinkSignupField;->Phone:Lcom/stripe/android/link/ui/inline/LinkSignupField;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userInput:Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->merchantName:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    iget-object v3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->fields:Ljava/util/List;

    iget-object v4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->prefillEligibleFields:Ljava/util/Set;

    iget-boolean v5, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->allowsDefaultOptIn:Z

    iget-boolean v6, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->linkSignUpOptInFeatureEnabled:Z

    iget-boolean v7, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->didAskToChangeSignupDetails:Z

    iget-boolean v8, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded:Z

    iget-boolean v9, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->apiFailed:Z

    iget-object v10, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-boolean v11, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->userHasInteracted:Z

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "InlineSignupViewState(userInput="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", merchantName="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signupMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", prefillEligibleFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowsDefaultOptIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkSignUpOptInFeatureEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", didAskToChangeSignupDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isExpanded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", apiFailed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signUpState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userHasInteracted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
