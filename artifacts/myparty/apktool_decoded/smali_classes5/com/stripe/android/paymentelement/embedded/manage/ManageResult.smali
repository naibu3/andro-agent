.class public interface abstract Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;
.super Ljava/lang/Object;
.source "ManageContract.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;,
        Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;,
        Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Error;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;",
        "Landroid/os/Parcelable;",
        "Complete",
        "Error",
        "Companion",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Complete;",
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Error;",
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
.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;

.field public static final EXTRA_RESULT:Ljava/lang/String; = "extra_activity_result"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageResult;->Companion:Lcom/stripe/android/paymentelement/embedded/manage/ManageResult$Companion;

    return-void
.end method
