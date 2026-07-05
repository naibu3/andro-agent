.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;
.super Ljava/lang/Object;
.source "FinancialConnectionsSingletonSharedComponentHolder.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsSingletonSharedComponentHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSingletonSharedComponentHolder.kt\ncom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;",
        "",
        "<init>",
        "()V",
        "component",
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;",
        "getComponent",
        "application",
        "Landroid/app/Application;",
        "buildComponent",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;

.field private static volatile component:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final buildComponent(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;
    .locals 1

    .line 33
    invoke-static {}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent;->factory()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent$Factory;

    move-result-object v0

    .line 34
    invoke-interface {v0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent$Factory;->create(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getComponent(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->component:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;

    if-nez v0, :cond_1

    monitor-enter p0

    .line 27
    :try_start_0
    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->component:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;

    if-nez v0, :cond_0

    sget-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->buildComponent(Landroid/app/Application;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;->component:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1
    return-object v0
.end method
