.class public final Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;
.super Ljava/lang/Object;
.source "CollectBankAccountLauncher.kt"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InstantDebits"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;",
        "Landroid/os/Parcelable;",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
        "email",
        "",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V",
        "getEmail",
        "()Ljava/lang/String;",
        "getElementsSessionContext",
        "()Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "component1",
        "component2",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

.field private final email:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits$Creator;

    invoke-direct {v0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 156
    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    .line 157
    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;ILjava/lang/Object;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V

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
    instance-of v1, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    iget-object p1, p1, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ElementsSessionContext;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "InstantDebits(email="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", elementsSessionContext="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->email:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->elementsSessionContext:Lcom/stripe/android/financialconnections/ElementsSessionContext;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
