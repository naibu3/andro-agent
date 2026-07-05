.class public final Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;
.super Ljava/lang/Object;
.source "BillingDetailsFormState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001Ba\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Ju\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000f\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;",
        "",
        "name",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "email",
        "phone",
        "line1",
        "line2",
        "city",
        "postalCode",
        "state",
        "country",
        "<init>",
        "(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;)V",
        "getName",
        "()Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getEmail",
        "getPhone",
        "getLine1",
        "getLine2",
        "getCity",
        "getPostalCode",
        "getState",
        "getCountry",
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
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final state:Lcom/stripe/android/uicore/forms/FormFieldEntry;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/stripe/android/uicore/forms/FormFieldEntry;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 7
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 8
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 9
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 10
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 11
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 12
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 13
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    .line 14
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->copy(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;)Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;
    .locals 10

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;-><init>(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCity()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getCountry()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getEmail()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getLine1()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getLine2()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getName()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getPhone()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getPostalCode()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getState()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->name:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->email:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->phone:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line1:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->line2:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->city:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->postalCode:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->state:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->country:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "BillingDetailsFormState(name="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ", email="

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", line1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", line2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", city="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", postalCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", country="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
