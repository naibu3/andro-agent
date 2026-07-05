.class final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_ProvideLocaleFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;

    invoke-direct {v0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
