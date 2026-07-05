.class public interface abstract Lcom/stripe/android/view/ActivityStarter$Args;
.super Ljava/lang/Object;
.source "ActivityStarter.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/ActivityStarter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/ActivityStarter$Args$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/stripe/android/view/ActivityStarter$Args;",
        "Landroid/os/Parcelable;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/view/ActivityStarter$Args$Companion;

.field public static final EXTRA:Ljava/lang/String; = "extra_activity_args"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/view/ActivityStarter$Args$Companion;->$$INSTANCE:Lcom/stripe/android/view/ActivityStarter$Args$Companion;

    sput-object v0, Lcom/stripe/android/view/ActivityStarter$Args;->Companion:Lcom/stripe/android/view/ActivityStarter$Args$Companion;

    return-void
.end method
