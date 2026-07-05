.class public final Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;
.super Ljava/lang/Object;
.source "LpmRepository_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;
    .locals 1

    .line 32
    sget-object v0, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory$InstanceHolder;->INSTANCE:Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;

    return-object v0
.end method

.method public static newInstance()Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;
    .locals 1

    .line 36
    new-instance v0, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    invoke-direct {v0}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;
    .locals 1

    .line 28
    invoke-static {}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;->newInstance()Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/luxe/LpmRepository_Factory;->get()Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;

    move-result-object v0

    return-object v0
.end method
