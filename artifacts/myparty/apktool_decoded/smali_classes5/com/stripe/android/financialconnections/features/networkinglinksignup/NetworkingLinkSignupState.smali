.class public final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
.super Ljava/lang/Object;
.source "NetworkingLinkSignupViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;,
        Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;,
        Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetworkingLinkSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkSignupViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0003345Be\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0011\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0010\u0010\u0014J\u000f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003H\u00c6\u0003J\u000f\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010,\u001a\u00020\u000fH\u00c6\u0003Jg\u0010-\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00032\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010.\u001a\u00020\u000f2\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001eR\u0011\u0010!\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u001eR\u0011\u0010#\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;",
        "",
        "payload",
        "Lcom/stripe/android/financialconnections/presentation/Async;",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
        "validEmail",
        "",
        "validPhone",
        "saveAccountToLink",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "lookupAccount",
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "viewEffect",
        "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;",
        "isInstantDebits",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)V",
        "parentState",
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;",
        "(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V",
        "getPayload",
        "()Lcom/stripe/android/financialconnections/presentation/Async;",
        "getValidEmail",
        "()Ljava/lang/String;",
        "getValidPhone",
        "getSaveAccountToLink",
        "getLookupAccount",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;",
        "()Z",
        "showFullForm",
        "getShowFullForm",
        "valid",
        "getValid",
        "pane",
        "getPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "Payload",
        "Content",
        "ViewEffect",
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
.field private final isInstantDebits:Z

.field private final lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;"
        }
    .end annotation
.end field

.field private final payload:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;"
        }
    .end annotation
.end field

.field private final validEmail:Ljava/lang/String;

.field private final validPhone:Ljava/lang/String;

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;",
            "Z)V"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveAccountToLink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupAccount"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 337
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 338
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    .line 339
    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    .line 340
    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 341
    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    .line 342
    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    .line 343
    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 337
    sget-object p1, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p1, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    .line 340
    sget-object p4, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p4, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    .line 341
    sget-object p5, Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/Async$Uninitialized;

    check-cast p5, Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/4 p7, 0x0

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 336
    invoke-direct/range {p2 .. p9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V
    .locals 11

    const-string v0, "parentState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;->isLinkWithStripe()Z

    move-result v8

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    .line 346
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->copy(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;",
            "Z)",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveAccountToLink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupAccount"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;-><init>(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getLookupAccount()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;"
        }
    .end annotation

    .line 341
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    .line 360
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0

    :cond_0
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getPayload()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            ">;"
        }
    .end annotation

    .line 337
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getSaveAccountToLink()Lcom/stripe/android/financialconnections/presentation/Async;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/financialconnections/presentation/Async<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            ">;"
        }
    .end annotation

    .line 340
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    return-object v0
.end method

.method public final getShowFullForm()Z
    .locals 1

    .line 351
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getValid()Z
    .locals 4

    .line 355
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 356
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    if-eqz v3, :cond_2

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    if-eqz v0, :cond_2

    :cond_1
    return v1

    :cond_2
    return v2
.end method

.method public final getValidEmail()Ljava/lang/String;
    .locals 1

    .line 338
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final getValidPhone()Ljava/lang/String;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/presentation/Async;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isInstantDebits()Z
    .locals 1

    .line 343
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->payload:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validEmail:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->validPhone:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->saveAccountToLink:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->lookupAccount:Lcom/stripe/android/financialconnections/presentation/Async;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->viewEffect:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;

    iget-boolean v6, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;->isInstantDebits:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "NetworkingLinkSignupState(payload="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", validEmail="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", validPhone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", saveAccountToLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lookupAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", viewEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isInstantDebits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
