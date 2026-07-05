.class public final enum Lcom/stripe/android/uicore/elements/ParameterDestination$Local;
.super Ljava/lang/Enum;
.source "IdentifierSpec.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/ParameterDestination;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/ParameterDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Local"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/elements/ParameterDestination$Local;",
        ">;",
        "Lcom/stripe/android/uicore/elements/ParameterDestination;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0007j\u0002\u0008\u0005\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/ParameterDestination$Local;",
        "Lcom/stripe/android/uicore/elements/ParameterDestination;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Extras",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "stripe-ui-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/uicore/elements/ParameterDestination$Local;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum Extras:Lcom/stripe/android/uicore/elements/ParameterDestination$Local;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/elements/ParameterDestination$Local;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->Extras:Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    filled-new-array {v0}, [Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 20
    new-instance v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    const-string v1, "Extras"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->Extras:Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    invoke-static {}, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->$values()[Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->$VALUES:[Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local$Creator;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/ParameterDestination$Local$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/uicore/elements/ParameterDestination$Local;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/ParameterDestination$Local;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 21
    check-cast p0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/elements/ParameterDestination$Local;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->$VALUES:[Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 21
    check-cast v0, [Lcom/stripe/android/uicore/elements/ParameterDestination$Local;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/ParameterDestination$Local;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
