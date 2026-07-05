.class public abstract LFinancialConnectionsGenericInfoScreen$Body$Entry;
.super Ljava/lang/Object;
.source "FinancialConnectionsGenericInfoScreen.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFinancialConnectionsGenericInfoScreen$Body;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;,
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Companion;,
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;,
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;,
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000c2\u00020\u0001:\u0005\u0008\t\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "LFinancialConnectionsGenericInfoScreen$Body$Entry;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "Text",
        "Image",
        "Bullets",
        "Unknown",
        "Companion",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;",
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
    with = Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFinancialConnectionsGenericInfoScreen$Body$Entry;->Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LFinancialConnectionsGenericInfoScreen$Body$Entry;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getId()Ljava/lang/String;
.end method
