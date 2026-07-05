.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;
.super Landroid/widget/FrameLayout;
.source "ChallengeZoneWebView.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/views/FormField;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\u0008\u001cJ\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0010J\u0012\u0010!\u001a\u00020 2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/stripe/android/stripe3ds2/views/FormField;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "webView",
        "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;",
        "getWebView",
        "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;",
        "value",
        "",
        "userEntry",
        "getUserEntry",
        "()Ljava/lang/String;",
        "onClickListener",
        "Landroid/view/View$OnClickListener;",
        "getOnClickListener$3ds2sdk_release",
        "()Landroid/view/View$OnClickListener;",
        "setOnClickListener$3ds2sdk_release",
        "(Landroid/view/View$OnClickListener;)V",
        "transformHtml",
        "html",
        "transformHtml$3ds2sdk_release",
        "transformFormMethod",
        "transformFormActionUrl",
        "loadHtml",
        "",
        "setOnClickListener",
        "Companion",
        "3ds2sdk_release"
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
.field private static final Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;

.field private static final ENCODING:Ljava/lang/String; = "UTF-8"

.field private static final HTML_MIME_TYPE:Ljava/lang/String; = "text/html"

.field private static final METHOD_GET:Ljava/lang/String; = "method=\"get\""

.field private static final PATTERN_FORM_ACTION:Ljava/util/regex/Pattern;

.field private static final PATTERN_METHOD_POST:Ljava/util/regex/Pattern;


# instance fields
.field private onClickListener:Landroid/view/View$OnClickListener;

.field private userEntry:Ljava/lang/String;

.field private final webView:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;


# direct methods
.method public static synthetic $r8$lambda$1Kvqq5NDGS8rOYzDK14HUlwjFmQ(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->_init_$lambda$0(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;Ljava/lang/String;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->Companion:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;

    .line 76
    const-string v0, "method=\"post\""

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->PATTERN_METHOD_POST:Ljava/util/regex/Pattern;

    .line 81
    const-string v0, "action=\"(.+?)\""

    .line 80
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->PATTERN_FORM_ACTION:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    const-string p2, ""

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->userEntry:Ljava/lang/String;

    .line 25
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 26
    move-object p2, p0

    check-cast p2, Landroid/view/ViewGroup;

    .line 24
    invoke-static {p1, p2}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneWebViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneWebViewBinding;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneWebViewBinding;->webView:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->webView:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    .line 29
    new-instance p2, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;->setOnHtmlSubmitListener$3ds2sdk_release(Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;Ljava/lang/String;)V
    .locals 0

    if-nez p1, :cond_0

    .line 30
    const-string p1, ""

    :cond_0
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->userEntry:Ljava/lang/String;

    .line 31
    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->onClickListener:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_1

    check-cast p0, Landroid/view/View;

    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private final transformFormActionUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 46
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->PATTERN_FORM_ACTION:Ljava/util/regex/Pattern;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    .line 48
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    const-string v2, "https://emv3ds/challenge"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 50
    new-instance p1, Lkotlin/text/Regex;

    invoke-direct {p1, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final transformFormMethod(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 41
    sget-object v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->PATTERN_METHOD_POST:Ljava/util/regex/Pattern;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 42
    const-string v0, "method=\"get\""

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "replaceAll(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final getOnClickListener$3ds2sdk_release()Landroid/view/View$OnClickListener;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->onClickListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getUserEntry()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->userEntry:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebView()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->webView:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    return-object v0
.end method

.method public final loadHtml(Ljava/lang/String;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->webView:Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;

    .line 64
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->transformHtml$3ds2sdk_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 66
    const-string v4, "UTF-8"

    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 62
    const-string v3, "text/html"

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->onClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final setOnClickListener$3ds2sdk_release(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->onClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final transformHtml$3ds2sdk_release(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "html"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->transformFormMethod(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;->transformFormActionUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
