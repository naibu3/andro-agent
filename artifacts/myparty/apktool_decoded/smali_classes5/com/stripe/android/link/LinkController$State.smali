.class public final Lcom/stripe/android/link/LinkController$State;
.super Ljava/lang/Object;
.source "LinkController.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkController.kt\ncom/stripe/android/link/LinkController$State\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,571:1\n1#2:572\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B-\u0008\u0007\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkController$State;",
        "Landroid/os/Parcelable;",
        "internalLinkAccount",
        "Lcom/stripe/android/link/LinkController$LinkAccount;",
        "selectedPaymentMethodPreview",
        "Lcom/stripe/android/link/LinkController$PaymentMethodPreview;",
        "createdPaymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "<init>",
        "(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;)V",
        "getInternalLinkAccount",
        "()Lcom/stripe/android/link/LinkController$LinkAccount;",
        "getSelectedPaymentMethodPreview",
        "()Lcom/stripe/android/link/LinkController$PaymentMethodPreview;",
        "getCreatedPaymentMethod",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "isConsumerVerified",
        "",
        "()Ljava/lang/Boolean;",
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
            "Lcom/stripe/android/link/LinkController$State;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field private final internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

.field private final selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/LinkController$State$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkController$State$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/LinkController$State;->CREATOR:Landroid/os/Parcelable$Creator;

    sget v0, Lcom/stripe/android/model/PaymentMethod;->$stable:I

    sput v0, Lcom/stripe/android/link/LinkController$State;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/LinkController$State;-><init>(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;)V
    .locals 0

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    iput-object p1, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    .line 244
    iput-object p2, p0, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    .line 245
    iput-object p3, p0, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 239
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkController$State;-><init>(Lcom/stripe/android/link/LinkController$LinkAccount;Lcom/stripe/android/link/LinkController$PaymentMethodPreview;Lcom/stripe/android/model/PaymentMethod;)V

    return-void
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
    instance-of v1, p1, Lcom/stripe/android/link/LinkController$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkController$State;

    iget-object v1, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    iget-object v3, p1, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    iget-object v3, p1, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object p1, p1, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCreatedPaymentMethod()Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    return-object v0
.end method

.method public final getInternalLinkAccount()Lcom/stripe/android/link/LinkController$LinkAccount;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    return-object v0
.end method

.method public final getSelectedPaymentMethodPreview()Lcom/stripe/android/link/LinkController$PaymentMethodPreview;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/link/LinkController$LinkAccount;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/link/LinkController$PaymentMethodPreview;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isConsumerVerified()Ljava/lang/Boolean;
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkController$LinkAccount;->getSessionState()Lcom/stripe/android/link/LinkController$SessionState;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/stripe/android/link/LinkController$SessionState;->LoggedIn:Lcom/stripe/android/link/LinkController$SessionState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    iget-object v1, p0, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    iget-object v2, p0, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "State(internalLinkAccount="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", selectedPaymentMethodPreview="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createdPaymentMethod="

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
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->internalLinkAccount:Lcom/stripe/android/link/LinkController$LinkAccount;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkController$LinkAccount;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->selectedPaymentMethodPreview:Lcom/stripe/android/link/LinkController$PaymentMethodPreview;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkController$PaymentMethodPreview;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/link/LinkController$State;->createdPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
